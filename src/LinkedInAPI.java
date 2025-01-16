
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class LinkedInAPI {
    private static final String CLIENT_ID = "your_client_id";
    private static final String CLIENT_SECRET = "your_client_secret";
    private static final String REDIRECT_URI = "your_redirect_uri";
    private static String accessToken;

    public void authenticate() {
        System.out.println("Visit this URL to authorize:");
        System.out.println("https://www.linkedin.com/oauth/v2/authorization?response_type=code&client_id=" + CLIENT_ID + "&redirect_uri=" + REDIRECT_URI + "&scope=r_liteprofile%20r_emailaddress%20w_member_social");
    }

    public String makeApiCall(String endpoint) {
        try {
            URL url = new URL("https://api.linkedin.com/v2/" + endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "Bearer " + accessToken);

            Scanner sc = new Scanner(conn.getInputStream());
            StringBuilder response = new StringBuilder();
            while (sc.hasNext()) {
                response.append(sc.nextLine());
            }
            sc.close();

            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

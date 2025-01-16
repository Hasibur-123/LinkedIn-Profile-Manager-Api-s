public class ProfileManager {
    private LinkedInAPI api;

    public ProfileManager(LinkedInAPI api) {
        this.api = api;
    }

    public void updateHeadline(String headline) {
        String endpoint = "me";
        String body = "{ \"headline\": \"" + headline + "\" }";
        api.makeApiCall(endpoint, "POST", body);
        System.out.println("Headline updated to: " + headline);
    }

    public void addExperience(String title, String company, String description) {
        String endpoint = "experiences";
        String body = "{ \"title\": \"" + title + "\", \"companyName\": \"" + company + "\", \"description\": \"" + description + "\" }";
        api.makeApiCall(endpoint, "POST", body);
        System.out.println("Experience added: " + title + " at " + company);
    }
}

public class ConnectionManager {
    private LinkedInAPI api;

    public ConnectionManager(LinkedInAPI api) {
        this.api = api;
    }

    public void sendConnectionRequest(String profileId, String message) {
        String endpoint = "invitations";
        String body = "{ \"profileId\": \"" + profileId + "\", \"message\": \"" + message + "\" }";
        api.makeApiCall(endpoint, "POST", body);
        System.out.println("Connection request sent to profile: " + profileId);
    }
}

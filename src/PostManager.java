public class PostManager {
    private LinkedInAPI api;

    public PostManager(LinkedInAPI api) {
        this.api = api;
    }

    public void postContent(String content) {
        String endpoint = "shares";
        String body = "{ \"content\": \"" + content + "\" }";
        api.makeApiCall(endpoint, "POST", body);
        System.out.println("Content posted: " + content);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedInAPI api = new LinkedInAPI();
        api.authenticate();

        ProfileManager profileManager = new ProfileManager(api);
        profileManager.updateHeadline("Java Developer | Open to Opportunities");
        profileManager.addExperience("Software Developer", "Company XYZ", "Developed backend systems using Java and Spring Boot.");
    }
}

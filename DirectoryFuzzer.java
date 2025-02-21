//DirectoryFuzzer
class DirectoryFuzzer {
    private String baseUrl;

    public DirectoryFuzzer(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void fuzzDirectories(List<String> directories) {
        System.out.println("Starting Directory Fuzzing...");
        for (String dir : directories) {
            try {
                URL url = new URL(baseUrl + "/" + dir);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                int responseCode = connection.getResponseCode();
                System.out.println("Checked: " + url + " - Response: " + responseCode);
            } catch (Exception e) {
                System.err.println("Error checking directory: " + dir);
            }
        }
    }
}

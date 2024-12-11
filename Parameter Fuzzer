// Parameter Fuzzer
class ParameterFuzzer {
    private String baseUrl;

    public ParameterFuzzer(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void fuzzParameters(String endpoint, List<String> parameters, List<String> payloads) {
        System.out.println("Starting Parameter Fuzzing...");
        for (String param : parameters) {
            for (String payload : payloads) {
                try {
                    String urlStr = baseUrl + endpoint + "?" + param + "=" + URLEncoder.encode(payload, "UTF-8");
                    URL url = new URL(urlStr);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    int responseCode = connection.getResponseCode();
                    System.out.println("Checked: " + urlStr + " - Response: " + responseCode);
                } catch (Exception e) {
                    System.err.println("Error fuzzing parameter: " + param);
                }
            }
        }
    }
}

// Subdomain Enumerator
class SubdomainEnumerator {
    private String domain;

    public SubdomainEnumerator(String domain) {
        this.domain = domain;
    }

    public void enumerateSubdomains(List<String> subdomains) {
        System.out.println("Starting Subdomain Enumeration...");
        for (String subdomain : subdomains) {
            try {
                String fullDomain = subdomain + "." + domain;
                InetAddress address = InetAddress.getByName(fullDomain);
                System.out.println("Found Subdomain: " + fullDomain + " - IP: " + address.getHostAddress());
            } catch (Exception e) {
                System.err.println("Error resolving subdomain: " + subdomain);
            }
        }
    }
}

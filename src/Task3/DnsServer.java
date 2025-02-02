package Task3;

public class DnsServer {
    private String ip1;
    private String ip2;

    public DnsServer(String ip1, String ip2) {
        this.ip1 = ip1;
        this.ip2 = ip2;
    }

    public String getIp1() {
        return ip1;
    }

    public String getIp2() {
        return ip2;
    }

    @Override
    public String toString() {
        return String.format("Dns_Server -> [IP1 - %s] [IP2 - %s]",this.ip1, this.ip2);
    }
}

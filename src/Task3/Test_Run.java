package Task3;
import Enums.DnsProvider;

public class Test_Run {
    public static void main(String[] args) {

        Mapas<DnsProvider, DnsServer> dnsMap = new Mapas<>();
        dnsMap.ideti(
                DnsProvider.OPEN_DNS,
                new DnsServer("208.67.222.222", "208.67.220.220")
                );
        dnsMap.ideti(
                DnsProvider.CLOUDFLARE,
                new DnsServer("1.1.1.1", "1.0.0.1")
                );
        dnsMap.ideti(
                DnsProvider.GOOGLE_PUBLIC_DNS,
                new DnsServer("8.8.8.8", "8.8.4.4")
                );

        System.out.println("DNS Map:");
        System.out.println(dnsMap);

        System.out.println();

        Mapas<String, String> stringMap = new Mapas<>();
        stringMap.ideti("k1", "v1");
        stringMap.ideti("k2", "v2");

        System.out.println("String Map:");
        System.out.println(stringMap);

        System.out.println();

        System.out.println(dnsMap.gauti(DnsProvider.GOOGLE_PUBLIC_DNS));
        System.out.println(stringMap.gauti("k1"));
    }
}

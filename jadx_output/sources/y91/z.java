package y91;

/* loaded from: classes7.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f460330a = new java.util.ArrayList();

    public static java.lang.String a(java.lang.String str, int i17, java.lang.String str2) {
        if (str2.startsWith("/")) {
            return "http://" + str + ":" + i17 + str2;
        }
        return "http://" + str + ":" + i17 + "/" + str2;
    }

    public static java.lang.String b() {
        java.lang.String str = null;
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                java.util.Enumeration<java.net.InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        java.net.InetAddress nextElement = inetAddresses.nextElement();
                        if (!(nextElement instanceof java.net.Inet6Address)) {
                            java.lang.String hostAddress = nextElement.getHostAddress();
                            if (!"127.0.0.1".equals(hostAddress)) {
                                str = hostAddress;
                                break;
                            }
                        }
                    }
                }
            }
        } catch (java.net.SocketException e17) {
            java.util.Objects.toString(e17.getCause());
        }
        return str;
    }

    public static java.util.List c() {
        java.util.List list = f460330a;
        ((java.util.ArrayList) list).clear();
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                java.util.Iterator it = java.util.Collections.list(networkInterfaces).iterator();
                while (it.hasNext()) {
                    java.net.NetworkInterface networkInterface = (java.net.NetworkInterface) it.next();
                    java.util.Iterator it6 = java.util.Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        if (((java.net.InetAddress) it6.next()).getHostAddress().startsWith("192.168")) {
                            ((java.util.ArrayList) list).add(networkInterface);
                            break;
                        }
                    }
                }
            }
        } catch (java.net.SocketException unused) {
        }
        return list;
    }
}

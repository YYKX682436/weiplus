package wh;

/* loaded from: classes12.dex */
public abstract class x1 {
    public static m3.d a(android.content.Context context, java.lang.String str) {
        long j17;
        android.net.NetworkCapabilities networkCapabilities;
        long j18 = 0;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            long j19 = 0;
            j17 = 0;
            for (android.net.Network network : connectivityManager.getAllNetworks()) {
                android.net.NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && ((networkInfo.isConnected() || networkInfo.isConnectedOrConnecting()) && networkInfo.getTypeName().equalsIgnoreCase(str) && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null)) {
                    j19 = networkCapabilities.getLinkDownstreamBandwidthKbps() * 1024;
                    j17 = 1024 * networkCapabilities.getLinkUpstreamBandwidthKbps();
                    if (j19 > 0 || j17 > 0) {
                        break;
                    }
                }
            }
            j18 = j19;
        } else {
            j17 = 0;
        }
        return new m3.d(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
    }

    public static wh.v1 b(android.content.Context context) {
        try {
            wh.v1 v1Var = new wh.v1();
            m3.d a17 = a(context, "WIFI");
            java.lang.Object obj = a17.f323092a;
            long j17 = 0;
            v1Var.f445884a = obj == null ? 0L : ((java.lang.Long) obj).longValue();
            java.lang.Object obj2 = a17.f323093b;
            v1Var.f445885b = obj2 == null ? 0L : ((java.lang.Long) obj2).longValue();
            m3.d a18 = a(context, "MOBILE");
            java.lang.Object obj3 = a18.f323092a;
            v1Var.f445886c = obj3 == null ? 0L : ((java.lang.Long) obj3).longValue();
            java.lang.Object obj4 = a18.f323093b;
            if (obj4 != null) {
                j17 = ((java.lang.Long) obj4).longValue();
            }
            v1Var.f445887d = j17;
            return v1Var;
        } catch (java.lang.Exception e17) {
            oj.j.f("Matrix.battery.ProcStatUtil", "getBps err: " + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }
}

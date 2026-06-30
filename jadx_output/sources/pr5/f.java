package pr5;

/* loaded from: classes13.dex */
public final class f extends pr5.a {
    public f(android.content.Context context) {
        super(context);
        if (context == null) {
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) applicationContext.getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        try {
            connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().addTransportType(0).addTransportType(1).addTransportType(2).addTransportType(3).build(), new pr5.e(this, applicationContext));
        } catch (java.lang.Exception e17) {
            or5.b.e("network register failed " + e17, new java.lang.Object[0]);
        }
    }
}

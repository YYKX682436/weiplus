package ly;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ly.h f322182a = new ly.h();

    public final int a(android.content.Context context, boolean z17) {
        android.net.ConnectivityManager connectivityManager;
        android.net.Network activeNetwork;
        android.net.NetworkCapabilities networkCapabilities;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            java.lang.Object systemService = context.getSystemService("connectivity");
            connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        } catch (java.lang.Exception unused) {
        }
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return 0;
        }
        if (networkCapabilities.hasTransport(1)) {
            return 1;
        }
        if (networkCapabilities.hasTransport(0)) {
            java.lang.Object systemService2 = context.getSystemService("phone");
            android.telephony.TelephonyManager telephonyManager = systemService2 instanceof android.telephony.TelephonyManager ? (android.telephony.TelephonyManager) systemService2 : null;
            int dataNetworkType = telephonyManager != null ? telephonyManager.getDataNetworkType() : 0;
            if (dataNetworkType == 1 || dataNetworkType == 2 || dataNetworkType == 7) {
                return 2;
            }
            if (z17) {
                if (android.os.Build.VERSION.SDK_INT >= 29 && dataNetworkType == 20) {
                    return 5;
                }
            }
            return dataNetworkType == 13 || dataNetworkType == 15 ? 4 : 3;
        }
        return 0;
    }
}

package gi;

/* loaded from: classes13.dex */
public class t extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public long f272120a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.a f272121b;

    public t(m3.a aVar) {
        this.f272121b = aVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        super.onAvailable(network);
        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network onAvailable " + network);
        this.f272121b.accept(java.lang.Boolean.TRUE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(android.net.Network network, boolean z17) {
        super.onBlockedStatusChanged(network, z17);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        int i17;
        int[] iArr;
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (android.os.SystemClock.uptimeMillis() - this.f272120a > 1800000) {
            try {
                int i18 = android.os.Build.VERSION.SDK_INT;
                if (i18 >= 29) {
                    i17 = networkCapabilities.getSignalStrength();
                    com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network strength: " + i17);
                } else {
                    i17 = 0;
                }
                if (i18 >= 31) {
                    iArr = networkCapabilities.getCapabilities();
                    com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network capabilities: " + java.util.Arrays.toString(iArr));
                } else {
                    iArr = null;
                }
                com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network TRANSPORT_CELLULAR: " + networkCapabilities.hasTransport(0));
                com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network TRANSPORT_WIFI: " + networkCapabilities.hasTransport(1));
                com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network TRANSPORT_BLUETOOTH: " + networkCapabilities.hasTransport(2));
                com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network TRANSPORT_ETHERNET: " + networkCapabilities.hasTransport(3));
                com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network TRANSPORT_VPN: " + networkCapabilities.hasTransport(4));
                if (i18 >= 26) {
                    try {
                        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network TRANSPORT_WIFI_AWARE: " + networkCapabilities.hasTransport(5));
                    } catch (java.lang.Throwable unused) {
                    }
                }
                if (i18 >= 27) {
                    com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network TRANSPORT_LOWPAN: " + networkCapabilities.hasTransport(6));
                }
                if (networkCapabilities.hasTransport(0) && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5) || networkCapabilities.hasTransport(3))) {
                    ap.a.a(1, "DualNetTransport", null, null, java.lang.String.valueOf(i17), java.util.Arrays.toString(iArr));
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
        super.onLinkPropertiesChanged(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLosing(android.net.Network network, int i17) {
        super.onLosing(network, i17);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        super.onLost(network);
        com.tencent.mars.xlog.Log.i("Matrix.battery.LifeCycle", "network onLost " + network);
        this.f272121b.accept(java.lang.Boolean.FALSE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        super.onUnavailable();
    }
}

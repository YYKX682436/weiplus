package rf1;

/* loaded from: classes13.dex */
public class b extends android.content.BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f394618b = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final android.net.ConnectivityManager.NetworkCallback f394617a = new rf1.a(this);

    public final void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "dispatchConnectEventIfNeed, isConnected:%b, isWifi:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        java.util.List list = this.f394618b;
        if (!z17 || !z18) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((rf1.c) it.next()).h();
            }
            return;
        }
        rf1.h a17 = rf1.e.f394621a.a(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "[mWiFiEventReceiver]currentWifi:%s", a17);
        if (a17 == null) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) list;
        java.util.Iterator it6 = copyOnWriteArrayList.iterator();
        while (it6.hasNext()) {
            ((rf1.c) it6.next()).a(a17);
        }
        java.util.Iterator it7 = copyOnWriteArrayList.iterator();
        while (it7.hasNext()) {
            ((rf1.c) it7.next()).b(a17);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.os.Parcelable parcelableExtra;
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if (android.text.TextUtils.isEmpty(action)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "actiong:%s", action);
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("wifi_state", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "wifiState" + intExtra);
            if (intExtra == 1) {
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f394618b).iterator();
                while (it.hasNext()) {
                    ((rf1.c) it.next()).h();
                }
            }
        }
        if (!io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(action) || (parcelableExtra = intent.getParcelableExtra("networkInfo")) == null) {
            return;
        }
        android.net.NetworkInfo networkInfo = (android.net.NetworkInfo) parcelableExtra;
        a(networkInfo.isConnected(), networkInfo.getType() == 1);
    }
}

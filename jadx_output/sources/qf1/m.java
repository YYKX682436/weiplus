package qf1;

/* loaded from: classes13.dex */
public class m extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 314;
    public static final java.lang.String NAME = "startWifi";

    /* renamed from: g, reason: collision with root package name */
    public static boolean f362278g;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartWifi", "invoke startWifi");
        android.content.Context a17 = com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(lVar.getContext());
        rf1.l.b(a17);
        if (!f362278g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "enable");
            if (rf1.d.f394619a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "enable, already enabled");
            } else {
                android.content.Context a18 = com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(a17);
                rf1.d.f394619a = true;
                if (rf1.d.f394620b == null) {
                    rf1.b bVar = new rf1.b();
                    rf1.d.f394620b = bVar;
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                    intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                    intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                    intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
                    intentFilter.setPriority(Integer.MAX_VALUE);
                    a18.registerReceiver(bVar, intentFilter);
                    android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) a18.getSystemService("connectivity");
                    if (connectivityManager == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "enable, connectivityManager is null");
                    } else {
                        try {
                            connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().removeCapability(14).build(), bVar.f394617a);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ConnectWifiEvents", e17, "registerNetworkCallback failure", new java.lang.Object[0]);
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "enable, receiver is not null");
                }
            }
            rf1.d.a(new qf1.k(this, lVar));
            f362278g = true;
        }
        com.tencent.mm.plugin.appbrand.x0.a(lVar.getAppId(), new qf1.l(this, a17, lVar));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errCode", 0);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        lVar.a(i17, t("ok", hashMap));
    }
}

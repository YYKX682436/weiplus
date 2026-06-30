package com.tencent.mm.sdk.platformtools;

/* loaded from: classes13.dex */
public final class n0 {
    public n0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.sdk.platformtools.t0 a() {
        com.tencent.mm.sdk.platformtools.t0 t0Var = com.tencent.mm.sdk.platformtools.t0.f192979g;
        if (t0Var != null) {
            return t0Var;
        }
        com.tencent.mm.sdk.platformtools.i0 i0Var = com.tencent.mm.sdk.platformtools.v0.f193027a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object systemService = context.getApplicationContext().getSystemService("wifi");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) systemService;
        if (wifiManager.getWifiState() != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConnectivityCompat", "not wifi currently, return empty wifi info");
            return new com.tencent.mm.sdk.platformtools.t0(null);
        }
        i0Var.b();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                return i0Var.a(context, wifiManager);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ConnectivityCompat", "acquireWiFiInfo29(): access_fine_location perm not granted.");
            return new com.tencent.mm.sdk.platformtools.t0(null);
        }
        if (i17 >= 27) {
            return i0Var.a(context, wifiManager);
        }
        android.net.wifi.WifiInfo wifiInfo = (android.net.wifi.WifiInfo) yj0.a.j(wifiManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "acquireWiFiInfo", "()Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
        return wifiInfo != null ? new com.tencent.mm.sdk.platformtools.t0(wifiInfo) : new com.tencent.mm.sdk.platformtools.t0(null);
    }
}

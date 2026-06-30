package f42;

/* loaded from: classes12.dex */
public final class f implements yj0.c {
    @Override // yj0.c
    public java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        f42.i iVar = f42.j.f259529a;
        kotlin.jvm.internal.o.d(applicationContext);
        if (f42.i.a(iVar, applicationContext)) {
            ri.a.c("wifi", str, str2, str3, str4, str5, obj, objArr);
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) obj;
        if (str4 == null) {
            return null;
        }
        switch (str4.hashCode()) {
            case -2129330689:
                if (!str4.equals("startScan")) {
                    return null;
                }
                if (f42.i.a(iVar, applicationContext)) {
                    return java.lang.Boolean.valueOf(wifiManager.startScan());
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str4 + " from " + str + '#' + str2);
                return null;
            case -1437827709:
                if (!str4.equals("getScanResults")) {
                    return null;
                }
                if (f42.i.a(iVar, applicationContext)) {
                    return wifiManager.getScanResults();
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str4 + " from " + str + '#' + str2);
                return null;
            case -703033767:
                if (!str4.equals("getConfiguredNetworks")) {
                    return null;
                }
                if (f42.i.a(iVar, applicationContext)) {
                    return wifiManager.getConfiguredNetworks();
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str4 + " from " + str + '#' + str2);
                return null;
            case 977831330:
                if (!str4.equals("getConnectionInfo")) {
                    return null;
                }
                if (f42.i.a(iVar, applicationContext)) {
                    return wifiManager.getConnectionInfo();
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str4 + " from " + str + '#' + str2);
                return null;
            default:
                return null;
        }
    }
}

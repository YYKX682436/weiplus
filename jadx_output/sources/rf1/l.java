package rf1;

/* loaded from: classes13.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f394629a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f394630b;

    /* renamed from: c, reason: collision with root package name */
    public static rf1.h f394631c;

    /* renamed from: d, reason: collision with root package name */
    public static rf1.f f394632d;

    /* renamed from: e, reason: collision with root package name */
    public static android.content.Context f394633e;

    /* renamed from: f, reason: collision with root package name */
    public static android.content.BroadcastReceiver f394634f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile rf1.g f394635g;

    public static rf1.i a(boolean z17) {
        java.util.List<android.net.wifi.ScanResult> list;
        java.lang.String str;
        int i17;
        rf1.i iVar = new rf1.i();
        java.lang.String str2 = null;
        f394631c = null;
        if (f394629a && sf1.s.b()) {
            if (z17) {
                sf1.s.d();
            }
            try {
                list = (java.util.List) yj0.a.j(sf1.s.f407019a, "com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/WifiManagerInternalWrapper", "getScanResults", "()Ljava/util/List;", "android/net/wifi/WifiManager", "getScanResults", "()Ljava/util/List;");
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th6, "getScanResults", new java.lang.Object[0]);
                list = null;
            }
            iVar.f394628b = new java.util.ArrayList();
            iVar.f394627a = "ok";
            if (list != null) {
                list.size();
                android.net.wifi.WifiInfo a17 = sf1.s.a();
                if (a17 == null || android.text.TextUtils.isEmpty(a17.getSSID())) {
                    str = null;
                } else {
                    str2 = sf1.t.b(a17.getSSID());
                    str = a17.getBSSID();
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str == null) {
                        str = "";
                    }
                }
                for (android.net.wifi.ScanResult scanResult : list) {
                    if (scanResult != null) {
                        java.lang.String str3 = scanResult.capabilities;
                        char c17 = str3 == null ? (char) 65535 : str3.contains("WEP") ? (char) 1 : scanResult.capabilities.contains("PSK") ? (char) 2 : scanResult.capabilities.contains("EAP") ? (char) 3 : (char) 0;
                        rf1.h hVar = new rf1.h();
                        hVar.f394622a = sf1.t.b(scanResult.SSID);
                        java.lang.String str4 = scanResult.BSSID;
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        if (str4 == null) {
                            str4 = "";
                        }
                        hVar.f394623b = str4;
                        int i18 = scanResult.level;
                        if (i18 <= -100) {
                            i17 = 0;
                        } else {
                            i17 = 99;
                            if (i18 < -55) {
                                i17 = (int) (((i18 + 100) * 99) / 45.0f);
                            }
                        }
                        hVar.f394624c = java.lang.Integer.valueOf(i17);
                        hVar.f394625d = java.lang.Boolean.valueOf(c17 == 2);
                        hVar.f394626e = java.lang.Integer.valueOf(scanResult.frequency);
                        if (str2 != null && str != null && hVar.f394622a.compareTo(str2) == 0 && hVar.f394623b.compareTo(str) == 0) {
                            f394631c = hVar;
                        }
                        if (c17 == 0 || c17 == 2) {
                            ((java.util.ArrayList) iVar.f394628b).add(hVar);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WiFiManagerWrapper", "[getWifiList] mCurrentWiFi: " + f394631c);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WiFiManagerWrapper", "wifiList is null");
            }
        } else if (f394629a) {
            iVar.f394627a = "wifi is disable";
        } else {
            iVar.f394627a = "sdk not init";
        }
        return iVar;
    }

    public static void b(android.content.Context context) {
        if (f394629a || context == null) {
            return;
        }
        f394633e = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WiFiManagerWrapper", "initSdk, register WifiScanResultBroadcastReceiver");
        if (f394634f == null) {
            f394634f = new rf1.k(null);
        }
        f394633e.registerReceiver(f394634f, new android.content.IntentFilter("android.net.wifi.SCAN_RESULTS"));
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) f394633e.getSystemService("wifi");
        if (wifiManager != null) {
            sf1.s.f407019a = wifiManager;
            f394629a = true;
        }
    }
}

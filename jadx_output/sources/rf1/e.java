package rf1;

/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final rf1.e f394621a = new rf1.e();

    public final rf1.h a(boolean z17) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "get, preventScanWifi: true, acceptIncompleteWiFiItem: " + z17);
        android.net.wifi.WifiInfo a17 = sf1.s.a();
        android.net.wifi.WifiConfiguration wifiConfiguration = null;
        if (a17 == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "getIncompleteWiFiItem, wifiInfo.ssid: " + a17.getSSID() + ", wifiInfo.bssid: " + a17.getBSSID());
        rf1.h hVar = new rf1.h();
        hVar.f394622a = sf1.t.b(a17.getSSID());
        java.lang.String bssid = a17.getBSSID();
        hVar.f394623b = bssid;
        if (kotlin.jvm.internal.o.b(bssid, a17.getBSSID())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "fillBestEffort, connectionInfo got");
            int rssi = a17.getRssi();
            if (rssi <= -100) {
                i17 = 0;
            } else {
                i17 = 99;
                if (rssi < -55) {
                    i17 = (int) (((rssi - (-100)) * 99) / 45.0f);
                }
            }
            hVar.f394624c = java.lang.Integer.valueOf(i17);
            hVar.f394626e = java.lang.Integer.valueOf(a17.getFrequency());
        }
        java.lang.String str = hVar.f394623b;
        java.util.List b17 = sf1.f.b();
        if (b17 != null) {
            java.util.Iterator it = b17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.net.wifi.WifiConfiguration wifiConfiguration2 = (android.net.wifi.WifiConfiguration) it.next();
                if (java.util.Objects.equals(wifiConfiguration2.BSSID, str)) {
                    wifiConfiguration = wifiConfiguration2;
                    break;
                }
            }
        }
        if (wifiConfiguration != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "fillBestEffort, wifiConfig not null");
            hVar.f394625d = java.lang.Boolean.valueOf(2 == sf1.t.a(wifiConfiguration));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "fillBestEffort, signalStrength: " + hVar.f394624c + ", frequency: " + hVar.f394626e + ", security: " + hVar.f394625d);
        return hVar;
    }
}

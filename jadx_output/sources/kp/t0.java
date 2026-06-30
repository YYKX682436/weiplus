package kp;

/* loaded from: classes13.dex */
public final class t0 implements android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310837a;

    public t0(kp.i1 i1Var) {
        this.f310837a = i1Var;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener
    public final void onDeviceInfoAvailable(android.net.wifi.p2p.WifiP2pDevice wifiP2pDevice) {
        java.lang.String str;
        java.lang.String str2 = null;
        if (wifiP2pDevice != null && (str = wifiP2pDevice.deviceName) != null && (!r26.n0.N(str))) {
            str2 = str;
        }
        if (str2 == null) {
            com.tencent.mars.xlog.Log.w("WiFiDirectService", "prefetch local p2p deviceName empty");
        } else {
            this.f310837a.f310772p = str2;
            com.tencent.mars.xlog.Log.i("WiFiDirectService", "prefetch local p2p deviceName=".concat(str2));
        }
    }
}

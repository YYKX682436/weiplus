package kp;

/* loaded from: classes13.dex */
public final class e1 implements android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f310732b;

    public e1(kp.i1 i1Var, kotlinx.coroutines.q qVar) {
        this.f310731a = i1Var;
        this.f310732b = qVar;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener
    public final void onDeviceInfoAvailable(android.net.wifi.p2p.WifiP2pDevice wifiP2pDevice) {
        java.lang.String str;
        java.lang.String str2 = null;
        if (wifiP2pDevice != null && (str = wifiP2pDevice.deviceName) != null && (!r26.n0.N(str))) {
            str2 = str;
        }
        if (str2 != null) {
            this.f310731a.f310772p = str2;
            com.tencent.mars.xlog.Log.i("WiFiDirectService", "fetch local p2p deviceName=".concat(str2));
        } else {
            com.tencent.mars.xlog.Log.w("WiFiDirectService", "fetch local p2p deviceName empty");
        }
        if (((kotlinx.coroutines.r) this.f310732b).n()) {
            this.f310732b.resumeWith(kotlin.Result.m521constructorimpl(str2));
        }
    }
}

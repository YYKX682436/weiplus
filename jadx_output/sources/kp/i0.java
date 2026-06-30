package kp;

/* loaded from: classes13.dex */
public final class i0 implements android.net.wifi.p2p.WifiP2pManager.ActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f310761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310762c;

    public i0(java.lang.String str, kotlinx.coroutines.q qVar, kp.i1 i1Var) {
        this.f310760a = str;
        this.f310761b = qVar;
        this.f310762c = i1Var;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i17) {
        com.tencent.mars.xlog.Log.e("WiFiDirectService", "connection fail: " + i17);
        kp.i1 i1Var = this.f310762c;
        ((kotlinx.coroutines.flow.h3) i1Var.f310768i).k(java.lang.Boolean.FALSE);
        bw5.xf0 xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR;
        if (i17 == 1) {
            xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_DEVICE_NOT_SUPPORT;
        } else if (!i1Var.cj()) {
            xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_WIFI_NOT_ENABLED;
        } else if (i1Var.bj()) {
            xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_WIFI_AP_ENABLED;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f310761b.resumeWith(kotlin.Result.m521constructorimpl(new gz.a(false, xf0Var, "connectToGroup: connection fail: " + i17)));
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("WiFiDirectService", "connection request sent to " + this.f310760a + "，waiting for response...");
        this.f310761b.resumeWith(kotlin.Result.m521constructorimpl(new gz.a(true, null, null, 6, null)));
    }
}

package kp;

/* loaded from: classes13.dex */
public final class p0 implements android.net.wifi.p2p.WifiP2pManager.ActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f310812b;

    public p0(kp.i1 i1Var, kotlinx.coroutines.q qVar) {
        this.f310811a = i1Var;
        this.f310812b = qVar;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i17) {
        com.tencent.mars.xlog.Log.e("WiFiDirectService", "Failed to create group: " + i17);
        bw5.xf0 xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CREATE_GROUP_ERROR;
        if (i17 == 1) {
            xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_DEVICE_NOT_SUPPORT;
        } else {
            kp.i1 i1Var = this.f310811a;
            if (!i1Var.cj()) {
                xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_WIFI_NOT_ENABLED;
            } else if (i1Var.bj()) {
                xf0Var = bw5.xf0.NEAR_CONNECTION_ERROR_CODE_WIFI_AP_ENABLED;
            }
        }
        bw5.xf0 xf0Var2 = xf0Var;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f310812b.resumeWith(kotlin.Result.m521constructorimpl(new gz.b(false, xf0Var2, "createGroup: Failed to create group: " + i17, null, null, 24, null)));
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("WiFiDirectService", "Create group success");
        this.f310811a.f310771o = true;
        this.f310812b.resumeWith(kotlin.Result.m521constructorimpl(new gz.b(true, null, null, null, null, 30, null)));
        com.tencent.mm.sdk.platformtools.o4.L().G("group_created", true);
    }
}

package kp;

/* loaded from: classes13.dex */
public final class x0 implements android.net.wifi.p2p.WifiP2pManager.ActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f310856b;

    public x0(kp.i1 i1Var, kotlinx.coroutines.q qVar) {
        this.f310855a = i1Var;
        this.f310856b = qVar;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i17) {
        com.tencent.mars.xlog.Log.e("WiFiDirectService", "removeGroup fail: " + i17);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f310856b.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("WiFiDirectService", "removeGroup success");
        kp.i1 i1Var = this.f310855a;
        ((kotlinx.coroutines.flow.h3) i1Var.f310767h).k(null);
        ((kotlinx.coroutines.flow.h3) i1Var.f310768i).k(java.lang.Boolean.FALSE);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f310856b.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }
}

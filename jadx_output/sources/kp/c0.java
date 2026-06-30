package kp;

/* loaded from: classes7.dex */
public final class c0 implements android.net.wifi.p2p.WifiP2pManager.ActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f310719a;

    public c0(kotlinx.coroutines.q qVar) {
        this.f310719a = qVar;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i17) {
        com.tencent.mars.xlog.Log.e("WiFiDirectService", "discoverPeers failed: " + i17);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f310719a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("WiFiDirectService", "discoverPeers success");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f310719a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }
}

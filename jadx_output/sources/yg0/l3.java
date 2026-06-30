package yg0;

/* loaded from: classes8.dex */
public final class l3 implements qx4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yg0.o3 f462214a;

    public l3(yg0.o3 o3Var) {
        this.f462214a = o3Var;
    }

    @Override // qx4.d
    public void onReady() {
        com.tencent.mars.xlog.Log.w("MicroMsg.FTSPlatformWebView", "preNotifyRetry, process jsReadyCallback");
        ((yg0.j3) this.f462214a.f462238o).run();
    }
}

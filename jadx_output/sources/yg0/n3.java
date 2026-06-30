package yg0;

/* loaded from: classes8.dex */
public final class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg0.o3 f462225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.fs0 f462226e;

    public n3(yg0.o3 o3Var, bw5.fs0 fs0Var) {
        this.f462225d = o3Var;
        this.f462226e = fs0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qx4.d0 d0Var;
        java.lang.ref.WeakReference weakReference;
        ch0.z b17 = this.f462225d.f462231e.b();
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI = (b17 == null || (weakReference = b17.f41266f) == null) ? null : (com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI) weakReference.get();
        if (preLoadWebViewUI != null) {
            if (!preLoadWebViewUI.K3) {
                return;
            }
            java.lang.String content = "setNewSearchRequestId, activity hash code: " + preLoadWebViewUI.hashCode() + ", notify js new request";
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        }
        bw5.fs0 fs0Var = this.f462226e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cl0.g gVar = new cl0.g();
            gVar.s("query", fs0Var.b());
            gVar.s(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(fs0Var.f27510n));
            gVar.s("type", java.lang.Long.valueOf(fs0Var.f27506g));
            if (preLoadWebViewUI != null && (d0Var = preLoadWebViewUI.E3) != null) {
                d0Var.m("newFlutterRequestStart", gVar);
                f0Var = jz5.f0.f302826a;
            }
            kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}

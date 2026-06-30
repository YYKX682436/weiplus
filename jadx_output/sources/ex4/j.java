package ex4;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex4.o f257219d;

    public j(ex4.o oVar) {
        this.f257219d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        com.tencent.mm.plugin.webview.model.l2 l2Var;
        ex4.o oVar = this.f257219d;
        if (!oVar.f257243s.f257222b) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewSnapshotHelper", "show progressBar on time expire");
            oVar.f257243s.n();
            com.tencent.mm.plugin.webview.model.b6.l(18L);
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI a17 = oVar.a();
        if (a17 != null && (e3Var = a17.L1) != null && (l2Var = e3Var.f181816r1) != null) {
            ((com.tencent.mm.plugin.webview.core.o2) l2Var).a();
        }
        oVar.f257242r = false;
    }
}

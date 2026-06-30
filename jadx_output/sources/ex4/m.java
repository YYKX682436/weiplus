package ex4;

/* loaded from: classes8.dex */
public final class m extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f257222b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ex4.o f257223c;

    public m(ex4.o oVar) {
        this.f257223c = oVar;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void e() {
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void m() {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        com.tencent.mm.plugin.webview.model.l2 l2Var;
        com.tencent.mm.ui.base.MMFalseProgressBar mMFalseProgressBar;
        ex4.o oVar = this.f257223c;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI a17 = oVar.a();
        if (a17 != null && (mMFalseProgressBar = a17.f183834m) != null) {
            mMFalseProgressBar.a();
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI a18 = oVar.a();
        if (a18 != null && (e3Var = a18.L1) != null && (l2Var = e3Var.f181816r1) != null) {
            ((com.tencent.mm.plugin.webview.core.o2) l2Var).a();
        }
        this.f257222b = true;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void n() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI a17;
        com.tencent.mm.ui.base.MMFalseProgressBar mMFalseProgressBar;
        ex4.o oVar = this.f257223c;
        if (!oVar.f257242r && (a17 = oVar.a()) != null && (mMFalseProgressBar = a17.f183834m) != null) {
            mMFalseProgressBar.c();
        }
        this.f257222b = false;
    }
}

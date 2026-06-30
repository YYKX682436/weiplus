package of1;

/* loaded from: classes7.dex */
public final class f0 extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ of1.v0 f344912b;

    public f0(of1.v0 v0Var) {
        this.f344912b = v0Var;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void m() {
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.f344912b.W1;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
        of1.y1 y1Var = oVar instanceof of1.y1 ? (of1.y1) oVar : null;
        if (y1Var != null) {
            of1.w1 w1Var = (of1.w1) y1Var;
            w1Var.f345034e.P0(new of1.j1(w1Var));
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void n() {
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = this.f344912b.W1;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("mView");
            throw null;
        }
        of1.y1 y1Var = oVar instanceof of1.y1 ? (of1.y1) oVar : null;
        if (y1Var != null) {
            of1.w1 w1Var = (of1.w1) y1Var;
            w1Var.f345034e.P0(new of1.k1(w1Var));
        }
    }
}

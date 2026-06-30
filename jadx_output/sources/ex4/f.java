package ex4;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex4.o f257216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ex4.o oVar) {
        super(0);
        this.f257216d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI a17 = this.f257216d.a();
        if (a17 != null && (e3Var = a17.L1) != null) {
            com.tencent.mm.plugin.webview.core.t2 t2Var = e3Var.f181820v1;
            boolean z17 = true;
            t2Var.f181980a = true;
            java.lang.String str = t2Var.f181981b;
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                t2Var.a(t2Var.f181981b, 2);
            }
        }
        com.tencent.mm.plugin.webview.model.b6.l(17L);
        return jz5.f0.f302826a;
    }
}

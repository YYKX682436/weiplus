package uy3;

/* loaded from: classes8.dex */
public final class i0 extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f431946b;

    public i0(uy3.j0 j0Var) {
        this.f431946b = j0Var;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void e() {
        uy3.j0 j0Var = this.f431946b;
        try {
            zg0.q2 q2Var = j0Var.f431950h;
            if (q2Var != null) {
                com.tencent.mm.plugin.webview.stub.v0 e07 = ((com.tencent.mm.plugin.webview.core.r0) q2Var).e0();
                uy3.g0 g0Var = j0Var.f431951i;
                zg0.q2 q2Var2 = j0Var.f431950h;
                e07.rg(g0Var, q2Var2 != null ? ((com.tencent.mm.plugin.webview.core.r0) q2Var2).U() : 0);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanBoxDialog", th6, "initWebViewController exception", new java.lang.Object[0]);
        }
    }
}

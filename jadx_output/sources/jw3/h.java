package jw3;

/* loaded from: classes8.dex */
public final class h extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jw3.i f302323b;

    public h(jw3.i iVar) {
        this.f302323b = iVar;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void e() {
        jw3.i iVar = this.f302323b;
        try {
            zg0.q2 q2Var = iVar.f302326h;
            if (q2Var != null) {
                com.tencent.mm.plugin.webview.stub.v0 e07 = ((com.tencent.mm.plugin.webview.core.r0) q2Var).e0();
                jw3.g gVar = iVar.f302327i;
                zg0.q2 q2Var2 = iVar.f302326h;
                e07.rg(gVar, q2Var2 != null ? ((com.tencent.mm.plugin.webview.core.r0) q2Var2).U() : 0);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SelectTextDialog", th6, "initWebViewController exception", new java.lang.Object[0]);
        }
    }
}

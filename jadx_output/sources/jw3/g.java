package jw3;

/* loaded from: classes8.dex */
public final class g extends com.tencent.mm.plugin.webview.stub.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jw3.i f302322e;

    public g(jw3.i iVar) {
        this.f302322e = iVar;
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String Ni() {
        try {
            zg0.q2 q2Var = this.f302322e.f302326h;
            if (q2Var == null) {
                return "";
            }
            java.lang.String str = ((com.tencent.mm.plugin.webview.core.r0) q2Var).E;
            return str == null ? "" : str;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SelectTextDialog", th6, "getCommitUrl exception", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.b, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String getCurrentUrl() {
        try {
            zg0.q2 q2Var = this.f302322e.f302326h;
            if (q2Var == null) {
                return "";
            }
            java.lang.String Z = ((com.tencent.mm.plugin.webview.core.r0) q2Var).Z();
            return Z == null ? "" : Z;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SelectTextDialog", th6, "getCommitUrl exception", new java.lang.Object[0]);
            return "";
        }
    }
}

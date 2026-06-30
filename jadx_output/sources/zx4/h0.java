package zx4;

/* loaded from: classes8.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f477140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f477142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f477143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f477144h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f477145i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477146m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477147n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, zx4.l0 l0Var, boolean z17, com.tencent.mm.ui.widget.dialog.u3 u3Var, yz5.l lVar, boolean z18, java.lang.String str, zx4.l0 l0Var2) {
        super(1);
        this.f477140d = webViewUI;
        this.f477141e = l0Var;
        this.f477142f = z17;
        this.f477143g = u3Var;
        this.f477144h = lVar;
        this.f477145i = z18;
        this.f477146m = str;
        this.f477147n = l0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zx4.h0 h0Var;
        zx4.o oVar = (zx4.o) obj;
        if (oVar instanceof zx4.n) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("captureResult sucess: h:");
            zx4.n nVar = (zx4.n) oVar;
            sb6.append(nVar.f477169c);
            sb6.append(" w:");
            sb6.append(nVar.f477168b);
            com.tencent.mars.xlog.Log.i("WebviewScreenShotHelper", sb6.toString());
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f477140d;
            zx4.l0 l0Var = this.f477141e;
            boolean z17 = this.f477145i;
            boolean z18 = this.f477142f;
            java.lang.String str = this.f477146m;
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f477143g;
            ((yb0.g) b0Var).Ni(webViewUI, new zx4.f0(l0Var, z17, webViewUI, z18, str, u3Var, this.f477147n, oVar), new zx4.g0(l0Var, webViewUI, z18, u3Var));
            h0Var = this;
        } else {
            com.tencent.mars.xlog.Log.i("WebviewScreenShotHelper", "captureResult failed: capture failed");
            h0Var = this;
            zx4.l0.c(h0Var.f477141e, h0Var.f477140d, h0Var.f477142f, h0Var.f477143g);
        }
        yz5.l lVar = h0Var.f477144h;
        if (lVar != null) {
            if (oVar == null) {
                oVar = new zx4.m(null, 1, null);
            }
            lVar.invoke(oVar);
        }
        return jz5.f0.f302826a;
    }
}

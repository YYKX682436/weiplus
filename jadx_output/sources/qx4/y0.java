package qx4;

/* loaded from: classes8.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx4.z0 f367473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx4.m0 f367474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(qx4.z0 z0Var, qx4.m0 m0Var) {
        super(0);
        this.f367473d = z0Var;
        this.f367474e = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qx4.x0 x0Var = new qx4.x0(com.tencent.xweb.f1.WV_KIND_NONE, new android.content.MutableContextWrapper(com.tencent.mm.sdk.platformtools.x2.f193071a));
        x0Var.setPreload(true);
        qx4.z0 z0Var = this.f367473d;
        int i17 = z0Var.f367477b == 2 ? 10 : 0;
        qx4.m0 m0Var = this.f367474e;
        x0Var.J0(null, new qx4.u0(i17, m0Var, z0Var, x0Var));
        m0Var.f367427c = x0Var;
        if (m0Var.f367426b == 2) {
            qx4.e eVar = new qx4.e(new qx4.v0(x0Var));
            x0Var.addJavascriptInterface(eVar, "preloadJSApi");
            m0Var.f367428d = eVar;
        } else {
            nw4.p2 p2Var = new nw4.p2();
            x0Var.addJavascriptInterface(p2Var, "__wx");
            qx4.d0 d0Var = new qx4.d0(new qx4.w0(x0Var), new mu4.h(com.tencent.mm.plugin.webview.stub.WebViewStubService.class, "webSearch", "", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h).a());
            x0Var.addJavascriptInterface(d0Var, "webSearchJSApi");
            m0Var.f367429e = p2Var;
            m0Var.f367430f = d0Var;
        }
        x0Var.loadUrl(z0Var.f367476a);
        return jz5.f0.f302826a;
    }
}

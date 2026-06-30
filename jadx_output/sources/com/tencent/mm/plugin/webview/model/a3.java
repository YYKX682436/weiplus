package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f182763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.f3 f182764g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.e3 f182765h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182766i;

    public a3(int i17, int i18, com.tencent.mm.modelbase.o oVar, com.tencent.mm.plugin.webview.model.f3 f3Var, com.tencent.mm.plugin.webview.model.e3 e3Var, java.lang.String str) {
        this.f182761d = i17;
        this.f182762e = i18;
        this.f182763f = oVar;
        this.f182764g = f3Var;
        this.f182765h = e3Var;
        this.f182766i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f182761d;
        com.tencent.mm.plugin.webview.model.f3 f3Var = this.f182764g;
        if (i17 != 0 || this.f182762e != 0) {
            try {
                db5.e1.t((android.content.Context) this.f182765h.f182851a.get(), this.f182766i, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l8b), new com.tencent.mm.plugin.webview.model.z2(f3Var));
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OauthMultiAccountMgr", "showAlert ex " + e17.getMessage());
                return;
            }
        }
        com.tencent.mm.protobuf.f fVar = this.f182763f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.OauthAuthorizeConfirmResp");
        r45.jx4 jx4Var = (r45.jx4) fVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(jx4Var.f378199d)) {
            f3Var.c();
            return;
        }
        java.lang.String redirect_url = jx4Var.f378199d;
        kotlin.jvm.internal.o.f(redirect_url, "redirect_url");
        com.tencent.mm.plugin.webview.model.f3.b(f3Var, redirect_url);
    }
}

package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class y8 implements js.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f185572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 f185573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185574c;

    public y8(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var, nw4.y2 y2Var) {
        this.f185572a = mMFragmentActivity;
        this.f185573b = e9Var;
        this.f185574c = y2Var;
    }

    @Override // js.v0
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        ((is.i0) ((js.w0) i95.n0.c(js.w0.class))).getClass();
        w45.b bVar = w45.b.f442899a;
        nw4.y2 y2Var = this.f185574c;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var = this.f185573b;
        if (i18 != -1) {
            e9Var.f185084a.i5(y2Var, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
            return;
        }
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("setpwd_ticket") : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.PrivateCommonApiHandler", "get reset pwd ticket %s", stringExtra);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            e9Var.f185084a.i5(y2Var, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.addFlags(603979776);
        intent2.putExtra("setpwd_ticket", stringExtra);
        j45.l.x(this.f185572a, ".plugin.account.ui.RegByMobileSetPwdUI", intent2, 1, new com.tencent.mm.plugin.webview.ui.tools.jsapi.x8(e9Var, y2Var));
    }

    @Override // js.v0
    public void onCancel() {
        this.f185573b.f185084a.i5(this.f185574c, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
    }
}

package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public final class p3 implements com.tencent.mm.pluginsdk.model.app.h3 {

    /* renamed from: d, reason: collision with root package name */
    public final lt.o0 f189032d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f189033e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f189034f;

    public p3(android.content.Context context, lt.o0 o0Var) {
        this.f189033e = context;
        this.f189032d = o0Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.h3
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.pluginsdk.model.app.u3 u3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LoadAppInfoAfterLogin", "OnScenEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        zo3.p.Bi().a(7, this);
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f189034f;
        if (u3Var2 != null && u3Var2.isShowing()) {
            this.f189034f.dismiss();
            this.f189034f = null;
        }
        lt.o0 o0Var = this.f189032d;
        if (o0Var != null) {
            com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI = ((com.tencent.mm.plugin.account.ui.li) o0Var).f74021a.f74048a;
            int i19 = com.tencent.mm.plugin.account.ui.SimpleLoginUI.f73660v;
            simpleLoginUI.W6(-1);
        }
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        if (d17 != null) {
            d17.edit().putString("key_app_ids_registion_while_not_login", "").commit();
        }
    }
}

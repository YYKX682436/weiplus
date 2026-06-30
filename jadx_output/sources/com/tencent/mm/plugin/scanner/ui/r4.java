package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class r4 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f159623d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f159624e;

    /* renamed from: f, reason: collision with root package name */
    public w60.k f159625f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f159626g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f159627h = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.scanner.ui.q4(this), false);

    public r4(android.content.Context context) {
        this.f159623d = context;
    }

    public final void a(java.lang.String str, int i17, byte[] bArr) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra("geta8key_session_id", i17);
        intent.putExtra("geta8key_cookie", bArr);
        ((com.tencent.mm.app.y7) com.tencent.mm.plugin.scanner.i1.a()).D(intent, this.f159623d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        this.f159627h.d();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f159626g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, this);
        w60.k kVar = (w60.k) m1Var;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelsimple.k0 k0Var = (com.tencent.mm.modelsimple.k0) kVar;
            java.lang.String Q = k0Var.Q();
            if (Q == null || Q.length() == 0) {
                a(this.f159624e, k0Var.O(), k0Var.J());
                return;
            } else {
                a(Q, k0Var.O(), k0Var.J());
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ViewMMURL", "getA8Key fail, errType = " + i17 + ", errCode = " + i18);
        com.tencent.mm.modelsimple.k0 k0Var2 = (com.tencent.mm.modelsimple.k0) kVar;
        a(this.f159624e, k0Var2.O(), k0Var2.J());
    }
}

package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class g2 implements com.tencent.mm.plugin.webview.ui.tools.widget.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.l2 f182890c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f182892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.v0 f182893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.u1 f182894g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f182895h;

    public g2(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.model.l2 l2Var, int i17, android.os.Bundle bundle, com.tencent.mm.plugin.webview.stub.v0 v0Var, com.tencent.mm.plugin.webview.model.u1 u1Var, int i18) {
        this.f182888a = context;
        this.f182889b = str;
        this.f182890c = l2Var;
        this.f182891d = i17;
        this.f182892e = bundle;
        this.f182893f = v0Var;
        this.f182894g = u1Var;
        this.f182895h = i18;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.t6
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "WebAuthorizeDialog#onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        java.lang.String str = this.f182889b;
        if (i17 == 1) {
            ((r60.e) ((s60.e) i95.n0.c(s60.e.class))).wi(this.f182888a, com.tencent.mm.model.gdpr.a.OPENSDK, str, new com.tencent.mm.plugin.webview.model.f2(this, bundle));
            return;
        }
        if (i17 != 2 && i17 != 3) {
            ((com.tencent.mm.plugin.webview.core.o2) this.f182890c).d();
            return;
        }
        com.tencent.mm.plugin.webview.model.l2 l2Var = this.f182890c;
        com.tencent.mm.plugin.webview.stub.v0 v0Var = this.f182893f;
        com.tencent.mm.plugin.webview.model.u1 u1Var = this.f182894g;
        int i18 = this.f182895h;
        android.content.Context context = this.f182888a;
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "doRejectLogic");
        com.tencent.mm.plugin.webview.model.k2.a(v0Var, this.f182892e.getString("oauth_url"), 2, bundle == null ? new java.util.ArrayList() : (java.util.ArrayList) bundle.getSerializable("key_scope"), u1Var, false, i18, l2Var, context);
        ((com.tencent.mm.plugin.webview.core.o2) l2Var).d();
        hy4.b bVar = hy4.b.INSTANCE;
        if (str == null) {
            str = "";
        }
        bVar.a(str, com.tencent.mm.plugin.webview.model.k2.f182980a, 0, 1, 0, 1, this.f182891d);
        bVar.b(2, (int) (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.webview.model.k2.f182981b), this.f182891d);
    }
}

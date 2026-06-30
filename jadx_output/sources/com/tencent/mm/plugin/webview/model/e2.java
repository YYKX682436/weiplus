package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.f2 f182850e;

    public e2(com.tencent.mm.plugin.webview.model.f2 f2Var, int i17) {
        this.f182850e = f2Var;
        this.f182849d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f182849d;
        hy4.b bVar = hy4.b.INSTANCE;
        com.tencent.mm.plugin.webview.model.f2 f2Var = this.f182850e;
        if (i17 == 1) {
            ((com.tencent.mm.plugin.webview.core.o2) f2Var.f182874b.f182890c).d();
            com.tencent.mm.plugin.webview.model.g2 g2Var = f2Var.f182874b;
            java.lang.String str = g2Var.f182889b;
            bVar.a(str == null ? "" : str, com.tencent.mm.plugin.webview.model.k2.f182980a, 0, 1, 0, 1, g2Var.f182891d);
        } else {
            com.tencent.mm.plugin.webview.model.g2 g2Var2 = f2Var.f182874b;
            java.lang.String str2 = g2Var2.f182889b;
            bVar.a(str2 == null ? "" : str2, com.tencent.mm.plugin.webview.model.k2.f182980a, 1, 1, 0, 1, g2Var2.f182891d);
            com.tencent.mm.plugin.webview.model.g2 g2Var3 = f2Var.f182874b;
            android.os.Bundle bundle = g2Var3.f182892e;
            android.os.Bundle bundle2 = f2Var.f182873a;
            com.tencent.mm.plugin.webview.model.l2 l2Var = g2Var3.f182890c;
            com.tencent.mm.plugin.webview.stub.v0 v0Var = g2Var3.f182893f;
            com.tencent.mm.plugin.webview.model.u1 u1Var = g2Var3.f182894g;
            int i18 = g2Var3.f182895h;
            android.content.Context context = g2Var3.f182888a;
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "doAcceptLogic");
            if (bundle.getBoolean("is_call_server_when_confirm")) {
                com.tencent.mm.plugin.webview.model.k2.a(v0Var, bundle.getString("oauth_url"), 1, (java.util.ArrayList) bundle2.getSerializable("key_scope"), u1Var, true, i18, l2Var, context);
            } else {
                java.lang.String string = bundle.getString("redirect_url");
                ((com.tencent.mm.plugin.webview.core.o2) l2Var).b(string, 9);
                com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "doAcceptLogic redirectUrl: %s", string);
            }
        }
        bVar.b(2, (int) (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.webview.model.k2.f182981b), f2Var.f182874b.f182891d);
    }
}

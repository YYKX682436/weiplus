package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f182820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.f3 f182822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.e3 f182823g;

    public c3(int i17, java.lang.String str, com.tencent.mm.plugin.webview.model.f3 f3Var, com.tencent.mm.plugin.webview.model.e3 e3Var) {
        this.f182820d = i17;
        this.f182821e = str;
        this.f182822f = f3Var;
        this.f182823g = e3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String string;
        java.lang.String str = this.f182821e;
        java.lang.String str2 = "";
        hy4.b bVar = hy4.b.INSTANCE;
        if (this.f182820d == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.sendResult] MPGdprPolicyUtil.checkPolicy DENY");
            bVar.a(str == null ? "" : str, com.tencent.mm.plugin.webview.model.k2.f182980a, 0, 1, 0, 1, 0);
            com.tencent.mm.plugin.webview.model.f3.a(this.f182822f);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.sendResult] MPGdprPolicyUtil.checkPolicy PROCEED");
            bVar.a(str == null ? "" : str, com.tencent.mm.plugin.webview.model.k2.f182980a, 1, 1, 0, 1, 0);
            com.tencent.mm.plugin.webview.model.e3 e3Var = this.f182823g;
            android.os.Bundle bundle = e3Var.f182855e;
            boolean z17 = bundle != null ? bundle.getBoolean("is_call_server_when_confirm") : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.accept] isCallServerWhenConfirm = " + z17);
            if (z17) {
                e3Var.a(1);
            } else {
                android.os.Bundle bundle2 = e3Var.f182855e;
                if (bundle2 != null && (string = bundle2.getString("redirect_url")) != null) {
                    str2 = string;
                }
                com.tencent.mm.plugin.webview.model.f3.b(e3Var.f182860j, str2);
            }
        }
        bVar.b(2, (int) (java.lang.System.currentTimeMillis() - com.tencent.mm.plugin.webview.model.k2.f182981b), 0);
    }
}

package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class t2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f181980a;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Point f181982c;

    /* renamed from: d, reason: collision with root package name */
    public long f181983d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg0.k2 f181985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181986g;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f181981b = "";

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.f3 f181984e = new com.tencent.mm.plugin.webview.model.f3();

    public t2(zg0.k2 k2Var, com.tencent.mm.plugin.webview.core.e3 e3Var) {
        this.f181985f = k2Var;
        this.f181986g = e3Var;
    }

    public final boolean a(java.lang.String url, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f181986g;
        java.lang.String stringExtra = e3Var.d0().getStringExtra("geta8key_username");
        int k07 = e3Var.k0(stringExtra);
        if (!this.f181980a) {
            this.f181981b = url;
        }
        pw4.c cVar = e3Var.f181938l;
        if (cVar.f358713b && cVar.f358728q && !cVar.f358715d && ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.webview.core.x3.f182019h).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.w(e3Var.o1(), "handle oauth fail on background");
            e3Var.J(e3Var.f181949q0, url);
            return false;
        }
        com.tencent.mm.plugin.webview.model.l2 l2Var = e3Var.f181816r1;
        com.tencent.mm.plugin.webview.core.o2 o2Var = (com.tencent.mm.plugin.webview.core.o2) l2Var;
        o2Var.getClass();
        com.tencent.mm.plugin.webview.model.f3 oauthMultiAccountMgr = this.f181984e;
        kotlin.jvm.internal.o.g(oauthMultiAccountMgr, "oauthMultiAccountMgr");
        com.tencent.mm.plugin.webview.model.f3 f3Var = o2Var.f181903c;
        if (f3Var != null) {
            f3Var.c();
        }
        o2Var.f181903c = oauthMultiAccountMgr;
        com.tencent.mm.plugin.webview.stub.v0 e07 = e3Var.e0();
        com.tencent.mm.plugin.webview.core.n2 n2Var = e3Var.f181817s1;
        int e17 = e3Var.j1().e();
        android.content.Context Y = e3Var.Y();
        android.app.Dialog dialog = e3Var.f181944o;
        com.tencent.mm.plugin.webview.model.k2.f182980a = java.lang.System.currentTimeMillis();
        hy4.b.INSTANCE.d(1, "");
        com.tencent.mm.plugin.webview.core.o2 o2Var2 = (com.tencent.mm.plugin.webview.core.o2) l2Var;
        java.lang.String c17 = o2Var2.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize scene: %d, autoOauth: %d, url=%s", java.lang.Integer.valueOf(k07), java.lang.Integer.valueOf(i17), c17);
        com.tencent.mm.plugin.webview.model.w1 w1Var = new com.tencent.mm.plugin.webview.model.w1(o2Var2);
        com.tencent.mm.plugin.webview.core.e3 e3Var2 = (com.tencent.mm.plugin.webview.core.e3) o2Var2.f181901a.get();
        if (e3Var2 != null) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = o2Var2.f181902b;
            if (u3Var != null && u3Var.isShowing()) {
                u3Var.dismiss();
            }
            if (u3Var != null) {
                u3Var.setCancelMessage(null);
            }
            if (u3Var != null) {
                u3Var.setDismissMessage(null);
            }
            o2Var2.f181902b = db5.e1.Q(e3Var2.f181916a.getActivityContextIfHas(), null, e3Var2.Y().getString(com.tencent.mm.R.string.gga), true, true, w1Var);
        }
        r45.kx4 kx4Var = new r45.kx4();
        kx4Var.f379025d = url;
        kx4Var.f379026e = stringExtra;
        kx4Var.f379027f = k07;
        kx4Var.f379028g = i17;
        kx4Var.f379030i = c17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = kx4Var;
        lVar.f70665b = new r45.lx4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/oauth_authorize";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.pay.d1.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(Y);
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.model.x1(weakReference, e07, o2Var2, n2Var, url, e17, dialog));
        return true;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return !this.f181985f.f472754g && com.tencent.mm.plugin.webview.model.k2.e(url, this.f181986g.d0().getIntExtra("geta8key_scene", 0));
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return a(url, (this.f181980a || !((com.tencent.mm.plugin.webview.core.o2) this.f181986g.f181816r1).e()) ? 0 : 1);
    }
}

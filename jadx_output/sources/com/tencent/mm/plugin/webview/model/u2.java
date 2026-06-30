package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class u2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.y2 f183128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f183129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f183130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.h1 f183131g;

    public u2(com.tencent.mm.plugin.webview.model.y2 y2Var, int i17, r45.jv5 jv5Var, fl1.h1 h1Var) {
        this.f183128d = y2Var;
        this.f183129e = i17;
        this.f183130f = jv5Var;
        this.f183131g = h1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.webview.model.y2 y2Var = this.f183128d;
        java.util.ArrayList arrayList = new java.util.ArrayList(y2Var.f183198f);
        int i18 = this.f183129e;
        arrayList.remove(i18);
        if (((fl1.h1) y2Var.f183198f.get(i18)).f263786h == y2Var.f183201i) {
            ((fl1.h1) arrayList.get(0)).f263784f = true;
        }
        com.tencent.mm.plugin.webview.model.y2 y2Var2 = this.f183128d;
        y2Var2.a(this.f183130f, y2Var2.f183195c, arrayList, y2Var2.f183199g, y2Var2.f183200h);
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[[OauthDialog.showDialog] try delete avatarIdx = " + i18);
        r45.qb0 qb0Var = new r45.qb0();
        qb0Var.f383796d = this.f183131g.f263786h;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = qb0Var;
        lVar.f70665b = new r45.rb0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/oauth_delavatar";
        lVar.f70667d = 2700;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.plugin.webview.model.t2(y2Var, arrayList, this.f183130f));
    }
}

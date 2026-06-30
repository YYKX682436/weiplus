package com.tencent.mm.plugin.qqmail.stub;

/* loaded from: classes8.dex */
public class ReadMailProxy extends k55.b {

    /* renamed from: f, reason: collision with root package name */
    public final hs3.j f154807f;

    /* renamed from: g, reason: collision with root package name */
    public final hs3.j f154808g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.u6 f154809h;

    public ReadMailProxy(k55.k kVar, hs3.j jVar) {
        super(kVar);
        this.f154809h = new ns3.a(this);
        this.f154807f = jVar;
        this.f154808g = new ns3.b(this);
    }

    @k55.m
    public void cancel(long j17) {
        new com.tencent.mm.sdk.platformtools.n3().post(new ns3.d(this, j17));
    }

    @k55.m
    public long downloadQQMailApp(java.lang.String str, java.lang.String str2) {
        try {
            java.net.URL url = new java.net.URL(str);
            new java.net.URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toURL();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://wx.mail.qq.com/list/readtemplate?name=wxplugin_push.html");
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
            return -1L;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReadMailProxy", "dz[download qq mail error:%s]", e17.toString());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReadMailProxy", e17, "", new java.lang.Object[0]);
            return -1L;
        }
    }

    @k55.m
    public long get(java.lang.String str, java.util.Map map, android.os.Bundle bundle) {
        hs3.k kVar = new hs3.k();
        kVar.f284580a = bundle.getBoolean("qqmail_httpoptions_expired");
        kVar.f284581b = bundle.getBoolean("qqmail_httpoptions_needcache");
        kVar.f284582c = bundle.getBoolean("qqmail_httpoptions_needparse");
        return ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().g(str, 0, map, null, kVar, this.f154808g);
    }

    @k55.m
    public java.lang.String getBindUin() {
        return new kk.v(com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(9, null))).toString();
    }

    @k55.m
    public double getMailAppDownloadProgress(long j17) {
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        long j18 = com.tencent.mm.plugin.downloader.model.r0.i().p(j17).f96968n;
        if (j18 <= 0) {
            return 0.0d;
        }
        return (r5.f96967m * 1.0d) / j18;
    }

    @k55.m
    public java.lang.Integer getMailAppDownloadStatus(long j17) {
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        return java.lang.Integer.valueOf(com.tencent.mm.plugin.downloader.model.r0.i().p(j17).f96963f);
    }

    @k55.m
    public java.lang.String getMailAppEnterUlAndroid() {
        return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "MailAppEnterMailAppUrlAndroid");
    }

    @k55.m
    public java.lang.String getMailAppRedirectUrlAndroid() {
        return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "MailAppRedirectUrAndroid");
    }

    @k55.m
    public java.lang.Object getUneradMailCountFromConfig() {
        return gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_QQMAIL_UNREAD_COUNT_INT, -1);
    }

    @k55.m
    public void getUnreadMailCount() {
        com.tencent.mm.pluginsdk.ui.tools.u6 u6Var = this.f154809h;
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.pluginsdk.ui.tools.t6$$a(u6Var), "QQMailUnreadHelper");
    }

    @k55.m
    public java.lang.String getUserBindEmail() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(5, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    @k55.m
    public boolean isSDCardAvailable() {
        return gm0.j1.u().l();
    }

    @k55.l
    public void onComplete() {
        hs3.j jVar = this.f154807f;
        if (jVar != null) {
            jVar.a();
        }
    }

    @k55.l
    public void onError(int i17, java.lang.String str) {
        hs3.j jVar = this.f154807f;
        if (jVar != null) {
            jVar.b(i17, str);
        }
    }

    @k55.l
    public boolean onReady() {
        hs3.j jVar = this.f154807f;
        if (jVar == null) {
            return true;
        }
        return jVar.c();
    }

    @k55.l
    public void onSuccess(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        hs3.j jVar = this.f154807f;
        if (jVar != null) {
            jVar.d(str, map);
        }
    }

    @k55.m
    public long post(java.lang.String str, java.util.Map map, android.os.Bundle bundle) {
        hs3.k kVar = new hs3.k();
        kVar.f284580a = bundle.getBoolean("qqmail_httpoptions_expired");
        kVar.f284581b = bundle.getBoolean("qqmail_httpoptions_needcache");
        kVar.f284582c = bundle.getBoolean("qqmail_httpoptions_needparse");
        return ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().g(str, 1, map, null, kVar, this.f154808g);
    }

    @k55.m
    public int removeDownloadQQMailAppTask(long j17) {
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        return com.tencent.mm.plugin.downloader.model.r0.i().t(j17);
    }

    @k55.m
    public void reportKvState(int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, java.lang.Integer.valueOf(i18));
    }

    @k55.m
    public void reportKvStates(int i17, int i18, int i19) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @k55.m
    public java.lang.Integer showMailAppRecommend() {
        if (com.tencent.mm.sdk.platformtools.a0.f192439b == 1) {
            return 0;
        }
        return java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "MailApp", "ShowMailAppRecommend"), 0));
    }

    public ReadMailProxy(k55.k kVar, hs3.j jVar, os3.z4 z4Var) {
        super(kVar);
        this.f154809h = new ns3.a(this);
        this.f154807f = jVar;
        this.f154808g = new ns3.c(this);
    }
}

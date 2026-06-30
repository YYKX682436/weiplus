package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class g implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s97 f175192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175193e;

    public g(com.tencent.mm.plugin.topstory.ui.webview.j jVar, r45.s97 s97Var, java.lang.String str) {
        this.f175192d = s97Var;
        this.f175193e = str;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "TopStory.CacheHomeData";
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.jn6 jn6Var = new r45.jn6();
        r45.s97 s97Var = this.f175192d;
        jn6Var.f377979h = s97Var.f385589h.f370824f;
        jn6Var.f377976e = c01.id.c();
        r45.bk5 bk5Var = s97Var.f385589h;
        jn6Var.f377977f = bk5Var.f370822d;
        jn6Var.f377978g = bk5Var.f370823e;
        jn6Var.f377975d = this.f175193e;
        jn6Var.f377980i = bk5Var.f370825g;
        ((wm4.p) i95.n0.c(wm4.p.class)).wi().f175046f.put(java.lang.Integer.valueOf(jn6Var.f377979h), jn6Var);
        try {
            byte[] byteArray = jn6Var.toByteArray();
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(pm4.w.g());
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            com.tencent.mm.vfs.w6.R(pm4.w.g() + jn6Var.f377979h, byteArray);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "putHomeDataCache write data key: %d length: %d", java.lang.Integer.valueOf(jn6Var.f377979h), java.lang.Integer.valueOf(byteArray.length));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", e17, "putHomeDataCache ", new java.lang.Object[0]);
        }
        ((wm4.p) i95.n0.c(wm4.p.class)).wi().d(jn6Var.f377979h, "");
    }
}

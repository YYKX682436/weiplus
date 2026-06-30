package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class j extends aw4.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f175204e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f175205f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f175206g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f175207h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f175208i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f175209m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f175210n;

    public j() {
        super(null);
        this.f175204e = new java.util.HashMap();
        this.f175205f = new java.util.HashMap();
        this.f175206g = new java.util.HashMap();
        this.f175208i = new com.tencent.mm.plugin.topstory.ui.webview.d(this);
        this.f175209m = new com.tencent.mm.plugin.topstory.ui.webview.e(this);
        this.f175210n = new com.tencent.mm.plugin.topstory.ui.webview.f(this);
    }

    public final void b(r45.in6 in6Var, java.lang.String str, boolean z17) {
        java.util.HashMap hashMap = this.f175206g;
        if (!((java.lang.Boolean) hashMap.get(java.lang.Integer.valueOf(in6Var.f377194s))).booleanValue()) {
            java.util.HashMap hashMap2 = this.f175205f;
            if (z17) {
                hashMap2.remove(java.lang.Integer.valueOf(in6Var.f377194s));
                return;
            }
            com.tencent.mm.plugin.topstory.ui.webview.i iVar = new com.tencent.mm.plugin.topstory.ui.webview.i(this, null);
            iVar.f175201c = in6Var;
            iVar.f175199a = c01.id.c();
            iVar.f175200b = str;
            hashMap2.put(java.lang.Integer.valueOf(in6Var.f377194s), iVar);
            return;
        }
        aw4.q qVar = this.f14844d;
        if (((com.tencent.mm.plugin.topstory.ui.home.a) qVar) != null) {
            com.tencent.mm.plugin.topstory.ui.home.j jVar = (com.tencent.mm.plugin.topstory.ui.home.j) ((com.tencent.mm.plugin.topstory.ui.home.a) qVar);
            java.util.Iterator it = ((java.util.ArrayList) jVar.H).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.topstory.ui.home.c1 c1Var = (com.tencent.mm.plugin.topstory.ui.home.c1) it.next();
                if (c1Var.f174944c != null) {
                    c1Var.f174945d = 0;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "invalid cache when onSearchDataReady");
                }
            }
            jVar.Y = true;
            jVar.f174993m.u(str);
        }
        hashMap.remove(java.lang.Integer.valueOf(in6Var.f377194s));
    }

    public java.lang.String c(r45.in6 in6Var) {
        int i17 = in6Var.f377194s;
        java.util.HashMap hashMap = this.f175205f;
        com.tencent.mm.plugin.topstory.ui.webview.i iVar = (com.tencent.mm.plugin.topstory.ui.webview.i) hashMap.get(java.lang.Integer.valueOf(i17));
        java.lang.String str = null;
        if (iVar == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "loadDataFromCache,channelId = " + i17);
        if (iVar.f175201c.f377183e.equals(in6Var.f377183e) && iVar.f175201c.f377189n.equals(in6Var.f377189n) && c01.id.c() - iVar.f175199a <= 60000) {
            str = iVar.f175200b;
        }
        hashMap.remove(java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "load data from cache fail");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "load data from cache success %d", java.lang.Integer.valueOf(str.length()));
        }
        return str;
    }

    public void d(r45.in6 in6Var, boolean z17, boolean z18, int i17) {
        boolean r17 = wm4.u.r();
        int i18 = in6Var.f377194s;
        if (pm4.w.n(i18) && r17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "loadDataFromServer, preTabChannelId = %s，homeContext channelId = %s, hashcode = %s, needCallback = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17));
        java.util.HashMap hashMap = this.f175204e;
        sm4.b bVar = (sm4.b) hashMap.get(java.lang.Integer.valueOf(i18));
        java.util.HashMap hashMap2 = this.f175206g;
        if (!z18 && bVar != null && in6Var.f377183e.equals(bVar.f409928f.f377183e)) {
            hashMap2.put(java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "Wait current net scene");
            pm4.y.f(in6Var, "WaitCurrentNetScene", c01.id.c());
        } else {
            sm4.b bVar2 = new sm4.b(in6Var, i17);
            gm0.j1.d().a(1943, this);
            gm0.j1.d().g(bVar2);
            hashMap.put(java.lang.Integer.valueOf(i18), bVar2);
            hashMap2.put(java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "Start new net scene");
        }
    }

    public void e() {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.topstory.ui.webview.h(this, null), "TopStory.LoadHtmlDataFromSdcardTask");
    }

    @Override // aw4.a, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        if (this.f175204e.values() == null || !this.f175204e.values().contains(m1Var)) {
            return;
        }
        sm4.b bVar = (sm4.b) m1Var;
        this.f175204e.remove(java.lang.Integer.valueOf(bVar.f409928f.f377194s));
        if (this.f175204e.isEmpty()) {
            gm0.j1.d().q(1943, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "cacheCgi.isEmpty() = " + this.f175204e.isEmpty());
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "netscene topstory error");
            r45.in6 in6Var = bVar.f409928f;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("ret", -1);
            } catch (org.json.JSONException unused) {
            }
            b(in6Var, jSONObject.toString(), true);
            return;
        }
        r45.s97 s97Var = (r45.s97) bVar.f409927e.f70711b.f70700a;
        java.lang.String str2 = s97Var.f385587f;
        r45.in6 in6Var2 = bVar.f409928f;
        if (in6Var2 != null && pm4.w.l(in6Var2.f377194s)) {
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().J(s97Var.f385590i);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "try to clear haokan red dot");
        }
        r45.in6 in6Var3 = bVar.f409928f;
        if (in6Var3 != null && pm4.w.m(in6Var3.f377194s)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "clear home red dot");
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().l();
            om4.p wi6 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
            mf0.c0 c0Var = wi6.f346437e;
            if (c0Var != null) {
                ((com.tencent.mm.plugin.topstory.ui.home.l0) c0Var).d(wi6.x());
            }
        }
        r45.in6 in6Var4 = bVar.f409928f;
        if (in6Var4 != null && pm4.w.n(in6Var4.f377194s)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebData", "clear home red dot");
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().m();
            om4.p wi7 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
            mf0.c0 c0Var2 = wi7.f346437e;
            if (c0Var2 != null) {
                ((com.tencent.mm.plugin.topstory.ui.home.l0) c0Var2).e(wi7.x());
            }
        }
        b(bVar.f409928f, str2, false);
        com.tencent.mm.protobuf.f fVar = bVar.f409927e.f70711b.f70700a;
        if (((r45.s97) fVar).f385589h == null || ((r45.s97) fVar).f385589h.f370826h != 1) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.topstory.ui.webview.g(this, s97Var, str2));
    }
}

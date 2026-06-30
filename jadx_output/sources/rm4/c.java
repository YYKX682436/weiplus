package rm4;

/* loaded from: classes10.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static rm4.c f397441q;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f397442d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f397443e;

    /* renamed from: f, reason: collision with root package name */
    public long f397444f;

    /* renamed from: g, reason: collision with root package name */
    public long f397445g;

    /* renamed from: h, reason: collision with root package name */
    public sm4.c f397446h;

    /* renamed from: i, reason: collision with root package name */
    public sm4.c f397447i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f397448m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f397449n;

    /* renamed from: o, reason: collision with root package name */
    public rm4.a f397450o;

    /* renamed from: p, reason: collision with root package name */
    public rm4.b f397451p;

    public c() {
        this.f397444f = 1L;
        this.f397445g = 1L;
        java.lang.String a17 = a("blacklist");
        if (com.tencent.mm.vfs.w6.j(a17)) {
            try {
                this.f397442d = com.tencent.mm.sdk.platformtools.t8.O1(com.tencent.mm.vfs.w6.M(a17), ",");
                long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_BLACK_LIST_VERSION_LONG, 1L);
                this.f397444f = t17;
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "black version %d", java.lang.Long.valueOf(t17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryBlackListMgr", e17, "read black cache file", new java.lang.Object[0]);
            }
        }
        if (this.f397442d == null) {
            this.f397442d = new java.util.ArrayList();
        }
        java.lang.String a18 = a("unlikelist");
        if (com.tencent.mm.vfs.w6.j(a18)) {
            try {
                this.f397442d = com.tencent.mm.sdk.platformtools.t8.O1(com.tencent.mm.vfs.w6.M(a18), ",");
                long t18 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_UNLIKE_LIST_VERSION_LONG, 1L);
                this.f397445g = t18;
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "unlike version %d", java.lang.Long.valueOf(t18));
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryBlackListMgr", e18, "read unlike cache file", new java.lang.Object[0]);
            }
        }
        if (this.f397443e == null) {
            this.f397443e = new java.util.ArrayList();
        }
        gm0.j1.d().a(2748, this);
    }

    public static final java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().d() + "topstory/");
        sb6.append(str);
        return sb6.toString();
    }

    public static rm4.c b() {
        if (f397441q == null) {
            f397441q = new rm4.c();
        }
        return f397441q;
    }

    public void c() {
        com.tencent.mm.vfs.w6.R(a("blacklist"), com.tencent.mm.sdk.platformtools.t8.c1(this.f397442d, ",").getBytes());
    }

    public void d() {
        com.tencent.mm.vfs.w6.R(a("unlikelist"), com.tencent.mm.sdk.platformtools.t8.c1(this.f397443e, ",").getBytes());
    }

    public void e(long j17, int i17) {
        if (this.f397446h != null) {
            gm0.j1.d().d(this.f397446h);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "request black version %d offset %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        this.f397446h = new sm4.c(1, j17, i17);
        gm0.j1.n().f273288b.g(this.f397446h);
    }

    public void f(long j17, int i17) {
        if (this.f397447i != null) {
            gm0.j1.d().d(this.f397447i);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "request unlike version %d offset %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        this.f397447i = new sm4.c(3, j17, i17);
        gm0.j1.n().f273288b.g(this.f397447i);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.equals(this.f397446h)) {
            if (i17 == 0 && i18 == 0) {
                r45.jd3 jd3Var = (r45.jd3) this.f397446h.f409931e.f70711b.f70700a;
                int i19 = jd3Var.f377722g;
                if (i19 != 1) {
                    if (i19 == 2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "no need to update black list");
                        return;
                    } else {
                        if (i19 != 3) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "invalid black update flag %d", java.lang.Integer.valueOf(i19));
                            return;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "resync black list");
                        this.f397448m = null;
                        e(this.f397444f, 0);
                        return;
                    }
                }
                if (this.f397448m == null) {
                    this.f397448m = new java.util.ArrayList();
                }
                java.util.LinkedList linkedList = jd3Var.f377719d;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.fn fnVar = (r45.fn) it.next();
                    ((java.util.ArrayList) this.f397448m).add(fnVar.f374459d);
                }
                if (jd3Var.f377720e == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "sync black size %d version %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(jd3Var.f377723h));
                    e(jd3Var.f377723h, jd3Var.f377724i);
                    return;
                }
                this.f397442d = this.f397448m;
                this.f397448m = null;
                long j17 = jd3Var.f377723h;
                this.f397444f = j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "update black version %d total item %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f397442d.size()));
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_BLACK_LIST_VERSION_LONG, java.lang.Long.valueOf(this.f397444f));
                c();
                rm4.a aVar = this.f397450o;
                if (aVar != null) {
                    int i27 = com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI.f174890p;
                    com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI topStorySettingUI = ((com.tencent.mm.plugin.topstory.ui.home.g1) aVar).f174976a;
                    topStorySettingUI.X6();
                    topStorySettingUI.Y6();
                    return;
                }
                return;
            }
            return;
        }
        if (m1Var.equals(this.f397447i) && i17 == 0 && i18 == 0) {
            r45.jd3 jd3Var2 = (r45.jd3) this.f397447i.f409931e.f70711b.f70700a;
            int i28 = jd3Var2.f377722g;
            if (i28 != 1) {
                if (i28 == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "no need to update unlike list");
                    return;
                } else {
                    if (i28 != 3) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "invalid unlike update flag %d", java.lang.Integer.valueOf(i28));
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "resync unlike list");
                    this.f397449n = null;
                    f(this.f397445g, 0);
                    return;
                }
            }
            if (this.f397449n == null) {
                this.f397449n = new java.util.ArrayList();
            }
            java.util.LinkedList linkedList2 = jd3Var2.f377719d;
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                r45.fn fnVar2 = (r45.fn) it6.next();
                ((java.util.ArrayList) this.f397449n).add(fnVar2.f374459d);
            }
            if (jd3Var2.f377720e == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "sync unlike size %d version", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Long.valueOf(jd3Var2.f377723h));
                f(jd3Var2.f377723h, jd3Var2.f377724i);
                return;
            }
            this.f397443e = this.f397449n;
            this.f397449n = null;
            long j18 = jd3Var2.f377723h;
            this.f397445g = j18;
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBlackListMgr", "update unlike version %d total item %d", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f397443e.size()));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_UNLIKE_LIST_VERSION_LONG, java.lang.Long.valueOf(this.f397445g));
            d();
            rm4.b bVar = this.f397451p;
            if (bVar != null) {
                int i29 = com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI.f174890p;
                com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI topStorySettingUI2 = ((com.tencent.mm.plugin.topstory.ui.home.h1) bVar).f174980a;
                topStorySettingUI2.X6();
                topStorySettingUI2.Y6();
            }
        }
    }
}

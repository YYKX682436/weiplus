package wm4;

@j95.b
/* loaded from: classes2.dex */
public class p extends i95.w implements wm4.o {

    /* renamed from: e, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.topstory.ui.home.m2 f447298e;

    /* renamed from: g, reason: collision with root package name */
    public wm4.n f447300g;

    /* renamed from: d, reason: collision with root package name */
    public int f447297d = 2;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f447299f = new java.util.HashMap();

    public void Ai() {
        if (((java.lang.Boolean) ((jz5.n) ((pg3.q) ((n40.m) i95.n0.c(n40.m.class))).f354217e).getValue()).booleanValue()) {
            ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.TopStory.PluginTopStoryUI");
            if (!((java.lang.Boolean) ((jz5.n) ((pg3.q) ((n40.m) i95.n0.c(n40.m.class))).f354219g).getValue()).booleanValue()) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: wm4.p$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        wm4.p.this.Bi();
                    }
                };
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(runnable, 1000L, false);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.PluginTopStoryUI", "LongVideo-Trace, optimize thread wait");
            ku5.u0 u0Var2 = ku5.t0.f312615d;
            java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: wm4.p$$a
                @Override // java.lang.Runnable
                public final void run() {
                    wm4.p.this.Bi();
                }
            };
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.z(runnable2, 500L, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bi() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wm4.p.Bi():void");
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        boolean z17;
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HOME_UI_TIMESTAMP_LONG, 0L);
        if (c01.id.c() - t17 <= 259200000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.PluginTopStoryUI", "Use TopStory In Three Days %s", k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, t17 / 1000));
            su4.k3.e(23);
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.sdk.platformtools.u3.i(new wm4.r(this), 5000L);
        }
        s75.d.b(new wm4.q(this), "TopStory.LoadHomeCacheData");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        this.f447298e = null;
        o11.g gVar = wm4.u.f447309a;
        com.tencent.mm.autogen.events.TopStoryEvent topStoryEvent = new com.tencent.mm.autogen.events.TopStoryEvent();
        topStoryEvent.f54898g.f6509a = 4;
        topStoryEvent.e();
        q25.b.c("//topstory");
        this.f447299f.clear();
    }

    public com.tencent.mm.plugin.topstory.ui.home.m2 wi() {
        if (this.f447298e == null) {
            synchronized (this) {
                if (this.f447298e == null) {
                    this.f447298e = new com.tencent.mm.plugin.topstory.ui.home.m2();
                }
            }
        }
        return this.f447298e;
    }
}

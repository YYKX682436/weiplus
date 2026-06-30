package fn4;

/* loaded from: classes15.dex */
public class l1 {

    /* renamed from: b, reason: collision with root package name */
    public fn4.c1 f264573b;

    /* renamed from: c, reason: collision with root package name */
    public fn4.g f264574c;

    /* renamed from: d, reason: collision with root package name */
    public r45.xn6 f264575d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f264576e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f264577f;

    /* renamed from: g, reason: collision with root package name */
    public f25.m0 f264578g;

    /* renamed from: j, reason: collision with root package name */
    public fn4.b f264581j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f264582k;

    /* renamed from: a, reason: collision with root package name */
    public int f264572a = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f264579h = false;

    /* renamed from: i, reason: collision with root package name */
    public final f25.f f264580i = new fn4.d1(this);

    public static dn.o a(fn4.l1 l1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, fn4.i1 i1Var) {
        l1Var.getClass();
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_TopStoryVideoViewMgr";
        oVar.field_mediaId = str;
        oVar.M1 = str2;
        oVar.H1 = 1;
        oVar.Z = 3;
        oVar.f241809y0 = 4;
        oVar.field_fullpath = str3;
        oVar.f241815c2 = i1Var;
        return oVar;
    }

    public void b(fn4.g gVar, com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        if (gVar == this.f264574c || this.f264581j == null) {
            return;
        }
        if (this.f264573b == null) {
            fn4.c1 c1Var = new fn4.c1(this.f264581j.B(), this.f264581j);
            c1Var.setRootPath(this.f264581j.z4());
            c1Var.setIOnlineVideoProxy(new fn4.j1(this, null));
            c1Var.setReporter(new fn4.k1(this, null));
            this.f264573b = c1Var;
        }
        if (this.f264573b.getParent() != null) {
            ((android.view.ViewGroup) this.f264573b.getParent()).removeView(this.f264573b);
        }
        gVar.getVideoViewParent().addView(this.f264573b);
        this.f264573b.setVideoFooterView(gVar.getControlBar());
        this.f264573b.setScaleType(e1Var);
        this.f264573b.setIMMVideoViewCallback(gVar.getVideoViewCallback());
        j();
        this.f264574c = gVar;
    }

    public int c() {
        fn4.c1 c1Var = this.f264573b;
        if (c1Var != null) {
            return c1Var.getCurrPosMs();
        }
        return 0;
    }

    public boolean d() {
        fn4.c1 c1Var = this.f264573b;
        if (c1Var != null) {
            return c1Var.isPlaying();
        }
        return false;
    }

    public void e(int i17, int i18) {
        if (i17 == 0) {
            if (this.f264576e && this.f264582k) {
                this.f264582k = false;
                k();
                return;
            }
            return;
        }
        if (i18 == 0 && this.f264576e && d()) {
            this.f264582k = true;
            h();
        }
    }

    public void f() {
        int i17 = this.f264572a - 1;
        this.f264572a = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onUIDestroy %d", java.lang.Integer.valueOf(i17));
        if (this.f264572a <= 0) {
            if (this.f264573b != null) {
                m();
                this.f264573b.d();
            }
            this.f264581j = null;
        }
    }

    public void g(java.lang.String str) {
        rm4.d dVar = this.f264581j.o4().f264479f;
        if (dVar != null) {
            dVar.f397456e = 1L;
        }
        fn4.c1 c1Var = this.f264573b;
        if (c1Var != null && c1Var.getSessionId().equals(str)) {
            if (this.f264575d != null) {
                ((wm4.p) i95.n0.c(wm4.p.class)).f447299f.remove(this.f264575d.f390259h);
            }
            m();
        }
        uu4.a.a(26);
    }

    public void h() {
        if (this.f264573b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "abandonAudioFocus: ");
            if (this.f264578g != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f264578g);
            }
            this.f264578g = null;
            this.f264573b.setKeepScreenOn(false);
            this.f264573b.pause();
            this.f264577f = true;
        }
    }

    public void i(fn4.b bVar, r45.xn6 xn6Var, java.lang.String str, int i17) {
        r45.pn6 pn6Var = xn6Var.Y;
        if (pn6Var != null) {
            pn6Var.f383244o = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "replay video %s %s %s", xn6Var.f390259h, xn6Var.f390255d, str);
        bVar.o4().g(bVar.r0());
        bVar.o4().c();
        bVar.o4().f(xn6Var, i17, str);
        this.f264573b.setKeepScreenOn(true);
        ((com.tencent.mm.plugin.topstory.ui.video.TopStoryVideoPlayTextureView) this.f264573b.f189748q).setAlpha(1.0f);
        fn4.c1 c1Var = this.f264573b;
        c1Var.P1 = str;
        c1Var.start();
        this.f264575d = xn6Var;
        this.f264576e = true;
        this.f264577f = false;
        ((wm4.p) i95.n0.c(wm4.p.class)).f447299f.put(xn6Var.f390259h, 0);
    }

    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "requestAudioFocus: ");
        if (this.f264578g != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f264578g);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.g0.f259095c, this.f264580i);
        this.f264578g = m96;
        if (((g25.e) m96).f267980c) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "requestAudioFocus: not gain focus");
        l(false);
    }

    public void k() {
        if (this.f264573b != null) {
            j();
            this.f264573b.setKeepScreenOn(true);
            this.f264573b.play();
            this.f264577f = false;
        }
    }

    public void l(boolean z17) {
        fn4.c1 c1Var = this.f264573b;
        if (c1Var != null) {
            c1Var.setMute(z17);
        }
    }

    public void m() {
        if (this.f264573b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "stop play");
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "abandonAudioFocus: ");
            if (this.f264578g != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.f264578g);
            }
            this.f264578g = null;
            ((com.tencent.mm.plugin.topstory.ui.video.TopStoryVideoPlayTextureView) this.f264573b.f189748q).setAlpha(0.0f);
            this.f264573b.setKeepScreenOn(false);
            this.f264573b.stop();
            this.f264575d = null;
            this.f264576e = false;
            this.f264577f = false;
            fn4.b bVar = this.f264581j;
            if (bVar != null) {
                bVar.o4().g(this.f264581j.r0());
                this.f264581j.o4().c();
            }
            fn4.g gVar = this.f264574c;
            if (gVar != null) {
                gVar.o();
            }
        }
    }
}

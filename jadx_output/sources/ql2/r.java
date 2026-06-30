package ql2;

/* loaded from: classes10.dex */
public final class r extends al5.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final pj4.t f364542e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f364543f;

    /* renamed from: g, reason: collision with root package name */
    public int f364544g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g92 f364545h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.rtmp.TXLivePlayer f364546i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.SurfaceTexture f364547m;

    /* renamed from: n, reason: collision with root package name */
    public final ql2.n f364548n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f364549o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.videocomposition.effect.EffectRenderView f364550p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f364551q;

    /* renamed from: r, reason: collision with root package name */
    public f25.m0 f364552r;

    static {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.e5.a();
    }

    public r(java.lang.String str, android.widget.FrameLayout frameLayout, pj4.j0 j0Var, pj4.t tVar, java.util.Map liveInfoCache) {
        kotlin.jvm.internal.o.g(liveInfoCache, "liveInfoCache");
        this.f364542e = tVar;
        this.f364543f = liveInfoCache;
        this.f364548n = new ql2.n(this);
        android.view.View inflate = android.view.View.inflate(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.layout.axv, null);
        this.f364549o = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.fjk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f364550p = (com.tencent.mm.videocomposition.effect.EffectRenderView) findViewById;
        if (frameLayout != null) {
            frameLayout.addView(inflate);
        }
        n();
    }

    @Override // al5.a0
    public void g() {
        this.f5862d = false;
        n();
    }

    @Override // bm5.s0
    public java.lang.String getTag() {
        return "LivePullDownView";
    }

    @Override // al5.a0
    public void h() {
        this.f5862d = true;
        boolean z17 = false;
        if (this.f364551q || iq.b.y() || iq.b.F(com.tencent.mm.sdk.platformtools.x2.f193071a, false)) {
            m();
        } else {
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.y.f259117c, new ql2.p(this));
            this.f364552r = m96;
            if (m96 != null && ((g25.e) m96).f267980c) {
                z17 = true;
            }
        }
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364546i;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(true ^ z17);
        }
        o();
    }

    @Override // al5.a0
    public void i() {
    }

    @Override // al5.a0
    public void j() {
    }

    @Override // al5.a0
    public void k(float f17) {
    }

    public final void m() {
        f25.m0 m0Var = this.f364552r;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f364552r = null;
    }

    public final void n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToImage liveId:");
        r45.g92 g92Var = this.f364545h;
        sb6.append(g92Var != null ? g92Var.getString(0) : null);
        com.tencent.mars.xlog.Log.i("LivePullDownView", sb6.toString());
        this.f364544g = 0;
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364546i;
        if (tXLivePlayer != null) {
            tXLivePlayer.stopPlay(true);
        }
        m();
    }

    public final void o() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToVideo liveId:");
        r45.g92 g92Var = this.f364545h;
        sb6.append(g92Var != null ? g92Var.getString(0) : null);
        com.tencent.mars.xlog.Log.i("LivePullDownView", sb6.toString());
        this.f364544g = 1;
        r45.g92 g92Var2 = this.f364545h;
        if (g92Var2 != null) {
            r45.nw1 nw1Var = (r45.nw1) this.f364543f.get(g92Var2.getString(0));
            if (nw1Var != null && nw1Var.getInteger(2) != 2) {
                ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
                com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364546i;
                if (tXLivePlayer != null) {
                    tXLivePlayer.startLivePlay(nw1Var.getString(3), 1);
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("switchToVideo streamUrl:");
            sb7.append(nw1Var != null ? nw1Var.getString(3) : null);
            com.tencent.mars.xlog.Log.i("LivePullDownView", sb7.toString());
        }
    }

    @Override // al5.a0, pf5.g
    public void onDestroy() {
        m();
    }

    @Override // al5.a0, pf5.g
    public void onPause() {
    }

    @Override // al5.a0, pf5.g
    public void onResume() {
    }

    public final void p(r45.g92 g92Var) {
        java.lang.String string;
        if (g92Var == null) {
            return;
        }
        this.f364545h = g92Var;
        java.lang.String string2 = g92Var.getString(1);
        r45.g92 g92Var2 = this.f364545h;
        com.tencent.mars.xlog.Log.i("LivePullDownView", "tryGetLiveInfo anchorUsername:" + string2 + " liveId:" + (g92Var2 != null ? g92Var2.getString(0) : null));
        r45.g92 g92Var3 = this.f364545h;
        if (g92Var3 != null) {
            java.lang.String string3 = g92Var3.getString(0);
            java.util.Map map = this.f364543f;
            r45.nw1 nw1Var = (r45.nw1) map.get(string3);
            if (nw1Var == null || nw1Var.getInteger(2) != 2) {
                java.lang.String string4 = g92Var3.getString(1);
                if (string4 == null) {
                    string4 = "";
                }
                new ek2.y0(string4, new ql2.o(this)).l();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryGetLiveInfo cacheLiveStatus:");
            r45.nw1 nw1Var2 = (r45.nw1) map.get(g92Var3.getString(0));
            sb6.append(nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.getInteger(2)) : null);
            com.tencent.mars.xlog.Log.i("LivePullDownView", sb6.toString());
        }
        this.f364546i = new com.tencent.rtmp.TXLivePlayer(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.rtmp.TXLivePlayConfig tXLivePlayConfig = new com.tencent.rtmp.TXLivePlayConfig();
        tXLivePlayConfig.setAutoAdjustCacheTime(false);
        tXLivePlayConfig.setMaxAutoAdjustCacheTime(5.0f);
        tXLivePlayConfig.setMinAutoAdjustCacheTime(5.0f);
        tXLivePlayConfig.setCacheTime(5.0f);
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364546i;
        if (tXLivePlayer != null) {
            tXLivePlayer.setPlayerView(null);
        }
        com.tencent.rtmp.TXLivePlayer tXLivePlayer2 = this.f364546i;
        if (tXLivePlayer2 != null) {
            tXLivePlayer2.setPlayListener(this.f364548n);
        }
        com.tencent.rtmp.TXLivePlayer tXLivePlayer3 = this.f364546i;
        if (tXLivePlayer3 != null) {
            tXLivePlayer3.enableHardwareDecode(true);
        }
        hn0.w.f282443a.a("LivePullDownView");
        com.tencent.rtmp.TXLivePlayer tXLivePlayer4 = this.f364546i;
        if (tXLivePlayer4 != null) {
            tXLivePlayer4.setConfig(tXLivePlayConfig);
        }
        com.tencent.rtmp.TXLivePlayer tXLivePlayer5 = this.f364546i;
        if (tXLivePlayer5 != null) {
            tXLivePlayer5.setRenderMode(0);
        }
        pj4.t tVar = this.f364542e;
        java.lang.Integer valueOf = tVar != null ? java.lang.Integer.valueOf(tVar.f355289e) : null;
        this.f364551q = valueOf != null && valueOf.intValue() == 0;
        com.tencent.mm.videocomposition.effect.EffectRenderView effectRenderView = this.f364550p;
        effectRenderView.getEffectManager().d();
        effectRenderView.setSurfaceCallback(new ql2.m(this));
        r45.g92 g92Var4 = this.f364545h;
        if (g92Var4 == null || (string = g92Var4.getString(0)) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.u9((s40.w0) c17, com.tencent.mm.sdk.platformtools.t8.E1(string), false, null, new ql2.q(this), 0, null, null, null, 246, null);
    }
}

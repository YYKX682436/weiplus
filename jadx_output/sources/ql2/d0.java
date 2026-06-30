package ql2;

/* loaded from: classes10.dex */
public final class d0 extends al5.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f364503e;

    /* renamed from: f, reason: collision with root package name */
    public int f364504f;

    /* renamed from: g, reason: collision with root package name */
    public r45.g92 f364505g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.rtmp.TXLivePlayer f364506h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f364507i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.videocomposition.effect.EffectRenderView f364508m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f364509n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f364510o;

    /* renamed from: p, reason: collision with root package name */
    public f25.m0 f364511p;

    static {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.e5.a();
    }

    public d0(java.lang.String str, android.widget.FrameLayout frameLayout, pj4.j0 j0Var, pj4.t tVar, java.util.Map liveInfoCache) {
        java.lang.String string;
        java.util.Map d17;
        kotlin.jvm.internal.o.g(liveInfoCache, "liveInfoCache");
        this.f364503e = liveInfoCache;
        ql2.a0 a0Var = new ql2.a0(this);
        android.view.View inflate = android.view.View.inflate(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.layout.axv, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.fjk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.videocomposition.effect.EffectRenderView effectRenderView = (com.tencent.mm.videocomposition.effect.EffectRenderView) findViewById;
        this.f364508m = effectRenderView;
        if (frameLayout != null) {
            frameLayout.addView(inflate);
        }
        o();
        if (j0Var != null && (d17 = com.tencent.mm.sdk.platformtools.aa.d(j0Var.f355141f, "finderLive", null)) != null) {
            this.f364505g = zy2.d5.l("", d17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryGetLiveInfo anchorUsername:");
        r45.g92 g92Var = this.f364505g;
        sb6.append(g92Var != null ? g92Var.getString(1) : null);
        sb6.append(" liveId:");
        r45.g92 g92Var2 = this.f364505g;
        sb6.append(g92Var2 != null ? g92Var2.getString(0) : null);
        com.tencent.mars.xlog.Log.i("LivePullDownView", sb6.toString());
        r45.g92 g92Var3 = this.f364505g;
        if (g92Var3 != null) {
            r45.nw1 nw1Var = (r45.nw1) liveInfoCache.get(g92Var3.getString(0));
            if (nw1Var == null || nw1Var.getInteger(2) != 2) {
                java.lang.String string2 = g92Var3.getString(1);
                new ek2.y0(string2 != null ? string2 : "", new ql2.b0(this)).l();
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tryGetLiveInfo cacheLiveStatus:");
            r45.nw1 nw1Var2 = (r45.nw1) liveInfoCache.get(g92Var3.getString(0));
            sb7.append(nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.getInteger(2)) : null);
            com.tencent.mars.xlog.Log.i("LivePullDownView", sb7.toString());
        }
        this.f364506h = new com.tencent.rtmp.TXLivePlayer(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.rtmp.TXLivePlayConfig tXLivePlayConfig = new com.tencent.rtmp.TXLivePlayConfig();
        tXLivePlayConfig.setAutoAdjustCacheTime(false);
        tXLivePlayConfig.setMaxAutoAdjustCacheTime(5.0f);
        tXLivePlayConfig.setMinAutoAdjustCacheTime(5.0f);
        tXLivePlayConfig.setCacheTime(5.0f);
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364506h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setPlayerView(null);
        }
        com.tencent.rtmp.TXLivePlayer tXLivePlayer2 = this.f364506h;
        if (tXLivePlayer2 != null) {
            tXLivePlayer2.setPlayListener(a0Var);
        }
        com.tencent.rtmp.TXLivePlayer tXLivePlayer3 = this.f364506h;
        if (tXLivePlayer3 != null) {
            tXLivePlayer3.enableHardwareDecode(true);
        }
        hn0.w.f282443a.a("LivePullDownView");
        com.tencent.rtmp.TXLivePlayer tXLivePlayer4 = this.f364506h;
        if (tXLivePlayer4 != null) {
            tXLivePlayer4.setConfig(tXLivePlayConfig);
        }
        com.tencent.rtmp.TXLivePlayer tXLivePlayer5 = this.f364506h;
        if (tXLivePlayer5 != null) {
            tXLivePlayer5.setRenderMode(0);
        }
        java.lang.Integer valueOf = tVar != null ? java.lang.Integer.valueOf(tVar.f355289e) : null;
        boolean z17 = valueOf != null && valueOf.intValue() == 0;
        this.f364509n = z17;
        com.tencent.mars.xlog.Log.i("LivePullDownView", "initPlayer: isMute = " + z17 + ", shouldMute = " + m());
        com.tencent.rtmp.TXLivePlayer tXLivePlayer6 = this.f364506h;
        if (tXLivePlayer6 != null) {
            tXLivePlayer6.setMute(m());
        }
        effectRenderView.getEffectManager().d();
        effectRenderView.setSurfaceCallback(new ql2.z(this));
        r45.g92 g92Var4 = this.f364505g;
        if (g92Var4 == null || (string = g92Var4.getString(0)) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.u9((s40.w0) c17, com.tencent.mm.sdk.platformtools.t8.E1(string), false, null, new ql2.y(inflate), 0, null, null, null, 246, null);
    }

    @Override // al5.a0
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("LivePullDownView", "applyMute: " + z17);
        this.f364510o = z17;
        q(z17);
    }

    @Override // al5.a0
    public boolean f() {
        return true;
    }

    @Override // al5.a0
    public void g() {
        this.f5862d = false;
        o();
    }

    @Override // bm5.s0
    public java.lang.String getTag() {
        return "LivePullDownView";
    }

    @Override // al5.a0
    public void h() {
        boolean z17 = true;
        this.f5862d = true;
        if (!m() && !iq.b.y() && !iq.b.F(com.tencent.mm.sdk.platformtools.x2.f193071a, false)) {
            z17 = false;
        }
        q(z17);
        p();
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

    public final boolean m() {
        return this.f364509n || this.f364510o;
    }

    public final void n() {
        f25.m0 m0Var = this.f364511p;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f364511p = null;
    }

    public final void o() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToImage liveId:");
        r45.g92 g92Var = this.f364505g;
        sb6.append(g92Var != null ? g92Var.getString(0) : null);
        com.tencent.mars.xlog.Log.i("LivePullDownView", sb6.toString());
        this.f364504f = 0;
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364506h;
        if (tXLivePlayer != null) {
            tXLivePlayer.stopPlay(true);
        }
        n();
    }

    @Override // al5.a0, pf5.g
    public void onDestroy() {
        n();
    }

    @Override // al5.a0, pf5.g
    public void onPause() {
    }

    @Override // al5.a0, pf5.g
    public void onResume() {
    }

    public final void p() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToVideo liveId:");
        r45.g92 g92Var = this.f364505g;
        sb6.append(g92Var != null ? g92Var.getString(0) : null);
        sb6.append(", shouldMute=");
        sb6.append(m());
        com.tencent.mars.xlog.Log.i("LivePullDownView", sb6.toString());
        r45.g92 g92Var2 = this.f364505g;
        if (g92Var2 != null) {
            this.f364504f = 1;
            r45.nw1 nw1Var = (r45.nw1) this.f364503e.get(g92Var2.getString(0));
            if (nw1Var != null && nw1Var.getInteger(2) != 2) {
                ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
                com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364506h;
                if (tXLivePlayer != null) {
                    tXLivePlayer.setMute(m());
                }
                com.tencent.rtmp.TXLivePlayer tXLivePlayer2 = this.f364506h;
                if (tXLivePlayer2 != null) {
                    tXLivePlayer2.startLivePlay(nw1Var.getString(3), 1);
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("switchToVideo streamUrl:");
            sb7.append(nw1Var != null ? nw1Var.getString(3) : null);
            com.tencent.mars.xlog.Log.i("LivePullDownView", sb7.toString());
        }
    }

    public final void q(boolean z17) {
        boolean z18 = false;
        if (z17) {
            n();
        } else {
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.y.f259117c, new ql2.c0(this));
            this.f364511p = m96;
            if (m96 != null && ((g25.e) m96).f267980c) {
                z18 = true;
            }
        }
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f364506h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(true ^ z18);
        }
    }
}

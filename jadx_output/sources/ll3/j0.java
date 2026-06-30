package ll3;

/* loaded from: classes11.dex */
public class j0 extends com.tencent.mm.plugin.ball.service.d {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f319184n;

    public j0(java.lang.String str) {
        this.f319184n = "MicroMsg.GlobalMusicFloatBallHelper";
        this.f319184n = str;
        b(h0(), "MusicFloatBall");
        Q(2);
        if (h0() == 23) {
            t().f93086f = 18;
        } else if (h0() == 6) {
            t().f93086f = 1;
        }
        g();
    }

    public void e0(b21.r rVar) {
        boolean z17;
        java.lang.String str = this.f319184n;
        com.tencent.mars.xlog.Log.i(str, "addFloatBallForMusic");
        if (u()) {
            z17 = false;
        } else {
            z17 = true;
            a0(true);
        }
        if (!g0(rVar)) {
            com.tencent.mars.xlog.Log.w(str, "can not hand musicPlayerEvent and ignore");
            return;
        }
        Z(rVar.f17348g);
        V(rVar.f17349h);
        c0("song_id", rVar.f17346e);
        c0("db_music_id", xl3.c.a(rVar));
        q0(rVar);
        com.tencent.mars.xlog.Log.i(str, "onMusicPlayerEvent isFromNewMusicPlayer: %s, newBall: %s", java.lang.Boolean.valueOf(rVar.T), java.lang.Boolean.valueOf(z17));
        if (z17) {
            t().f93085e = rVar.f17345d;
            g();
            f0(rVar);
        }
        r0(rVar);
    }

    public void f0(b21.r rVar) {
        if (rVar != null) {
            com.tencent.mars.xlog.Log.i(this.f319184n, "addMusicFloatBall isFromNewMusicPlayer: %s", java.lang.Boolean.valueOf(rVar.T));
            if (rVar.T) {
                return;
            }
            j();
        }
    }

    public boolean g0(b21.r rVar) {
        return (rVar == null || rVar.T || rVar.U || h0() != 6) ? false : true;
    }

    public int h0() {
        return 6;
    }

    public java.lang.String i0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, boolean z17) {
        b21.r b17 = b21.m.b();
        java.lang.String g17 = ballInfo.g("song_id", "~");
        java.lang.String str = b17 == null ? "" : b17.f17346e;
        com.tencent.mars.xlog.Log.i(this.f319184n, "onFloatBallInfoRemoved, stop music id:%s current:%s, needStopMusic: %s, isStartPlayMusic: %s, isPlaying: %s", g17, str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(b21.m.d()), java.lang.Boolean.valueOf(b21.m.c()));
        if (z17 && b17 != null && b21.m.d() && g17.equals(str)) {
            b21.m.j();
        }
        android.view.View view = ballInfo.f93052m;
        if (view != null && (view instanceof com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView)) {
            com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView floatBallMusicLyricView = (com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView) view;
            floatBallMusicLyricView.f150672h.dead();
            kl3.t.g().f(floatBallMusicLyricView.f150671g);
        }
        if (z17) {
            return g17;
        }
        return null;
    }

    public void j0(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
    }

    public void k0(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent, b21.r rVar) {
    }

    public void l0(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
        java.lang.String string;
        boolean z17;
        boolean z18 = true;
        if (!(kl3.t.f308843g != null)) {
            com.tencent.mars.xlog.Log.e(this.f319184n, "floatBallMusicActionListener don't anything, must init MusicPlayerManager first with MusicLogic before!");
            return;
        }
        b21.r rVar = musicPlayerEvent.f54512g.f7037c;
        if (rVar == null) {
            rVar = b21.m.b();
        }
        if (rVar != null && !g0(rVar)) {
            com.tencent.mars.xlog.Log.w(this.f319184n, "onMusicPlayerEvent action: %s, isFromNewMusicPlayer: %s, isFromTingPlayer: %s", java.lang.Integer.valueOf(musicPlayerEvent.f54512g.f7036b), java.lang.Boolean.valueOf(rVar.T), java.lang.Boolean.valueOf(rVar.U));
            return;
        }
        int i17 = musicPlayerEvent.f54512g.f7036b;
        if (i17 != 0 && i17 != 1) {
            if (i17 != 2) {
                if (i17 == 3) {
                    if (u()) {
                        k0(musicPlayerEvent, rVar);
                        return;
                    }
                    return;
                } else if (i17 != 7) {
                    if ((i17 == 13 || i17 == 14) && u() && rVar != null) {
                        Z(rVar.f17348g);
                        V(rVar.f17349h);
                        c0("song_id", rVar.f17346e);
                        c0("db_music_id", xl3.c.a(rVar));
                        r0(rVar);
                        return;
                    }
                    return;
                }
            }
            com.tencent.mm.sdk.platformtools.u3.i(new ll3.g0(this, musicPlayerEvent), 200L);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.l5.Bi()) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492319g14);
        } else if (iq.b.a()) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g17);
        } else {
            ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
            if (!vq4.p0.d()) {
                ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
                if (!vq4.p0.c() && !iq.b.H() && !iq.b.d()) {
                    if (i95.n0.h(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class)) {
                        java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.plugin.appbrand.backgroundrunning.b1) ((com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class))).Bi()).iterator();
                        while (it.hasNext()) {
                            if ((((com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) it.next()).f76923f & 4) > 0) {
                                com.tencent.mars.xlog.Log.i(this.f319184n, "isAnyAppInVOIP, already exist wxa using VOIP");
                                z17 = true;
                                break;
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g17);
                    } else {
                        string = null;
                        if (iq.b.m(null, false, null) || iq.b.n(null, false)) {
                            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492316g11);
                        } else {
                            iq.b.r();
                        }
                    }
                }
            }
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g18);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            z18 = false;
        } else {
            b21.m.j();
            ((ku5.t0) ku5.t0.f312615d).B(new ll3.h0(this, string));
        }
        if (z18) {
            return;
        }
        e0(rVar);
        m0(musicPlayerEvent, rVar);
    }

    public void m0(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent, b21.r rVar) {
    }

    public void n0(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
    }

    public void o0() {
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        int i17 = this.f93132d.H;
        ((ov.p0) j0Var).getClass();
        java.lang.Boolean bool = qp1.w.f365755a;
        b0(i17 & (-3));
    }

    public void p0(b21.r rVar) {
        if (u()) {
            return;
        }
        a0(true);
        Z(rVar.f17348g);
        V(rVar.f17349h);
        c0("song_id", rVar.f17346e);
        c0("db_music_id", xl3.c.a(rVar));
        q0(rVar);
        t().f93085e = rVar.f17345d;
        g();
        r0(rVar);
        f0(rVar);
    }

    public void q0(b21.r rVar) {
        if (rVar.T) {
            return;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        int i17 = this.f93132d.H;
        ((ov.p0) j0Var).getClass();
        java.lang.Boolean bool = qp1.w.f365755a;
        ballInfo.H = i17 | 2;
        b0(this.f93132d.H);
    }

    public final void r0(b21.r rVar) {
        if (rVar.T) {
            return;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo.f93052m == null) {
            ballInfo.f93052m = new com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView(com.tencent.mm.sdk.platformtools.x2.f193071a, null);
        }
        android.view.View view = this.f93132d.f93052m;
        if (view instanceof com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView) {
            ((com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView) view).setMusicWrapper(rVar);
            com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView floatBallMusicLyricView = (com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView) this.f93132d.f93052m;
            floatBallMusicLyricView.f150672h.alive();
            kl3.t g17 = kl3.t.g();
            com.tencent.mm.plugin.music.player.base.k kVar = floatBallMusicLyricView.f150671g;
            rl3.b bVar = (rl3.b) g17.a();
            if (kVar == null) {
                bVar.getClass();
                return;
            }
            java.util.LinkedList linkedList = bVar.f397235j;
            if (linkedList.contains(kVar)) {
                return;
            }
            linkedList.add(kVar);
        }
    }
}

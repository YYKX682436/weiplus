package kl3;

/* loaded from: classes16.dex */
public class t extends kl3.q {

    /* renamed from: g, reason: collision with root package name */
    public static kl3.t f308843g;

    /* renamed from: e, reason: collision with root package name */
    public kl3.e f308844e;

    /* renamed from: f, reason: collision with root package name */
    public xl3.b f308845f;

    public t(kl3.e eVar) {
        this.f308844e = eVar;
    }

    public static kl3.t g() {
        kl3.t tVar = f308843g;
        if (tVar == null) {
            throw new java.lang.NullPointerException("must init MusicPlayerManager with your impl logic first!!!");
        }
        if (tVar.f308844e == null) {
            tVar.f308844e = new kl3.r();
        }
        ((ll3.o2) ((cl3.e) i95.n0.c(cl3.e.class))).requireAccountInitialized();
        return f308843g;
    }

    public static xl3.b k() {
        if (g().f308845f == null) {
            g().f308845f = new xl3.b();
        }
        return g().f308845f;
    }

    public static kl3.e l() {
        return g().f308844e;
    }

    @Override // kl3.q
    public com.tencent.mm.plugin.music.player.base.l a() {
        b21.r j17 = j();
        return xl3.d.a(j17) ? this.f308841c : (j17 == null || !xl3.d.b(j17.f17345d)) ? this.f308839a : this.f308840b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(b21.r rVar) {
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicUrlParser", "GetShakeMusicUrl, musicWrapper is null");
        } else {
            boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
            boolean isNetworkConnected = com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
            java.lang.String str = com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17352n) ? rVar.f17354p : rVar.f17352n;
            java.lang.String str2 = rVar.f17353o;
            java.lang.String d17 = xl3.f.d(str, str2, isWifi, pBool);
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUrlParser", "parsePlayUrl mSrc:%s", d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUrlParser", "songWifiUrl:%s", rVar.f17352n);
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUrlParser", "isWifi:%d, isQQMusic:%d", java.lang.Integer.valueOf(isWifi ? 1 : 0), java.lang.Integer.valueOf(pBool.value ? 1 : 0));
            boolean z17 = false;
            boolean z18 = isWifi ? pBool.value : false;
            if (!isNetworkConnected) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUrlParser", "isNetConnected false, detect right Url to play");
                java.lang.String d18 = xl3.f.d(str, str2, true, pBool);
                java.lang.String d19 = xl3.f.d(str, str2, false, pBool);
                if ((d18 == null || !d18.equals(d19)) && !xl3.d.a(rVar)) {
                    if (xl3.d.b(rVar.f17345d)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUrlParser", "use qqMusicPlayer");
                        if ((gl3.i.b(d18) && gl3.i.c(d18) > 0) == false) {
                            if (gl3.i.b(d19) && gl3.i.c(d19) > 0) {
                                z17 = true;
                            }
                            if (z17) {
                                d18 = d19;
                            }
                        }
                    } else {
                        if (!xl3.e.a(rVar, true)) {
                            d18 = xl3.e.a(rVar, false) ? d19 : "";
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUrlParser", "use musicPlayer");
                    }
                    if (!android.text.TextUtils.isEmpty(d18) && !d18.equals(d17)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUrlParser", "reset the mSrc :%s", d18);
                        d17 = d18;
                    }
                }
                d18 = "";
                if (!android.text.TextUtils.isEmpty(d18)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUrlParser", "reset the mSrc :%s", d18);
                    d17 = d18;
                }
            }
            rVar.Q = d17;
            com.tencent.mm.sdk.platformtools.r2 r2Var = gl3.h.f272831a;
            if (!android.text.TextUtils.isEmpty(d17)) {
                gl3.h.f272832b.put(d17, java.lang.Boolean.valueOf(z18));
            }
        }
        if (this.f308844e.s(rVar)) {
            d(rVar);
        } else {
            e();
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicPlayerManager", "prepare is fail, not to play or wait for callback onStart");
        }
    }

    public void i() {
        o();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayerManager", "release");
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicBasePlayEngine", "release");
        rl3.t tVar = this.f308840b;
        if (tVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "release");
            com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = tVar.f397278l;
            if (commonPlayer != null) {
                commonPlayer.release();
                tVar.f397278l = null;
            }
            synchronized (tVar.f397234i) {
                com.tencent.mm.sdk.platformtools.h5 h5Var = tVar.f397234i[0];
                if (h5Var != null) {
                    ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).Di(h5Var);
                    tVar.f397234i[0] = null;
                }
            }
        }
        rl3.u uVar = this.f308841c;
        if (uVar != null) {
            try {
                com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer = uVar.f397294l;
                if (tPPlayer != null) {
                    tPPlayer.release();
                    uVar.f397294l = null;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.TPMusicPlayer", e17, "release", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.f308842d);
        this.f308844e.release();
        this.f308845f = null;
    }

    public b21.r j() {
        return this.f308844e.o();
    }

    public void m(boolean z17) {
        rl3.p pVar = this.f308839a;
        if (pVar.i()) {
            pVar.f397228c = z17;
        }
        rl3.t tVar = this.f308840b;
        if (tVar.i()) {
            tVar.f397228c = z17;
        }
        rl3.u uVar = this.f308841c;
        if (uVar.i()) {
            uVar.f397228c = z17;
        }
    }

    public void n(b21.r rVar) {
        if (rVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayerManager", "MusicType %d", java.lang.Integer.valueOf(rVar.f17345d));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayerManager", "startPlayNewMusic");
        h(this.f308844e.g(rVar));
    }

    public void o() {
        this.f308839a.stopPlay();
        rl3.t tVar = this.f308840b;
        if (tVar != null) {
            tVar.stopPlay();
        }
        rl3.u uVar = this.f308841c;
        if (uVar != null) {
            uVar.stopPlay();
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.f308842d);
    }

    public void p(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicBasePlayEngine", "stopMusicDelayIfPaused, delay_ms:%d", java.lang.Integer.valueOf(i17));
        java.lang.Runnable runnable = this.f308842d;
        com.tencent.mm.sdk.platformtools.u3.l(runnable);
        com.tencent.mm.sdk.platformtools.u3.i(runnable, i17);
    }
}

package rl3;

/* loaded from: classes15.dex */
public class t extends rl3.b {

    /* renamed from: k, reason: collision with root package name */
    public b21.r f397277k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.qqmusic.mediaplayer.CommonPlayer f397278l;

    /* renamed from: m, reason: collision with root package name */
    public b21.o f397279m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f397280n;

    /* renamed from: o, reason: collision with root package name */
    public rl3.s f397281o;

    /* renamed from: p, reason: collision with root package name */
    public vl3.b f397282p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f397284r;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f397283q = "";

    /* renamed from: s, reason: collision with root package name */
    public int f397285s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f397286t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f397287u = 0;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType f397288v = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;

    /* renamed from: w, reason: collision with root package name */
    public boolean f397289w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f397290x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f397291y = false;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.qqmusic.mediaplayer.PlayerListenerCallback f397292z = new rl3.r(this);

    public t() {
        com.tencent.mm.plugin.music.player.base.d.b();
    }

    public static void x(rl3.t tVar) {
        com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType = tVar.f397288v;
        if (audioType == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "idKeyReportMusicMimeType audioType:%d, isStatMineType:%b", java.lang.Integer.valueOf(audioType.getValue()), java.lang.Boolean.valueOf(tVar.f397289w));
        if (tVar.f397289w) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "idKeyReportMusicMimeType OK");
        tVar.f397289w = true;
        kl3.h hVar = tVar.f397229d;
        if (hVar != null) {
            b21.r rVar = tVar.f397277k;
            int value = tVar.f397288v.getValue();
            ((pl3.e) hVar).f356703a.getClass();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
            iDKey.SetKey(value == 2 ? 92 : value == 3 ? 93 : value == 4 ? 94 : value == 5 ? 95 : value == 6 ? 96 : value == 7 ? 97 : value == 8 ? 98 : value == 9 ? 99 : 100);
            iDKey.SetValue(1L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(iDKey);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.j(arrayList, true, false);
            java.lang.String c17 = gl3.h.c(rVar.Q);
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayerReportImpl", "mineTypeStr:%s", c17);
            if (android.text.TextUtils.isEmpty(c17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayerReportImpl", "music is null or mineTypeStr is empty");
            } else {
                g0Var.d(14486, 1, java.lang.Integer.valueOf(rVar.f17345d), java.lang.Integer.valueOf(pl3.a.a(c17)), c17);
            }
        }
    }

    public final boolean A(b21.r rVar) {
        return rVar != null && rVar.a(kl3.t.g().j());
    }

    public void B(float f17) {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f397278l;
        if (commonPlayer == null) {
            return;
        }
        if (f17 < 0.5f || f17 > 2.0f) {
            commonPlayer.setSpeed(1.0f);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "set speed :%f", java.lang.Float.valueOf(f17));
            this.f397278l.setSpeed(f17);
        }
    }

    public final void C() {
        if (this.f397278l != null) {
            this.f397231f = a();
            this.f397233h += android.os.SystemClock.elapsedRealtime() - this.f397232g;
            long duration = getDuration();
            kl3.h hVar = this.f397229d;
            if (hVar != null) {
                b21.r rVar = this.f397277k;
                long j17 = this.f397231f;
                long j18 = this.f397233h;
                pl3.e eVar = (pl3.e) hVar;
                if (rVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatReportService", "scene:%d, endPosition:%d, totalPlayTime:%d, duration:%d", java.lang.Integer.valueOf(rVar.f17345d), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(duration));
                    if (rVar.f17345d == 10) {
                        eVar.A(rVar, j17, j18, duration);
                    }
                }
            }
        }
    }

    public final boolean D() {
        return kl3.t.g().j() == null;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public int a() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f397278l;
        if (commonPlayer != null) {
            return (int) commonPlayer.getCurrentPosition();
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void b() {
        this.f397291y = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "passivePause");
        if (this.f397278l == null || !i()) {
            return;
        }
        try {
            this.f397278l.pause();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e17, "passivePause", new java.lang.Object[0]);
            m(this.f397277k, 503);
            y(this.f397277k, 503);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean c(int i17) {
        int duration = getDuration();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "seekToMusic pos:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(duration));
        if (duration < 0 || i17 > duration) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "position is invalid, position:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(duration));
            stopPlay();
            return false;
        }
        if (this.f397278l != null) {
            b21.r rVar = this.f397277k;
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onSeekingEvent");
            this.f397227b = "seeking";
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
            am.jk jkVar = musicPlayerEvent.f54512g;
            jkVar.f7036b = 12;
            jkVar.f7037c = rVar;
            jkVar.f7040f = "seeking";
            jkVar.f7039e = getDuration();
            jkVar.f7041g = true;
            musicPlayerEvent.b(android.os.Looper.getMainLooper());
            kl3.e eVar = this.f397230e;
            if (eVar != null) {
                eVar.l(rVar);
            }
            this.f397278l.seekTo(i17);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "pauseAndAbandonFocus");
        pause();
        w();
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean e() {
        return true;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public b21.o f() {
        int duration = getDuration();
        int a17 = a();
        boolean i17 = i();
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f397278l;
        int bufferedPercentage = commonPlayer != null ? commonPlayer.getBufferedPercentage() : 0;
        if (bufferedPercentage < 0 || bufferedPercentage > 100) {
            bufferedPercentage = 0;
        }
        int i18 = bufferedPercentage >= 0 ? bufferedPercentage : 0;
        b21.o oVar = this.f397279m;
        if (oVar != null) {
            oVar.f17337a = duration;
            oVar.f17338b = a17;
            oVar.f17339c = i17 ? 1 : 0;
            oVar.f17340d = i18;
        } else {
            this.f397279m = new b21.o(duration, a17, i17 ? 1 : 0, i18);
        }
        this.f397279m.getClass();
        b21.o oVar2 = this.f397279m;
        oVar2.f17341e = this.f397227b;
        return oVar2;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean g() {
        if (!this.f397280n) {
            return false;
        }
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f397278l;
        return !(commonPlayer != null && commonPlayer.getPlayerState() == 3);
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public int getDuration() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f397278l;
        if (commonPlayer != null) {
            return commonPlayer.getDuration();
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean h() {
        return this.f397280n && this.f397291y;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean i() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f397278l;
        return commonPlayer != null && commonPlayer.getPlayerState() == 4;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void j(boolean z17) {
        v(z17);
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void pause() {
        this.f397291y = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "pause");
        if (this.f397278l == null || !i()) {
            return;
        }
        try {
            this.f397278l.pause();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e17, "pause", new java.lang.Object[0]);
            m(this.f397277k, 503);
            y(this.f397277k, 503);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void resume() {
        v(true);
    }

    @Override // rl3.b
    public boolean s() {
        if (t(this.f397277k)) {
            return super.s();
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void stopPlay() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "stopPlay");
        try {
            C();
            com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f397278l;
            if (commonPlayer != null) {
                commonPlayer.stop();
            }
            rl3.s sVar = this.f397281o;
            if (sVar != null) {
                sVar.f397275d = true;
                this.f397281o = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e17, "stopPlay", new java.lang.Object[0]);
            m(this.f397277k, 504);
            y(this.f397277k, 504);
        }
        w();
        this.f397280n = false;
        this.f397291y = false;
    }

    public final void v(boolean z17) {
        this.f397285s = 0;
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f397278l;
        boolean z18 = commonPlayer != null && commonPlayer.getPlayerState() == 3;
        boolean i17 = i();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(i17);
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer2 = this.f397278l;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(commonPlayer2 != null && commonPlayer2.getPlayerState() == 5);
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer3 = this.f397278l;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "resume, isPreparing:%b, isPlayingMusic:%b, paused:%b, isPrepared:%b", valueOf, valueOf2, valueOf3, java.lang.Boolean.valueOf(commonPlayer3 != null && commonPlayer3.getPlayerState() == 2));
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer4 = this.f397278l;
        if (commonPlayer4 != null) {
            if (!(commonPlayer4 != null && commonPlayer4.getPlayerState() == 5)) {
                com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer5 = this.f397278l;
                if (!(commonPlayer5 != null && commonPlayer5.getPlayerState() == 2)) {
                    return;
                }
            }
            if (i17) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "requestFocus:%b", java.lang.Boolean.valueOf(z17));
            if (!z17 || s()) {
                try {
                    this.f397278l.start();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e17, "resume", new java.lang.Object[0]);
                    m(this.f397277k, 502);
                    y(this.f397277k, 502);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "request focus error");
            }
            this.f397280n = true;
        }
    }

    public void w() {
        kl3.e eVar;
        if (!t(this.f397277k) || (eVar = this.f397230e) == null) {
            return;
        }
        eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(b21.r r23, int r24) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rl3.t.y(b21.r, int):void");
    }

    public void z() {
        this.f397229d = (kl3.h) sl3.b.b(kl3.h.class);
        kl3.e l17 = kl3.t.l();
        this.f397230e = l17;
        if (l17 != null) {
            this.f397290x = l17.h();
        }
    }
}

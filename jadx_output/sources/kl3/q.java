package kl3;

/* loaded from: classes15.dex */
public abstract class q implements kl3.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f308842d = new kl3.p(this);

    /* renamed from: a, reason: collision with root package name */
    public final rl3.p f308839a = new rl3.p();

    /* renamed from: b, reason: collision with root package name */
    public final rl3.t f308840b = new rl3.t();

    /* renamed from: c, reason: collision with root package name */
    public final rl3.u f308841c = new rl3.u();

    public abstract com.tencent.mm.plugin.music.player.base.l a();

    public void b(b21.r rVar) {
        if (xl3.d.a(rVar)) {
            rl3.u uVar = this.f308841c;
            uVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
            uVar.m(rVar, -1);
            return;
        }
        if (rVar == null || !xl3.d.b(rVar.f17345d)) {
            rl3.p pVar = this.f308839a;
            pVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
            pVar.m(rVar, -1);
            return;
        }
        rl3.t tVar = this.f308840b;
        tVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
        tVar.m(rVar, -1);
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicBasePlayEngine", "sendPreemptedEvent");
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar = musicPlayerEvent.f54512g;
        jkVar.f7036b = 10;
        jkVar.f7040f = "preempted";
        jkVar.f7044j = "not from app brand appid";
        jkVar.f7041g = true;
        musicPlayerEvent.b(android.os.Looper.getMainLooper());
    }

    public void d(final b21.r rVar) {
        if (xl3.d.a(rVar)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicBasePlayEngine", "use musicPlayer");
            e();
            final rl3.u uVar = this.f308841c;
            uVar.v();
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "init and start download");
            uVar.stopPlay();
            if (rVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "music is null");
            } else {
                if (uVar.f397229d != null) {
                    pl3.c.a(rVar, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "initIdKeyStatData");
                    ((pl3.e) uVar.f397229d).z();
                }
                uVar.f397295m = rVar;
                if (uVar.f397294l == null) {
                    com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer = new com.tencent.thumbplayer.tplayer.TPPlayer(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    uVar.f397294l = tPPlayer;
                    tPPlayer.setDataSource(rVar.Q);
                    uVar.f397294l.setOnErrorListener(new com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener() { // from class: rl3.u$$a
                        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
                        public final void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
                            rl3.u uVar2 = rl3.u.this;
                            uVar2.getClass();
                            if (kl3.t.g().j() == null) {
                                return;
                            }
                            uVar2.stopPlay();
                            uVar2.r(uVar2.f397295m);
                            kl3.h hVar = uVar2.f397229d;
                            if (hVar != null) {
                                ((pl3.e) hVar).y(uVar2.f397295m, i17, i18);
                            }
                        }
                    });
                    uVar.f397294l.setOnCompletionListener(new com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener() { // from class: rl3.u$$b
                        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
                        public final void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
                            rl3.u uVar2 = rl3.u.this;
                            uVar2.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "setEvents, onComplete");
                            if (kl3.t.g().j() == null) {
                                return;
                            }
                            uVar2.l(uVar2.f397295m);
                        }
                    });
                    uVar.f397294l.setOnStopAsyncCompleteListener(new com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener() { // from class: rl3.u$$c
                        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener
                        public final void onStopAsyncComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
                            rl3.u uVar2 = rl3.u.this;
                            uVar2.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "setEvents, onStop");
                            b21.r j17 = kl3.t.g().j();
                            if (j17 == null) {
                                return;
                            }
                            if (j17.a(rVar)) {
                                uVar2.stopPlay();
                            }
                            uVar2.r(uVar2.f397295m);
                        }
                    });
                    uVar.f397294l.setOnPreparedListener(new com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener() { // from class: rl3.u$$d
                        @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
                        public final void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
                            rl3.u uVar2 = rl3.u.this;
                            uVar2.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "setEvents, onStart");
                            b21.r j17 = kl3.t.g().j();
                            if (j17 == null) {
                                return;
                            }
                            if (!uVar2.t(uVar2.f397295m) || uVar2.s()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "startPlay");
                                try {
                                    com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer2 = uVar2.f397294l;
                                    if (tPPlayer2 != null) {
                                        tPPlayer2.start();
                                    }
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.TPMusicPlayer", e17, "startPlay", new java.lang.Object[0]);
                                }
                                uVar2.f397296n = true;
                                uVar2.f397297o = false;
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.Music.TPMusicPlayer", "request focus error");
                            }
                            uVar2.q(j17);
                            kl3.h hVar = uVar2.f397229d;
                            if (hVar != null) {
                                b21.r rVar2 = uVar2.f397295m;
                                ((pl3.e) hVar).f356704b.getClass();
                                java.lang.String c17 = gl3.h.c(rVar2.Q);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Music.TpMusicPlayerReportImpl", "mineTypeStr:%s", c17);
                                if (android.text.TextUtils.isEmpty(c17)) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.TpMusicPlayerReportImpl", "music is null or mineTypeStr is empty");
                                } else {
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14486, 2, java.lang.Integer.valueOf(rVar2.f17345d), java.lang.Integer.valueOf(pl3.a.a(c17)), c17);
                                }
                            }
                        }
                    });
                    uVar.f397294l.setOnInfoListener(new rl3.v(uVar));
                    try {
                        uVar.f397294l.prepareAsync();
                    } catch (java.io.IOException unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Music.TPMusicPlayer", "mediaPlayer prepareAsync error");
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "startPlay src:%s,  playUrl:%s", rVar.f17352n, rVar.Q);
                uVar.k();
            }
        } else if (xl3.d.b(rVar.f17345d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicBasePlayEngine", "use qqMusicPlayer");
            e();
            if (!rVar.M && ((kl3.t) this).f308844e.x(rVar.f17345d)) {
                rVar.M = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicBasePlayEngine", "support useNetworkDataPlay, MusicType:%d", java.lang.Integer.valueOf(rVar.f17345d));
            }
            rl3.t tVar = this.f308840b;
            tVar.z();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = currentTimeMillis - tVar.f397287u;
            b21.r rVar2 = tVar.f397277k;
            if (rVar2 == null || !rVar2.a(rVar) || j17 > 20) {
                tVar.f397231f = 0L;
                tVar.f397232g = android.os.SystemClock.elapsedRealtime();
                tVar.f397233h = 0L;
                if (tVar.f397229d != null) {
                    pl3.c.a(rVar, false);
                }
                tVar.f397287u = currentTimeMillis;
                tVar.f397277k = rVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "startPlay, currentTime:%d, startTime:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(rVar.D));
                if (tVar.f397278l != null && tVar.i()) {
                    tVar.f397278l.stop();
                }
                com.tencent.mm.plugin.music.player.base.d.a();
                tVar.f397285s = 0;
                tVar.f397286t = rVar.D;
                java.net.URL url = null;
                tVar.f397288v = null;
                tVar.f397289w = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "initPlayer");
                b21.r rVar3 = tVar.f397277k;
                java.lang.String str = rVar3.Q;
                tVar.f397283q = str;
                java.lang.String str2 = rVar3.f17357s;
                tVar.f397284r = str2;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "mSrc:%s mSongLocalPath:%s", str, str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "field_songWifiUrl:%s", tVar.f397277k.f17352n);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(tVar.f397283q) && com.tencent.mm.sdk.platformtools.t8.K0(tVar.f397284r)) {
                    gl3.h.f(tVar.f397283q);
                    java.lang.String str3 = tVar.f397283q;
                    if (str3 != null) {
                        gl3.h.f272833c.put(str3, 0);
                    }
                    gl3.h.e(tVar.f397283q, 0);
                    b21.r rVar4 = tVar.f397277k;
                    java.lang.String str4 = rVar4.Q;
                    boolean z17 = rVar4.M;
                    if (!android.text.TextUtils.isEmpty(str4)) {
                        gl3.h.f272837g.put(str4, java.lang.Boolean.valueOf(z17));
                    }
                }
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(tVar.f397284r);
                com.tencent.qqmusic.mediaplayer.PlayerListenerCallback playerListenerCallback = tVar.f397292z;
                if (K0) {
                    try {
                        url = new java.net.URL(tVar.f397283q);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e17, "initPlayer", new java.lang.Object[0]);
                        com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "new URL exception:" + e17.getMessage());
                    }
                    if (url == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "initPlayer url is null");
                        tVar.m(tVar.f397277k, 500);
                        tVar.y(tVar.f397277k, 500);
                        tVar.k();
                    } else {
                        if (tVar.f397278l == null) {
                            tVar.f397278l = new com.tencent.qqmusic.mediaplayer.CommonPlayer(playerListenerCallback);
                        }
                        tVar.f397278l.reset();
                        if (tVar.f397282p == null) {
                            tVar.f397282p = new vl3.b();
                        }
                        b21.r rVar5 = tVar.f397277k;
                        java.lang.String str5 = rVar5 == null ? "invalidReferrer" : rVar5.S;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "initPlayer, referrer: " + str5);
                        tVar.f397282p.a(tVar.f397283q, str5);
                        try {
                            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "QQMusicPlayer temp cache dir:%s", tVar.f397290x);
                            if (!android.text.TextUtils.isEmpty(tVar.f397290x)) {
                                tVar.f397278l.setOnlinePlayCacheDir(tVar.f397290x);
                            }
                            tVar.f397278l.setDataSource(tVar.f397282p, android.net.Uri.parse(url.toString()));
                            tVar.f397278l.prepare();
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "initPlayer exception:" + e18.getMessage());
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e18, "initPlayer", new java.lang.Object[0]);
                            tVar.m(tVar.f397277k, 501);
                            tVar.y(tVar.f397277k, 501);
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "play with local file, filePath:%s", tVar.f397284r);
                    if (tVar.f397278l == null) {
                        tVar.f397278l = new com.tencent.qqmusic.mediaplayer.CommonPlayer(playerListenerCallback);
                    }
                    tVar.f397278l.reset();
                    if (tVar.f397284r.startsWith("file://")) {
                        tVar.f397284r = tVar.f397284r.substring(7);
                    }
                    try {
                        tVar.f397278l.setDataSource(tVar.f397284r);
                        tVar.f397278l.prepare();
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "initPlayer exception:" + e19.getMessage());
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e19, "initPlayer", new java.lang.Object[0]);
                        tVar.m(tVar.f397277k, 501);
                        tVar.y(tVar.f397277k, 501);
                    }
                }
                tVar.B((float) tVar.f397277k.K);
                float f17 = tVar.f397277k.L;
                com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = tVar.f397278l;
                if (commonPlayer != null && f17 >= 0.0f) {
                    commonPlayer.setVolume(f17, f17);
                }
                tVar.k();
            } else {
                tVar.f397277k = rVar;
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "startPlay, is playing for music src:%s, don't play again in 3 second, interval:%d", tVar.f397283q, java.lang.Long.valueOf(j17));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicBasePlayEngine", "use musicPlayer");
            e();
            rl3.p pVar = this.f308839a;
            pVar.z();
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "init and start download");
            pVar.stopPlay();
            jl3.d dVar = new jl3.d(rVar, gl3.e.b(rVar.f17346e));
            pVar.f397267m = dVar;
            dVar.f300221q = pVar.f397271q;
            if (pVar.f397229d != null) {
                pl3.c.a(rVar, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "initIdKeyStatData");
                ((pl3.e) pVar.f397229d).z();
                ((pl3.e) pVar.f397229d).f356705c.f356697j = pVar.f397267m;
            }
            pVar.f397265k = rVar;
            pVar.y(rVar, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "startPlay src:%s,  playUrl:%s", rVar.f17352n, rVar.Q);
            jl3.d dVar2 = pVar.f397267m;
            if (dVar2.f300217m) {
                dVar2.f300217m = false;
                s75.d.b(dVar2, "music_download_thread");
            }
            pVar.k();
        }
        if (rVar.f17345d != 11) {
            c();
        }
    }

    public void e() {
        rl3.p pVar = this.f308839a;
        if (pVar.i()) {
            pVar.stopPlay();
        }
        rl3.t tVar = this.f308840b;
        if (tVar.i()) {
            tVar.stopPlay();
        }
        rl3.u uVar = this.f308841c;
        if (uVar.i()) {
            uVar.stopPlay();
        }
    }

    public void f(com.tencent.mm.plugin.music.player.base.k kVar) {
        ((rl3.b) a()).u(kVar);
        rl3.p pVar = this.f308839a;
        if (pVar.f397235j.size() > 0) {
            pVar.u(kVar);
        }
        rl3.t tVar = this.f308840b;
        if (tVar.f397235j.size() > 0) {
            tVar.u(kVar);
        }
        rl3.u uVar = this.f308841c;
        if (uVar.f397235j.size() > 0) {
            uVar.u(kVar);
        }
    }
}

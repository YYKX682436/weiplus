package rl3;

/* loaded from: classes15.dex */
public class r implements com.tencent.qqmusic.mediaplayer.PlayerListenerCallback {

    /* renamed from: d, reason: collision with root package name */
    public b21.r f397273d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl3.t f397274e;

    public r(rl3.t tVar) {
        this.f397274e = tVar;
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onBufferingUpdate(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onCompletion(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onCompletion");
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onError(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "onError what:%d, extra:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        rl3.t tVar = this.f397274e;
        if (tVar.D()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "onError, currentMusic is null");
            return;
        }
        b21.r rVar = tVar.f397277k;
        this.f397273d = rVar;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "onError, cbMusic is null");
            return;
        }
        boolean isNetworkConnected = com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (i18 == 80 && isNetworkConnected) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "connect success, but download is fail!");
        }
        int i27 = tVar.f397285s;
        if (i27 >= 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "errorCount %d", java.lang.Integer.valueOf(i27));
            return;
        }
        tVar.f397285s = i27 + 1;
        tVar.C();
        tVar.y(this.f397273d, i18);
        if (tVar.A(this.f397273d)) {
            tVar.stopPlay();
            com.tencent.mm.sdk.platformtools.u3.h(new rl3.q(this));
        }
        tVar.r(this.f397273d);
        tVar.m(this.f397273d, i18);
        rl3.s sVar = tVar.f397281o;
        if (sVar != null) {
            sVar.f397275d = true;
            tVar.f397281o = null;
        }
        if (i17 == 91 && i18 == 55) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "unknow format ,delete file");
            java.lang.String str = tVar.f397283q;
            com.tencent.mm.sdk.platformtools.r2 r2Var = gl3.h.f272831a;
            com.tencent.qqmusic.mediaplayer.util.Logger.i("MicroMsg.Music.PieceFileCache", "deleteFileByUrl");
            gl3.i.a(xl3.c.d(str));
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onPrepared(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onPrepared");
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onSeekComplete(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onSeekComplete seekPosition:%d", java.lang.Integer.valueOf(i17));
        rl3.t tVar = this.f397274e;
        int i18 = tVar.f397286t;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "seek complete to startTime :%d", java.lang.Integer.valueOf(i18));
            tVar.f397286t = 0;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "_onSeekComplete");
        b21.r rVar = this.f397273d;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
            return;
        }
        tVar.p(rVar);
        if (tVar.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "seek end, send play event!");
            tVar.o(this.f397273d);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onStarted(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onStarted");
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onStateChanged(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged state %d", java.lang.Integer.valueOf(i17));
        rl3.t tVar = this.f397274e;
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PREPARING!");
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "_onPreparing");
            b21.r rVar = tVar.f397277k;
            this.f397273d = rVar;
            if (rVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onPreparingEvent %b", java.lang.Boolean.valueOf(tVar.i()));
            tVar.f397227b = "waiting";
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
            am.jk jkVar = musicPlayerEvent.f54512g;
            jkVar.f7036b = 11;
            jkVar.f7037c = rVar;
            jkVar.f7040f = "waiting";
            jkVar.f7039e = tVar.getDuration();
            jkVar.f7041g = true;
            musicPlayerEvent.b(android.os.Looper.getMainLooper());
            kl3.e eVar = tVar.f397230e;
            if (eVar != null) {
                eVar.k(rVar);
                return;
            }
            return;
        }
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PREPARED!");
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "_onPrepared");
            int i18 = tVar.f397286t;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "seek to startTime:%d", java.lang.Integer.valueOf(i18));
                tVar.c(tVar.f397286t);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "start to play");
            if (!tVar.s()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "request focus error");
                return;
            }
            b21.r rVar2 = tVar.f397277k;
            if (rVar2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onPrepareEvent %b", java.lang.Boolean.valueOf(tVar.i()));
            tVar.f397227b = "canplay";
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = new com.tencent.mm.autogen.events.MusicPlayerEvent();
            am.jk jkVar2 = musicPlayerEvent2.f54512g;
            jkVar2.f7036b = 9;
            jkVar2.f7037c = rVar2;
            jkVar2.f7040f = "canplay";
            jkVar2.f7039e = tVar.getDuration();
            jkVar2.f7041g = true;
            musicPlayerEvent2.b(android.os.Looper.getMainLooper());
            kl3.e eVar2 = tVar.f397230e;
            if (eVar2 != null) {
                eVar2.b(rVar2);
            }
            try {
                com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = tVar.f397278l;
                if (commonPlayer != null) {
                    commonPlayer.start();
                    if (tVar.f397278l.getCurrentAudioInformation() != null && tVar.f397278l.getCurrentAudioInformation().getAudioType() != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "getAudioType:%d", java.lang.Integer.valueOf(tVar.f397278l.getCurrentAudioInformation().getAudioType().getValue()));
                        tVar.f397288v = tVar.f397278l.getCurrentAudioInformation().getAudioType();
                        rl3.t.x(tVar);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", e17, "_onPrepared", new java.lang.Object[0]);
                tVar.m(tVar.f397277k, 502);
                tVar.y(tVar.f397277k, 502);
            }
            tVar.f397280n = true;
            return;
        }
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged STARTED!");
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "_onStart");
            b21.r rVar3 = tVar.f397277k;
            this.f397273d = rVar3;
            if (rVar3 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            }
            tVar.f397232g = android.os.SystemClock.elapsedRealtime();
            if ("pause".equals(tVar.f397227b)) {
                tVar.o(this.f397273d);
            } else {
                tVar.q(this.f397273d);
            }
            rl3.s sVar = tVar.f397281o;
            if (sVar != null) {
                sVar.f397275d = true;
            }
            rl3.s sVar2 = new rl3.s(tVar, null);
            tVar.f397281o = sVar2;
            sVar2.f397275d = false;
            s75.d.b(sVar2, "music_play_progress_runnable");
            return;
        }
        if (i17 == 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PAUSED!");
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "_onPause");
            if (this.f397273d == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            } else {
                tVar.f397233h += android.os.SystemClock.elapsedRealtime() - tVar.f397232g;
                tVar.n(this.f397273d);
                return;
            }
        }
        if (i17 != 6) {
            if (i17 != 7) {
                if (i17 == 8) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged END!");
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "_onEnd");
                    return;
                } else {
                    if (i17 == 9) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged ERROR!");
                        return;
                    }
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged PLAYBACKCOMPLETED!");
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "_onCompletion");
            if (this.f397273d == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
                return;
            }
            tVar.C();
            tVar.f397280n = false;
            tVar.l(tVar.f397277k);
            rl3.s sVar3 = tVar.f397281o;
            if (sVar3 != null) {
                sVar3.f397275d = true;
                tVar.f397281o = null;
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "onStateChanged STOPPED!");
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.QQMusicPlayer", "_onStop");
        if (this.f397273d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "cbMusic is null");
            return;
        }
        if (tVar.D()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.QQMusicPlayer", "currentMusic is null");
            return;
        }
        if (tVar.A(this.f397273d)) {
            tVar.r(this.f397273d);
            return;
        }
        b21.r rVar4 = this.f397273d;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (rVar4 == null || (str = rVar4.f17346e) == null) {
            str = "";
        }
        objArr[0] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.BaseMusicPlayer", "onStopForReportEvent: %s", objArr);
        com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent3 = new com.tencent.mm.autogen.events.MusicPlayerEvent();
        am.jk jkVar3 = musicPlayerEvent3.f54512g;
        jkVar3.f7036b = 18;
        jkVar3.f7037c = rVar4;
        musicPlayerEvent3.b(android.os.Looper.getMainLooper());
    }
}

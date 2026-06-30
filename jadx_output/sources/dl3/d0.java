package dl3;

/* loaded from: classes13.dex */
public class d0 extends dl3.v {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f235280c;

    /* renamed from: d, reason: collision with root package name */
    public n01.b f235281d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.qqmusic.mediaplayer.CommonPlayer f235282e;

    /* renamed from: f, reason: collision with root package name */
    public n01.d f235283f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235284g;

    /* renamed from: j, reason: collision with root package name */
    public dl3.c0 f235287j;

    /* renamed from: k, reason: collision with root package name */
    public vl3.b f235288k;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f235297t;

    /* renamed from: w, reason: collision with root package name */
    public el3.i f235300w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f235302y;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235285h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235286i = false;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f235289l = "";

    /* renamed from: m, reason: collision with root package name */
    public int f235290m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f235291n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f235292o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f235293p = false;

    /* renamed from: q, reason: collision with root package name */
    public long f235294q = 0;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType f235295r = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;

    /* renamed from: s, reason: collision with root package name */
    public boolean f235296s = false;

    /* renamed from: u, reason: collision with root package name */
    public long f235298u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f235299v = 0;

    /* renamed from: x, reason: collision with root package name */
    public dl3.b f235301x = null;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.qqmusic.mediaplayer.PlayerListenerCallback f235303z = new dl3.a0(this);
    public final com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener A = new dl3.b0(this);

    public d0() {
        java.lang.String str;
        this.f235280c = "";
        this.f235302y = "";
        this.f235280c = dl3.h.a();
        com.tencent.mm.plugin.music.player.base.d.b();
        dl3.i s17 = dl3.i.s();
        synchronized (s17.f235332y) {
            if (!s17.f235332y.contains(this)) {
                s17.f235332y.add(this);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "create QQAudioPlayer instance");
        this.f235297t = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper());
        if (gl3.e.d()) {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            str = com.tencent.mm.vfs.w6.i("wcf://QQMusicCache/", true);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            str = "";
        }
        this.f235302y = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "playCacheTempDir:%s", str);
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public int a() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
        if (commonPlayer != null) {
            return (int) commonPlayer.getCurrentPosition();
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean c(int i17) {
        int duration = getDuration();
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "seekToMusic pos:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(duration));
        if (duration < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "position is invalid, position:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(duration));
            stopPlay();
            return false;
        }
        if (i17 > duration) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "position is invalid, position:%d, duration:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(duration));
            return false;
        }
        if (this.f235282e == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onSeekingEvent");
        com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent = new com.tencent.mm.autogen.events.AudioPlayerEvent();
        am.g0 g0Var = audioPlayerEvent.f53990g;
        g0Var.f6716a = 10;
        g0Var.f6719d = "seeking";
        g0Var.f6718c = this.f235280c;
        g0Var.f6720e = k();
        audioPlayerEvent.b(android.os.Looper.getMainLooper());
        this.f235282e.seekTo(i17);
        return true;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "pauseAndAbandonFocus");
        pause();
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean e() {
        return true;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean g() {
        return this.f235284g && !x();
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public int getDuration() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
        if (commonPlayer != null) {
            return commonPlayer.getDuration();
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean i() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
        return commonPlayer != null && commonPlayer.getPlayerState() == 4;
    }

    @Override // dl3.v
    public java.lang.String k() {
        n01.b bVar = this.f235281d;
        return bVar != null ? bVar.f333849n : "";
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void pause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "pause, audioId:%s", this.f235280c);
        this.f235285h = true;
        if (this.f235282e == null || !i()) {
            com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
            if (commonPlayer != null) {
                if (commonPlayer != null && commonPlayer.getPlayerState() == 7) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "pause fail, play complete, set isStartPlaying false");
                    this.f235284g = false;
                    return;
                }
                return;
            }
            return;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "pause success");
            this.f235282e.pause();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e17, "pause", new java.lang.Object[0]);
            l(503);
            t(503);
        }
    }

    public final void q() {
        try {
            com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
            if (commonPlayer != null) {
                commonPlayer.setVolume(0.0f, 0.0f);
                if (!w() && !v() && !i()) {
                    if (this.f235286i) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "stop play, but send pause state event");
                        this.f235282e.reset();
                        m();
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "reset and send stop event");
                        this.f235282e.reset();
                        p();
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "stop");
                this.f235282e.stop();
            }
            dl3.c0 c0Var = this.f235287j;
            if (c0Var != null) {
                c0Var.f235278d = true;
                this.f235287j = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e17, "stopPlay", new java.lang.Object[0]);
            l(504);
            t(504);
        }
        this.f235284g = false;
        this.f235285h = true;
        this.f235299v = java.lang.System.currentTimeMillis();
    }

    public final void r() {
        if (w() || v()) {
            com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
            dl3.i s17 = dl3.i.s();
            commonPlayer.setAudioStreamType((s17.C || s17.f235329v.f333833a || s17.D) ? 3 : 0);
        }
        this.f235282e.start();
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer2 = this.f235282e;
        double d17 = this.f235281d.f333847l;
        commonPlayer2.setVolume((float) d17, (float) d17);
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void resume() {
        this.f235290m = 0;
        boolean x17 = x();
        boolean i17 = i();
        this.f235285h = false;
        this.f235286i = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "resume, isPreparing:%b, isPlayingMusic:%b, isStartPlaying:%b, audioId:%s", java.lang.Boolean.valueOf(x17), java.lang.Boolean.valueOf(i17), java.lang.Boolean.valueOf(this.f235284g), this.f235280c);
        if (this.f235282e != null && !w() && !x17 && !i17 && !this.f235284g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "audio play is complete, need initPlayer again");
            this.f235292o = 0;
            this.f235293p = true;
            u();
            el3.i iVar = this.f235300w;
            if (iVar != null) {
                ((el3.h) iVar).D(this.f235281d.f333844i);
                return;
            }
            return;
        }
        if (this.f235282e != null) {
            if ((v() || w()) && !i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "audio play is paused, need start to play");
                try {
                    com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
                    double d17 = this.f235281d.f333847l;
                    commonPlayer.setVolume((float) d17, (float) d17);
                    r();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e17, "resume", new java.lang.Object[0]);
                    l(502);
                    t(502);
                }
                this.f235284g = true;
            }
        }
    }

    public n01.d s() {
        if (this.f235283f == null) {
            this.f235283f = new n01.d();
        }
        int duration = getDuration();
        int a17 = a();
        boolean i17 = i();
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
        int bufferedPercentage = commonPlayer != null ? commonPlayer.getBufferedPercentage() : 0;
        if (bufferedPercentage < 0 || bufferedPercentage > 100) {
            bufferedPercentage = 0;
        }
        int i18 = bufferedPercentage >= 0 ? bufferedPercentage : 0;
        n01.d dVar = this.f235283f;
        dVar.f333863b = a17;
        dVar.f333862a = duration;
        dVar.f333864c = !i17;
        dVar.f333865d = this.f235286i;
        dVar.f333866e = (i18 * duration) / 100;
        n01.b bVar = this.f235281d;
        if (bVar == null) {
            return null;
        }
        dVar.f333868g = bVar.f333840e;
        dVar.f333867f = bVar.f333837b;
        dVar.f333869h = bVar.f333857v;
        return dVar;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void stopPlay() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "stopPlay");
        this.f235286i = false;
        q();
    }

    public final void t(int i17) {
        int i18;
        el3.i iVar = this.f235300w;
        if (iVar != null) {
            int i19 = this.f235281d.f333844i;
            ((el3.h) iVar).getClass();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(na1.e.CTRL_INDEX);
            iDKey.SetKey(1);
            iDKey.SetValue(1L);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(na1.e.CTRL_INDEX);
            iDKey2.SetKey(9);
            iDKey2.SetValue(1L);
            com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
            iDKey3.SetID(na1.e.CTRL_INDEX);
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayIdKeyReport", "getQQAudioPlayerErrIdKey, errCode:" + i17);
            if (i17 == 66) {
                i18 = 23;
            } else if (i17 == 67) {
                i18 = 24;
            } else if (i17 == 69) {
                i18 = 25;
            } else if (i17 == 70) {
                i18 = 36;
            } else if (i17 == 74) {
                i18 = 26;
            } else if (i17 == 80) {
                i18 = 27;
            } else if (i17 == 105) {
                i18 = 37;
            } else if (i17 == 101) {
                i18 = 28;
            } else if (i17 != 102) {
                switch (i17) {
                    case 53:
                        i18 = 17;
                        break;
                    case 54:
                        i18 = 18;
                        break;
                    case 55:
                        i18 = 19;
                        break;
                    default:
                        switch (i17) {
                            case 62:
                                i18 = 20;
                                break;
                            case 63:
                                i18 = 21;
                                break;
                            case 64:
                                i18 = 22;
                                break;
                            default:
                                switch (i17) {
                                    case 500:
                                        i18 = 31;
                                        break;
                                    case 501:
                                        i18 = 32;
                                        break;
                                    case 502:
                                        i18 = 33;
                                        break;
                                    case 503:
                                        i18 = 34;
                                        break;
                                    case 504:
                                        i18 = 35;
                                        break;
                                    default:
                                        i18 = 30;
                                        break;
                                }
                        }
                }
            } else {
                i18 = 29;
            }
            iDKey3.SetKey(i18);
            iDKey3.SetValue(1L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            arrayList.add(iDKey3);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
        }
    }

    public final void u() {
        java.net.URL url;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "initPlayer");
        n01.b bVar = this.f235281d;
        boolean z17 = true;
        boolean z18 = (bVar == null || !bVar.f333837b.startsWith("wxblob://") || bVar.B == null) ? false : true;
        com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener = this.A;
        com.tencent.qqmusic.mediaplayer.PlayerListenerCallback playerListenerCallback = this.f235303z;
        if (z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "play with pByteBuff");
            if (this.f235282e == null) {
                this.f235282e = new com.tencent.qqmusic.mediaplayer.CommonPlayer(playerListenerCallback);
            }
            this.f235282e.reset();
            n01.b bVar2 = this.f235281d;
            try {
                this.f235282e.setDataSource(new ul3.c(bVar2.B, bVar2.f333837b));
                this.f235282e.addAudioListener(iAudioListener);
                this.f235282e.prepare();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + e17.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e17, "initPlayer", new java.lang.Object[0]);
                l(501);
                t(501);
            }
        } else {
            if (!android.text.TextUtils.isEmpty(this.f235281d.f333838c)) {
                n01.b bVar3 = this.f235281d;
                if (bVar3.f333860y == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "play with local file, filePath:%s", bVar3.f333838c);
                    if (this.f235282e == null) {
                        this.f235282e = new com.tencent.qqmusic.mediaplayer.CommonPlayer(playerListenerCallback);
                    }
                    this.f235282e.reset();
                    try {
                        this.f235282e.setDataSource(this.f235281d.f333838c);
                        this.f235282e.addAudioListener(iAudioListener);
                        this.f235282e.prepare();
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e18, "initPlayer exception", new java.lang.Object[0]);
                        l(501);
                        t(501);
                    }
                }
            }
            if (!android.text.TextUtils.isEmpty(this.f235281d.f333838c)) {
                n01.b bVar4 = this.f235281d;
                if (bVar4.f333860y != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "play with inputStream, filePath:%s", bVar4.f333838c);
                    if (this.f235282e == null) {
                        this.f235282e = new com.tencent.qqmusic.mediaplayer.CommonPlayer(playerListenerCallback);
                    }
                    this.f235282e.reset();
                    try {
                        this.f235282e.setDataSource(new ul3.c(this.f235281d.f333860y));
                        this.f235282e.addAudioListener(iAudioListener);
                        this.f235282e.prepare();
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + e19.getMessage());
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e19, "initPlayer", new java.lang.Object[0]);
                        l(501);
                        t(501);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "play with src url :%s", this.f235281d.f333837b);
            java.lang.String str = this.f235281d.f333837b;
            this.f235289l = str;
            if (xl3.f.j(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "can match shake music wifi url");
            } else {
                z17 = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "mSrc:%s", this.f235289l);
            gl3.h.f(this.f235289l);
            java.lang.String str2 = this.f235289l;
            if (!android.text.TextUtils.isEmpty(str2)) {
                gl3.h.f272832b.put(str2, java.lang.Boolean.valueOf(z17));
            }
            try {
                url = new java.net.URL(this.f235289l);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e27, "initPlayer", new java.lang.Object[0]);
                url = null;
            }
            if (url == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer url is null");
                l(500);
                t(500);
                return;
            }
            if (this.f235282e == null) {
                this.f235282e = new com.tencent.qqmusic.mediaplayer.CommonPlayer(playerListenerCallback);
            }
            this.f235282e.reset();
            if (this.f235288k == null) {
                this.f235288k = new vl3.b();
            }
            this.f235288k.a(this.f235289l, this.f235281d.f333858w);
            try {
                if (!android.text.TextUtils.isEmpty(this.f235302y)) {
                    this.f235282e.setOnlinePlayCacheDir(this.f235302y);
                }
                this.f235282e.setDataSource(this.f235288k, android.net.Uri.parse(url.toString()));
                this.f235282e.addAudioListener(iAudioListener);
                this.f235282e.prepare();
            } catch (java.lang.Exception e28) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "initPlayer exception:" + e28.getMessage());
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.QQAudioPlayer", e28, "initPlayer", new java.lang.Object[0]);
                l(501);
                t(501);
            }
        }
        n01.b bVar5 = this.f235281d;
        float f17 = bVar5 != null ? (float) bVar5.f333848m : 0.0f;
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
        if (commonPlayer != null) {
            if (f17 < 0.5f || f17 > 2.0f) {
                commonPlayer.setSpeed(1.0f);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "set speed :%f", java.lang.Float.valueOf(f17));
                this.f235282e.setSpeed(f17);
            }
            com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer2 = this.f235282e;
            float f18 = (float) this.f235281d.f333847l;
            commonPlayer2.setVolume(f18, f18);
        }
    }

    public boolean v() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
        return commonPlayer != null && commonPlayer.getPlayerState() == 5;
    }

    public boolean w() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
        return commonPlayer != null && commonPlayer.getPlayerState() == 2;
    }

    public boolean x() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
        return commonPlayer != null && commonPlayer.getPlayerState() == 3;
    }

    public void y(n01.b bVar) {
        this.f235281d = bVar;
        this.f235292o = bVar.f333839d;
        this.f235293p = bVar.f333842g;
        if (this.f235282e == null || !i()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "audioId:%s, param.src:%s setVoume %f", this.f235280c, this.f235289l, java.lang.Double.valueOf(this.f235281d.f333847l));
        com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = this.f235282e;
        double d17 = this.f235281d.f333847l;
        commonPlayer.setVolume((float) d17, (float) d17);
        double d18 = this.f235281d.f333848m;
        if (d18 <= 0.0d) {
            this.f235282e.setSpeed(1.0f);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "set speed :%f", java.lang.Double.valueOf(d18));
            this.f235282e.setSpeed((float) this.f235281d.f333848m);
        }
    }

    public void z(n01.b bVar) {
        if (bVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "startPlay fail, play param is null");
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onErrorEvent");
            l(-1);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - this.f235294q;
        n01.b bVar2 = this.f235281d;
        if (bVar2 != null && bVar2.a(bVar) && j17 <= 20) {
            this.f235281d = bVar;
            this.f235292o = bVar.f333839d;
            this.f235293p = bVar.f333842g;
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.QQAudioPlayer", "startPlay, is playing for audio src:%s, don't play again in 3 second, interval:%d", this.f235289l, java.lang.Long.valueOf(j17));
            return;
        }
        el3.i iVar = (el3.i) sl3.b.b(el3.i.class);
        this.f235300w = iVar;
        if (iVar != null) {
            ((el3.h) iVar).D(bVar.f333844i);
        }
        this.f235294q = currentTimeMillis;
        this.f235281d = bVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.QQAudioPlayer", "startPlay, fromScene:%d, audioId:%s", java.lang.Integer.valueOf(bVar.f333844i), this.f235280c);
        if (this.f235282e != null && i()) {
            this.f235282e.stop();
        }
        this.f235290m = 0;
        this.f235292o = bVar.f333839d;
        this.f235293p = bVar.f333842g;
        this.f235295r = null;
        this.f235296s = false;
        this.f235286i = false;
        this.f235285h = false;
        u();
    }
}

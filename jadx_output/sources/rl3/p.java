package rl3;

/* loaded from: classes15.dex */
public class p extends rl3.b {

    /* renamed from: k, reason: collision with root package name */
    public b21.r f397265k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.music.player.base.i f397266l;

    /* renamed from: m, reason: collision with root package name */
    public jl3.d f397267m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f397268n;

    /* renamed from: o, reason: collision with root package name */
    public b21.o f397269o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f397270p;

    /* renamed from: q, reason: collision with root package name */
    public final jl3.c f397271q = new rl3.o(this);

    /* renamed from: r, reason: collision with root package name */
    public boolean f397272r = false;

    public static void w(rl3.p pVar, b21.r rVar, int i17) {
        pVar.getClass();
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicPlayer", "currentMusic is null, don't idKeyReportMusicError");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "idKeyReportMusicError, action:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.music.player.base.i iVar = pVar.f397266l;
        int i18 = (iVar == null || !(iVar instanceof rl3.j)) ? 0 : ((rl3.j) iVar).f397257n;
        kl3.h hVar = pVar.f397229d;
        if (hVar != null) {
            ((pl3.e) hVar).y(pVar.f397265k, i17, i18);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public int a() {
        com.tencent.mm.plugin.music.player.base.i iVar = this.f397266l;
        if (iVar != null) {
            return iVar.a();
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void b() {
        this.f397272r = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "passivePause");
        try {
            com.tencent.mm.plugin.music.player.base.i iVar = this.f397266l;
            if (iVar == null || !iVar.e()) {
                return;
            }
            this.f397266l.g();
            n(this.f397265k);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e17, "passivePause", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean c(int i17) {
        int duration;
        int x17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "seekToMusic pos:%d", java.lang.Integer.valueOf(i17));
        try {
            duration = getDuration();
            x17 = x();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e17, "seekTo", new java.lang.Object[0]);
        }
        if (duration >= 0 && i17 <= duration) {
            int i18 = (int) ((x17 / 100.0d) * duration);
            if (x17 != 100 && i17 > i18) {
                i17 = i18 - 2000;
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "on completed seekto, position is %d =", java.lang.Integer.valueOf(i17));
            }
            com.tencent.mm.plugin.music.player.base.i iVar = this.f397266l;
            if (iVar != null && i17 >= 0) {
                iVar.i(i17);
                p(this.f397265k);
                return true;
            }
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicPlayer", "duration or position is illegal, stop");
        stopPlay();
        return false;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "pauseAndAbandonFocus");
        pause();
        kl3.e eVar = this.f397230e;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean e() {
        return false;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public b21.o f() {
        int duration = getDuration();
        int a17 = a();
        int i17 = 1;
        if (!i()) {
            if (!this.f397270p || (!this.f397268n && !this.f397226a)) {
                i17 = 0;
            }
            i17 = i17 != 0 ? 0 : 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "get music status = %d", java.lang.Integer.valueOf(i17));
        int x17 = duration > 0 ? x() : 0;
        b21.o oVar = this.f397269o;
        if (oVar != null) {
            oVar.f17337a = duration;
            oVar.f17338b = a17;
            oVar.f17339c = i17;
            oVar.f17340d = x17;
        } else {
            this.f397269o = new b21.o(duration, a17, i17, x17);
        }
        this.f397269o.getClass();
        b21.o oVar2 = this.f397269o;
        oVar2.f17341e = this.f397227b;
        return oVar2;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean g() {
        return this.f397270p;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public int getDuration() {
        com.tencent.mm.plugin.music.player.base.i iVar = this.f397266l;
        if (iVar != null) {
            return iVar.b();
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean h() {
        return this.f397270p && this.f397272r;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean i() {
        com.tencent.mm.plugin.music.player.base.i iVar = this.f397266l;
        if (iVar != null) {
            try {
                return iVar.e();
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void j(boolean z17) {
        v(z17);
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void pause() {
        this.f397272r = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "pause");
        try {
            com.tencent.mm.plugin.music.player.base.i iVar = this.f397266l;
            if (iVar == null || !iVar.e()) {
                return;
            }
            this.f397266l.g();
            this.f397268n = true;
            n(this.f397265k);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e17, "pause", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void resume() {
        v(true);
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void stopPlay() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "stopPlay");
        com.tencent.mm.plugin.music.player.base.i iVar = this.f397266l;
        if (iVar != null && (iVar instanceof rl3.j)) {
            java.lang.String c17 = iVar.c();
            kl3.h hVar = this.f397229d;
            if (hVar != null) {
                b21.r rVar = this.f397265k;
                pl3.b bVar = ((pl3.e) hVar).f356705c;
                bVar.getClass();
                if (android.text.TextUtils.isEmpty(c17) && bVar.f356697j != null) {
                    c17 = bVar.a();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayerReportImpl", "idKeyReportMusicMimeType mineType:%s, hasStatForMimeType:%b", c17, java.lang.Boolean.valueOf(bVar.f356696i));
                if (!android.text.TextUtils.isEmpty(c17) && !bVar.f356696i) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayerReportImpl", "idKeyReportMusicMimeType OK");
                    bVar.f356696i = true;
                    com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                    iDKey.SetID(com.tencent.mm.plugin.appbrand.jsapi.lab.h.CTRL_INDEX);
                    iDKey.SetKey(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AMR_NB.equalsIgnoreCase(c17) ? 70 : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AMR_WB.equalsIgnoreCase(c17) ? 71 : (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MPEG.equalsIgnoreCase(c17) || c17.equalsIgnoreCase("audio/mp3")) ? 72 : ("audio/mp4a-latm".equalsIgnoreCase(c17) || c17.startsWith(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MP4)) ? 73 : "audio/qcelp".equalsIgnoreCase(c17) ? 74 : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_VORBIS.equalsIgnoreCase(c17) ? 75 : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_OPUS.equalsIgnoreCase(c17) ? 76 : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_ALAW.equalsIgnoreCase(c17) ? 77 : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MLAW.equalsIgnoreCase(c17) ? 78 : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_RAW.equalsIgnoreCase(c17) ? 79 : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_FLAC.equalsIgnoreCase(c17) ? 80 : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_MSGSM.equalsIgnoreCase(c17) ? 81 : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_AC3.equalsIgnoreCase(c17) ? 82 : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_E_AC3.equalsIgnoreCase(c17) ? 83 : "audio/x-ms-wma".equalsIgnoreCase(c17) ? 84 : "audio/x-wav".equalsIgnoreCase(c17) ? 85 : ("audio/x-ape".equalsIgnoreCase(c17) || "application/x-ape".equalsIgnoreCase(c17)) ? 86 : 87);
                    iDKey.SetValue(1L);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(iDKey);
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.j(arrayList, true, false);
                    if (rVar != null) {
                        g0Var.d(14486, 0, java.lang.Integer.valueOf(rVar.f17345d), java.lang.Integer.valueOf(pl3.a.a(c17)), c17);
                    }
                }
            }
        }
        try {
            jl3.d dVar = this.f397267m;
            if (dVar != null) {
                dVar.f300217m = true;
                this.f397267m = null;
            }
            com.tencent.mm.plugin.music.player.base.i iVar2 = this.f397266l;
            if (iVar2 != null) {
                iVar2.k();
                this.f397266l = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e17, "stopPlay", new java.lang.Object[0]);
        }
        kl3.e eVar = this.f397230e;
        if (eVar != null) {
            eVar.a();
        }
        this.f397270p = false;
        this.f397272r = false;
    }

    public final void v(boolean z17) {
        try {
            com.tencent.mm.plugin.music.player.base.i iVar = this.f397266l;
            if (iVar == null || iVar.e()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "music is playing");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "resume requestFocus:%b", java.lang.Boolean.valueOf(z17));
                if (z17 && t(this.f397265k) && !s()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicPlayer", "request focus error");
                }
                this.f397266l.h();
                o(this.f397265k);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e17, "resume", new java.lang.Object[0]);
        }
    }

    public int x() {
        long j17;
        int i17;
        jl3.d dVar = this.f397267m;
        if (dVar == null) {
            return 0;
        }
        boolean z17 = dVar.f300216i;
        jl3.a aVar = dVar.f300213f;
        if (z17) {
            long j18 = aVar.f300207f;
            long j19 = aVar.f300205d;
            if (j18 != 0) {
                j17 = (j19 * 100) / j18;
                i17 = (int) j17;
            }
            i17 = 0;
        } else {
            long j27 = aVar.f300203b;
            long j28 = aVar.f300202a;
            if (j27 != 0) {
                j17 = (j28 * 100) / j27;
                i17 = (int) j17;
            }
            i17 = 0;
        }
        if (i17 >= 1) {
            return i17;
        }
        return 0;
    }

    public final void y(b21.r rVar, boolean z17) {
        if (this.f397266l == null) {
            if (z17 || !fp.h.b(15)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "use MMMediaPlayer");
                this.f397266l = new rl3.h();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "use MMPlayer");
                this.f397266l = new rl3.j();
            }
            com.tencent.mm.plugin.music.player.base.i iVar = this.f397266l;
            iVar.f150664b = rVar;
            iVar.f150663a = new rl3.l(this);
        }
    }

    public void z() {
        this.f397229d = (kl3.h) sl3.b.b(kl3.h.class);
        this.f397230e = kl3.t.l();
    }
}

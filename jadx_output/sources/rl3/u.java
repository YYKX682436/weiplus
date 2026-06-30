package rl3;

/* loaded from: classes15.dex */
public class u extends rl3.b {

    /* renamed from: k, reason: collision with root package name */
    public b21.o f397293k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.thumbplayer.tplayer.TPPlayer f397294l;

    /* renamed from: m, reason: collision with root package name */
    public b21.r f397295m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f397296n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f397297o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f397298p = false;

    @Override // com.tencent.mm.plugin.music.player.base.l
    public int a() {
        com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer = this.f397294l;
        if (tPPlayer != null) {
            return (int) tPPlayer.getCurrentPositionMs();
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void b() {
        this.f397298p = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "passivePause");
        try {
            if (this.f397294l == null || !w()) {
                return;
            }
            this.f397294l.pause();
            n(this.f397295m);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.TPMusicPlayer", e17, "passivePause", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean c(int i17) {
        int duration;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "seekToMusic pos:%d", java.lang.Integer.valueOf(i17));
        try {
            duration = getDuration();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.TPMusicPlayer", e17, "seekTo", new java.lang.Object[0]);
        }
        if (duration >= 0 && i17 <= duration) {
            com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer = this.f397294l;
            if (tPPlayer != null && i17 >= 0) {
                tPPlayer.seekTo(i17);
                p(this.f397295m);
                return true;
            }
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.TPMusicPlayer", "duration or position is illegal, stop");
        stopPlay();
        return false;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "pauseAndAbandonFocus");
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
            if (!this.f397296n || (!this.f397297o && !this.f397226a)) {
                i17 = 0;
            }
            i17 = i17 != 0 ? 0 : 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "get music status = %d", java.lang.Integer.valueOf(i17));
        b21.o oVar = this.f397293k;
        if (oVar != null) {
            oVar.f17337a = duration;
            oVar.f17338b = a17;
            oVar.f17339c = i17;
            oVar.f17340d = 0;
        } else {
            this.f397293k = new b21.o(duration, a17, i17, 0);
        }
        this.f397293k.getClass();
        b21.o oVar2 = this.f397293k;
        oVar2.f17341e = this.f397227b;
        return oVar2;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean g() {
        return this.f397296n;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public int getDuration() {
        com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer = this.f397294l;
        if (tPPlayer != null) {
            return (int) tPPlayer.getDurationMs();
        }
        return -1;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean h() {
        return this.f397296n && this.f397298p;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public boolean i() {
        if (this.f397294l != null) {
            try {
                return w();
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void j(boolean z17) {
        try {
            if (this.f397294l == null || w()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "music is playing");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "resume requestFocus:%b", java.lang.Boolean.valueOf(z17));
                if (z17 && t(this.f397295m) && !s()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.TPMusicPlayer", "request focus error");
                }
                this.f397294l.start();
                o(this.f397295m);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.TPMusicPlayer", e17, "resume", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void pause() {
        this.f397298p = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "pause");
        try {
            if (this.f397294l == null || !w()) {
                return;
            }
            this.f397294l.pause();
            this.f397297o = true;
            n(this.f397295m);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.TPMusicPlayer", e17, "pause", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void resume() {
        j(true);
    }

    @Override // com.tencent.mm.plugin.music.player.base.l
    public void stopPlay() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.TPMusicPlayer", "stopPlay");
        try {
            com.tencent.thumbplayer.tplayer.TPPlayer tPPlayer = this.f397294l;
            if (tPPlayer != null) {
                tPPlayer.stop();
                this.f397294l = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.TPMusicPlayer", e17, "stopPlay", new java.lang.Object[0]);
        }
        kl3.e eVar = this.f397230e;
        if (eVar != null) {
            eVar.a();
        }
        this.f397296n = false;
        this.f397298p = false;
    }

    public void v() {
        this.f397229d = (kl3.h) sl3.b.b(kl3.h.class);
        this.f397230e = kl3.t.l();
    }

    public final boolean w() {
        return this.f397294l.getCurrentState() == 5;
    }
}

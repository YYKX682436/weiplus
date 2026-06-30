package rl3;

/* loaded from: classes14.dex */
public class h extends com.tencent.mm.plugin.music.player.base.i {

    /* renamed from: d, reason: collision with root package name */
    public rl3.g f397242d;

    /* renamed from: e, reason: collision with root package name */
    public final android.media.MediaPlayer f397243e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f397244f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f397245g = false;

    public h() {
        if (((kl3.f) sl3.b.b(kl3.f.class)) != null) {
            this.f397243e = new to.g();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMediaPlayer", "mediaResService is null");
        }
        if (this.f397243e == null) {
            this.f397243e = new android.media.MediaPlayer();
        }
        this.f397243e.setAudioStreamType(3);
        this.f397243e.setOnCompletionListener(new rl3.c(this));
        this.f397243e.setOnSeekCompleteListener(new rl3.d(this));
        this.f397243e.setOnPreparedListener(new rl3.e(this));
        this.f397243e.setOnErrorListener(new rl3.f(this));
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public int a() {
        try {
            return this.f397243e.getCurrentPosition();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e17, "getCurrentPos", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public int b() {
        try {
            return this.f397243e.getDuration();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e17, "getDuration", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public java.lang.String c() {
        return null;
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public boolean d() {
        return !this.f397244f;
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public boolean e() {
        try {
            return this.f397243e.isPlaying();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e17, "setSourcePath", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMediaPlayer", "pause");
        if (!this.f397244f) {
            this.f397243e.pause();
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMediaPlayer", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
        boolean z17 = !this.f397244f;
        android.media.MediaPlayer mediaPlayer = this.f397243e;
        if (!z17) {
            try {
                mediaPlayer.prepareAsync();
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e17, "prepareAsync", new java.lang.Object[0]);
                return;
            }
        }
        try {
            if (mediaPlayer.isPlaying()) {
                return;
            }
            mediaPlayer.start();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e18, "start", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void i(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMediaPlayer", "seek %d", java.lang.Long.valueOf(j17));
        this.f397243e.seekTo((int) j17);
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void j(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMediaPlayer", "setSourcePath, sourcePath:%s", str);
        try {
            this.f397243e.setDataSource(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e17, "setSourcePath", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.music.player.base.i
    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMediaPlayer", "stop");
        this.f397244f = true;
        android.media.MediaPlayer mediaPlayer = this.f397243e;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
                mediaPlayer.release();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MMMediaPlayer", e17, "stop", new java.lang.Object[0]);
            }
        }
        rl3.g gVar = this.f397242d;
        if (gVar != null) {
            gVar.f397240d = true;
            this.f397242d = null;
        }
        f(false);
    }
}

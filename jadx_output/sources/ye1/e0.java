package ye1;

/* loaded from: classes15.dex */
public class e0 extends ye1.a {

    /* renamed from: q, reason: collision with root package name */
    public android.media.MediaPlayer f461198q;

    /* renamed from: r, reason: collision with root package name */
    public final android.media.MediaPlayer.OnErrorListener f461199r;

    public e0() {
        ye1.x xVar = new ye1.x(this);
        ye1.y yVar = new ye1.y(this);
        ye1.z zVar = new ye1.z(this);
        ye1.a0 a0Var = new ye1.a0(this);
        ye1.b0 b0Var = new ye1.b0(this);
        ye1.c0 c0Var = new ye1.c0(this);
        this.f461199r = c0Var;
        ye1.d0 d0Var = new ye1.d0(this);
        to.g gVar = new to.g();
        this.f461198q = gVar;
        gVar.setScreenOnWhilePlaying(true);
        this.f461198q.setAudioStreamType(3);
        this.f461198q.setOnInfoListener(a0Var);
        this.f461198q.setOnErrorListener(c0Var);
        this.f461198q.setOnPreparedListener(xVar);
        this.f461198q.setOnCompletionListener(zVar);
        this.f461198q.setOnSeekCompleteListener(b0Var);
        this.f461198q.setOnVideoSizeChangedListener(yVar);
        this.f461198q.setOnBufferingUpdateListener(d0Var);
    }

    public final boolean M() {
        return this.f461198q != null;
    }

    public final void N(int i17) {
        android.media.MediaPlayer.OnErrorListener onErrorListener = this.f461199r;
        if (onErrorListener != null) {
            ((ye1.c0) onErrorListener).onError(this.f461198q, -1024, i17);
        }
    }

    @Override // ye1.e
    public void b(boolean z17) {
        try {
            if (M()) {
                this.f461198q.setLooping(z17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s setLooping fail", java.lang.Integer.valueOf(hashCode()));
            N(-10);
        }
    }

    @Override // ye1.e
    public void c(float f17, float f18) {
        try {
            if (M()) {
                this.f461198q.setVolume(f17, f18);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s setVolume fail", java.lang.Integer.valueOf(hashCode()));
            N(-13);
        }
    }

    @Override // ye1.e
    public boolean f(float f17) {
        if (f17 <= 0.0f) {
            return false;
        }
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s setSpeed fail", java.lang.Integer.valueOf(hashCode()));
            N(-14);
        }
        if (!M()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.SystemMediaPlayer", "%s setSpeed, current system(%d) not support play speed setting", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return false;
        }
        android.media.PlaybackParams playbackParams = this.f461198q.getPlaybackParams();
        playbackParams.setSpeed(f17);
        if (this.f461198q.isPlaying()) {
            this.f461198q.setPlaybackParams(playbackParams);
        } else {
            this.f461198q.setPlaybackParams(playbackParams);
            this.f461198q.pause();
        }
        return true;
    }

    @Override // ye1.e
    public int getCurrentPosition() {
        try {
            if (!M()) {
                return 0;
            }
            int i17 = this.f461162a;
            if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 6) {
                return this.f461198q.getCurrentPosition();
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s getCurrentPosition fail", java.lang.Integer.valueOf(hashCode()));
            N(-15);
            return 0;
        }
    }

    @Override // ye1.e
    public int getDuration() {
        int i17;
        try {
            if (!M() || (i17 = this.f461162a) == -1 || i17 == 1 || i17 == 0) {
                return 0;
            }
            return this.f461198q.getDuration();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s getDuration fail", java.lang.Integer.valueOf(hashCode()));
            N(-16);
            return 0;
        }
    }

    @Override // ye1.e
    public int getPlayerType() {
        return 1;
    }

    @Override // ye1.e
    public int getVideoHeight() {
        try {
            if (M()) {
                return this.f461198q.getVideoHeight();
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s getVideoHeight fail", java.lang.Integer.valueOf(hashCode()));
            N(-18);
            return 0;
        }
    }

    @Override // ye1.e
    public int getVideoWidth() {
        try {
            if (M()) {
                return this.f461198q.getVideoWidth();
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s getVideoWidth fail", java.lang.Integer.valueOf(hashCode()));
            N(-17);
            return 0;
        }
    }

    @Override // ye1.e
    public boolean isPlaying() {
        int i17;
        try {
            if (!M() || (i17 = this.f461162a) == -1 || i17 == -2 || i17 == 0 || i17 == 1) {
                return false;
            }
            return this.f461198q.isPlaying();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s isPlaying fail", java.lang.Integer.valueOf(hashCode()));
            N(-9);
            return false;
        }
    }

    @Override // ye1.e
    public ye1.e l(java.lang.Class cls) {
        if (ye1.e0.class.isAssignableFrom(cls)) {
            return this;
        }
        return null;
    }

    @Override // ye1.e
    public void m(java.lang.String str, java.lang.String str2) {
        try {
            if (M()) {
                if (str2 == null) {
                    this.f461198q.setDataSource(str);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.SystemMediaPlayer", "setDataSource, referrer: ".concat(str2));
                    this.f461198q.setDataSource(com.tencent.mm.sdk.platformtools.x2.f193071a, android.net.Uri.parse(str), java.util.Collections.singletonMap("Referer", str2));
                }
                this.f461162a = 1;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s setDataSource fail", java.lang.Integer.valueOf(hashCode()));
            N(-11);
        }
    }

    @Override // ye1.e
    public void pause() {
        try {
            if (M()) {
                int i17 = this.f461162a;
                if (i17 == 2 || i17 == 3 || i17 == 6) {
                    this.f461198q.pause();
                    this.f461162a = 4;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s pause fail", java.lang.Integer.valueOf(hashCode()));
            N(-2);
        }
    }

    @Override // ye1.e
    public void prepareAsync() {
        try {
            if (M()) {
                this.f461198q.prepareAsync();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s prepareAsync fail", java.lang.Integer.valueOf(hashCode()));
            N(-6);
        }
    }

    @Override // ye1.e
    public void release() {
        try {
            if (M()) {
                android.media.MediaPlayer mediaPlayer = this.f461198q;
                if (mediaPlayer != null) {
                    mediaPlayer.setOnInfoListener(null);
                    this.f461198q.setOnErrorListener(null);
                    this.f461198q.setOnPreparedListener(null);
                    this.f461198q.setOnCompletionListener(null);
                    this.f461198q.setOnSeekCompleteListener(null);
                    this.f461198q.setOnBufferingUpdateListener(null);
                    this.f461198q.setOnVideoSizeChangedListener(null);
                }
                this.f461198q.release();
                this.f461162a = -2;
                this.f461163b = true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s release fail", java.lang.Integer.valueOf(hashCode()));
            N(-8);
        }
    }

    @Override // ye1.e
    public void reset() {
        try {
            if (M()) {
                this.f461198q.reset();
                this.f461162a = 0;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s reset fail", java.lang.Integer.valueOf(hashCode()));
            N(-7);
        }
    }

    @Override // ye1.e
    public void seekTo(long j17) {
        try {
            if (M()) {
                int i17 = this.f461162a;
                if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 6) {
                    this.f461198q.seekTo((int) j17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s seekTo fail", java.lang.Integer.valueOf(hashCode()));
            N(-3);
        }
    }

    @Override // ye1.e
    public void setDataSource(java.lang.String str) {
        m(str, null);
    }

    @Override // ye1.e
    public void setMute(boolean z17) {
        if (M()) {
            if (z17) {
                c(0.0f, 0.0f);
            } else {
                c(1.0f, 1.0f);
            }
        }
    }

    @Override // ye1.e
    public void setSurface(android.view.Surface surface) {
        try {
            if (M()) {
                this.f461198q.setSurface(surface);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s setSurface fail", java.lang.Integer.valueOf(hashCode()));
            N(-12);
        }
    }

    @Override // ye1.e
    public void start() {
        try {
            if (M()) {
                int i17 = this.f461162a;
                if (i17 == 2 || i17 == 4 || i17 == 6) {
                    this.f461198q.start();
                    this.f461162a = 3;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s start fail", java.lang.Integer.valueOf(hashCode()));
            N(-1);
        }
    }

    @Override // ye1.e
    public void stop() {
        try {
            if (M()) {
                int i17 = this.f461162a;
                if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 6) {
                    this.f461198q.stop();
                    this.f461162a = 5;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SameLayer.SystemMediaPlayer", e17, "%s stop fail", java.lang.Integer.valueOf(hashCode()));
            N(-4);
        }
    }

    @Override // ye1.e
    public void y(java.lang.String str, int i17) {
        m(str, null);
    }
}

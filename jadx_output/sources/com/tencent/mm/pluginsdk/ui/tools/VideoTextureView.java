package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class VideoTextureView extends com.tencent.mm.ui.base.MMTextureView implements com.tencent.mm.pluginsdk.ui.tools.f4 {
    public static final /* synthetic */ int R = 0;
    public boolean A;
    public final android.media.MediaPlayer.OnVideoSizeChangedListener B;
    public final android.media.MediaPlayer.OnPreparedListener C;
    public final android.media.MediaPlayer.OnSeekCompleteListener D;
    public final android.media.MediaPlayer.OnBufferingUpdateListener E;
    public final android.media.MediaPlayer.OnInfoListener F;
    public final android.media.MediaPlayer.OnCompletionListener G;
    public final android.media.MediaPlayer.OnErrorListener H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f191482J;
    public boolean K;
    public boolean L;
    public final android.view.TextureView.SurfaceTextureListener M;
    public boolean N;
    public final com.tencent.mm.pluginsdk.ui.tools.o8 P;
    public float Q;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f191483h;

    /* renamed from: i, reason: collision with root package name */
    public int f191484i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.Surface f191485m;

    /* renamed from: n, reason: collision with root package name */
    public android.media.MediaPlayer f191486n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f191487o;

    /* renamed from: p, reason: collision with root package name */
    public int f191488p;

    /* renamed from: q, reason: collision with root package name */
    public int f191489q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f191490r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.a4 f191491s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.e4 f191492t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.c4 f191493u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.b4 f191494v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.d4 f191495w;

    /* renamed from: x, reason: collision with root package name */
    public long f191496x;

    /* renamed from: y, reason: collision with root package name */
    public long f191497y;

    /* renamed from: z, reason: collision with root package name */
    public int f191498z;

    public VideoTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void E(android.graphics.SurfaceTexture surfaceTexture) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, null);
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]);
        javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[0];
        javax.microedition.khronos.egl.EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, eGLConfig, surfaceTexture, new int[]{12344});
        egl10.eglMakeCurrent(eglGetDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        egl10.eglSwapBuffers(eglGetDisplay, eglCreateWindowSurface);
        egl10.eglDestroySurface(eglGetDisplay, eglCreateWindowSurface);
        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
        egl10.eglTerminate(eglGetDisplay);
    }

    public void F() {
        android.view.Surface surface;
        if (this.f191486n == null || !this.f191487o || (surface = this.f191485m) == null || !surface.isValid()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d flush surface start time[%d] ", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(getCurrentPosition()));
        this.L = true;
        this.f191486n.setVolume(0.0f, 0.0f);
        this.f191486n.start();
    }

    public final void G() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f191483h) || this.f191485m == null) {
            return;
        }
        H();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d open video %s", java.lang.Integer.valueOf(hashCode()), this.f191483h);
        try {
            to.g gVar = new to.g();
            this.f191486n = gVar;
            gVar.setOnPreparedListener(this.C);
            this.f191486n.setOnVideoSizeChangedListener(this.B);
            this.f191487o = false;
            this.f191484i = -1;
            this.f191498z = 0;
            this.f191486n.setOnCompletionListener(this.G);
            this.f191486n.setOnErrorListener(this.H);
            this.f191486n.setOnSeekCompleteListener(this.D);
            this.f191486n.setOnBufferingUpdateListener(this.E);
            this.f191486n.setOnInfoListener(this.F);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f191483h)) {
                this.f191486n.setDataSource(this.f191483h);
            }
            this.f191486n.setSurface(this.f191485m);
            this.f191486n.setAudioStreamType(3);
            this.f191486n.setScreenOnWhilePlaying(true);
            this.f191486n.prepareAsync();
            this.f191489q = this.f191486n.getVideoHeight();
            this.f191488p = this.f191486n.getVideoWidth();
            setMute(this.N);
            I(this.Q);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d open video success player[%s] ", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f191486n.hashCode()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTextureView", e17, "prepare async error path", new java.lang.Object[0]);
            com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191491s;
            if (a4Var != null) {
                a4Var.onError(-1, -1);
            }
        }
    }

    public final void H() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = java.lang.Boolean.valueOf(this.f191487o);
        objArr[2] = java.lang.Boolean.valueOf(this.f191486n == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d release media player isPrepared[%b] player is null[%b] ", objArr);
        android.media.MediaPlayer mediaPlayer = this.f191486n;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(null);
            this.f191486n.setOnVideoSizeChangedListener(null);
            try {
                this.f191486n.stop();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTextureView", e17, "stop media player error", new java.lang.Object[0]);
            }
            try {
                this.f191486n.reset();
                this.f191486n.release();
                this.f191486n.setOnBufferingUpdateListener(null);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTextureView", e18, "reset media player error", new java.lang.Object[0]);
            }
        }
        this.f191486n = null;
    }

    public boolean I(float f17) {
        if (f17 <= 0.0f) {
            return false;
        }
        this.Q = f17;
        if (!fp.h.c(23)) {
            return false;
        }
        float f18 = this.Q;
        try {
            if (this.f191486n != null && fp.h.c(23)) {
                android.media.PlaybackParams playbackParams = this.f191486n.getPlaybackParams();
                if (playbackParams == null) {
                    playbackParams = new android.media.PlaybackParams();
                }
                this.f191486n.setPlaybackParams(playbackParams.setSpeed(f18));
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTextureView", e17, "%s handle play rate error", java.lang.Integer.valueOf(hashCode()));
            return false;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void a(double d17, boolean z17) {
        b(d17);
        this.f191490r = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void b(double d17) {
        android.media.MediaPlayer mediaPlayer = this.f191486n;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) d17);
            this.f191490r = true;
            this.f191486n.getCurrentPosition();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean c(android.content.Context context, boolean z17) {
        return start();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public int getCurrentPosition() {
        android.media.MediaPlayer mediaPlayer = this.f191486n;
        return (mediaPlayer == null || !this.f191487o) ? mediaPlayer == null ? -1 : 0 : mediaPlayer.getCurrentPosition();
    }

    public int getDownloadPercent() {
        return this.f191498z;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public int getDuration() {
        android.media.MediaPlayer mediaPlayer = this.f191486n;
        if (mediaPlayer == null || !this.f191487o) {
            this.f191484i = -1;
            return -1;
        }
        int i17 = this.f191484i;
        if (i17 > 0) {
            return i17;
        }
        int duration = mediaPlayer.getDuration();
        this.f191484i = duration;
        return duration;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public double getLastProgresstime() {
        return 0.0d;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public long getLastSurfaceUpdateTime() {
        return this.I;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    /* renamed from: getVideoPath */
    public java.lang.String getF174598m() {
        return this.f191483h;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean isPlaying() {
        android.media.MediaPlayer mediaPlayer = this.f191486n;
        boolean z17 = false;
        if (mediaPlayer != null && this.f191487o && !this.K && !this.L) {
            try {
                z17 = mediaPlayer.isPlaying();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTextureView", e17, "isPlaying", new java.lang.Object[0]);
            }
        }
        hashCode();
        return z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void onDetach() {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f191488p == 0 || this.f191489q == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f191488p;
        int i27 = this.f191489q;
        com.tencent.mm.pluginsdk.ui.tools.o8 o8Var = this.P;
        o8Var.a(defaultSize, defaultSize2, i19, i27);
        setMeasuredDimension(o8Var.f191818g, o8Var.f191819h);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void pause() {
        android.media.MediaPlayer mediaPlayer = this.f191486n;
        if (mediaPlayer != null && this.f191487o && mediaPlayer.isPlaying()) {
            this.f191486n.pause();
        }
        this.f191490r = false;
    }

    public void setForceScaleFullScreen(boolean z17) {
        this.P.f191812a = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setLoop(boolean z17) {
        android.media.MediaPlayer mediaPlayer = this.f191486n;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z17);
        }
        this.A = true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setMute(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d set mute %b", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17));
        this.N = z17;
        android.media.MediaPlayer mediaPlayer = this.f191486n;
        if (mediaPlayer != null) {
            if (z17) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(1.0f, 1.0f);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnInfoCallback(com.tencent.mm.pluginsdk.ui.tools.b4 b4Var) {
        this.f191494v = b4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnSeekCompleteCallback(com.tencent.mm.pluginsdk.ui.tools.c4 c4Var) {
        this.f191493u = c4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnSurfaceCallback(com.tencent.mm.pluginsdk.ui.tools.d4 d4Var) {
        this.f191495w = d4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOneTimeVideoTextureUpdateCallback(com.tencent.mm.pluginsdk.ui.tools.e4 e4Var) {
        this.f191492t = e4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setPlayProgressCallback(boolean z17) {
    }

    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        this.P.d(e1Var);
        requestLayout();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setThumb(android.graphics.Bitmap bitmap) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoCallback(com.tencent.mm.pluginsdk.ui.tools.a4 a4Var) {
        this.f191491s = a4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoPath(java.lang.String str) {
        this.f191483h = str;
        this.f191490r = false;
        G();
        requestLayout();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean start() {
        if (this.f191485m == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoTextureView", "%d it surface not ready, do not start", java.lang.Integer.valueOf(hashCode()));
            this.f191482J = true;
            this.f191490r = true;
            return false;
        }
        long j17 = this.f191496x;
        if (j17 == 0) {
            j17 = com.tencent.mm.sdk.platformtools.t8.i1();
        }
        this.f191496x = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "start %d mIsPrepared %b pauseWhenUpdated %b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(this.f191487o), java.lang.Boolean.valueOf(this.K));
        android.media.MediaPlayer mediaPlayer = this.f191486n;
        if (mediaPlayer != null && this.f191487o) {
            if (this.K) {
                this.K = false;
                setMute(this.N);
            }
            this.f191486n.start();
            this.f191490r = true;
            return true;
        }
        if (mediaPlayer != null || !this.f191487o) {
            this.f191490r = true;
            return false;
        }
        this.f191490r = true;
        G();
        requestLayout();
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void stop() {
        android.graphics.SurfaceTexture surfaceTexture;
        long j17 = this.f191497y;
        long j18 = j17 > 0 ? j17 - this.f191496x : 2147483647L;
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1() - this.f191496x;
        int i18 = ((int) (j18 > i17 ? i17 : j18)) * 1000;
        if (i18 > getDuration()) {
            i18 = getDuration();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "stop : dur:%d stop:%d comp:%d", java.lang.Integer.valueOf(getDuration()), java.lang.Long.valueOf(i17), java.lang.Long.valueOf(j18));
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191491s;
        if (a4Var != null) {
            a4Var.q(i18, getDuration());
        }
        H();
        this.P.c();
        try {
            if (this.f191485m != null && this.f191487o && (surfaceTexture = getSurfaceTexture()) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoTextureView", "%d releaseSurface", java.lang.Integer.valueOf(hashCode()));
                E(surfaceTexture);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoTextureView", e17, "release surface", new java.lang.Object[0]);
        }
        this.f191483h = "";
        this.f191498z = 0;
        this.f191487o = false;
        this.f191490r = false;
        this.I = 0L;
    }

    public VideoTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f191485m = null;
        this.f191486n = null;
        this.f191496x = 0L;
        this.f191497y = 0L;
        this.f191498z = 0;
        this.A = false;
        this.B = new com.tencent.mm.pluginsdk.ui.tools.f8(this);
        this.C = new com.tencent.mm.pluginsdk.ui.tools.g8(this);
        this.D = new com.tencent.mm.pluginsdk.ui.tools.h8(this);
        this.E = new com.tencent.mm.pluginsdk.ui.tools.i8(this);
        this.F = new com.tencent.mm.pluginsdk.ui.tools.j8(this);
        this.G = new com.tencent.mm.pluginsdk.ui.tools.k8(this);
        this.H = new com.tencent.mm.pluginsdk.ui.tools.l8(this);
        this.I = 0L;
        this.f191482J = false;
        this.K = false;
        this.L = false;
        com.tencent.mm.pluginsdk.ui.tools.m8 m8Var = new com.tencent.mm.pluginsdk.ui.tools.m8(this);
        this.M = m8Var;
        this.N = false;
        this.P = new com.tencent.mm.pluginsdk.ui.tools.o8();
        this.Q = -1.0f;
        this.f191488p = 0;
        this.f191489q = 0;
        setSurfaceTextureListener(m8Var);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}

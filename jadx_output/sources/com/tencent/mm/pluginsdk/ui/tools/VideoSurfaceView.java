package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class VideoSurfaceView extends android.view.SurfaceView implements com.tencent.mm.pluginsdk.ui.tools.f4 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f191467d;

    /* renamed from: e, reason: collision with root package name */
    public int f191468e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.SurfaceHolder f191469f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaPlayer f191470g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191471h;

    /* renamed from: i, reason: collision with root package name */
    public int f191472i;

    /* renamed from: m, reason: collision with root package name */
    public int f191473m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f191474n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.a4 f191475o;

    /* renamed from: p, reason: collision with root package name */
    public final android.media.MediaPlayer.OnVideoSizeChangedListener f191476p;

    /* renamed from: q, reason: collision with root package name */
    public final android.media.MediaPlayer.OnPreparedListener f191477q;

    /* renamed from: r, reason: collision with root package name */
    public final android.media.MediaPlayer.OnCompletionListener f191478r;

    /* renamed from: s, reason: collision with root package name */
    public final android.media.MediaPlayer.OnErrorListener f191479s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.SurfaceHolder.Callback f191480t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f191481u;

    public VideoSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void d(com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView videoSurfaceView) {
        int i17;
        int i18 = videoSurfaceView.f191473m;
        if (i18 == 0 || (i17 = videoSurfaceView.f191472i) == 0) {
            return;
        }
        videoSurfaceView.getWidth();
        videoSurfaceView.getHeight();
        int width = videoSurfaceView.getWidth();
        int height = videoSurfaceView.getHeight();
        if (width <= 0) {
            width = i17;
        }
        if (height <= 0) {
            height = i18;
        }
        float f17 = i17;
        float f18 = (width * 1.0f) / f17;
        float f19 = i18;
        float f27 = (height * 1.0f) / f19;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) videoSurfaceView.getLayoutParams();
        if (f18 > f27) {
            layoutParams.width = (int) (f17 * f27);
            layoutParams.height = height;
        } else {
            layoutParams.width = width;
            layoutParams.height = (int) (f19 * f18);
        }
        layoutParams.addRule(13);
        videoSurfaceView.setLayoutParams(layoutParams);
        videoSurfaceView.f191470g.getVideoWidth();
        videoSurfaceView.f191470g.getVideoHeight();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void a(double d17, boolean z17) {
        b(d17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void b(double d17) {
        android.media.MediaPlayer mediaPlayer = this.f191470g;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) d17);
            start();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean c(android.content.Context context, boolean z17) {
        start();
        return true;
    }

    public final void e() {
        if (this.f191467d == null || this.f191469f == null) {
            return;
        }
        android.media.MediaPlayer mediaPlayer = this.f191470g;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f191470g.release();
            this.f191470g = null;
        }
        try {
            to.g gVar = new to.g();
            this.f191470g = gVar;
            gVar.setOnPreparedListener(this.f191477q);
            this.f191470g.setOnVideoSizeChangedListener(this.f191476p);
            this.f191471h = false;
            this.f191468e = -1;
            this.f191470g.setOnCompletionListener(this.f191478r);
            this.f191470g.setOnErrorListener(this.f191479s);
            this.f191470g.setDataSource(this.f191467d);
            this.f191470g.setDisplay(this.f191469f);
            this.f191470g.setAudioStreamType(3);
            this.f191470g.setScreenOnWhilePlaying(true);
            this.f191470g.prepareAsync();
            this.f191473m = this.f191470g.getVideoHeight();
            this.f191472i = this.f191470g.getVideoWidth();
            setMute(this.f191481u);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoSurfaceView", e17, "prepare async error %s", e17.getMessage());
            com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191475o;
            if (a4Var != null) {
                a4Var.onError(-1, -1);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public int getCurrentPosition() {
        android.media.MediaPlayer mediaPlayer = this.f191470g;
        if (mediaPlayer == null || !this.f191471h) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public int getDuration() {
        android.media.MediaPlayer mediaPlayer = this.f191470g;
        if (mediaPlayer == null || !this.f191471h) {
            this.f191468e = -1;
            return -1;
        }
        int i17 = this.f191468e;
        if (i17 > 0) {
            return i17;
        }
        int duration = mediaPlayer.getDuration();
        this.f191468e = duration;
        return duration;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public double getLastProgresstime() {
        return 0.0d;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public long getLastSurfaceUpdateTime() {
        return 0L;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public java.lang.String getVideoPath() {
        return this.f191467d;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean isPlaying() {
        android.media.MediaPlayer mediaPlayer = this.f191470g;
        if (mediaPlayer == null || !this.f191471h) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void onDetach() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void pause() {
        android.media.MediaPlayer mediaPlayer = this.f191470g;
        if (mediaPlayer != null && this.f191471h && mediaPlayer.isPlaying()) {
            this.f191470g.pause();
        }
        this.f191474n = false;
    }

    public void setForceScaleFullScreen(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setLoop(boolean z17) {
        android.media.MediaPlayer mediaPlayer = this.f191470g;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setMute(boolean z17) {
        this.f191481u = z17;
        android.media.MediaPlayer mediaPlayer = this.f191470g;
        if (mediaPlayer != null) {
            if (z17) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(0.5f, 0.5f);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnInfoCallback(com.tencent.mm.pluginsdk.ui.tools.b4 b4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnSeekCompleteCallback(com.tencent.mm.pluginsdk.ui.tools.c4 c4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOnSurfaceCallback(com.tencent.mm.pluginsdk.ui.tools.d4 d4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setOneTimeVideoTextureUpdateCallback(com.tencent.mm.pluginsdk.ui.tools.e4 e4Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setPlayProgressCallback(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setThumb(android.graphics.Bitmap bitmap) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoCallback(com.tencent.mm.pluginsdk.ui.tools.a4 a4Var) {
        this.f191475o = a4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void setVideoPath(java.lang.String str) {
        this.f191467d = str;
        this.f191474n = false;
        e();
        requestLayout();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public boolean start() {
        android.media.MediaPlayer mediaPlayer = this.f191470g;
        if (mediaPlayer == null || !this.f191471h) {
            this.f191474n = true;
        } else {
            mediaPlayer.start();
            this.f191474n = false;
        }
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.f4
    public void stop() {
        android.media.MediaPlayer mediaPlayer = this.f191470g;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f191470g.release();
            this.f191470g = null;
        }
    }

    public VideoSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f191469f = null;
        this.f191470g = null;
        this.f191476p = new com.tencent.mm.pluginsdk.ui.tools.y7(this);
        this.f191477q = new com.tencent.mm.pluginsdk.ui.tools.z7(this);
        this.f191478r = new com.tencent.mm.pluginsdk.ui.tools.a8(this);
        this.f191479s = new com.tencent.mm.pluginsdk.ui.tools.b8(this);
        com.tencent.mm.pluginsdk.ui.tools.c8 c8Var = new com.tencent.mm.pluginsdk.ui.tools.c8(this);
        this.f191480t = c8Var;
        this.f191481u = false;
        this.f191472i = 0;
        this.f191473m = 0;
        getHolder().addCallback(c8Var);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
    }
}

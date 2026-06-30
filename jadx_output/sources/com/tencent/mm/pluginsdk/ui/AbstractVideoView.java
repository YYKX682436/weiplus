package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public abstract class AbstractVideoView extends android.widget.RelativeLayout implements com.tencent.mm.pluginsdk.ui.f1, com.tencent.mm.pluginsdk.ui.tools.a4, com.tencent.mm.pluginsdk.ui.tools.e4, com.tencent.mm.pluginsdk.ui.tools.c4, com.tencent.mm.pluginsdk.ui.tools.b4, com.tencent.mm.pluginsdk.ui.tools.d4 {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public int G;
    public final com.tencent.mm.sdk.platformtools.b4 H;
    public final com.tencent.mm.sdk.platformtools.b4 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f189737J;
    public final m34.e K;
    public final android.view.View.OnClickListener L;
    public boolean M;
    public final java.lang.Runnable N;
    public final java.lang.Runnable P;
    public com.tencent.mm.pluginsdk.ui.c1 Q;
    public final com.tencent.mm.pluginsdk.ui.e3 R;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f189738d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f189739e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f189740f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f189741g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f189742h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f189743i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f189744m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f189745n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar f189746o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.z0 f189747p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f189748q;

    /* renamed from: r, reason: collision with root package name */
    public int f189749r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f189750s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.b1 f189751t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.d1 f189752u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f189753v;

    /* renamed from: w, reason: collision with root package name */
    public final int f189754w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f189755x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f189756y;

    /* renamed from: z, reason: collision with root package name */
    public int f189757z;

    public AbstractVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean A() {
        long lastSurfaceUpdateTime = this.f189748q.getLastSurfaceUpdateTime();
        int currentPosition = this.f189748q.getCurrentPosition();
        N();
        if (lastSurfaceUpdateTime <= 0 || lastSurfaceUpdateTime != this.F || currentPosition == this.G) {
            this.F = lastSurfaceUpdateTime;
            this.G = currentPosition;
            return true;
        }
        com.tencent.mars.xlog.Log.w(this.f189739e, "%s check surface is update error", N());
        a(this.G / 1000, true);
        return false;
    }

    public m34.e B() {
        return new com.tencent.mm.pluginsdk.ui.h(this);
    }

    public com.tencent.mm.pluginsdk.ui.tools.f4 C(android.content.Context context) {
        return null;
    }

    public void D() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f189756y;
        n3Var.removeMessages(1);
        n3Var.sendEmptyMessage(2);
    }

    public void H(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.pluginsdk.ui.c1 c1Var = this.Q;
        if (c1Var != null) {
            c1Var.idkeyStat(j17, j18, j19, z17);
        }
    }

    public void I() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s init view ", N());
        android.view.LayoutInflater.from(this.f189740f).inflate(M(), this);
        this.f189742h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p0l);
        this.f189743i = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f487563p06);
        this.f189744m = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.ozc);
        this.f189745n = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f487554oz2);
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar) findViewById(com.tencent.mm.R.id.ozz);
        this.f189746o = videoPlayerSeekBar;
        this.f189747p = videoPlayerSeekBar;
        if (videoPlayerSeekBar != null) {
            videoPlayerSeekBar.setIplaySeekCallback(this.K);
            this.f189746o.setOnClickListener(this.L);
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 C = C(this.f189740f);
        this.f189748q = C;
        C.setVideoCallback(this);
        this.f189748q.setOnSeekCompleteCallback(this);
        this.f189748q.setOnInfoCallback(this);
        this.f189748q.setOnSurfaceCallback(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f189743i.addView((android.view.View) this.f189748q, 0, layoutParams);
    }

    public boolean L() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        boolean z17 = false;
        if (f4Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(f4Var.getF174598m()) && this.E) {
            z17 = true;
        }
        N();
        return z17;
    }

    public int M() {
        return com.tencent.mm.R.layout.f488656zr;
    }

    public java.lang.String N() {
        return "" + hashCode();
    }

    public boolean O() {
        return !(this instanceof com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoView);
    }

    public boolean P() {
        return false;
    }

    public void Q() {
        com.tencent.mm.pluginsdk.ui.e3 e3Var = this.R;
        if (e3Var.f190794a == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            e3Var.f190794a = java.lang.System.currentTimeMillis();
        }
    }

    public void R() {
        int i17;
        int i18;
        com.tencent.mm.pluginsdk.ui.e3 e3Var = this.R;
        long j17 = e3Var.f190799f;
        if (j17 > 0) {
            long j18 = e3Var.f190798e;
            if (j18 > 0) {
                int i19 = (int) ((j17 - j18) / 1000);
                if (com.tencent.mars.comm.NetStatusUtil.isWifi(this.f189740f)) {
                    i17 = 70;
                    i18 = 74;
                } else if (com.tencent.mars.comm.NetStatusUtil.is4G(this.f189740f)) {
                    i17 = 75;
                    i18 = 79;
                } else if (com.tencent.mars.comm.NetStatusUtil.is3G(this.f189740f)) {
                    i17 = 80;
                    i18 = 84;
                } else {
                    if (!com.tencent.mars.comm.NetStatusUtil.is2G(this.f189740f)) {
                        return;
                    }
                    i17 = 85;
                    i18 = 89;
                }
                int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.y(i19, new int[]{1, 2, 3, 4}, i17 + getReportIdkey(), i18 + getReportIdkey()));
                N();
                H(600L, q17, 1L, false);
            }
        }
    }

    public boolean S(double d17) {
        return a(d17, isPlaying());
    }

    public void T() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f189756y;
        if (n3Var.hasMessages(1) || this.M) {
            return;
        }
        n3Var.sendEmptyMessageDelayed(1, 500L);
    }

    public void T4(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s on get video size [%d, %d]", N(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f189751t;
        if (b1Var != null) {
            b1Var.I(getSessionId(), getMediaId(), i17, i18);
        }
        H(600L, getReportIdkey() + 8, 1L, false);
    }

    public void U(boolean z17) {
        N();
        this.H.c(500L, 500L);
    }

    public void V() {
        this.H.d();
        this.I.d();
    }

    public void W(int i17) {
        com.tencent.mm.pluginsdk.ui.z0 z0Var = this.f189747p;
        if (z0Var != null) {
            z0Var.c(i17);
        }
    }

    public final void X(boolean z17) {
        com.tencent.mm.pluginsdk.ui.z0 z0Var = this.f189747p;
        if (z0Var != null) {
            z0Var.e(z17);
        }
    }

    public boolean a(double d17, boolean z17) {
        boolean L = L();
        int videoDurationSec = getVideoDurationSec();
        int i17 = (videoDurationSec <= 0 || d17 <= ((double) videoDurationSec)) ? (int) d17 : videoDurationSec;
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        boolean z18 = (f4Var == null || com.tencent.mm.sdk.platformtools.t8.K0(f4Var.getF174598m())) ? false : true;
        com.tencent.mm.sdk.platformtools.Log.c(this.f189739e, "%s seek to [%d %s] seconds afterPlay[%b] isPrepared[%b] duration[%d] hadSetPath[%b]", N(), java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(L), java.lang.Integer.valueOf(videoDurationSec), java.lang.Boolean.valueOf(z18));
        H(600L, getReportIdkey() + 5, 1L, false);
        if (!L) {
            this.B = i17;
            if (z18) {
                this.A = true;
            } else {
                this.A = z17;
                start();
            }
        } else if (this.f189748q != null) {
            T();
            W(i17);
            this.f189748q.a(i17 * 1000, z17);
            return z17;
        }
        return false;
    }

    public void d() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s onUIDestroy", N());
        stop();
        this.f189756y.removeCallbacksAndMessages(null);
        V();
        this.f189737J.d();
        H(600L, getReportIdkey() + 12, 1L, false);
    }

    public void e() {
        java.lang.String str = this.f189739e;
        java.lang.String N = N();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(str, "%s onUIPause %s", N, new com.tencent.mm.sdk.platformtools.z3());
        this.f189749r = getCurrPosSec();
        this.f189750s = isPlaying();
        this.G = 0;
        this.F = 0;
        pause();
        V();
        this.f189741g = false;
        H(600L, getReportIdkey() + 11, 1L, false);
    }

    public void g() {
        java.lang.String str = this.f189739e;
        java.lang.String N = N();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(str, "%s onUIResume %s", N, new com.tencent.mm.sdk.platformtools.z3());
        this.f189741g = true;
        H(600L, getReportIdkey() + 10, 1L, false);
    }

    public int getCacheTimeSec() {
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosMs() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            return f4Var.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrPosSec() {
        if (this.f189748q != null) {
            return java.lang.Math.round((r0.getCurrentPosition() * 1.0f) / 1000.0f);
        }
        return 0;
    }

    public java.lang.String getMediaId() {
        return "";
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getPlayerType() {
        return this.f189757z;
    }

    public abstract int getReportIdkey();

    public java.lang.String getSessionId() {
        return "";
    }

    public int getVideoDurationSec() {
        if (this.f189748q != null) {
            return java.lang.Math.round((r0.getDuration() * 1.0f) / 1000.0f);
        }
        return -1;
    }

    public int getVideoSource() {
        return 0;
    }

    public void i() {
        java.lang.Object obj = this.f189747p;
        if (obj != null) {
            this.f189745n.removeView((android.view.View) obj);
        }
    }

    public boolean isPlaying() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        boolean isPlaying = f4Var != null ? f4Var.isPlaying() : false;
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s is playing[%b]", N(), java.lang.Boolean.valueOf(isPlaying));
        return isPlaying;
    }

    public void onCompletion() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s onCompletion, curMs %d, duration %d", N(), java.lang.Integer.valueOf(getCurrPosSec()), java.lang.Integer.valueOf(getVideoDurationSec()));
        W(getVideoDurationSec());
        D();
        V();
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f189751t;
        if (b1Var != null) {
            b1Var.E(getSessionId(), getMediaId());
        }
        this.G = 0;
        this.F = 0;
        H(600L, getReportIdkey() + 7, 1L, false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mars.xlog.Log.w(this.f189739e, "%s onError info [%d %d] errorCount[%d]", N(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.C));
        H(600L, getReportIdkey() + 90, 1L, false);
        int i19 = this.C + 1;
        this.C = i19;
        if (i19 <= 5) {
            int currPosSec = getCurrPosSec();
            int i27 = this.B;
            if (i27 == -1) {
                i27 = currPosSec;
            }
            com.tencent.mars.xlog.Log.i(this.f189739e, "%s onError now, try to start again. currPlaySec[%d] seekTimeWhenPrepared[%d] currPosSec[%d]", N(), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(currPosSec));
            stop();
            T();
            this.f189756y.postDelayed(new com.tencent.mm.pluginsdk.ui.c(this, i27), 200L);
            return;
        }
        H(600L, getReportIdkey() + 92, 1L, false);
        com.tencent.mm.pluginsdk.ui.e3 e3Var = this.R;
        e3Var.f190804k = i17;
        e3Var.f190805l = i18;
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f189751t;
        if (b1Var != null) {
            java.lang.String sessionId = getSessionId();
            java.lang.String mediaId = getMediaId();
            java.lang.String str = "MEDIA_ERR_SRC_NOT_SUPPORTED";
            if (i17 != -1010 && i17 != -1007) {
                str = "MEDIA_ERR_NETWORK";
                if (i17 != -1004 ? com.tencent.mars.comm.NetStatusUtil.isConnected(this.f189740f) : com.tencent.mars.comm.NetStatusUtil.isConnected(this.f189740f)) {
                    str = "MEDIA_ERR_DECODE";
                }
            }
            b1Var.N(sessionId, mediaId, str, i17, i18);
        }
        stop();
        D();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        int i17;
        int i18;
        com.tencent.mars.xlog.Log.i(this.f189738d, "video is onPrepared");
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s onPrepared startWhenPrepared[%b] seekTimeWhenPrepared[%d] isPrepared[%b]", N(), java.lang.Boolean.valueOf(this.A), java.lang.Integer.valueOf(this.B), java.lang.Boolean.valueOf(this.E));
        this.E = true;
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            f4Var.setOneTimeVideoTextureUpdateCallback(this);
        }
        setVideoTotalTime(getVideoDurationSec());
        boolean z17 = this.A;
        if (!z17) {
            int i19 = this.B;
            a(i19 <= -1 ? 0.0d : i19, z17);
        } else if (this.B <= -1) {
            if (play() && O()) {
                this.I.c(1000L, 1000L);
            }
        } else if (j()) {
            play();
        } else {
            a(this.B, this.A);
        }
        this.B = -1;
        this.A = true;
        this.G = 0;
        this.F = 0;
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f189751t;
        if (b1Var != null) {
            b1Var.o(getSessionId(), getMediaId());
        }
        if (this.C > 0) {
            N();
            this.f189737J.c(5000L, 5000L);
        }
        H(600L, getReportIdkey() + 2, 1L, false);
        com.tencent.mm.pluginsdk.ui.e3 e3Var = this.R;
        if (e3Var.f190795b == 0) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            e3Var.f190795b = java.lang.System.currentTimeMillis();
        }
        e3Var.f190803j = getVideoDurationSec();
        long j17 = e3Var.f190794a;
        if (j17 > 0) {
            long j18 = e3Var.f190795b;
            if (j18 > 0) {
                int i27 = (int) ((j18 - j17) / 1000);
                if (com.tencent.mars.comm.NetStatusUtil.isWifi(this.f189740f)) {
                    i17 = 20;
                    i18 = 24;
                } else if (com.tencent.mars.comm.NetStatusUtil.is4G(this.f189740f)) {
                    i17 = 25;
                    i18 = 29;
                } else if (com.tencent.mars.comm.NetStatusUtil.is3G(this.f189740f)) {
                    i17 = 30;
                    i18 = 34;
                } else {
                    if (!com.tencent.mars.comm.NetStatusUtil.is2G(this.f189740f)) {
                        return;
                    }
                    i17 = 35;
                    i18 = 39;
                }
                int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.y(i27, new int[]{1, 2, 3, 4}, i17 + getReportIdkey(), i18 + getReportIdkey()));
                N();
                H(600L, q17, 1L, false);
            }
        }
    }

    public void onSurfaceAvailable() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s on surface available", N());
        U(false);
    }

    public boolean pause() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s pause", N());
        H(600L, getReportIdkey() + 4, 1L, false);
        if (this.f189748q == null) {
            return false;
        }
        X(false);
        this.f189748q.pause();
        V();
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f189751t;
        if (b1Var != null) {
            b1Var.i(getSessionId(), getMediaId());
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.R.f190797d = java.lang.System.currentTimeMillis();
        return true;
    }

    public boolean play() {
        if (!this.f189741g) {
            java.lang.String str = this.f189739e;
            java.lang.String N = N();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.w(str, "%s ui on pause now, why u call me to play? [%s]", N, new com.tencent.mm.sdk.platformtools.z3());
            return false;
        }
        H(600L, getReportIdkey() + 3, 1L, false);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var == null) {
            return false;
        }
        boolean start = f4Var.start();
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s video play [%b] isPlayOnUiPause[%b]", N(), java.lang.Boolean.valueOf(start), java.lang.Boolean.valueOf(this.f189750s));
        X(start);
        if (start) {
            this.f189750s = false;
            com.tencent.mars.xlog.Log.i(this.f189738d, "play, start is true");
            U(false);
            com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f189751t;
            if (b1Var != null) {
                b1Var.l(getSessionId(), getMediaId());
            }
        }
        return start;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setCover(android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView;
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s set cover", N());
        if (bitmap == null || bitmap.isRecycled() || (imageView = this.f189742h) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setFullDirection(int i17) {
    }

    public void setIMMVideoViewCallback(com.tencent.mm.pluginsdk.ui.b1 b1Var) {
        this.f189751t = b1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setIsShowBasicControls(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s is show seek bar[%b]", N(), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f189756y;
        if (z17) {
            n3Var.post(new com.tencent.mm.pluginsdk.ui.l(this));
        } else {
            n3Var.post(new com.tencent.mm.pluginsdk.ui.a(this));
        }
    }

    public abstract /* synthetic */ void setLoop(boolean z17);

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setLoopCompletionCallback(com.tencent.mm.pluginsdk.ui.d1 d1Var) {
        this.f189752u = d1Var;
    }

    public void setMute(boolean z17) {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            f4Var.setMute(z17);
        }
    }

    public void setReporter(com.tencent.mm.pluginsdk.ui.c1 c1Var) {
        this.Q = c1Var;
    }

    public abstract /* synthetic */ void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setVideoFooterView(com.tencent.mm.pluginsdk.ui.z0 z0Var) {
        if (!(z0Var instanceof android.view.View)) {
            com.tencent.mars.xlog.Log.w(this.f189739e, "%s set video footer view but is not view", N());
            return;
        }
        i();
        this.f189747p = z0Var;
        this.f189745n.addView((android.view.View) z0Var);
    }

    public void setVideoTotalTime(int i17) {
        com.tencent.mm.pluginsdk.ui.z0 z0Var = this.f189747p;
        if (z0Var == null || z0Var.getVideoTotalTime() == i17) {
            return;
        }
        this.f189747p.setVideoTotalTime(i17);
    }

    public void stop() {
        int i17;
        int i18;
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s stop", N());
        H(600L, getReportIdkey() + 6, 1L, false);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            f4Var.stop();
        }
        this.f189755x = false;
        this.B = -1;
        this.A = true;
        this.E = false;
        this.G = 0;
        this.F = 0;
        V();
        this.f189756y.postDelayed(new com.tencent.mm.pluginsdk.ui.b(this), 10L);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.ui.e3 e3Var = this.R;
        e3Var.f190796c = currentTimeMillis;
        if (e3Var.f190801h > 0) {
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(this.f189740f)) {
                i17 = 41;
                i18 = 45;
            } else if (com.tencent.mars.comm.NetStatusUtil.is4G(this.f189740f)) {
                i17 = 46;
                i18 = 50;
            } else if (com.tencent.mars.comm.NetStatusUtil.is3G(this.f189740f)) {
                i17 = 51;
                i18 = 55;
            } else if (com.tencent.mars.comm.NetStatusUtil.is2G(this.f189740f)) {
                i17 = 56;
                i18 = 60;
            }
            int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.y(e3Var.f190801h, new int[]{1, 2, 3, 4}, i17 + getReportIdkey(), i18 + getReportIdkey()));
            N();
            H(600L, q17, 1L, false);
        }
        if (e3Var.f190794a == 0) {
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(e3Var.f190794a);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190795b);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190796c);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190797d);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190798e);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190799f);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190800g);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190801h);
        stringBuffer.append(",");
        long j17 = e3Var.f190795b;
        stringBuffer.append(j17 > 0 ? j17 - e3Var.f190794a : 0L);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190802i);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190803j);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190804k);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190805l);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f190806m);
        stringBuffer.append(",");
        long j18 = e3Var.f190806m;
        long j19 = e3Var.f190794a;
        stringBuffer.append(j18 > j19 ? j18 - j19 : 0L);
        stringBuffer.append(",");
        stringBuffer.append(getPlayerType());
        stringBuffer.append(",");
        stringBuffer.append(getVideoSource());
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s rpt video kv stat{%s}", N(), stringBuffer2);
        com.tencent.mm.pluginsdk.ui.c1 c1Var = this.Q;
        if (c1Var != null) {
            c1Var.kvStat(14349, stringBuffer2);
        }
        e3Var.f190794a = 0L;
        e3Var.f190795b = 0L;
        e3Var.f190796c = 0L;
        e3Var.f190797d = 0L;
        e3Var.f190798e = 0L;
        e3Var.f190799f = 0L;
        e3Var.f190800g = 0L;
        e3Var.f190801h = 0;
        e3Var.f190802i = "";
        e3Var.f190803j = 0;
        e3Var.f190804k = 0;
        e3Var.f190805l = 0;
        e3Var.f190806m = 0L;
    }

    public void v() {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s onTextureUpdate ", N());
        D();
    }

    public void z(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s on seek complete startPlay[%b]", N(), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            f4Var.setOneTimeVideoTextureUpdateCallback(this);
        }
        D();
        X(z17);
        int currPosSec = getCurrPosSec();
        com.tencent.mars.xlog.Log.i(this.f189738d, "onSeekComplete, startPlay is " + z17 + ", updateUI and currPosSec is " + currPosSec);
        W(currPosSec);
        if (z17) {
            U(false);
            this.f189750s = false;
            com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f189751t;
            if (b1Var != null) {
                b1Var.l(getSessionId(), getMediaId());
            }
        }
    }

    public AbstractVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f189738d = "VideoView.AbstractVideoView";
        this.f189739e = "MicroMsg.AbstractVideoView";
        this.f189741g = true;
        this.f189749r = 0;
        this.f189750s = false;
        this.f189753v = false;
        this.f189755x = false;
        this.f189756y = new com.tencent.mm.pluginsdk.ui.d(this, android.os.Looper.getMainLooper());
        this.f189757z = 0;
        this.A = true;
        this.B = -1;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = 0L;
        this.G = 0;
        this.H = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.pluginsdk.ui.e(this), true);
        this.I = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.pluginsdk.ui.f(this), false);
        this.f189737J = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.pluginsdk.ui.g(this), true);
        this.K = B();
        this.L = new com.tencent.mm.pluginsdk.ui.i(this);
        this.M = false;
        this.N = new com.tencent.mm.pluginsdk.ui.j(this);
        this.P = new com.tencent.mm.pluginsdk.ui.k(this);
        this.Q = null;
        this.R = new com.tencent.mm.pluginsdk.ui.e3();
        this.f189740f = context;
        I();
    }

    public AbstractVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17);
        this.f189738d = "VideoView.AbstractVideoView";
        this.f189739e = "MicroMsg.AbstractVideoView";
        this.f189741g = true;
        this.f189749r = 0;
        this.f189750s = false;
        this.f189753v = false;
        this.f189755x = false;
        this.f189756y = new com.tencent.mm.pluginsdk.ui.d(this, android.os.Looper.getMainLooper());
        this.f189757z = 0;
        this.A = true;
        this.B = -1;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = 0L;
        this.G = 0;
        this.H = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.pluginsdk.ui.e(this), true);
        this.I = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.pluginsdk.ui.f(this), false);
        this.f189737J = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.pluginsdk.ui.g(this), true);
        this.K = B();
        this.L = new com.tencent.mm.pluginsdk.ui.i(this);
        this.M = false;
        this.N = new com.tencent.mm.pluginsdk.ui.j(this);
        this.P = new com.tencent.mm.pluginsdk.ui.k(this);
        this.Q = null;
        this.R = new com.tencent.mm.pluginsdk.ui.e3();
        this.f189754w = i18;
        this.f189740f = context;
        I();
    }
}

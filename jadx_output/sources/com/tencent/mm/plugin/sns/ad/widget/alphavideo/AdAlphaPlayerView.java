package com.tencent.mm.plugin.sns.ad.widget.alphavideo;

/* loaded from: classes4.dex */
public class AdAlphaPlayerView extends android.widget.FrameLayout implements n84.z {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f163477u = 0;

    /* renamed from: d, reason: collision with root package name */
    public n84.v f163478d;

    /* renamed from: e, reason: collision with root package name */
    public kk4.c f163479e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.TextureView f163480f;

    /* renamed from: g, reason: collision with root package name */
    public n84.u f163481g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f163482h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f163483i;

    /* renamed from: m, reason: collision with root package name */
    public int f163484m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f163485n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f163486o;

    /* renamed from: p, reason: collision with root package name */
    public m3.a f163487p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f163488q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener f163489r;

    /* renamed from: s, reason: collision with root package name */
    public n84.t f163490s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f163491t;

    public AdAlphaPlayerView(android.content.Context context) {
        super(context);
        this.f163485n = false;
        this.f163486o = false;
        this.f163488q = "";
        this.f163491t = new com.tencent.mm.sdk.platformtools.b4(new n84.i(this), true);
    }

    public static /* synthetic */ n84.u a(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.u uVar = adAlphaPlayerView.f163481g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return uVar;
    }

    private kk4.c getPlayer() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        kk4.c cVar = this.f163479e;
        if (cVar == null) {
            this.f163479e = b();
        } else {
            try {
                ((kk4.f0) cVar).reset();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdAlphaPlayerView", "getPlayer() called " + th6, th6);
                this.f163479e = b();
            }
        }
        try {
            setDataSource(this.f163479e);
        } catch (java.lang.Throwable th7) {
            n84.w.c("AdAlphaPlayerView", "init player failed", th7);
            n84.x.a().b(new n84.p(this));
        }
        kk4.c cVar2 = this.f163479e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return cVar2;
    }

    private void setDataSource(kk4.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (cVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        } else {
            if (android.text.TextUtils.isEmpty(this.f163482h)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                return;
            }
            ((kk4.f0) cVar).setDataSource(this.f163482h);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDataSource", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
    }

    public final kk4.c b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        kk4.f0 f0Var = new kk4.f0(context, null);
        f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(203, 1L));
        f0Var.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildQueueInt(204, new int[]{102}));
        f0Var.f308541q = new n84.j(this, f0Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1913, 2);
        f0Var.setOnErrorListener(new n84.l(this));
        f0Var.setOnCompletionListener(new n84.m(this));
        f0Var.setOnVideoSizeChangedListener(new n84.n(this));
        f0Var.setOnInfoListener(new n84.o(this));
        f0Var.setOutputMute(true);
        f0Var.setLoopback(this.f163483i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return f0Var;
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenGLComponentsInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.e("AdAlphaPlayerView", "onOpenGLComponentsInit");
        final kk4.c player = getPlayer();
        if (player == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenGLComponentsInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        try {
            n84.v vVar = this.f163478d;
            vVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            android.graphics.SurfaceTexture surfaceTexture = vVar.f335697x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            android.view.Surface surface = new android.view.Surface(surfaceTexture);
            kk4.f0 f0Var = (kk4.f0) player;
            f0Var.setSurface(surface);
            f0Var.setOnPreparedListener(new n84.b(this, f0Var));
            f0Var.prepareAsync();
        } catch (java.lang.Throwable th6) {
            n84.x.a().b(new n84.c(this));
            n84.w.c("AdAlphaPlayerView", "start the video failed!", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.u uVar = this.f163481g;
        if (uVar != null) {
            ((com.tencent.mm.plugin.sns.ui.widget.g0) uVar).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenGLInit", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenGLInit", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: n84.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                kk4.c cVar = player;
                int i17 = com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.f163477u;
                com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.this;
                adAlphaPlayerView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onOpenGLComponentsInit$0", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                adAlphaPlayerView.setAlpha(1.0f);
                if (adAlphaPlayerView.f163486o) {
                    try {
                        ((kk4.f0) cVar).start();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onOpenGLComponentsInit$0", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenGLComponentsInit", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepare", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.e("AdAlphaPlayerView", "prepare");
        n84.u uVar = this.f163481g;
        if (uVar != null) {
            ((com.tencent.mm.plugin.sns.ui.widget.g0) uVar).b(2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        android.view.TextureView textureView = new android.view.TextureView(getContext());
        textureView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        textureView.setOpaque(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSurface", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f163480f = textureView;
        java.util.Objects.toString(textureView.getSurfaceTexture());
        this.f163480f.setSurfaceTextureListener(new n84.r(this));
        addView(this.f163480f, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepare", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.e("AdAlphaPlayerView", "resumeAd");
        this.f163486o = true;
        n84.u uVar = this.f163481g;
        if (uVar != null) {
            ((com.tencent.mm.plugin.sns.ui.widget.g0) uVar).b(2);
        }
        try {
            kk4.c cVar = this.f163479e;
            if (cVar != null) {
                ((kk4.f0) cVar).start();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTimer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            ((ku5.t0) ku5.t0.f312615d).B(new n84.g(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            n84.v vVar = this.f163478d;
            if (vVar != null) {
                vVar.e();
            }
        } catch (java.lang.Throwable th6) {
            n84.w.c("AdAlphaPlayerView", "resume failed", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeReleasePlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.x.a().b(new n84.e(this));
        n84.v vVar = this.f163478d;
        if (vVar != null) {
            vVar.d();
        }
        if (this.f163479e != null) {
            ((ku5.t0) ku5.t0.f312615d).g(new n84.f(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeReleasePlayer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.u uVar = this.f163481g;
        if (uVar != null) {
            ((com.tencent.mm.plugin.sns.ui.widget.g0) uVar).b(4);
        }
        try {
            h();
            f();
        } catch (java.lang.Throwable th6) {
            n84.w.d("AdAlphaPlayerView", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public kotlinx.coroutines.flow.n2 getOnFrameRenderedFlow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.v vVar = this.f163478d;
        if (vVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            return null;
        }
        vVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        kotlinx.coroutines.flow.i2 i2Var = vVar.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnFrameRenderedFlow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        return i2Var;
    }

    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopTimer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        ((ku5.t0) ku5.t0.f312615d).B(new n84.h(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopTimer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.e("AdAlphaPlayerView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.w.e("AdAlphaPlayerView", "onSizeChanged w:" + i17 + " h:" + i18);
        super.onSizeChanged(i17, i18, i19, i27);
        n84.v vVar = this.f163478d;
        if (vVar != null) {
            vVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize, "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
            vVar.f335665i = i17;
            vVar.f335666m = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.live2.impl.V2TXLiveDefInner.TXLivePropertyKey.kV2SetSurfaceSize, "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void setOnPrepared(m3.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f163487p = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void setOnProgressListener(n84.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnProgressListener", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f163490s = tVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnProgressListener", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public void setPrepared(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        this.f163485n = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
    }

    public AdAlphaPlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163485n = false;
        this.f163486o = false;
        this.f163488q = "";
        this.f163491t = new com.tencent.mm.sdk.platformtools.b4(new n84.i(this), true);
    }
}

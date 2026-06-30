package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

/* loaded from: classes4.dex */
public class AdLandingVideoWrapper extends android.widget.RelativeLayout implements com.tencent.mm.pluginsdk.ui.f1, com.tencent.mm.pluginsdk.ui.a1, com.tencent.mm.pluginsdk.ui.c1, com.tencent.mm.pluginsdk.ui.b1, c01.i {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f165610v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f165611d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.f1 f165612e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.b1 f165613f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.z0 f165614g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.e1 f165615h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f165616i;

    /* renamed from: m, reason: collision with root package name */
    public float f165617m;

    /* renamed from: n, reason: collision with root package name */
    public int f165618n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f165619o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f165620p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f165621q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f165622r;

    /* renamed from: s, reason: collision with root package name */
    public final c01.k f165623s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c f165624t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f165625u;

    public AdLandingVideoWrapper(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingVideoWrapper", "%d onVideoEnded", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f165613f;
        if (b1Var != null) {
            b1Var.E(str, str2);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 35);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingVideoWrapper", "%d onGetVideoSize[%d %d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f165613f;
        if (b1Var != null) {
            b1Var.I(str, str2, i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mars.xlog.Log.w("MicroMsg.AdLandingVideoWrapper", "%d onError[%s %d, %d]", java.lang.Integer.valueOf(hashCode()), str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f165613f;
        if (b1Var != null) {
            b1Var.N(str, str2, str3, i17, i18);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 36);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f165613f;
        if (b1Var != null) {
            b1Var.N5(str, str2, bool);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // c01.i
    public void P0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // c01.i
    public void U5() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lossTransient", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lossTransient", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // c01.i
    public void V3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gain", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gain", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean a(double d17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return false;
        }
        boolean a17 = f1Var.a(d17, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return a17;
    }

    public final com.tencent.mm.pluginsdk.ui.f1 b() {
        android.content.Context context = this.f165611d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFullScreenMMPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        try {
            com.tencent.mm.modelvideo.FullScreenMMVideoView fullScreenMMVideoView = new com.tencent.mm.modelvideo.FullScreenMMVideoView(context);
            fullScreenMMVideoView.setReporter(this);
            fullScreenMMVideoView.setIMMVideoViewCallback(this);
            fullScreenMMVideoView.setIMMDownloadFinish(this);
            java.lang.String g17 = za4.t0.g();
            com.tencent.mm.vfs.w6.u(g17);
            fullScreenMMVideoView.setRootPath(g17);
            fullScreenMMVideoView.setIOnlineVideoProxy(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.g());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFullScreenMMPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return fullScreenMMVideoView;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingVideoWrapper", th6.toString());
            com.tencent.mm.modelvideo.FullScreenMMVideoView fullScreenMMVideoView2 = new com.tencent.mm.modelvideo.FullScreenMMVideoView(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFullScreenMMPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return fullScreenMMVideoView2;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean c(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayRate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        if (f17 <= 0.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayRate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return false;
        }
        this.f165617m = f17;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayRate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return false;
        }
        boolean c17 = f1Var.c(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayRate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return c17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.d();
        }
        this.f165623s.a();
        setKeepScreenOn(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.e();
        }
        this.f165623s.a();
        setKeepScreenOn(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public final com.tencent.mm.pluginsdk.ui.f1 f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createMMPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.modelvideo.AdLandingMMVideoView adLandingMMVideoView = new com.tencent.mm.modelvideo.AdLandingMMVideoView(this.f165611d);
        adLandingMMVideoView.setReporter(this);
        adLandingMMVideoView.setIMMVideoViewCallback(this);
        adLandingMMVideoView.setIMMDownloadFinish(this);
        java.lang.String g17 = za4.t0.g();
        com.tencent.mm.vfs.w6.u(g17);
        adLandingMMVideoView.setRootPath(g17);
        adLandingMMVideoView.setIOnlineVideoProxy(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.g());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMMPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return adLandingMMVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.g();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // c01.i
    public void g3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCacheTimeSec() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheTimeSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheTimeSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return 0;
        }
        int cacheTimeSec = f1Var.getCacheTimeSec();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheTimeSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return cacheTimeSec;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosMs() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrPosMs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrPosMs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return 0;
        }
        int currPosMs = f1Var.getCurrPosMs();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrPosMs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return currPosMs;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosSec() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrPosSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrPosSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return 0;
        }
        int currPosSec = f1Var.getCurrPosSec();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrPosSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return currPosSec;
    }

    public android.view.View getInnerVideoView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var instanceof com.tencent.mm.modelvideo.AdLandingMMVideoView) {
            android.view.View innerVideoView = ((com.tencent.mm.modelvideo.AdLandingMMVideoView) f1Var).getInnerVideoView();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return innerVideoView;
        }
        if (!(f1Var instanceof com.tencent.mm.modelvideo.MMVideoView)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return null;
        }
        android.view.View innerVideoView2 = ((com.tencent.mm.modelvideo.MMVideoView) f1Var).getInnerVideoView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return innerVideoView2;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getPlayerType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayerType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayerType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return 0;
        }
        int playerType = f1Var.getPlayerType();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayerType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return playerType;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getVideoDurationSec() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoDurationSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            int videoDurationSec = f1Var.getVideoDurationSec();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoDurationSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return videoDurationSec;
        }
        int i17 = this.f165618n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoDurationSec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return i17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(1:3)(2:58|(11:60|5|6|7|8|(3:10|(1:28)(1:14)|(1:16)(2:24|(1:26)(1:27)))(8:29|(1:55)(1:33)|34|(2:36|(3:38|39|40)(1:42))(2:43|(3:45|(2:47|48)(2:49|50)|40)(1:51))|18|(1:20)|21|22)|17|18|(0)|21|22)(1:61))|4|5|6|7|8|(0)(0)|17|18|(0)|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006a, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #1 {all -> 0x006a, blocks: (B:7:0x004a, B:10:0x005a, B:12:0x0061, B:14:0x0065, B:16:0x0073, B:24:0x0097, B:26:0x00a1, B:27:0x00ba, B:28:0x006d, B:29:0x00d1, B:31:0x00d8, B:33:0x00dc, B:36:0x00e7, B:38:0x00ed, B:42:0x0125, B:43:0x013d, B:45:0x0143, B:47:0x014d, B:49:0x0178, B:51:0x01a4, B:55:0x00e1), top: B:6:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1 A[Catch: all -> 0x006a, TryCatch #1 {all -> 0x006a, blocks: (B:7:0x004a, B:10:0x005a, B:12:0x0061, B:14:0x0065, B:16:0x0073, B:24:0x0097, B:26:0x00a1, B:27:0x00ba, B:28:0x006d, B:29:0x00d1, B:31:0x00d8, B:33:0x00dc, B:36:0x00e7, B:38:0x00ed, B:42:0x0125, B:43:0x013d, B:45:0x0143, B:47:0x014d, B:49:0x0178, B:51:0x01a4, B:55:0x00e1), top: B:6:0x004a }] */
    @Override // com.tencent.mm.pluginsdk.ui.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(boolean r10, java.lang.String r11, int r12) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper.h(boolean, java.lang.String, int):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        hashCode();
        setKeepScreenOn(false);
        this.f165623s.a();
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f165613f;
        if (b1Var != null) {
            b1Var.i(str, str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void idkeyStat(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idkeyStat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, j19, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idkeyStat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean isPlaying() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return false;
        }
        boolean isPlaying = f1Var.isPlaying();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return isPlaying;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return false;
        }
        boolean j17 = f1Var.j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return j17;
    }

    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlayTimer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f165625u;
        b4Var.d();
        b4Var.c(1000L, 1000L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlayTimer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void kvStat(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        hashCode();
        setKeepScreenOn(true);
        this.f165623s.c(this);
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f165613f;
        if (b1Var != null) {
            b1Var.l(str, str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopPlayTimer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f165625u.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPlayTimer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f165613f;
        if (b1Var != null) {
            b1Var.m2(str, str2, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingVideoWrapper", "%d onPrepared", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f165613f;
        if (b1Var != null) {
            b1Var.o(str, str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        if (this.f165612e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return false;
        }
        setKeepScreenOn(false);
        this.f165623s.a();
        boolean pause = this.f165612e.pause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return pause;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean play() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        if (this.f165612e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
            return false;
        }
        setKeepScreenOn(true);
        this.f165623s.c(this);
        boolean play = this.f165612e.play();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        return play;
    }

    @Override // com.tencent.mm.pluginsdk.ui.a1
    public void r(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingVideoWrapper", "%d onDownloadFinish path [%s] isPlayNow [%b]", java.lang.Integer.valueOf(hashCode()), str, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setCover(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCover", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.setCover(bitmap);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCover", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setFullDirection(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.setFullDirection(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setFullScreen(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f165622r = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setIMMVideoViewCallback(com.tencent.mm.pluginsdk.ui.b1 b1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIMMVideoViewCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f165613f = b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIMMVideoViewCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setIsShowBasicControls(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsShowBasicControls", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.setIsShowBasicControls(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsShowBasicControls", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(be1.t0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        super.setKeepScreenOn(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(be1.t0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setLoop(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLoop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        try {
            com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
            if (f1Var != null) {
                f1Var.setLoop(z17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingVideoWrapper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLoop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setLoopCompletionCallback(com.tencent.mm.pluginsdk.ui.d1 d1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLoopCompletionCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        try {
            com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
            if (f1Var != null) {
                f1Var.setLoopCompletionCallback(d1Var);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingVideoWrapper", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLoopCompletionCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setMute(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f165616i = z17;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.setMute(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setNeedPause(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNeedPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var instanceof com.tencent.mm.modelvideo.AdLandingMMVideoView) {
            ((com.tencent.mm.modelvideo.AdLandingMMVideoView) f1Var).setNeedPause(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNeedPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScaleType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f165615h = e1Var;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.setScaleType(e1Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScaleType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setVideoFooterView(com.tencent.mm.pluginsdk.ui.z0 z0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoFooterView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f165614g = z0Var;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.setVideoFooterView(z0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoFooterView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public void setVideoPlayCallback(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoPlayCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        this.f165624t = cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoPlayCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void start() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.start();
            setKeepScreenOn(true);
            this.f165623s.c(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f165612e;
        if (f1Var != null) {
            f1Var.stop();
            this.f165623s.a();
            setKeepScreenOn(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper");
    }

    public AdLandingVideoWrapper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f165615h = com.tencent.mm.pluginsdk.ui.e1.CONTAIN;
        this.f165616i = false;
        this.f165617m = -1.0f;
        this.f165622r = false;
        this.f165625u = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b(this), true);
        this.f165611d = context;
        this.f165623s = new c01.k();
    }
}

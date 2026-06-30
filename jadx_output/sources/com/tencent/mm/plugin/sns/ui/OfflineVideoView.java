package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class OfflineVideoView extends android.widget.RelativeLayout implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public int f166409d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.g7 f166410e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f166411f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f166412g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f166413h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f166414i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f166415m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f166416n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f166417o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f166418p;

    /* renamed from: q, reason: collision with root package name */
    public int f166419q;

    /* renamed from: r, reason: collision with root package name */
    public int f166420r;

    /* renamed from: s, reason: collision with root package name */
    public int f166421s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f166422t;

    /* renamed from: u, reason: collision with root package name */
    public int f166423u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f166424v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f166425w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.e4 f166426x;

    public OfflineVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.f4 a(com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = offlineVideoView.f166413h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return f4Var;
    }

    public static /* synthetic */ android.widget.RelativeLayout b(com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        android.widget.RelativeLayout relativeLayout = offlineVideoView.f166411f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return relativeLayout;
    }

    public static /* synthetic */ android.widget.ProgressBar c(com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        android.widget.ProgressBar progressBar = offlineVideoView.f166414i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return progressBar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f166425w.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("freshThumbImage", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("freshThumbImage", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        } else {
            this.f166422t.post(new com.tencent.mm.plugin.sns.ui.z6(this, str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("freshThumbImage", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        }
    }

    public final void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f166422t.post(new com.tencent.mm.plugin.sns.ui.d7(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlayerPlaying", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f166413h;
        if (!(f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView)) {
            boolean h17 = h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlayerPlaying", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return h17;
        }
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var;
        boolean z17 = (videoPlayerTextureView.f191457t != null && !videoPlayerTextureView.E) && h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlayerPlaying", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return z17;
    }

    public int getCurrentPosition() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f166413h;
        if (f4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return 0;
        }
        int currentPosition = f4Var.getCurrentPosition() / 1000;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return currentPosition;
    }

    public int getCurrentPositionMs() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPositionMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f166413h;
        if (f4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPositionMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return 0;
        }
        int currentPosition = f4Var.getCurrentPosition();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPositionMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return currentPosition;
    }

    public int getDurationMs() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f166413h;
        if (f4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return 0;
        }
        int duration = f4Var.getDuration();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return duration;
    }

    public android.view.View getInnerVideoView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        java.lang.Object obj = this.f166413h;
        if (!(obj instanceof android.view.View)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return null;
        }
        android.view.View view = (android.view.View) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return view;
    }

    public int getTimerInterval() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimerInterval", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        int i17 = this.f166423u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimerInterval", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return i17;
    }

    public java.lang.String getVideoPath() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f166413h;
        if (f4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return "";
        }
        java.lang.String f174598m = f4Var.getF174598m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return f174598m;
    }

    public boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f166413h;
        boolean isPlaying = f4Var != null ? f4Var.isPlaying() : false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return isPlaying;
    }

    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        hashCode();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unInit", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d logic unInit", java.lang.Integer.valueOf(hashCode()));
        this.f166422t.removeCallbacksAndMessages(null);
        d();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f166413h;
        if (f4Var != null) {
            f4Var.stop();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unInit", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void j(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d prepare video  filePath %s", java.lang.Integer.valueOf(hashCode()), str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OfflineVideoView", "%d prepare video but filepath is null.", java.lang.Integer.valueOf(hashCode()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f166413h;
        if (f4Var != null) {
            f4Var.setOneTimeVideoTextureUpdateCallback(this.f166426x);
            this.f166413h.setVideoPath(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void k(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d seek second %d afterSeekPlay %b", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        f();
        this.f166413h.a(i17, z17);
        n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f166422t.post(new com.tencent.mm.plugin.sns.ui.c7(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d start curPos [%d], duration [%d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f166413h.getCurrentPosition()), java.lang.Integer.valueOf(this.f166413h.getDuration()));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f166413h.getF174598m())) {
            if (this.f166413h.getCurrentPosition() >= this.f166413h.getDuration()) {
                this.f166413h.a(0.0d, true);
                com.tencent.mm.plugin.sns.ui.g7 g7Var = this.f166410e;
                if (g7Var != null) {
                    g7Var.a(this.f166421s);
                }
            } else {
                this.f166413h.start();
            }
            n();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f166425w;
        long j17 = this.f166423u;
        b4Var.c(j17, j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void o(boolean z17, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f166422t.post(new com.tencent.mm.plugin.sns.ui.b7(this, z17, f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d on completion", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.plugin.sns.ui.g7 g7Var = this.f166410e;
        if (g7Var != null) {
            g7Var.onCompletion();
        } else if (fp.h.b(18) || !this.f166415m) {
            k(0, true);
        } else {
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f166413h;
            if (f4Var != null) {
                java.lang.String f174598m = f4Var.getF174598m();
                this.f166413h.stop();
                j(f174598m);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVideoView", "%d on play video error what %d extra %d isMMVideoPlayer %b errorCount %d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.f166415m), java.lang.Integer.valueOf(this.f166420r));
        this.f166420r++;
        java.lang.String f174598m = this.f166413h.getF174598m();
        this.f166413h.stop();
        this.f166416n = true;
        o(false, 0.0f);
        int i19 = 3;
        if (this.f166420r <= 3) {
            this.f166422t.postDelayed(new com.tencent.mm.plugin.sns.ui.a7(this, f174598m), 200L);
        } else {
            try {
                long j17 = -1;
                if (com.tencent.mm.sdk.platformtools.t8.K0(f174598m)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVideoView", "onError, filepath==null");
                } else if (com.tencent.mm.vfs.w6.j(f174598m)) {
                    j17 = com.tencent.mm.vfs.w6.k(f174598m);
                    com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "onError, fileLen=" + j17 + ", delRet=" + com.tencent.mm.vfs.w6.h(f174598m));
                    i19 = 1;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVideoView", "onError, file not exists");
                    i19 = 2;
                }
                if (!this.f166424v) {
                    ca4.e0.a("offline_video_error2", this.f166415m ? "1" : "0", i19, (int) j17, getClass().getSimpleName());
                    this.f166424v = true;
                }
                int i27 = this.f166409d;
                if (i27 == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.t.CTRL_INDEX, 9);
                } else if (i27 == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.t.CTRL_INDEX, 16);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVideoView", "onError, exp=" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        o(true, 0.0f);
        this.f166416n = false;
        f();
        this.f166421s = this.f166413h.getDuration() / 1000;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d on prepared. shouldPlayWhenPrepared [%b] shouldSeekTimeWhenPrepared[%d]", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f166418p), java.lang.Integer.valueOf(this.f166419q));
        if (this.f166418p) {
            int i17 = this.f166419q;
            if (i17 <= 0) {
                this.f166413h.start();
            } else {
                k(i17, true);
            }
            n();
            com.tencent.mm.plugin.sns.ui.g7 g7Var = this.f166410e;
            if (g7Var != null) {
                g7Var.a(this.f166421s);
            }
        } else {
            int i18 = this.f166419q;
            if (i18 <= 0) {
                i18 = 0;
            }
            k(i18, false);
        }
        this.f166419q = -1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toggleVideo", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        if (this.f166410e != null) {
            com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
            if (this.f166410e.d(pString, pString2)) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(pString2.value)) {
                    e(pString2.value);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(pString.value)) {
                    j(pString.value);
                }
            } else {
                l();
                o(false, 0.0f);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.OfflineVideoView", "%d toggle video but video callback is null", java.lang.Integer.valueOf(hashCode()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleVideo", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        return 0;
    }

    public void r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uiTouchPause", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d pause", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d on pause %s ", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        this.f166418p = false;
        if (this.f166413h.isPlaying()) {
            this.f166419q = this.f166413h.getCurrentPosition();
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d pause play", java.lang.Integer.valueOf(hashCode()));
            this.f166413h.pause();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        f();
        d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiTouchPause", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void s(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uiTouchSeek", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d ui touch seek second %d afterSeekPlay %b", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        k(i17, z17);
        n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiTouchSeek", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void setMute(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f166413h.setMute(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void setOnSeekCompleteCallback(com.tencent.mm.pluginsdk.ui.tools.c4 c4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnSeekCompleteCallback", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f166413h;
        if (f4Var != null) {
            f4Var.setOnSeekCompleteCallback(c4Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnSeekCompleteCallback", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void setSource(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f166409d = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void setTimerInterval(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTimerInterval", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        if (i17 < 200) {
            i17 = 200;
        }
        this.f166423u = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimerInterval", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void setVideoCallback(com.tencent.mm.plugin.sns.ui.g7 g7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoCallback", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        this.f166410e = g7Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoCallback", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public void t(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.plugin.sns.ui.g7 g7Var = this.f166410e;
        if (g7Var != null) {
            g7Var.c(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }

    public OfflineVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        boolean z17;
        this.f166409d = 0;
        this.f166416n = false;
        this.f166417o = false;
        this.f166418p = true;
        this.f166419q = -1;
        this.f166420r = 0;
        this.f166421s = 0;
        this.f166422t = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f166423u = 1000;
        this.f166424v = false;
        this.f166425w = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.sns.ui.e7(this), true);
        this.f166426x = new com.tencent.mm.plugin.sns.ui.f7(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d ui init view.", java.lang.Integer.valueOf(hashCode()));
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        from.inflate(com.tencent.mm.R.layout.cuy, this);
        this.f166412g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p0l);
        this.f166411f = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f487563p06);
        this.f166414i = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.ozc);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCanUseMMVideoPlayer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
        if (fp.h.a(18)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanUseMMVideoPlayer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            z17 = false;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCanUseMMVideoPlayer", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
            z17 = true;
        }
        if (z17) {
            this.f166415m = true;
            this.f166413h = new com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView(context, null);
        } else {
            this.f166415m = false;
            this.f166413h = new com.tencent.mm.pluginsdk.ui.tools.VideoTextureView(context, null);
        }
        this.f166413h.setVideoCallback(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f166411f.addView((android.view.View) this.f166413h, layoutParams);
        o(false, 0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.OfflineVideoView");
    }
}

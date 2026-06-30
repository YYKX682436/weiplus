package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes4.dex */
public class WebVideoWrapper extends android.widget.RelativeLayout implements com.tencent.mm.pluginsdk.ui.f1, com.tencent.mm.pluginsdk.ui.c1, com.tencent.mm.pluginsdk.ui.b1, c01.i {

    /* renamed from: d, reason: collision with root package name */
    public int f185734d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.f1 f185735e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.b1 f185736f;

    /* renamed from: g, reason: collision with root package name */
    public final c01.k f185737g;

    public WebVideoWrapper(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebVideoWrapper", "%d onVideoEnded", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f185736f;
        if (b1Var != null) {
            b1Var.E(str, str2);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebVideoWrapper", "%d onGetVideoSize[%d %d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f185736f;
        if (b1Var != null) {
            b1Var.I(str, str2, i17, i18);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mars.xlog.Log.w("MicroMsg.WebVideoWrapper", "%d onError[%s %d, %d]", java.lang.Integer.valueOf(hashCode()), str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f185736f;
        if (b1Var != null) {
            b1Var.N(str, str2, str3, i17, i18);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f185736f;
        if (b1Var != null) {
            b1Var.N5(str, str2, bool);
        }
    }

    @Override // c01.i
    public void P0() {
    }

    @Override // c01.i
    public void U5() {
    }

    @Override // c01.i
    public void V3() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean a(double d17, boolean z17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            return ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).a(d17, z17);
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean c(float f17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var;
        if (f17 > 0.0f && (f1Var = this.f185735e) != null) {
            return ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).c(f17);
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void d() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            ((com.tencent.mm.pluginsdk.ui.AbstractVideoView) f1Var).d();
        }
        this.f185737g.a();
        setKeepScreenOn(false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void e() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).e();
        }
        this.f185737g.a();
        setKeepScreenOn(false);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void g() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).g();
        }
    }

    @Override // c01.i
    public void g3() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCacheTimeSec() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            return f1Var.getCacheTimeSec();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosMs() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            return f1Var.getCurrPosMs();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getCurrPosSec() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            return f1Var.getCurrPosSec();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getPlayerType() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            return f1Var.getPlayerType();
        }
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public int getVideoDurationSec() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        return f1Var != null ? f1Var.getVideoDurationSec() : this.f185734d;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        this.f185734d = i17;
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).h(z17, str, i17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        hashCode();
        setKeepScreenOn(false);
        this.f185737g.a();
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f185736f;
        if (b1Var != null) {
            b1Var.i(str, str2);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void idkeyStat(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, j19, z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean isPlaying() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            return ((com.tencent.mm.pluginsdk.ui.AbstractVideoView) f1Var).isPlaying();
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean j() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            return ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).j();
        }
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void kvStat(int i17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        hashCode();
        setKeepScreenOn(true);
        this.f185737g.c(this);
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f185736f;
        if (b1Var != null) {
            b1Var.l(str, str2);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f185736f;
        if (b1Var != null) {
            b1Var.m2(str, str2, true);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebVideoWrapper", "%d onPrepared", java.lang.Integer.valueOf(hashCode()));
        com.tencent.mm.pluginsdk.ui.b1 b1Var = this.f185736f;
        if (b1Var != null) {
            b1Var.o(str, str2);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean pause() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var == null) {
            return false;
        }
        setKeepScreenOn(false);
        this.f185737g.a();
        return ((com.tencent.mm.pluginsdk.ui.AbstractVideoView) f1Var).pause();
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean play() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var == null) {
            return false;
        }
        setKeepScreenOn(true);
        this.f185737g.c(this);
        return ((com.tencent.mm.pluginsdk.ui.AbstractVideoView) f1Var).play();
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setCover(android.graphics.Bitmap bitmap) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            f1Var.setCover(bitmap);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setFullDirection(int i17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            f1Var.setFullDirection(i17);
        }
    }

    public void setIMMVideoViewCallback(com.tencent.mm.pluginsdk.ui.b1 b1Var) {
        this.f185736f = b1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setIsShowBasicControls(boolean z17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            f1Var.setIsShowBasicControls(z17);
        }
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z17) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        super.setKeepScreenOn(z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setLoop(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setLoopCompletionCallback(com.tencent.mm.pluginsdk.ui.d1 d1Var) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setMute(boolean z17) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            f1Var.setMute(z17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            f1Var.setScaleType(e1Var);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void setVideoFooterView(com.tencent.mm.pluginsdk.ui.z0 z0Var) {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            f1Var.setVideoFooterView(z0Var);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void start() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            ((com.tencent.mm.pluginsdk.ui.CommonVideoView) f1Var).start();
            setKeepScreenOn(true);
            this.f185737g.c(this);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public void stop() {
        com.tencent.mm.pluginsdk.ui.f1 f1Var = this.f185735e;
        if (f1Var != null) {
            ((com.tencent.mm.pluginsdk.ui.AbstractVideoView) f1Var).stop();
            this.f185737g.a();
            setKeepScreenOn(false);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }

    public WebVideoWrapper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f185737g = new c01.k();
        if (this.f185735e == null) {
            com.tencent.mm.pluginsdk.ui.CommonVideoView commonVideoView = new com.tencent.mm.pluginsdk.ui.CommonVideoView(context);
            commonVideoView.setReporter(this);
            commonVideoView.setIMMVideoViewCallback(this);
            idkeyStat(600L, 200L, 1L, false);
            this.f185735e = commonVideoView;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        addView((android.view.View) this.f185735e, layoutParams);
    }
}

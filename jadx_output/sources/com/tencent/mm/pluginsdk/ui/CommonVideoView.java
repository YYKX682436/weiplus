package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class CommonVideoView extends com.tencent.mm.pluginsdk.ui.AbstractVideoView {
    public boolean S;
    public java.lang.String T;
    public int U;
    public int V;
    public boolean W;

    public CommonVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = 0;
        this.W = false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public com.tencent.mm.pluginsdk.ui.tools.f4 C(android.content.Context context) {
        this.f189757z = 0;
        return new com.tencent.mm.pluginsdk.ui.tools.VideoTextureView(context, null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void D() {
        super.D();
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void I() {
        super.I();
        this.f189739e = "MicroMsg.CommonVideoView";
        this.f189738d = "VideoView.CommonVideoView";
    }

    public void Y() {
        try {
            int videoDurationSec = getVideoDurationSec();
            com.tencent.mars.xlog.Log.i(this.f189738d, "onLoopCompletion, updateUI and videoDurationSec is " + videoDurationSec);
            W(videoDurationSec);
            com.tencent.mm.pluginsdk.ui.d1 d1Var = this.f189752u;
            if (d1Var != null) {
                d1Var.c();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f189739e, th6.toString());
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public boolean a(double d17, boolean z17) {
        if (!j()) {
            return super.a(d17, z17);
        }
        com.tencent.mars.xlog.Log.w(this.f189739e, "%s it is live, don't seek ", N());
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.f1
    public boolean c(float f17) {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s set play rate [%f]", N(), java.lang.Float.valueOf(f17));
        if (!(this.f189748q instanceof com.tencent.mm.pluginsdk.ui.tools.VideoTextureView)) {
            return false;
        }
        H(600L, getReportIdkey() + 13, 1L, false);
        return ((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) this.f189748q).I(f17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void e() {
        super.e();
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void g() {
        super.g();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var == null || !(f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoTextureView)) {
            return;
        }
        if (this.f189750s) {
            play();
        } else {
            ((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) f4Var).F();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public int getCacheTimeSec() {
        try {
            if (!(this.f189748q instanceof com.tencent.mm.pluginsdk.ui.tools.VideoTextureView)) {
                return 0;
            }
            return (int) (super.getVideoDurationSec() * ((((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) r0).getDownloadPercent() * 1.0f) / 100.0f));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f189739e, e17, "%s get cache time sec error", N());
            return 0;
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public int getReportIdkey() {
        return 0;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public int getVideoDurationSec() {
        int i17 = this.U;
        return i17 <= 0 ? super.getVideoDurationSec() : i17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public int getVideoSource() {
        return this.V;
    }

    public void h(boolean z17, java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i(this.f189739e, "%s set video path isLive [%b] url [%s] durationSec [%d]", N(), java.lang.Boolean.valueOf(z17), str, java.lang.Integer.valueOf(i17));
        this.S = z17;
        this.T = str;
        this.U = i17;
        this.R.f190802i = str;
    }

    public boolean j() {
        boolean L = L();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        boolean z17 = false;
        int duration = f4Var != null ? f4Var.getDuration() : 0;
        if (this.S || (L && duration <= 0)) {
            z17 = true;
        }
        N();
        L();
        return z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.b4
    public void k(int i17, int i18) {
        N();
        com.tencent.mm.pluginsdk.ui.e3 e3Var = this.R;
        if (i17 == 701) {
            T();
            e3Var.f190801h++;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            e3Var.f190798e = java.lang.System.currentTimeMillis();
            H(600L, getReportIdkey() + 40, 1L, false);
            return;
        }
        if (i17 == 702) {
            super.D();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            e3Var.f190799f = currentTimeMillis;
            long j17 = e3Var.f190798e;
            if (j17 > 0) {
                e3Var.f190800g += currentTimeMillis - j17;
            }
            R();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        if (j()) {
            com.tencent.mars.xlog.Log.i(this.f189739e, "%s it is live video, do not completion", N());
            stop();
            start();
        } else {
            super.onCompletion();
            if (this.W) {
                a(0.0d, true);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void setLoop(boolean z17) {
        this.W = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) {
            ((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) f4Var).setScaleType(e1Var);
            H(600L, getReportIdkey() + 14, 1L, false);
        }
    }

    public void start() {
        if (this.f189748q != null) {
            java.lang.String str = this.f189739e;
            java.lang.String N = N();
            java.lang.String videoPath = this.f189748q.getVideoPath();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i(str, "%s start path [%s] [%s]", N, videoPath, new com.tencent.mm.sdk.platformtools.z3());
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f189748q.getVideoPath())) {
                this.f189748q.setVideoPath(this.T);
                T();
                Q();
            } else {
                play();
            }
            H(600L, getReportIdkey() + 1, 1L, false);
        }
    }

    public CommonVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.V = 0;
        this.W = false;
    }

    public CommonVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.V = 0;
        this.W = false;
    }

    public CommonVideoView(android.content.Context context) {
        super(context, null);
        this.V = 0;
        this.W = false;
    }
}

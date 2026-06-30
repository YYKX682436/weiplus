package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class EnvelopeStoryVideoView extends com.tencent.mm.modelvideo.MMVideoView {
    public static final java.lang.String U1 = lp0.b.D() + "hbstoryvideo/";
    public java.lang.String O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public com.tencent.mm.plugin.luckymoney.story.c1 S1;
    public boolean T1;

    public EnvelopeStoryVideoView(android.content.Context context) {
        super(context);
        this.R1 = false;
        k0();
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoView", "%s onUIPause", N());
        if (this.f189741g) {
            this.f189749r = getCurrPosSec();
            this.f189750s = true;
            this.G = 0;
            this.F = 0;
            pause();
            V();
            this.f189741g = false;
            H(600L, getReportIdkey() + 11, 1L, false);
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void g() {
        if (this.f189741g) {
            return;
        }
        this.f189741g = true;
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            if (this.f189750s) {
                play();
            } else {
                ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var).E();
            }
        }
        H(600L, getReportIdkey() + 10, 1L, false);
    }

    public int getRealPlayDurationSec() {
        return this.R1 ? getVideoDurationSec() : getCurrPosSec();
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public java.lang.String getSessionId() {
        return this.O1;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        super.h(z17, str, i17);
        if (this.T1) {
            this.f71645l1 = str;
        }
    }

    public final void k0() {
        android.widget.LinearLayout linearLayout = this.f189745n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        java.lang.String str = U1;
        setRootPath(str);
        com.tencent.mm.vfs.w6.t(str);
        setLoop(true);
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mm.plugin.luckymoney.story.c1 c1Var;
        this.R1 = true;
        if (this.L1 && (c1Var = this.S1) != null) {
            com.tencent.mm.plugin.luckymoney.story.b1 b1Var = ((com.tencent.mm.plugin.luckymoney.story.o0) c1Var).f145899a;
            int addAndGet = b1Var.f145832l.addAndGet(1);
            getVideoDurationSec();
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "sessionId: %s, current loop count: %s", b1Var.f145822b, java.lang.Integer.valueOf(addAndGet));
        }
        com.tencent.mm.pluginsdk.ui.b1 b1Var2 = this.f189751t;
        if (b1Var2 != null) {
            b1Var2.E(getSessionId(), getMediaId());
        }
        super.onCompletion();
    }

    public void setLocal(boolean z17) {
        this.Q1 = z17;
    }

    public void setLocalPreDownloadVideo(boolean z17) {
        this.T1 = z17;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void setMute(boolean z17) {
        super.setMute(z17);
        this.P1 = z17;
    }

    public void setSessionId(java.lang.String str) {
        this.O1 = str;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void start() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoView", "%s start cdnMediaId[%s] timeDuration[%d] isLocal[%s]", N(), this.f71650y0, java.lang.Integer.valueOf(this.A1), java.lang.Boolean.valueOf(this.Q1));
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
        if (f4Var != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f4Var.getVideoPath())) {
                play();
            } else {
                if (this.Q1 || this.T1) {
                    g0();
                    this.f71649x1 = 3;
                    return;
                }
                T();
                this.K1 = true;
                this.A1 = 0;
                this.f71649x1 = 1;
                t21.i0 i0Var = this.f71648x0;
                if (i0Var != null) {
                    i0Var.b(this.f71650y0, this.f71645l1, this.T);
                    this.f71648x0.d(this);
                }
                Q();
            }
            H(600L, getReportIdkey() + 1, 1L, false);
        }
    }

    public EnvelopeStoryVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R1 = false;
        k0();
    }

    public EnvelopeStoryVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.R1 = false;
        k0();
    }
}

package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class q0 implements com.tencent.mm.pluginsdk.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.b1 f145902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager f145903e;

    public q0(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager, com.tencent.mm.plugin.luckymoney.story.b1 b1Var, int i17) {
        this.f145903e = envelopeStoryVideoManager;
        this.f145902d = b1Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f145903e;
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "on video end: %s, %s, callback:%s", str, str2, envelopeStoryVideoManager.f145809n);
        com.tencent.mm.plugin.luckymoney.story.a1 a1Var = envelopeStoryVideoManager.f145809n;
        if (a1Var != null) {
            ((com.tencent.mm.plugin.luckymoney.story.e1) a1Var).f145849a.f145816o2.sendEmptyMessage(1);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopeStoryVideoManager", "onError: %s, %s, %s", str, str2, str3);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = this.f145902d;
        g0Var.d(19228, b1Var.f145823c, java.lang.Integer.valueOf(b1Var.f145833m.getVideoDurationSec()), 2, java.lang.Integer.valueOf(b1Var.f145829i), java.lang.Integer.valueOf(b1Var.f145833m.getRealPlayDurationSec()), java.lang.Integer.valueOf(b1Var.f145828h), 0, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "onVideoWaiting: %s, %s, %s", str, str2, bool);
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f145903e;
        if (envelopeStoryVideoManager.f145802d.isFinishing() || envelopeStoryVideoManager.f145802d.isDestroyed()) {
            envelopeStoryVideoManager.f();
            return;
        }
        int elapsedRealtime = ((int) android.os.SystemClock.elapsedRealtime()) / 1000;
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = this.f145902d;
        b1Var.f145827g = elapsedRealtime;
        android.widget.ProgressBar progressBar = b1Var.f145839s;
        if (progressBar != null) {
            progressBar.bringToFront();
            b1Var.f145839s.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "onVideoPause: %s, %s", str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "onVideoPlay: %s, %s", str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "onVideoWaitingEnd: %s, %s", str, str2);
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = this.f145902d;
        if (b1Var.f145827g > 0) {
            b1Var.f145828h = (int) (b1Var.f145828h + ((android.os.SystemClock.elapsedRealtime() / 1000) - b1Var.f145827g));
            b1Var.f145827g = 0;
        }
        android.widget.ProgressBar progressBar = b1Var.f145839s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "on prepared: %s, %s", str, str2);
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = this.f145902d;
        b1Var.f145833m.getVideoDurationSec();
        b1Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.luckymoney.story.p0(this), 10L);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "onVideoFirstFrameDraw: %s, %s", str, str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}

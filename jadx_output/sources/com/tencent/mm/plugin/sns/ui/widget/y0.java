package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class y0 implements gd4.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView f171317d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f171318e;

    public y0(com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView videoView) {
        kotlin.jvm.internal.o.g(videoView, "videoView");
        this.f171317d = videoView;
        this.f171318e = jz5.h.b(com.tencent.mm.plugin.sns.ui.widget.u0.f171276d);
    }

    @Override // gd4.x0
    public java.lang.Object a(java.lang.String str, android.widget.FrameLayout.LayoutParams layoutParams, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView = this.f171317d;
        snsAdTimelineVideoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        boolean z17 = snsAdTimelineVideoView.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPrepared", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        if (z17) {
            jz5.f0 f0Var = jz5.f0.f302826a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
            return f0Var;
        }
        java.lang.Object c17 = kotlinx.coroutines.a4.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, new com.tencent.mm.plugin.sns.ui.widget.x0(this, str, null), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        return c17;
    }

    @Override // gd4.x0
    public void b(android.widget.FrameLayout.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLayoutParams", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLayoutParams", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }

    @Override // gd4.x0
    public java.lang.Object c(long j17, boolean z17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView = this.f171317d;
        snsAdTimelineVideoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        snsAdTimelineVideoView.k((int) j17, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        return f0Var;
    }

    @Override // gd4.x0
    public kotlinx.coroutines.flow.n2 getCompletionFlow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCompletionFlow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        kotlinx.coroutines.flow.n2 n2Var = (kotlinx.coroutines.flow.n2) ((jz5.n) this.f171318e).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCompletionFlow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        return n2Var;
    }

    @Override // gd4.x0
    public long getCurrentPosInMills() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPosInMills", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        long currentPositionMs = this.f171317d.getCurrentPositionMs();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPosInMills", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        return currentPositionMs;
    }

    @Override // gd4.x0
    public long getDurationMs() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        long durationMs = this.f171317d.getDurationMs();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDurationMs", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        return durationMs;
    }

    @Override // gd4.x0
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView = this.f171317d;
        snsAdTimelineVideoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "pause");
        snsAdTimelineVideoView.r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }

    @Override // gd4.x0
    public void resume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        this.f171317d.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }

    @Override // gd4.x0
    public void setFrameLayoutAlpha(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFrameLayoutAlpha", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        com.tencent.mars.xlog.Log.i("SnsAdTimelineVideoViewKtProxy", "setFrameLayoutAlpha " + f17);
        this.f171317d.setAlpha(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFrameLayoutAlpha", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }

    @Override // gd4.x0
    public void start() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        this.f171317d.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }

    @Override // gd4.x0
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
        this.f171317d.u();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
    }
}

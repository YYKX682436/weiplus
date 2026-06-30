package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class g0 implements n84.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f171133a;

    public g0(com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView) {
        this.f171133a = snsAdBreakFrameVideoView;
    }

    public void a(android.view.View playerView, java.lang.String reason) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
        kotlin.jvm.internal.o.g(playerView, "playerView");
        kotlin.jvm.internal.o.g(reason, "reason");
        playerView.toString();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1913, 1);
        ca4.e0.b("break_video_error_info", "0", 0, 0, reason);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
    }

    public void b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStatusChanged", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
        if (i17 == 5) {
            int i18 = com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView.f170771s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$get_completionFlow$p", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            kotlinx.coroutines.flow.i2 i2Var = this.f171133a.f170783r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$get_completionFlow$p", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            i2Var.e(java.lang.Boolean.TRUE);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStatusChanged", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
    }
}

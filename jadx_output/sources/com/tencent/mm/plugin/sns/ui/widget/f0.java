package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class f0 implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f171125d;

    public f0(com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView) {
        this.f171125d = snsAdBreakFrameVideoView;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public final void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
        if (i17 == 106) {
            if (iTPPlayer == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
                return;
            }
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = this.f171125d;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView.e(snsAdBreakFrameVideoView);
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
            }
            kotlin.Result.m527isFailureimpl(m521constructorimpl);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
    }
}

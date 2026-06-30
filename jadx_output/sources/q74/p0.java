package q74;

/* loaded from: classes4.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f360486d;

    public p0(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f360486d = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$pagPlaying$1$1");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f360486d;
        try {
            com.tencent.mars.xlog.Log.i("SlideFullCardBreakFrameUICtrl", "post pagPlaying");
            mMPAGView.g();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameUICtrl_pagViewPlay", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$pagPlaying$1$1");
    }
}

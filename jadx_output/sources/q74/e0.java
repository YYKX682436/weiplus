package q74;

/* loaded from: classes4.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f360454d;

    public e0(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f360454d = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$bindCurrentProductViewDataAndDoAnimation$1$1");
        try {
            this.f360454d.n();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameUICtrlbindCurrentProductViewDataAndDoAnimation_pagViewStop", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$bindCurrentProductViewDataAndDoAnimation$1$1");
    }
}

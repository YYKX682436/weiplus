package q74;

/* loaded from: classes4.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f360490d;

    public r0(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f360490d = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$reset$1");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f360490d;
        try {
            mMPAGView.n();
            ((ku5.t0) ku5.t0.f312615d).g(new q74.q0(mMPAGView));
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SlideFullCardBreakFrameUICtrlreset_pagViewStop", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$reset$1");
    }
}

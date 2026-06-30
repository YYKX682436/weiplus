package u84;

/* loaded from: classes4.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f425684d;

    public w1(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f425684d = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$doReset$1");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f425684d;
        try {
            mMPAGView.n();
            ((ku5.t0) ku5.t0.f312615d).g(new u84.v1(mMPAGView));
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdInteractionTagViewreset_pagViewStop", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView$doReset$1");
    }
}

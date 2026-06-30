package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f163329d;

    public b0(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f163329d = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper$resetPAGView$1$1$1");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f163329d;
        try {
            mMPAGView.n();
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.ad.widget.adpag.a0(mMPAGView));
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdPAGHelper", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper$resetPAGView$1$1$1");
    }
}

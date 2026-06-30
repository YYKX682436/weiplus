package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.y f163364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f163365e;

    public x(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f163364d = yVar;
        this.f163365e = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$resetAndRemovePAGView$1$1$1");
        java.lang.String j17 = this.f163364d.j();
        com.tencent.mm.view.MMPAGView mMPAGView = this.f163365e;
        com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar = this.f163364d;
        try {
            mMPAGView.n();
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.ad.widget.adpag.w(yVar, mMPAGView));
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$resetAndRemovePAGView$1$1$1");
    }
}

package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f163378d;

    public z(com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f163378d = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper$doPAGStartPlay$1$1$1");
        try {
            this.f163378d.g();
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdPAGHelper", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper$doPAGStartPlay$1$1$1");
    }
}

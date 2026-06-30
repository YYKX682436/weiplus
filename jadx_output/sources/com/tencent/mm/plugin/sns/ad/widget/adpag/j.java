package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.y f163343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f163344e;

    public j(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f163343d = yVar;
        this.f163344e = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$doPAGStartPlay$1$1$1");
        java.lang.String j17 = this.f163343d.j();
        try {
            this.f163344e.g();
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$doPAGStartPlay$1$1$1");
    }
}

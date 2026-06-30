package k84;

/* loaded from: classes4.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f305300e;

    public v5(k84.c6 c6Var, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f305299d = c6Var;
        this.f305300e = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$1$1$1");
        java.lang.String str = this.f305299d.j() + "reset_pagViewRelease";
        try {
            this.f305300e.h();
        } catch (java.lang.Throwable th6) {
            ca4.q.c(str, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$1$1$1");
    }
}

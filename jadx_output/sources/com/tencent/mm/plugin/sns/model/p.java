package com.tencent.mm.plugin.sns.model;

/* loaded from: classes10.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.BulletCommentEventListener f164568d;

    public p(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.BulletCommentEventListener bulletCommentEventListener) {
        this.f164568d = bulletCommentEventListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener$1");
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.BulletCommentEventListener bulletCommentEventListener = this.f164568d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        boolean z17 = bulletCommentEventListener.f164048h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener$1");
            return;
        }
        com.tencent.mars.xlog.Log.w("AdLandingPagesProxy.BulletCommentEvent", "BulletEventListener auto dead, info=" + this.f164568d);
        try {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.BulletCommentEventListener bulletCommentEventListener2 = this.f164568d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            bulletCommentEventListener2.f164048h = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            this.f164568d.dead();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy.BulletCommentEvent", "BulletEventListener auto dead exp=" + e17);
        }
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.BulletCommentEventListener bulletCommentEventListener3 = this.f164568d;
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        long j17 = bulletCommentEventListener3.f164044d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.BulletCommentEventListener bulletCommentEventListener4 = this.f164568d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        long j18 = bulletCommentEventListener4.f164045e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.BulletCommentEventListener bulletCommentEventListener5 = this.f164568d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        java.lang.String str = bulletCommentEventListener5.f164047g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        adLandingPagesProxy.CLIENT_CALL("onBulletCommentEvent", valueOf, valueOf2, str, java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.BulletCommentEventListener bulletCommentEventListener6 = this.f164568d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        bulletCommentEventListener6.f164045e = -1L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener$1");
    }
}

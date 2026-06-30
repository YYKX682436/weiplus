package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public class e implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer f163337d;

    public e(com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer) {
        this.f163337d = adPAGFrameContainer;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer.f163313p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer = this.f163337d;
        adPAGFrameContainer.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mm.view.MMPAGView mMPAGView2 = adPAGFrameContainer.f163314d;
        if (mMPAGView2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        } else {
            try {
                if (!adPAGFrameContainer.f163318h) {
                    adPAGFrameContainer.f163318h = true;
                    mMPAGView2.b(adPAGFrameContainer.f163320m);
                    com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "startListenFlushListener");
                }
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$2");
    }
}

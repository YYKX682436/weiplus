package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer f163339d;

    public g(com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer) {
        this.f163339d = adPAGFrameContainer;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$4");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer.f163313p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f163339d.f163314d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        mMPAGView.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$4");
    }
}

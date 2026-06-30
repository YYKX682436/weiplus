package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public class d implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer f163334a;

    public d(com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer) {
        this.f163334a = adPAGFrameContainer;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$1");
        com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer = this.f163334a;
        if (com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer.a(adPAGFrameContainer) != null && com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer.a(adPAGFrameContainer).getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "mThumbIv need to be gone");
            com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer.a(adPAGFrameContainer).clearAnimation();
            com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer.a(adPAGFrameContainer).setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$1");
    }
}

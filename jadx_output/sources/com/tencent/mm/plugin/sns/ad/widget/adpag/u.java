package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.y f163360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar) {
        super(0);
        this.f163360d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mSnsAdGeneralPAGContainerStub$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mSnsAdGeneralPAGContainerStub$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.ui.AdFrameLayout D = this.f163360d.D();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdBreakContainer", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        android.view.ViewStub viewStub = D != null ? (android.view.ViewStub) D.findViewById(com.tencent.mm.R.id.v79) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mSnsAdGeneralPAGContainerStub$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mSnsAdGeneralPAGContainerStub$2");
        return viewStub;
    }
}

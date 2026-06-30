package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.y f163359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar) {
        super(0);
        this.f163359d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mSnsAdBreakContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mSnsAdBreakContainer$2");
        com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar = this.f163359d;
        yVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent");
        android.view.View view = yVar.f163366o;
        com.tencent.mm.plugin.sns.ui.AdFrameLayout adFrameLayout = view != null ? (com.tencent.mm.plugin.sns.ui.AdFrameLayout) view.findViewById(com.tencent.mm.R.id.f486970v72) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mSnsAdBreakContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$mSnsAdBreakContainer$2");
        return adFrameLayout;
    }
}

package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168851d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC) {
        super(0);
        this.f168851d = improveHeaderUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$coverLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$coverLayout$2");
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC = this.f168851d;
        android.view.View findViewById = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getHeadLayout(improveHeaderUIC).findViewById(com.tencent.mm.R.id.hbb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout snsImproveCoverLayout = (com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout) findViewById;
        if (pc4.d.f353410a.y()) {
            float screenWidth = improveHeaderUIC.getScreenWidth();
            float f17 = com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getMode$p(improveHeaderUIC) == 1 ? 0.9f : 0.45f;
            snsImproveCoverLayout.setMode(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getMode$p(improveHeaderUIC));
            snsImproveCoverLayout.setFoldHeight((int) (screenWidth * f17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$coverLayout$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$coverLayout$2");
        return snsImproveCoverLayout;
    }
}

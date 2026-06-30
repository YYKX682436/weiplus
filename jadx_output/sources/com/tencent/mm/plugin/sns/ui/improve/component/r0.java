package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168984d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC) {
        super(0);
        this.f168984d = improveMainUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$adapter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$adapter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDataUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        final com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = this.f168984d;
        com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC X6 = improveMainUIC.X6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDataUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.mvvmlist.MvvmList S6 = X6.S6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemConvert", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1");
                com.tencent.mm.plugin.sns.ui.improve.component.y0 y0Var = new com.tencent.mm.plugin.sns.ui.improve.component.y0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.this, type);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemConvert", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1");
                return y0Var;
            }
        };
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.h2 h2Var = new com.tencent.mm.plugin.sns.ui.improve.component.h2(S6, sVar, improveMainUIC);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$adapter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$adapter$2");
        return h2Var;
    }
}

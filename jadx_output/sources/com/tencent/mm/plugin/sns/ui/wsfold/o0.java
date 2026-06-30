package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.f1 f171411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var) {
        super(0);
        this.f171411d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$adapter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$adapter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDataUIC", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        final com.tencent.mm.plugin.sns.ui.wsfold.f1 f1Var = this.f171411d;
        com.tencent.mm.plugin.sns.ui.wsfold.w U6 = f1Var.U6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDataUIC", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.mvvmlist.MvvmList T6 = U6.T6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemConvert", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1");
                com.tencent.mm.plugin.sns.ui.wsfold.u0 u0Var = new com.tencent.mm.plugin.sns.ui.wsfold.u0(com.tencent.mm.plugin.sns.ui.wsfold.f1.this, type);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemConvert", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$buildItemConvertFactory$1");
                return u0Var;
            }
        };
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$buildItemConvertFactory", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC");
        com.tencent.mm.plugin.sns.ui.wsfold.b bVar = new com.tencent.mm.plugin.sns.ui.wsfold.b(T6, sVar, f1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$adapter$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldMainUIC$adapter$2");
        return bVar;
    }
}

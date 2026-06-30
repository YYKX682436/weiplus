package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC f168787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC) {
        super(0);
        this.f168787d = improveInputUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$minHeight$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$minHeight$2");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC = this.f168787d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf((com.tencent.mm.ui.bl.h(improveInputUIC.getContext()) + i65.a.h(improveInputUIC.getContext(), com.tencent.mm.R.dimen.f479623ay)) - (pc4.d.f353410a.y() ? i65.a.h(improveInputUIC.getContext(), com.tencent.mm.R.dimen.aqc) : i65.a.h(improveInputUIC.getContext(), com.tencent.mm.R.dimen.aax)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$minHeight$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$minHeight$2");
        return valueOf;
    }
}

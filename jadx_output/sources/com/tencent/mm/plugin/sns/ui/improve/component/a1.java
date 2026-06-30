package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f168742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f168742d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$dataUIC$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$dataUIC$2");
        androidx.appcompat.app.AppCompatActivity activity = this.f168742d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = (com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$dataUIC$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$dataUIC$2");
        return improveDataUIC;
    }
}

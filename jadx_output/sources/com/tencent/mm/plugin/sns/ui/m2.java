package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f06.g f169885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(f06.g gVar) {
        super(1);
        this.f169885d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$safeGet$2");
        java.lang.String it = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$safeGet$2");
        kotlin.jvm.internal.o.g(it, "it");
        ((yz5.l) this.f169885d).invoke(it);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$safeGet$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.Festival2021Widget$safeGet$2");
        return f0Var;
    }
}

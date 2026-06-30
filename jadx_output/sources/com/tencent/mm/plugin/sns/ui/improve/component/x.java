package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC f169051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC improveEventUIC) {
        super(0);
        this.f169051d = improveEventUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$onMenuItemSelectedListener$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$onMenuItemSelectedListener$2");
        com.tencent.mm.plugin.sns.ui.listener.c cVar = new com.tencent.mm.plugin.sns.ui.listener.c(this.f169051d.getContext(), 0, new com.tencent.mm.plugin.sns.model.l7(1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$onMenuItemSelectedListener$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$onMenuItemSelectedListener$2");
        return cVar;
    }
}

package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class e1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f168780d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f168781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168782f;

    /* renamed from: g, reason: collision with root package name */
    public int f168783g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f168782f = improveMainUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleLoadMore$1");
        this.f168781e = obj;
        this.f168783g |= Integer.MIN_VALUE;
        java.lang.Object Q6 = com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.Q6(this.f168782f, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleLoadMore$1");
        return Q6;
    }
}

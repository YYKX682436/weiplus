package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class f1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f168788d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f168789e;

    /* renamed from: f, reason: collision with root package name */
    public int f168790f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f168791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168792h;

    /* renamed from: i, reason: collision with root package name */
    public int f168793i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f168792h = improveMainUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$1");
        this.f168791g = obj;
        this.f168793i |= Integer.MIN_VALUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$handleScrollEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        java.lang.Object Z6 = this.f168792h.Z6(null, null, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$handleScrollEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$1");
        return Z6;
    }
}

package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class d1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f168756d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f168757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168758f;

    /* renamed from: g, reason: collision with root package name */
    public int f168759g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f168758f = improveMainUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleLoadFront$1");
        this.f168757e = obj;
        this.f168759g |= Integer.MIN_VALUE;
        java.lang.Object P6 = com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.P6(this.f168758f, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleLoadFront$1");
        return P6;
    }
}

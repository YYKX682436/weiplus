package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f169063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f169064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f169064e = improveMainUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$checkLoadFront$1");
        com.tencent.mm.plugin.sns.ui.improve.component.z0 z0Var = new com.tencent.mm.plugin.sns.ui.improve.component.z0(this.f169064e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$checkLoadFront$1");
        return z0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$checkLoadFront$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$checkLoadFront$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.improve.component.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$checkLoadFront$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$checkLoadFront$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$checkLoadFront$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f169063d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f169063d = 1;
            if (com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.P6(this.f169064e, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$checkLoadFront$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$checkLoadFront$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$checkLoadFront$1");
        return f0Var;
    }
}

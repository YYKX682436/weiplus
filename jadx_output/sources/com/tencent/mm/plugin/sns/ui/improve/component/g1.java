package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f168807d = improveMainUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
        com.tencent.mm.plugin.sns.ui.improve.component.g1 g1Var = new com.tencent.mm.plugin.sns.ui.improve.component.g1(this.f168807d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
        return g1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.improve.component.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        pm0.v.X(new ad4.n(false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        com.tencent.mm.plugin.sns.ui.m7 m7Var = pc4.a.f353407a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveGlobalInstance");
        if (m7Var != null) {
            m7Var.c();
        }
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = this.f168807d;
        androidx.appcompat.app.AppCompatActivity activity = improveMainUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.class)).X6();
        androidx.appcompat.app.AppCompatActivity activity2 = improveMainUIC.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((com.tencent.mm.plugin.sns.ui.improve.component.f2) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.sns.ui.improve.component.f2.class)).a1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleScrollEvent$2");
        return valueOf;
    }
}

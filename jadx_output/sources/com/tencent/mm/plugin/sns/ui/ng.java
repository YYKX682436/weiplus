package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class ng extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f169991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f169992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f169992e = snsCommentImageFlowUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1");
        com.tencent.mm.plugin.sns.ui.ng ngVar = new com.tencent.mm.plugin.sns.ui.ng(this.f169992e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1");
        return ngVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1");
        ((com.tencent.mm.plugin.sns.ui.ng) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1");
        pz5.a aVar2 = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1");
        return aVar2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f169991d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f169992e;
            com.tencent.mm.plugin.sns.ui.nh v76 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.v7(snsCommentImageFlowUI);
            if (v76 == null) {
                kotlin.jvm.internal.o.o("viewModel");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnFinishLoadMoreEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
            kotlinx.coroutines.flow.n2 n2Var = v76.f170006t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnFinishLoadMoreEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
            com.tencent.mm.plugin.sns.ui.mg mgVar = new com.tencent.mm.plugin.sns.ui.mg(snsCommentImageFlowUI);
            this.f169991d = 1;
            if (((kotlinx.coroutines.flow.k2) n2Var).a(mgVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.d dVar = new jz5.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$1");
        throw dVar;
    }
}

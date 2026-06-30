package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class pg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f170216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f170217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f170217e = snsCommentImageFlowUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2");
        com.tencent.mm.plugin.sns.ui.pg pgVar = new com.tencent.mm.plugin.sns.ui.pg(this.f170217e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2");
        return pgVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2");
        ((com.tencent.mm.plugin.sns.ui.pg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2");
        pz5.a aVar2 = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2");
        return aVar2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f170216d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f170217e;
            com.tencent.mm.plugin.sns.ui.nh v76 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.v7(snsCommentImageFlowUI);
            if (v76 == null) {
                kotlin.jvm.internal.o.o("viewModel");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemAddEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
            kotlinx.coroutines.flow.n2 n2Var = v76.f170003q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemAddEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUIModel");
            com.tencent.mm.plugin.sns.ui.og ogVar = new com.tencent.mm.plugin.sns.ui.og(snsCommentImageFlowUI);
            this.f170216d = 1;
            if (((kotlinx.coroutines.flow.k2) n2Var).a(ogVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.d dVar = new jz5.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2");
        throw dVar;
    }
}

package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class sg implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f170458d;

    public sg(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        this.f170458d = snsCommentImageFlowUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$3$1");
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$3$1");
        int intValue = ((java.lang.Number) lVar.f302834e).intValue();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWxAdapter$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f170458d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = snsCommentImageFlowUI.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWxAdapter$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemRemoved(intValue);
        }
        com.tencent.mm.plugin.sns.ui.nh v76 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.v7(snsCommentImageFlowUI);
        if (v76 == null) {
            kotlin.jvm.internal.o.o("viewModel");
            throw null;
        }
        if (v76.N6().size() <= 0) {
            com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.s7(snsCommentImageFlowUI).post(new com.tencent.mm.plugin.sns.ui.qg(snsCommentImageFlowUI));
        } else {
            com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView t76 = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.t7(snsCommentImageFlowUI);
            if (t76 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.rg rgVar = new com.tencent.mm.plugin.sns.ui.rg(intValue, snsCommentImageFlowUI);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDeleteAnimationDuration", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDeleteAnimationDuration", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView passThroughRecyclerView = snsCommentImageFlowUI.S;
            if (passThroughRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.n2 itemAnimator = passThroughRecyclerView.getItemAnimator();
            long n17 = itemAnimator != null ? itemAnimator.n() : 300L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDeleteAnimationDuration", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDeleteAnimationDuration", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
            t76.postDelayed(rgVar, n17 + 10);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$3$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$3$1");
        return f0Var;
    }
}

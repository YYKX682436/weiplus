package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class og implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f170099d;

    public og(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI) {
        this.f170099d = snsCommentImageFlowUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2$1");
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2$1");
        int intValue = ((java.lang.Number) lVar.f302834e).intValue();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWxAdapter$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f170099d.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWxAdapter$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemInserted(intValue);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$collectFlows$2$1");
        return f0Var;
    }
}

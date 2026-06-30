package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class jh extends kotlin.jvm.internal.m implements yz5.l {
    public jh(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.class, "showSelfCommentAlert", "showSelfCommentAlert(Lcom/tencent/mm/plugin/sns/ui/SnsFeedComment;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$3");
        com.tencent.mm.plugin.sns.ui.ei p07 = (com.tencent.mm.plugin.sns.ui.ei) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$3");
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = (com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI) this.receiver;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showSelfCommentAlert", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        snsCommentImageFlowUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showSelfCommentAlert", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        r45.e86 a17 = p07.a();
        java.lang.String str = a17.f373130h;
        if (com.tencent.mm.plugin.sns.ui.widget.t2.i(a17.f373139t, 64)) {
            db5.e1.f(snsCommentImageFlowUI.getContext(), null, new java.lang.String[]{snsCommentImageFlowUI.getContext().getString(com.tencent.mm.R.string.f490367t0)}, null, snsCommentImageFlowUI.getContext().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.sns.ui.lh(snsCommentImageFlowUI, a17));
        } else {
            db5.e1.f(snsCommentImageFlowUI.getContext(), null, new java.lang.String[]{snsCommentImageFlowUI.getContext().getString(com.tencent.mm.R.string.f490359sr), snsCommentImageFlowUI.getContext().getString(com.tencent.mm.R.string.f490367t0)}, null, snsCommentImageFlowUI.getContext().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.sns.ui.mh(str, snsCommentImageFlowUI, a17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSelfCommentAlert", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showSelfCommentAlert", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$3");
        return f0Var;
    }
}

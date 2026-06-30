package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class ih extends kotlin.jvm.internal.m implements yz5.l {
    public ih(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.class, "jumpToProfileWithUserName", "jumpToProfileWithUserName(Ljava/lang/String;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.app.y7 y7Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$2");
        java.lang.String p07 = (java.lang.String) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$2");
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = (com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI) this.receiver;
        snsCommentImageFlowUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToProfileWithUserName", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (p07.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToProfileWithUserName", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", p07);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 14);
            ct.u2 u2Var = (ct.u2) i95.n0.c(ct.u2.class);
            if (u2Var != null && (y7Var = ((bt.d) u2Var).f24068d) != null) {
                y7Var.l(intent, snsCommentImageFlowUI);
            }
            xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
            if (l0Var != null) {
                ((we0.j1) l0Var).hj(p07, 9L);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToProfileWithUserName", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$2");
        return f0Var;
    }
}

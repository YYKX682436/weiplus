package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class lh implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f169741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f169742b;

    public lh(com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI, r45.e86 e86Var) {
        this.f169741a = snsCommentImageFlowUI;
        this.f169742b = e86Var;
    }

    @Override // db5.c1
    public final void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$showSelfCommentAlert$1");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.r7(this.f169741a, this.f169742b);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$showSelfCommentAlert$1");
    }
}

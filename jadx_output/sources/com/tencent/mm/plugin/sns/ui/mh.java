package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class mh implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI f169920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f169921c;

    public mh(java.lang.String str, com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI, r45.e86 e86Var) {
        this.f169919a = str;
        this.f169920b = snsCommentImageFlowUI;
        this.f169921c = e86Var;
    }

    @Override // db5.c1
    public final void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$showSelfCommentAlert$2");
        r45.e86 e86Var = this.f169921c;
        com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI snsCommentImageFlowUI = this.f169920b;
        if (i17 == 0) {
            java.lang.String str = this.f169919a;
            if (com.tencent.mm.sdk.platformtools.b0.f(str)) {
                db5.e1.T(snsCommentImageFlowUI.getContext(), snsCommentImageFlowUI.getContext().getString(com.tencent.mm.R.string.f490361st));
                com.tencent.mm.ui.widget.dialog.u3 u3Var = com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.I1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsId$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                java.lang.String str2 = snsCommentImageFlowUI.W;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsId$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                if (str2 == null) {
                    kotlin.jvm.internal.o.o("snsId");
                    throw null;
                }
                java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(com.tencent.mm.plugin.sns.storage.w2.n(str2));
                if (e86Var != null && str != null && r07 != null) {
                    w04.a.INSTANCE.A9(4, r07 + ':' + e86Var.f373132m, com.tencent.mm.sdk.platformtools.t8.o0(str));
                }
            } else {
                db5.e1.T(snsCommentImageFlowUI.getContext(), snsCommentImageFlowUI.getContext().getString(com.tencent.mm.R.string.f490360ss));
            }
        } else if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI.r7(snsCommentImageFlowUI, e86Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$showSelfCommentAlert$2");
    }
}

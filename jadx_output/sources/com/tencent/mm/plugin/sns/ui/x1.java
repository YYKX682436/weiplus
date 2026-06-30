package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class x1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.q2 f171478d;

    public x1(com.tencent.mm.plugin.sns.ui.v1 v1Var, com.tencent.mm.plugin.sns.model.q2 q2Var) {
        this.f171478d = q2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$2");
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f171478d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$2");
    }
}

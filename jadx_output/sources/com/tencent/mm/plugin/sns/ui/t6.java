package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class t6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.u6 f170499d;

    public t6(com.tencent.mm.plugin.sns.ui.u6 u6Var) {
        this.f170499d = u6Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.NewSightWidget$9$1");
        com.tencent.mm.plugin.sns.ui.u6 u6Var = this.f170499d;
        com.tencent.mm.plugin.sns.ui.i6 i6Var = u6Var.f170566d;
        i6Var.Z = null;
        com.tencent.mm.plugin.sns.ui.i6.p(i6Var, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        java.lang.Runnable runnable = u6Var.f170566d.f168585q0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mm.sdk.platformtools.u3.l(runnable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.NewSightWidget$9$1");
    }
}

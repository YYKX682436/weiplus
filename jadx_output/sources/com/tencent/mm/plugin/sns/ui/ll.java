package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ll implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.p2 f169870d;

    public ll(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI, com.tencent.mm.plugin.sns.model.p2 p2Var) {
        this.f169870d = p2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$14");
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f169870d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$14");
    }
}

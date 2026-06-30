package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ml implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.q2 f169925d;

    public ml(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI, com.tencent.mm.plugin.sns.model.q2 q2Var) {
        this.f169925d = q2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$15");
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f169925d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$15");
    }
}

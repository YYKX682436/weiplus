package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fo implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.e3 f168353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsPermissionUI f168354e;

    public fo(com.tencent.mm.plugin.sns.ui.SnsPermissionUI snsPermissionUI, com.tencent.mm.plugin.sns.model.e3 e3Var) {
        this.f168354e = snsPermissionUI;
        this.f168353d = e3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI$2");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsPermissionUI.f167352r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        this.f168354e.onStop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI");
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f168353d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI$2");
    }
}

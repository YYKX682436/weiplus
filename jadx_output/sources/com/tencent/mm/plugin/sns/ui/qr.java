package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes10.dex */
public class qr implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.e3 f170355d;

    public qr(com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI, com.tencent.mm.plugin.sns.model.e3 e3Var) {
        this.f170355d = e3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$8");
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f170355d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$8");
    }
}

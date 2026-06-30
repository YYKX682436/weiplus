package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes3.dex */
public class s4 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f157932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157933b;

    public s4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, android.app.Dialog dialog) {
        this.f157933b = remittanceDetailUI;
        this.f157932a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        android.app.Dialog dialog = this.f157932a;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "fetch detail failed: %s", obj);
        if (obj != null) {
            boolean z17 = obj instanceof java.lang.String;
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157933b;
            dp.a.makeText(remittanceDetailUI, z17 ? obj.toString() : remittanceDetailUI.getString(com.tencent.mm.R.string.kpu), 1).show();
        }
    }
}

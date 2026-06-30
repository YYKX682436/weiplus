package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.q0 f157944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157945e;

    public t0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        this.f157945e = remittanceBaseUI;
        this.f157944d = q0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.I1;
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157945e;
        com.tencent.mm.plugin.remittance.model.q0 q0Var = this.f157944d;
        if (remittanceBaseUI.g7(q0Var)) {
            return;
        }
        remittanceBaseUI.i7(q0Var.f156964d, remittanceBaseUI.f157135f, remittanceBaseUI.Q, q0Var);
    }
}

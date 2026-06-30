package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.q0 f157853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157854e;

    public o0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        this.f157854e = remittanceBaseUI;
        this.f157853d = q0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.remittance.model.q0 q0Var = this.f157853d;
        java.lang.String str = q0Var.D;
        int i18 = com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.I1;
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157854e;
        remittanceBaseUI.c7(2, 3, str);
        if (remittanceBaseUI.g7(q0Var)) {
            return;
        }
        remittanceBaseUI.showLoading();
        remittanceBaseUI.i7(q0Var.f156964d, remittanceBaseUI.f157135f, remittanceBaseUI.Q, q0Var);
    }
}

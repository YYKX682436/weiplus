package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.q0 f157867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157868e;

    public p0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        this.f157868e = remittanceBaseUI;
        this.f157867d = q0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f157867d.D;
        int i18 = com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.I1;
        this.f157868e.c7(2, 2, str);
    }
}

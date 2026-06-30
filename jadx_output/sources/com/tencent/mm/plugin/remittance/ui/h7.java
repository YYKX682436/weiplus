package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class h7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.j1 f157752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceOSUI f157753e;

    public h7(com.tencent.mm.plugin.remittance.ui.RemittanceOSUI remittanceOSUI, com.tencent.mm.plugin.remittance.model.j1 j1Var) {
        this.f157753e = remittanceOSUI;
        this.f157752d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f157753e.o7(this.f157752d.f156867g);
    }
}

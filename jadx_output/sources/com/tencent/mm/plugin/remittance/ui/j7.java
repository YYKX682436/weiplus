package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class j7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.j1 f157786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceOSUI f157787e;

    public j7(com.tencent.mm.plugin.remittance.ui.RemittanceOSUI remittanceOSUI, com.tencent.mm.plugin.remittance.model.j1 j1Var) {
        this.f157787e = remittanceOSUI;
        this.f157786d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f157787e.o7(this.f157786d.f156867g);
    }
}

package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class i7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.j1 f157768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceOSUI f157769e;

    public i7(com.tencent.mm.plugin.remittance.ui.RemittanceOSUI remittanceOSUI, com.tencent.mm.plugin.remittance.model.j1 j1Var) {
        this.f157769e = remittanceOSUI;
        this.f157768d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f157769e.p7(this.f157768d.f156866f);
    }
}

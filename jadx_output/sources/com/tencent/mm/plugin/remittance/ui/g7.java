package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class g7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.j1 f157726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceOSUI f157727e;

    public g7(com.tencent.mm.plugin.remittance.ui.RemittanceOSUI remittanceOSUI, com.tencent.mm.plugin.remittance.model.j1 j1Var) {
        this.f157727e = remittanceOSUI;
        this.f157726d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f157727e.p7(this.f157726d.f156866f);
    }
}

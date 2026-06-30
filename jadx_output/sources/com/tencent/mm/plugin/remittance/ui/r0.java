package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class r0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.q0 f157909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157910e;

    public r0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        this.f157910e = remittanceBaseUI;
        this.f157909d = q0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.remittance.model.q0 q0Var = this.f157909d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(q0Var.f156966f.f156954c);
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157910e;
        if (K0) {
            com.tencent.mm.wallet_core.a.k(remittanceBaseUI, "order", "ShowOrdersInfoProcess", null, null);
            return;
        }
        js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
        java.lang.String str = q0Var.f156966f.f156954c;
        ((is.h) s0Var).getClass();
        c71.b.c(remittanceBaseUI, str, 5, true);
    }
}

package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.q0 f157814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157815e;

    public m0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI, com.tencent.mm.plugin.remittance.model.q0 q0Var) {
        this.f157815e = remittanceBaseUI;
        this.f157814d = q0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.remittance.model.q0 q0Var = this.f157814d;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceBaseUI", "goto h5: %s", q0Var.f156983z.f13798d);
        com.tencent.mm.wallet_core.ui.r1.V(this.f157815e.getContext(), q0Var.f156983z.f13798d, false);
    }
}

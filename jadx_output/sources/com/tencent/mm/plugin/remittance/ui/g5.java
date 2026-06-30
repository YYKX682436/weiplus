package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class g5 implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157723a;

    public g5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI) {
        this.f157723a = remittanceDetailUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        int i17 = n34Var.f381049e;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157723a;
        if (i17 == 2) {
            remittanceDetailUI.b7(remittanceDetailUI.B1.f156876r.f374723g, "");
        } else if (i17 == 1) {
            remittanceDetailUI.finish();
        } else if (i17 == 6) {
            remittanceDetailUI.b7(remittanceDetailUI.B1.f156876r.f374723g, n34Var.f381053i);
        }
    }
}

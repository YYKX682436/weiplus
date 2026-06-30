package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class d5 implements com.tencent.mm.plugin.wallet_core.utils.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157675a;

    public d5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI) {
        this.f157675a = remittanceDetailUI;
    }

    @Override // com.tencent.mm.plugin.wallet_core.utils.k0
    public void a(r45.n34 n34Var) {
        int i17 = n34Var.f381049e;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157675a;
        if (i17 == 2) {
            remittanceDetailUI.b7(remittanceDetailUI.A1.f156913g, "");
        } else if (i17 == 1) {
            remittanceDetailUI.finish();
        }
    }
}

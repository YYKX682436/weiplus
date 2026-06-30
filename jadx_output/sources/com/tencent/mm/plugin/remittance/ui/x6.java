package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class x6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceHKUI f158034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.tencent.mm.plugin.remittance.ui.RemittanceHKUI remittanceHKUI) {
        super(false);
        this.f158034d = remittanceHKUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceHKUI", "hy: on click banner");
        com.tencent.mm.plugin.remittance.ui.RemittanceHKUI remittanceHKUI = this.f158034d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceHKUI.M1)) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.V(remittanceHKUI.getContext(), remittanceHKUI.M1, true);
    }
}

package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class t3 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, boolean z17) {
        super(z17);
        this.f157950d = remittanceDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        np5.b0 b0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "click reveive btn");
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157950d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(remittanceDetailUI.f157338a2)) {
            com.tencent.mm.wallet_core.ui.r1.y0(remittanceDetailUI.getContext(), remittanceDetailUI.f157338a2, null);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27731, 9, java.lang.Integer.valueOf(remittanceDetailUI.X1), 0, 0, remittanceDetailUI.Y1);
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(remittanceDetailUI, 9, 4);
        pg0.a3 a3Var = (pg0.a3) i95.n0.c(pg0.a3.class);
        b0Var = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) remittanceDetailUI).mNetSceneMgr;
        a3Var.f353966t.f(remittanceDetailUI, 2, b0Var, new com.tencent.mm.plugin.remittance.ui.s3(this), false, 1008, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "click reveive btn，ret :%s", java.lang.Boolean.FALSE);
        remittanceDetailUI.a7();
    }
}

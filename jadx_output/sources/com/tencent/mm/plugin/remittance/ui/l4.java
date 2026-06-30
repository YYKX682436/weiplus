package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class l4 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.g1 f157803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.model.g1 g1Var) {
        super(false);
        this.f157804e = remittanceDetailUI;
        this.f157803d = g1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.model.g1 g1Var = this.f157803d;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.W6(this.f157804e, g1Var.f156843w.f157034f, g1Var, 11);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28399, com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f7(g1Var.f156843w.f157034f), 1, 0, 1);
    }
}

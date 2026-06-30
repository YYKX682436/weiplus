package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class v5 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.m0 f157992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157993b;

    public v5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.model.m0 m0Var) {
        this.f157993b = remittanceDetailUI;
        this.f157992a = m0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.remittance.model.m0 m0Var = this.f157992a;
        g0Var.d(28399, com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.g7(m0Var), 1, 0, 1, 3);
        this.f157993b.k7(m0Var.f156896c.f156812b, 0, "", 0, null, null);
    }
}

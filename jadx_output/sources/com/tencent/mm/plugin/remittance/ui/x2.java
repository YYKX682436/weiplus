package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class x2 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f158029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.z0 f158030b;

    public x2(com.tencent.mm.plugin.remittance.ui.h3 h3Var, com.tencent.mm.plugin.remittance.model.z0 z0Var) {
        this.f158029a = h3Var;
        this.f158030b = z0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.ui.k2 k2Var = this.f158029a.f157738g;
        if (k2Var != null) {
            com.tencent.mm.plugin.remittance.model.z0 z0Var = this.f158030b;
            com.tencent.mm.plugin.remittance.model.v0 v0Var = z0Var.f157077i.f156812b;
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = ((com.tencent.mm.plugin.remittance.ui.s5) k2Var).f157934a;
            int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f157336u2;
            remittanceDetailUI.k7(v0Var, 0, "", 0, null, null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27731, 3, java.lang.Integer.valueOf(z0Var.f157069a), 0, 0, z0Var.f157088t);
        }
    }
}

package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class n4 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.g1 f157844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.e1 f157845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.p1 f157846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157847d;

    public n4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.model.g1 g1Var, com.tencent.mm.plugin.remittance.model.e1 e1Var, com.tencent.mm.plugin.remittance.model.p1 p1Var) {
        this.f157847d = remittanceDetailUI;
        this.f157844a = g1Var;
        this.f157845b = e1Var;
        this.f157846c = p1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.model.e1 e1Var = this.f157845b;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157847d;
        com.tencent.mm.plugin.remittance.model.g1 g1Var = this.f157844a;
        if (g1Var != null) {
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.W6(remittanceDetailUI, e1Var.f156812b, g1Var, 12);
            return;
        }
        com.tencent.mm.plugin.remittance.model.v0 v0Var = e1Var.f156812b;
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f157336u2;
        remittanceDetailUI.getClass();
        remittanceDetailUI.k7(v0Var, this.f157846c.f156955r.f379962f, remittanceDetailUI.f157355l1, 12, null, null);
    }
}

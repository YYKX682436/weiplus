package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class m4 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.g1 f157818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.e1 f157819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.p1 f157820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157821d;

    public m4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.model.g1 g1Var, com.tencent.mm.plugin.remittance.model.e1 e1Var, com.tencent.mm.plugin.remittance.model.p1 p1Var) {
        this.f157821d = remittanceDetailUI;
        this.f157818a = g1Var;
        this.f157819b = e1Var;
        this.f157820c = p1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.remittance.model.e1 e1Var = this.f157819b;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157821d;
        com.tencent.mm.plugin.remittance.model.g1 g1Var = this.f157818a;
        if (g1Var != null) {
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.W6(remittanceDetailUI, e1Var.f156812b, g1Var, 12);
            return;
        }
        com.tencent.mm.plugin.remittance.model.v0 v0Var = e1Var.f156812b;
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f157336u2;
        remittanceDetailUI.getClass();
        remittanceDetailUI.k7(v0Var, this.f157820c.f156955r.f379962f, remittanceDetailUI.f157355l1, 12, null, null);
    }
}

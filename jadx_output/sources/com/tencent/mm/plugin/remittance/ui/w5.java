package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class w5 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f158011a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.m0 f158012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f158013c;

    public w5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.remittance.model.m0 m0Var) {
        this.f158013c = remittanceDetailUI;
        this.f158011a = z2Var;
        this.f158012b = m0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f158011a.B();
        com.tencent.mm.plugin.remittance.model.m0 m0Var = this.f158012b;
        com.tencent.mm.plugin.remittance.model.v0 v0Var = m0Var.f156897d.f156812b;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f158013c;
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f157336u2;
        remittanceDetailUI.k7(v0Var, 0, "", 0, null, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28399, com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.g7(m0Var), 1, 0, 1, 1);
    }
}

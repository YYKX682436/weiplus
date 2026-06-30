package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class a6 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f157633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.m0 f157634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157635c;

    public a6(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.remittance.model.m0 m0Var) {
        this.f157635c = remittanceDetailUI;
        this.f157633a = z2Var;
        this.f157634b = m0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        this.f157633a.B();
        com.tencent.mm.plugin.remittance.ui.x5 x5Var = new com.tencent.mm.plugin.remittance.ui.x5(this);
        com.tencent.mm.plugin.remittance.ui.z5 z5Var = new com.tencent.mm.plugin.remittance.ui.z5(this);
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157635c;
        com.tencent.mm.plugin.remittance.model.m0 m0Var = this.f157634b;
        com.tencent.mm.plugin.remittance.model.v0 v0Var = m0Var.f156898e.f156812b;
        int i17 = com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.f157336u2;
        remittanceDetailUI.k7(v0Var, 0, "", 0, x5Var, z5Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28399, com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.g7(m0Var), 1, 0, 1, 2);
    }
}

package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes.dex */
public class f implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI f156665a;

    public f(com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemittanceChooseUI bankMobileRemittanceChooseUI) {
        this.f156665a = bankMobileRemittanceChooseUI;
    }

    @Override // h45.i
    public void onKindaBusinessCallback(android.content.Intent intent) {
        if (intent.getIntExtra("pay_success", 0) != 1) {
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.remittance.mobile.ui.e eVar = new com.tencent.mm.plugin.remittance.mobile.ui.e(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(eVar, 200L, false);
    }
}

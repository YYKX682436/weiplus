package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class f6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157712d;

    public f6(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI) {
        this.f157712d = remittanceDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157712d;
        if (remittanceDetailUI.J1) {
            com.tencent.mm.plugin.remittance.model.k1 k1Var = remittanceDetailUI.B1;
            if (k1Var == null) {
                remittanceDetailUI.finish();
                return false;
            }
            r45.g04 g04Var = k1Var.f156876r.f374725i;
            if (g04Var == null) {
                remittanceDetailUI.finish();
                return false;
            }
            if (!com.tencent.mm.plugin.wallet_core.utils.l0.e(g04Var)) {
                remittanceDetailUI.finish();
                return false;
            }
            remittanceDetailUI.f157339b2.c(remittanceDetailUI.B1.f156876r.f374725i, new com.tencent.mm.plugin.remittance.ui.d6(this));
            remittanceDetailUI.B1.f156876r.f374725i = null;
        } else {
            com.tencent.mm.plugin.remittance.model.n0 n0Var = remittanceDetailUI.A1;
            if (n0Var == null) {
                remittanceDetailUI.finish();
                return false;
            }
            com.tencent.mm.plugin.wallet_core.utils.n nVar = n0Var.f156912f;
            if (nVar == null) {
                remittanceDetailUI.finish();
                return false;
            }
            if (!com.tencent.mm.plugin.wallet_core.utils.l0.d(nVar)) {
                remittanceDetailUI.finish();
                return false;
            }
            remittanceDetailUI.f157339b2.b(remittanceDetailUI.A1.f156912f, new com.tencent.mm.plugin.remittance.ui.e6(this));
            remittanceDetailUI.A1.f156912f = null;
        }
        return false;
    }
}

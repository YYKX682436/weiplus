package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class e2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152607d;

    public e2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152607d = walletOfflineCoinPurseUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152607d;
        if (itemId == 0) {
            yo3.m.n(walletOfflineCoinPurseUI);
            return;
        }
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.offline.ui.a1 a1Var = walletOfflineCoinPurseUI.P1;
            a1Var.getClass();
            if (((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().f()) {
                db5.e1.A(a1Var.f152577a, a1Var.a(com.tencent.mm.R.string.l1i), "", a1Var.a(com.tencent.mm.R.string.l1h), a1Var.a(com.tencent.mm.R.string.l1n), new com.tencent.mm.plugin.offline.ui.q0(a1Var), new com.tencent.mm.plugin.offline.ui.r0(a1Var));
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(a1Var.f152577a);
            u1Var.g(a1Var.a(com.tencent.mm.R.string.l1j));
            java.lang.String a17 = a1Var.a(com.tencent.mm.R.string.f493632l22);
            java.lang.String a18 = a1Var.a(com.tencent.mm.R.string.l1h);
            java.lang.String a19 = a1Var.a(com.tencent.mm.R.string.l1n);
            com.tencent.mm.ui.widget.dialog.a aVar = u1Var.f211996a.f211821b;
            aVar.f211734x = a17;
            aVar.f211735y = a18;
            aVar.f211736z = a19;
            com.tencent.mm.plugin.offline.ui.n0 n0Var = new com.tencent.mm.plugin.offline.ui.n0(a1Var);
            com.tencent.mm.plugin.offline.ui.o0 o0Var = new com.tencent.mm.plugin.offline.ui.o0(a1Var);
            com.tencent.mm.plugin.offline.ui.p0 p0Var = new com.tencent.mm.plugin.offline.ui.p0(a1Var);
            aVar.I = n0Var;
            aVar.f211708J = o0Var;
            aVar.K = p0Var;
            u1Var.q(false);
        }
    }
}

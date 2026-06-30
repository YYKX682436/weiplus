package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class v1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI f178520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI) {
        super(false);
        this.f178520d = walletBalanceSaveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.balance.model.lqt.u0 u0Var;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI walletBalanceSaveUI = this.f178520d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "click lqt entrance: %s", java.lang.Boolean.valueOf(walletBalanceSaveUI.f177842r.f412098c));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(17084, 5);
        ss4.m0 m0Var = walletBalanceSaveUI.f177842r;
        if (m0Var.f412098c) {
            walletBalanceSaveUI.hideWcKb();
            walletBalanceSaveUI.getClass();
            com.tencent.mm.plugin.wallet.balance.model.lqt.z0 z0Var = (com.tencent.mm.plugin.wallet.balance.model.lqt.z0) new em5.i().a(walletBalanceSaveUI, com.tencent.mm.plugin.wallet.balance.model.lqt.z0.class);
            android.app.Dialog e17 = com.tencent.mm.wallet_core.ui.b2.e(walletBalanceSaveUI, false, false, null);
            if (z0Var == null || (u0Var = z0Var.f177755b) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "fetchDetail() interactorGlueApi == null || interactorGlueApi.fetchLqtDetail == null");
                return;
            } else {
                ((km5.q) u0Var.b().h(new com.tencent.mm.plugin.wallet.balance.ui.y1(walletBalanceSaveUI, z0Var, e17))).s(new com.tencent.mm.plugin.wallet.balance.ui.w1(walletBalanceSaveUI, e17));
                return;
            }
        }
        if (m0Var.f412099d != null) {
            g0Var.d(17084, 6);
            ss4.l0 l0Var = walletBalanceSaveUI.f177842r.f412099d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "show open lqt alert");
            androidx.appcompat.app.AppCompatActivity context = walletBalanceSaveUI.getContext();
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211729s = l0Var.f412088a;
            aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f493568kr4);
            aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.kpr);
            aVar.E = new com.tencent.mm.plugin.wallet.balance.ui.z1(walletBalanceSaveUI, l0Var);
            aVar.Z = true;
            aVar.F = new com.tencent.mm.plugin.wallet.balance.ui.a2(walletBalanceSaveUI);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
        }
    }
}

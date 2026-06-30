package gt4;

/* loaded from: classes9.dex */
public class v1 implements gt4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget f275570a;

    public v1(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f275570a = walletSuccPageAwardWidget;
    }

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onStartScratchOrShake, isScratch: %s", java.lang.Boolean.valueOf(z17));
        int i17 = z17 ? 1 : 2;
        com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget = this.f275570a;
        com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.b(walletSuccPageAwardWidget, i17, false);
        if (z17) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = 5;
            objArr[1] = java.lang.Integer.valueOf(walletSuccPageAwardWidget.f180746u ? 2 : 1);
            g0Var.d(15225, objArr);
        } else {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = 4;
            objArr2[1] = java.lang.Integer.valueOf(walletSuccPageAwardWidget.f180746u ? 2 : 1);
            g0Var2.d(15225, objArr2);
        }
        walletSuccPageAwardWidget.f180747v = true;
    }
}

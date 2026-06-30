package gt4;

/* loaded from: classes9.dex */
public class z1 implements gt4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget f275586a;

    public z1(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f275586a = walletSuccPageAwardWidget;
    }

    public void a(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget = this.f275586a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "onStartShakeOrClick, isShake: %s, isClickH5OrTinyApp: %s", valueOf, java.lang.Boolean.valueOf(walletSuccPageAwardWidget.f180746u));
        if (z17) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = 4;
            objArr[1] = java.lang.Integer.valueOf(walletSuccPageAwardWidget.f180746u ? 2 : 1);
            g0Var.d(15225, objArr);
        } else {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = 7;
            objArr2[1] = java.lang.Integer.valueOf(walletSuccPageAwardWidget.f180746u ? 2 : 1);
            g0Var2.d(15225, objArr2);
        }
        walletSuccPageAwardWidget.f180740o.setShakeHintWording(walletSuccPageAwardWidget.getContext().getString(com.tencent.mm.R.string.kzy));
        walletSuccPageAwardWidget.f180740o.setShakeHintWordingColor(walletSuccPageAwardWidget.getResources().getColor(com.tencent.mm.R.color.f478873jj));
        com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget.b(walletSuccPageAwardWidget, 2, false);
        walletSuccPageAwardWidget.f180747v = true;
    }
}

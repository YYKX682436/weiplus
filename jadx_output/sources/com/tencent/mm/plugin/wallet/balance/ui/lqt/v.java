package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class v implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public long f178402a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI f178403b;

    public v(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI) {
        this.f178403b = walletLqtBalanceAutoTransferUI;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "click switch: %s", java.lang.Boolean.valueOf(z17));
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = elapsedRealtime - this.f178402a;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f178403b;
        if (j17 < 1000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "skip");
            walletLqtBalanceAutoTransferUI.f177933d.setCheck(!z17);
            this.f178402a = elapsedRealtime;
            return;
        }
        this.f178402a = elapsedRealtime;
        if (z17) {
            int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI.f177932t;
            walletLqtBalanceAutoTransferUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "go to pwd");
            android.content.Intent intent = new android.content.Intent(walletLqtBalanceAutoTransferUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI.class);
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
            walletLqtBalanceAutoTransferUI.startActivityForResult(intent, 16);
            return;
        }
        int i18 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI.f177932t;
        walletLqtBalanceAutoTransferUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "show close alert");
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletLqtBalanceAutoTransferUI.f177944r)) {
            walletLqtBalanceAutoTransferUI.f177944r = walletLqtBalanceAutoTransferUI.getString(com.tencent.mm.R.string.kom);
        }
        androidx.appcompat.app.AppCompatActivity context = walletLqtBalanceAutoTransferUI.getContext();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.A = false;
        aVar.f211709a = "";
        aVar.f211729s = walletLqtBalanceAutoTransferUI.f177944r;
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.kon);
        aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490347sg);
        aVar.W = walletLqtBalanceAutoTransferUI.getResources().getColor(com.tencent.mm.R.color.Red_100);
        aVar.E = new com.tencent.mm.plugin.wallet.balance.ui.lqt.x(walletLqtBalanceAutoTransferUI);
        aVar.Z = true;
        aVar.F = new com.tencent.mm.plugin.wallet.balance.ui.lqt.y(walletLqtBalanceAutoTransferUI);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        walletLqtBalanceAutoTransferUI.addDialog(j0Var);
    }
}

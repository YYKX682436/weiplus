package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI f178430d;

    public x(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI) {
        this.f178430d = walletLqtBalanceAutoTransferUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI.f177932t;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI walletLqtBalanceAutoTransferUI = this.f178430d;
        walletLqtBalanceAutoTransferUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "go to pwd");
        android.content.Intent intent = new android.content.Intent(walletLqtBalanceAutoTransferUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdNewUI.class);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        walletLqtBalanceAutoTransferUI.startActivityForResult(intent, 32);
    }
}

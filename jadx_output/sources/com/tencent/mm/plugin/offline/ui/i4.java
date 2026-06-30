package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class i4 implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI f152650a;

    public i4(com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI walletOfflineEntranceUI) {
        this.f152650a = walletOfflineEntranceUI;
    }

    @Override // h45.i
    public void onKindaBusinessCallback(android.content.Intent intent) {
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "intent is null ignore");
            return;
        }
        com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI walletOfflineEntranceUI = this.f152650a;
        if (walletOfflineEntranceUI.isFinishing() || walletOfflineEntranceUI.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "[onKindaBusinessCallback] isFinishing: %s, isDestroyed: %s", java.lang.Boolean.valueOf(walletOfflineEntranceUI.isFinishing()), java.lang.Boolean.valueOf(walletOfflineEntranceUI.isDestroyed()));
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("Offline.shouldFinishTransparentUI", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEntranceUI", "offlinepay has callback, needFinish: %s", java.lang.Boolean.valueOf(booleanExtra));
        if (booleanExtra) {
            walletOfflineEntranceUI.finish();
        }
    }
}

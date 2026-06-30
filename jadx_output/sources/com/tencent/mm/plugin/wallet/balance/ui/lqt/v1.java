package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class v1 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178406a;

    public v1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178406a = walletLqtDetailUI;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178406a;
        android.app.Dialog dialog = walletLqtDetailUI.Y;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "close account failed: %s", obj);
        if (obj != null) {
            db5.e1.y(walletLqtDetailUI.getContext(), obj instanceof java.lang.String ? obj.toString() : walletLqtDetailUI.getString(com.tencent.mm.R.string.kpu), "", walletLqtDetailUI.getString(com.tencent.mm.R.string.f490454vi), new com.tencent.mm.plugin.wallet.balance.ui.lqt.u1(this));
        }
    }
}

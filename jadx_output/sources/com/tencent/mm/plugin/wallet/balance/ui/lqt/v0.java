package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class v0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178405b;

    public v0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, int i17) {
        this.f178405b = walletLqtDetailUI;
        this.f178404a = i17;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178405b;
        android.app.Dialog dialog = walletLqtDetailUI.Y;
        if (dialog != null) {
            dialog.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "fetch detail failed: %s", obj);
        int i17 = this.f178404a - 1;
        if (i17 > 0) {
            walletLqtDetailUI.Y6(i17, false);
        } else if (obj != null) {
            db5.e1.y(walletLqtDetailUI.getContext(), obj instanceof java.lang.String ? obj.toString() : walletLqtDetailUI.getString(com.tencent.mm.R.string.kpu), "", walletLqtDetailUI.getString(com.tencent.mm.R.string.f490454vi), new com.tencent.mm.plugin.wallet.balance.ui.lqt.i0(this));
        }
    }
}

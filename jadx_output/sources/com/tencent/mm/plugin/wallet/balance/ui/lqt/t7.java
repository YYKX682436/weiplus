package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class t7 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178384a;

    public t7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f178384a = walletLqtSaveFetchUI;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178384a;
        boolean z17 = false;
        walletLqtSaveFetchUI.f178074x1 = false;
        walletLqtSaveFetchUI.getClass();
        walletLqtSaveFetchUI.hideLoading();
        if (obj != null) {
            boolean z18 = obj instanceof r45.an5;
            if (z18) {
                r45.an5 an5Var = (r45.an5) obj;
                z17 = np5.t.a(walletLqtSaveFetchUI, null, 1000, an5Var.f370142d, an5Var.f370143e);
            }
            if (z17) {
                return;
            }
            db5.e1.t(walletLqtSaveFetchUI, obj instanceof java.lang.String ? obj.toString() : z18 ? ((r45.an5) obj).f370143e : walletLqtSaveFetchUI.getString(com.tencent.mm.R.string.kpu), "", new com.tencent.mm.plugin.wallet.balance.ui.lqt.s7(this));
        }
    }
}

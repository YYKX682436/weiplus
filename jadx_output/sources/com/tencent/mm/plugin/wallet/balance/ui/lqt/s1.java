package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class s1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.t1 f178363d;

    public s1(com.tencent.mm.plugin.wallet.balance.ui.lqt.t1 t1Var) {
        this.f178363d = t1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.du4 du4Var;
        int i18;
        java.lang.String string;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.t1 t1Var = this.f178363d;
        if (itemId == -1) {
            r45.zg5 zg5Var = t1Var.f178371d.f177952f;
            if (!zg5Var.B) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(zg5Var.I)) {
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = t1Var.f178371d;
                    string = walletLqtDetailUI.f177952f.C == 0 ? walletLqtDetailUI.getString(com.tencent.mm.R.string.koz) : walletLqtDetailUI.getString(com.tencent.mm.R.string.koj);
                } else {
                    string = t1Var.f178371d.f177952f.I;
                }
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI2 = t1Var.f178371d;
                db5.e1.y(walletLqtDetailUI2, string, "", walletLqtDetailUI2.getString(com.tencent.mm.R.string.b9a), new com.tencent.mm.plugin.wallet.balance.ui.lqt.r1(this));
                return;
            }
        }
        java.util.LinkedList linkedList = t1Var.f178371d.f177952f.U;
        if (linkedList == null || linkedList.size() <= 0 || menuItem.getItemId() >= t1Var.f178371d.f177952f.U.size() || (i18 = (du4Var = (r45.du4) t1Var.f178371d.f177952f.U.get(menuItem.getItemId())).f372752h) == 1) {
            return;
        }
        if (i18 == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372750f)) {
                return;
            }
            com.tencent.mm.wallet_core.ui.r1.X(t1Var.f178371d, du4Var.f372750f, false);
        } else {
            if (i18 != 3 || com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372753i) || com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372750f)) {
                return;
            }
            com.tencent.mm.wallet_core.ui.r1.b0(du4Var.f372753i, du4Var.f372750f, 0, 1061);
        }
    }
}

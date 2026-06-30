package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class o1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f178297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178298e;

    public o1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, r45.du4 du4Var) {
        this.f178298e = walletLqtDetailUI;
        this.f178297d = du4Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        r45.du4 du4Var = this.f178297d;
        int i17 = du4Var.f372752h;
        if (i17 != 1) {
            if (i17 == 2) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372750f)) {
                    com.tencent.mm.wallet_core.ui.r1.X(this.f178298e, du4Var.f372750f, false);
                }
            } else if (i17 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372753i) && !com.tencent.mm.sdk.platformtools.t8.K0(du4Var.f372750f)) {
                com.tencent.mm.wallet_core.ui.r1.b0(du4Var.f372753i, du4Var.f372750f, 0, 1061);
            }
        }
        return false;
    }
}

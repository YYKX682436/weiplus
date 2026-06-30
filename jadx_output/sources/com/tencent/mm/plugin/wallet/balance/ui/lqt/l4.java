package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class l4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n85 f178259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI f178260e;

    public l4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI, r45.n85 n85Var) {
        this.f178260e = walletLqtPlanDetailUI;
        this.f178259d = n85Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        r45.n85 n85Var = this.f178259d;
        r45.dn4 dn4Var = n85Var.f381171o;
        if (dn4Var != null) {
            boolean z17 = dn4Var.f372595d;
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI = this.f178260e;
            if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(dn4Var.f372596e)) {
                java.util.LinkedList linkedList = n85Var.f381171o.f372597f;
                int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI.D;
                walletLqtPlanDetailUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanDetailUI", "show operation menu: %s", linkedList);
                if (linkedList != null && !linkedList.isEmpty()) {
                    com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) walletLqtPlanDetailUI.getContext(), 1, false);
                    k0Var.f211872n = new com.tencent.mm.plugin.wallet.balance.ui.lqt.m4(walletLqtPlanDetailUI, linkedList);
                    k0Var.f211881s = new com.tencent.mm.plugin.wallet.balance.ui.lqt.p4(walletLqtPlanDetailUI, n85Var);
                    k0Var.v();
                }
            } else {
                db5.e1.y(walletLqtPlanDetailUI.getContext(), n85Var.f381171o.f372596e, "", walletLqtPlanDetailUI.getString(com.tencent.mm.R.string.f490455vj), new com.tencent.mm.plugin.wallet.balance.ui.lqt.k4(this));
            }
        }
        return false;
    }
}

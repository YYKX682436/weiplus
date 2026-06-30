package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class p4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n85 f178322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI f178323e;

    public p4(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI, r45.n85 n85Var) {
        this.f178323e = walletLqtPlanDetailUI;
        this.f178322d = n85Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        r45.n85 n85Var = this.f178322d;
        int i18 = n85Var.f381172p;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI walletLqtPlanDetailUI = this.f178323e;
        walletLqtPlanDetailUI.f178022z = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanDetailUI", "operType：%s", java.lang.Integer.valueOf(itemId));
        if (itemId == 1) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI.U6(walletLqtPlanDetailUI, itemId);
            return;
        }
        if (itemId == 2) {
            db5.e1.L(walletLqtPlanDetailUI.getContext(), true, walletLqtPlanDetailUI.getString(com.tencent.mm.R.string.kql), "", walletLqtPlanDetailUI.getString(com.tencent.mm.R.string.kqk), walletLqtPlanDetailUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet.balance.ui.lqt.n4(this, itemId), new com.tencent.mm.plugin.wallet.balance.ui.lqt.o4(this), com.tencent.mm.R.color.f479308vo, com.tencent.mm.R.color.a0c);
            return;
        }
        if (itemId == 3) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI.U6(walletLqtPlanDetailUI, itemId);
            return;
        }
        if (itemId != 4) {
            return;
        }
        walletLqtPlanDetailUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanDetailUI", "go to add plan ui -> modify");
        android.content.Intent intent = new android.content.Intent(walletLqtPlanDetailUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.class);
        intent.putExtra("key_mode", 2);
        try {
            intent.putExtra("key_plan_item", n85Var.toByteArray());
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLqtPlanDetailUI", e17, "", new java.lang.Object[0]);
        }
        walletLqtPlanDetailUI.startActivityForResult(intent, 65281);
    }
}

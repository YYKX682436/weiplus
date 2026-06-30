package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout f178212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.rk5 f178213e;

    public j(com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout lqtSaveKeyboardToolBarLayout, r45.rk5 rk5Var) {
        this.f178212d = lqtSaveKeyboardToolBarLayout;
        this.f178213e = rk5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout$getAmountTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.i onSelectAmount = this.f178212d.getOnSelectAmount();
        if (onSelectAmount != null) {
            int i17 = this.f178213e.f384970d;
            int i18 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = ((com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$a) onSelectAmount).f178080a;
            walletLqtSaveFetchUI.getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17084, 34, java.lang.Integer.valueOf(i17));
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "keyboard toolbar select amount: %d", java.lang.Integer.valueOf(i17));
            if (i17 % 100 == 0) {
                walletLqtSaveFetchUI.f178056h.setText(java.lang.String.valueOf(i17 / 100));
            } else {
                walletLqtSaveFetchUI.f178056h.setText(com.tencent.mm.wallet_core.ui.r1.o(i17 / 100.0d));
            }
            walletLqtSaveFetchUI.f178056h.getContentEt().requestFocus();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/LqtSaveKeyboardToolBarLayout$getAmountTextView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

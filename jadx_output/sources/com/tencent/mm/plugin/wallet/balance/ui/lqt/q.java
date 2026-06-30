package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI f178329d;

    public q(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
        this.f178329d = walletKnowLqtFullScreenVideoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletKnowLqtFullScreenVideoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI = this.f178329d;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar = walletKnowLqtFullScreenVideoUI.f177920d;
        java.lang.Integer valueOf = lVar != null ? java.lang.Integer.valueOf(lVar.getPlayerState()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "click play controller, state: " + valueOf);
        if ((valueOf != null && valueOf.intValue() == 7) || (valueOf != null && valueOf.intValue() == 1)) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar2 = walletKnowLqtFullScreenVideoUI.f177920d;
            if (lVar2 != null) {
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.r(lVar2, null, 0L, 1, null);
            }
            android.widget.ImageView imageView = walletKnowLqtFullScreenVideoUI.f177923g;
            if (imageView != null) {
                imageView.setImageDrawable(walletKnowLqtFullScreenVideoUI.getResources().getDrawable(com.tencent.mm.R.drawable.f481888ah5));
            }
        } else if (valueOf != null && valueOf.intValue() == 6) {
            com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar3 = walletKnowLqtFullScreenVideoUI.f177920d;
            if (lVar3 != null) {
                com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.r(lVar3, null, 0L, 3, null);
            }
            android.widget.ImageView imageView2 = walletKnowLqtFullScreenVideoUI.f177923g;
            if (imageView2 != null) {
                imageView2.setImageDrawable(walletKnowLqtFullScreenVideoUI.getResources().getDrawable(com.tencent.mm.R.drawable.f481888ah5));
            }
        } else {
            try {
                com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar4 = walletKnowLqtFullScreenVideoUI.f177920d;
                if (lVar4 != null) {
                    lVar4.q();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletKnowLqtFullScreenVideoUIUI", "pause has exception" + e17);
            }
            android.widget.ImageView imageView3 = walletKnowLqtFullScreenVideoUI.f177923g;
            if (imageView3 != null) {
                imageView3.setImageDrawable(walletKnowLqtFullScreenVideoUI.getResources().getDrawable(com.tencent.mm.R.drawable.ah6));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletKnowLqtFullScreenVideoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

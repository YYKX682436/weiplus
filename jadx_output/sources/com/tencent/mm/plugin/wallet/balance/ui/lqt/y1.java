package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178447d;

    public y1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178447d = walletLqtDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178447d;
        walletLqtDetailUI.I.setWidth(((walletLqtDetailUI.H.getWidth() - (walletLqtDetailUI.H.getPaddingLeft() * 2)) - walletLqtDetailUI.f177950J.getWidth()) - i65.a.b(walletLqtDetailUI.getContext(), 16));
        walletLqtDetailUI.I.setVisibility(0);
    }
}

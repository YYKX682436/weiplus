package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class h1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletLuckyMoneyRefundWayUI f179007d;

    public h1(com.tencent.mm.plugin.wallet.pwd.ui.WalletLuckyMoneyRefundWayUI walletLuckyMoneyRefundWayUI) {
        this.f179007d = walletLuckyMoneyRefundWayUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f179007d.finish();
        return false;
    }
}

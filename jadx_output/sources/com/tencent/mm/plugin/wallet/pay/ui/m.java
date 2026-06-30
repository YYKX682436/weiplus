package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletChangeLoanRepayBankcardUI f178785d;

    public m(com.tencent.mm.plugin.wallet.pay.ui.WalletChangeLoanRepayBankcardUI walletChangeLoanRepayBankcardUI) {
        this.f178785d = walletChangeLoanRepayBankcardUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f178785d.setResult(-1, null);
        return true;
    }
}

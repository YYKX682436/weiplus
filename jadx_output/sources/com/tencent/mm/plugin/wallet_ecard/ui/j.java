package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes8.dex */
public class j implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI f181048d;

    public j(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI walletECardFinishUI) {
        this.f181048d = walletECardFinishUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardFinishUI", "press back btn");
        this.f181048d.f181025d.performClick();
        return false;
    }
}

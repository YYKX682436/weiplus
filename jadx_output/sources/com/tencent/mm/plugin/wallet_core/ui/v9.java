package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class v9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI f180694d;

    public v9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI walletVerifyIdCardUI) {
        this.f180694d = walletVerifyIdCardUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f180694d.finish();
        return false;
    }
}

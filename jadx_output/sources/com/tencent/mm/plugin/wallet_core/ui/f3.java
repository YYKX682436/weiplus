package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class f3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI f180265d;

    public f3(com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI walletCardSelectUI) {
        this.f180265d = walletCardSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f180265d.finish();
        return true;
    }
}

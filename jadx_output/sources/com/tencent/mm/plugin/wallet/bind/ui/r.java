package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes3.dex */
public class r implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI f178641d;

    public r(com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI walletBankcardManageUI) {
        this.f178641d = walletBankcardManageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f178641d.finish();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14422, 4);
        return true;
    }
}

package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class g3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152627d;

    public g3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        this.f152627d = walletOfflineCoinPurseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.autogen.events.OfflinePayResultNewEvent offlinePayResultNewEvent = new com.tencent.mm.autogen.events.OfflinePayResultNewEvent();
        offlinePayResultNewEvent.f54557g.f6361a = "ok";
        offlinePayResultNewEvent.e();
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152627d;
        if (walletOfflineCoinPurseUI.A1 == 8) {
            yo3.m.h(walletOfflineCoinPurseUI.getIntent().getStringExtra("key_appid"));
        }
        walletOfflineCoinPurseUI.finish();
        return false;
    }
}

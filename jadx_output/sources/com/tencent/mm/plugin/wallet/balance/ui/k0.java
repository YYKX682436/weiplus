package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletGetBulletinEvent f177910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177911e;

    public k0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f177911e = walletBalanceFetchUI;
        this.f177910d = walletGetBulletinEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = this.f177910d;
        am.j10 j10Var = walletGetBulletinEvent.f54956h;
        int i17 = j10Var.f6997d;
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f177911e;
        if (i17 == 2) {
            walletBalanceFetchUI.f177796u.setBannerData(j10Var.f6998e);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(j10Var.f6994a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "no bulletin data");
                return;
            }
            android.widget.TextView textView = walletBalanceFetchUI.f177790o;
            am.j10 j10Var2 = walletGetBulletinEvent.f54956h;
            com.tencent.mm.wallet_core.ui.r1.s0(null, textView, j10Var2.f6994a, j10Var2.f6995b, j10Var2.f6996c);
        }
    }
}

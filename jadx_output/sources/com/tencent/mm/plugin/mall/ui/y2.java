package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletGetBulletinEvent f148515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallWalletUI f148516e;

    public y2(com.tencent.mm.plugin.mall.ui.MallWalletUI mallWalletUI, com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f148516e = mallWalletUI;
        this.f148515d = walletGetBulletinEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.tw4 tw4Var;
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = this.f148515d;
        am.j10 j10Var = walletGetBulletinEvent.f54956h;
        int i17 = j10Var.f6997d;
        com.tencent.mm.plugin.mall.ui.MallWalletUI mallWalletUI = this.f148516e;
        if (i17 == 2 && (tw4Var = j10Var.f6998e) != null) {
            mallWalletUI.f148316e.setBannerData(tw4Var);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(j10Var.f6994a)) {
                return;
            }
            android.widget.TextView textView = mallWalletUI.f148315d;
            am.j10 j10Var2 = walletGetBulletinEvent.f54956h;
            com.tencent.mm.wallet_core.ui.r1.s0(null, textView, j10Var2.f6994a, j10Var2.f6995b, j10Var2.f6996c);
        }
    }
}

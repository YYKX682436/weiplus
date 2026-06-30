package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletGetBulletinEvent f148461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148462e;

    public p1(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2, com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f148462e = mallIndexUIv2;
        this.f148461d = walletGetBulletinEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.tw4 tw4Var;
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = this.f148461d;
        am.j10 j10Var = walletGetBulletinEvent.f54956h;
        int i17 = j10Var.f6997d;
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2 = this.f148462e;
        if (i17 == 2 && (tw4Var = j10Var.f6998e) != null) {
            mallIndexUIv2.f148258h.setBannerData(tw4Var);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(j10Var.f6994a)) {
                return;
            }
            android.widget.TextView textView = mallIndexUIv2.f148257g;
            am.j10 j10Var2 = walletGetBulletinEvent.f54956h;
            com.tencent.mm.wallet_core.ui.r1.s0(null, textView, j10Var2.f6994a, j10Var2.f6995b, j10Var2.f6996c);
        }
    }
}

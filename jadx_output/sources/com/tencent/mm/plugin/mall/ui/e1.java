package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletGetBulletinEvent f148367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148368e;

    public e1(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI, com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f148368e = mallIndexUI;
        this.f148367d = walletGetBulletinEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = this.f148367d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletGetBulletinEvent.f54956h.f6994a)) {
            return;
        }
        android.widget.TextView textView = this.f148368e.f148242g;
        am.j10 j10Var = walletGetBulletinEvent.f54956h;
        com.tencent.mm.wallet_core.ui.r1.s0(null, textView, j10Var.f6994a, j10Var.f6995b, j10Var.f6996c);
    }
}

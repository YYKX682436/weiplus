package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletGetBulletinEvent f152698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152699e;

    public r1(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent) {
        this.f152699e = walletOfflineCoinPurseUI;
        this.f152698d = walletGetBulletinEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.WalletGetBulletinEvent walletGetBulletinEvent = this.f152698d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletGetBulletinEvent.f54956h.f6994a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "no bulletin data");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.f152699e.findViewById(com.tencent.mm.R.id.af7);
        am.j10 j10Var = walletGetBulletinEvent.f54956h;
        com.tencent.mm.wallet_core.ui.r1.s0(null, textView, j10Var.f6994a, j10Var.f6995b, j10Var.f6996c);
    }
}

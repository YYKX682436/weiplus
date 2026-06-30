package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class x1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178432a;

    public x1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178432a = walletLqtDetailUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        this.f178432a.f177961p0.postDelayed(new com.tencent.mm.plugin.wallet.balance.ui.lqt.w1(this), 1000L);
        com.tencent.mm.autogen.events.OfflineUpdateCardListEvent offlineUpdateCardListEvent = new com.tencent.mm.autogen.events.OfflineUpdateCardListEvent();
        am.dm dmVar = offlineUpdateCardListEvent.f54558g;
        dmVar.f6477a = 2;
        dmVar.f6478b = "LQT";
        offlineUpdateCardListEvent.e();
        return null;
    }
}

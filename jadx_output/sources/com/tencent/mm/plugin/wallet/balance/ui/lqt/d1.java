package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class d1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.na5 f178131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178132b;

    public d1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, r45.na5 na5Var) {
        this.f178132b = walletLqtDetailUI;
        this.f178131a = na5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178132b;
        walletLqtDetailUI.O1 = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16807, 4);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.V6(walletLqtDetailUI, walletLqtDetailUI.M1, this.f178131a.f381203h);
    }
}

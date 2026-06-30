package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class h1 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178191a;

    public h1(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI) {
        this.f178191a = walletLqtDetailUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public void dismiss() {
        if (this.f178191a.O1) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16807, 6);
    }
}

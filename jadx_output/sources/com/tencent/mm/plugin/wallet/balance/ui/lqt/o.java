package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI f178292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
        super(0);
        this.f178292d = walletKnowLqtFullScreenVideoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI = this.f178292d;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar = walletKnowLqtFullScreenVideoUI.f177920d;
        if (lVar != null) {
            lVar.getPlayer().b(false);
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar2 = walletKnowLqtFullScreenVideoUI.f177920d;
        if (lVar2 != null) {
            lVar2.setOnVideoComplete(new com.tencent.mm.plugin.wallet.balance.ui.lqt.m(walletKnowLqtFullScreenVideoUI));
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar3 = walletKnowLqtFullScreenVideoUI.f177920d;
        if (lVar3 != null) {
            lVar3.setOnFirstFrameRendered(new com.tencent.mm.plugin.wallet.balance.ui.lqt.n(walletKnowLqtFullScreenVideoUI));
        }
        return jz5.f0.f302826a;
    }
}

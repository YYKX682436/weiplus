package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI f178276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
        super(0);
        this.f178276d = walletKnowLqtFullScreenVideoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI = this.f178276d;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar = walletKnowLqtFullScreenVideoUI.f177920d;
        if (lVar != null) {
            long totalLength = lVar.getTotalLength();
            android.widget.TextView textView = walletKnowLqtFullScreenVideoUI.f177925i;
            if (textView != null) {
                textView.setText(com.tencent.mm.wallet_core.ui.r1.r(walletKnowLqtFullScreenVideoUI.getContext().getString(com.tencent.mm.R.string.fcw), totalLength));
            }
        }
        return jz5.f0.f302826a;
    }
}

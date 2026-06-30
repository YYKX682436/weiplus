package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI f178265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI) {
        super(0);
        this.f178265d = walletKnowLqtFullScreenVideoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI walletKnowLqtFullScreenVideoUI = this.f178265d;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.l lVar = walletKnowLqtFullScreenVideoUI.f177920d;
        if (lVar != null) {
            lVar.t();
        }
        android.widget.ImageView imageView = walletKnowLqtFullScreenVideoUI.f177923g;
        if (imageView != null) {
            imageView.setImageDrawable(walletKnowLqtFullScreenVideoUI.getResources().getDrawable(com.tencent.mm.R.drawable.ah6));
        }
        return jz5.f0.f302826a;
    }
}

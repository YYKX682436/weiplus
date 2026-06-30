package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes3.dex */
public class y0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI f178531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI walletBalanceManagerUI) {
        super(false);
        this.f178531d = walletBalanceManagerUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://payapp.weixin.qq.com/kfweb/helpcenter/dispatch?scene_code=CommIssueChange");
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
        com.tencent.mm.wallet_core.ui.r1.T(this.f178531d.getContext(), intent);
        com.tencent.mm.wallet_core.ui.r1.q0(17, 1);
    }
}

package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class e1 extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178760e;

    public e1(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178760e = walletPayUI;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        boolean x17 = vr4.f1.wi().Ai().x();
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178760e;
        if (!x17) {
            com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = walletPayUI.f178729u;
            com.tencent.mm.wallet_core.model.a2.a(payInfo == null ? 0 : payInfo.f192109e, payInfo == null ? "" : payInfo.f192114m, 6, "");
        }
        walletPayUI.Y6(true);
        walletPayUI.f178732x = true;
    }
}

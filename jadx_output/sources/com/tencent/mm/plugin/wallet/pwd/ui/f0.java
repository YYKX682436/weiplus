package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes3.dex */
public class f0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI f178997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI walletForgotPwdUI) {
        super(false);
        this.f178997d = walletForgotPwdUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f178997d, "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2) + "/touch/scene_product.html?scene_id=kf3258", false);
    }
}

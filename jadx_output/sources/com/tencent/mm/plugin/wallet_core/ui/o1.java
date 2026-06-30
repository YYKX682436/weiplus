package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class o1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI f180547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI walletBindCardResultUI) {
        super(false);
        this.f180547d = walletBindCardResultUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBindCardResultUI", "click activity button");
        com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI.U6(this.f180547d);
    }
}

package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class o5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
        super(false);
        this.f180560d = walletOrderInfoNewUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoNewUI", "click activity button");
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.c7(this.f180560d);
    }
}

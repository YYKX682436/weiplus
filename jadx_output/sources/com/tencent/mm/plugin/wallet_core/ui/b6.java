package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class b6 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
        super(false);
        this.f180150d = walletOrderInfoNewUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f180150d.e7();
    }
}

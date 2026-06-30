package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class l5 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI f180408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI) {
        super(false);
        this.f180408d = walletOrderInfoNewUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI walletOrderInfoNewUI = this.f180408d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(walletOrderInfoNewUI.f180039u)) {
            return;
        }
        if (walletOrderInfoNewUI.f180027i.contains(walletOrderInfoNewUI.f180039u)) {
            walletOrderInfoNewUI.f180027i.remove(walletOrderInfoNewUI.f180039u);
            walletOrderInfoNewUI.C1.setChecked(false);
        } else {
            walletOrderInfoNewUI.f180027i.add(walletOrderInfoNewUI.f180039u);
            walletOrderInfoNewUI.C1.setChecked(true);
        }
    }
}

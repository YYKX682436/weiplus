package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class d0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f177878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177879b;

    public d0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f177879b = walletBalanceFetchUI;
        this.f177878a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard;
        this.f177878a.B();
        wcPayKeyboard = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) this.f177879b).mWcKeyboard;
        wcPayKeyboard.u();
    }
}

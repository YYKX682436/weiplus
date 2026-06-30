package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class b5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI f180149d;

    public b5(com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI walletMixOrderInfoUI) {
        this.f180149d = walletMixOrderInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
        com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI walletMixOrderInfoUI = this.f180149d;
        java.lang.String str = walletMixOrderInfoUI.f180009h;
        am.s10 s10Var = walletPayResultEvent.f54965g;
        s10Var.f7864d = str;
        s10Var.f7863c = 0;
        walletPayResultEvent.e();
        walletMixOrderInfoUI.finish();
    }
}

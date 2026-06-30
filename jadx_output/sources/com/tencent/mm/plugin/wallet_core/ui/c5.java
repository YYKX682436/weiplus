package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class c5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f180173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI f180174e;

    public c5(com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI walletMixOrderInfoUI, int i17) {
        this.f180174e = walletMixOrderInfoUI;
        this.f180173d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI walletMixOrderInfoUI = this.f180174e;
        boolean z17 = walletMixOrderInfoUI.f180005d;
        int i18 = this.f180173d;
        if (z17) {
            com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent webViewWillCloseWindowEvent = new com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent();
            webViewWillCloseWindowEvent.f54989g.f7689a = i18;
            webViewWillCloseWindowEvent.e();
        }
        com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
        java.lang.String str = walletMixOrderInfoUI.f180009h;
        am.s10 s10Var = walletPayResultEvent.f54965g;
        s10Var.f7864d = str;
        s10Var.f7863c = i18;
        walletPayResultEvent.e();
        walletMixOrderInfoUI.setResult(i18);
        walletMixOrderInfoUI.finish();
    }
}

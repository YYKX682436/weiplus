package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI f181187d;

    public n0(com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI walletOpenViewProxyUI, boolean z17) {
        this.f181187d = walletOpenViewProxyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI walletOpenViewProxyUI = this.f181187d;
        intent.putExtra("closeWebView", (java.lang.String) ((java.util.HashMap) walletOpenViewProxyUI.f181120f).get("closeWebView"));
        walletOpenViewProxyUI.setResult(-1, intent);
        walletOpenViewProxyUI.finish();
    }
}

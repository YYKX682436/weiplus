package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes9.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI f181171d;

    public e0(com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI walletOpenViewProxyUI) {
        this.f181171d = walletOpenViewProxyUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f181171d.finish();
    }
}

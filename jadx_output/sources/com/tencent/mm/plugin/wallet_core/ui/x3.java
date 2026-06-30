package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI f180788d;

    public x3(com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI walletCheckPwdUI) {
        this.f180788d = walletCheckPwdUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f180788d.hideTenpayKB();
    }
}

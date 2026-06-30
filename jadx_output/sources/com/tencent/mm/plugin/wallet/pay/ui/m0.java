package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178786d;

    public m0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178786d = walletPayUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i(this.f178786d.f178712d, "auto reset create flag");
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI.C1 = false;
    }
}

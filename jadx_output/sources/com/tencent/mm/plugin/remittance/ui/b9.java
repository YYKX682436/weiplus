package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI f157652d;

    public b9(com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI) {
        this.f157652d = walletMerchantPayUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "delay finish");
        this.f157652d.finish();
    }
}

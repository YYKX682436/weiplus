package zw1;

/* loaded from: classes15.dex */
public class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476761d;

    public p5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f476761d = walletCollectQrCodeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476761d;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.V6(walletCollectQrCodeUI, 2);
        ww1.y2.b(1, walletCollectQrCodeUI.f96438g, walletCollectQrCodeUI.f96439h, walletCollectQrCodeUI.f96436e, walletCollectQrCodeUI.f96437f, walletCollectQrCodeUI.getContext());
    }
}

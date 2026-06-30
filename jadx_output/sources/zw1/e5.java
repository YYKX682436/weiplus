package zw1;

/* loaded from: classes15.dex */
public class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476618d;

    public e5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f476618d = walletCollectQrCodeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476618d;
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.V6(walletCollectQrCodeUI, 1);
        ww1.y2.b(2, walletCollectQrCodeUI.f96438g, walletCollectQrCodeUI.f96439h, walletCollectQrCodeUI.f96436e, walletCollectQrCodeUI.f96437f, walletCollectQrCodeUI.getContext());
    }
}

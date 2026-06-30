package zw1;

/* loaded from: classes9.dex */
public class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI f476587d;

    public b3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f476587d = walletCollectQrCodeSettingUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI = this.f476587d;
        if (walletCollectQrCodeSettingUI.f96432i == 2 && walletCollectQrCodeSettingUI.isHandleAutoShowNormalStWcKb()) {
            walletCollectQrCodeSettingUI.showNormalStWcKb();
        }
    }
}

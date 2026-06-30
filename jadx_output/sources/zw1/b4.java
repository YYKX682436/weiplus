package zw1;

/* loaded from: classes15.dex */
public class b4 implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476588d;

    public b4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f476588d = walletCollectQrCodeUI;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str != null) {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476588d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(walletCollectQrCodeUI.f96437f.R) && str.equals(walletCollectQrCodeUI.f96437f.R)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "cdnImageDownloadListener mchPhoto = %s notifyKey = %s", walletCollectQrCodeUI.f96437f.R, str);
                walletCollectQrCodeUI.B7(2);
            }
        }
    }
}

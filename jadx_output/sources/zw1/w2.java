package zw1;

/* loaded from: classes9.dex */
public class w2 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI f476836a;

    public w2(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f476836a = walletCollectQrCodeSettingUI;
    }

    @Override // db5.a1
    public boolean onFinish(java.lang.CharSequence charSequence) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString());
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI = this.f476836a;
        if (K0) {
            walletCollectQrCodeSettingUI.f96430g = "";
            walletCollectQrCodeSettingUI.X6();
        } else {
            walletCollectQrCodeSettingUI.f96430g = charSequence.toString();
            walletCollectQrCodeSettingUI.X6();
        }
        com.tencent.mm.sdk.platformtools.u3.i(new zw1.v2(this), 200L);
        return true;
    }
}

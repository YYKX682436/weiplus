package zw1;

/* loaded from: classes8.dex */
public class f3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI f476623d;

    public f3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f476623d = walletCollectQrCodeSettingUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        double F = com.tencent.mm.sdk.platformtools.t8.F(editable.toString(), 0.0d);
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI = this.f476623d;
        if (!walletCollectQrCodeSettingUI.f96427d.n() || F < 0.01d) {
            walletCollectQrCodeSettingUI.f96431h.e(false);
        } else {
            walletCollectQrCodeSettingUI.f96431h.e(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

package gt4;

/* loaded from: classes9.dex */
public class f1 implements rp5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView f275432a;

    public f1(com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView) {
        this.f275432a = walletPhoneInputView;
    }

    @Override // rp5.b
    public boolean a(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        return false;
    }

    @Override // rp5.b
    public boolean b() {
        return false;
    }

    @Override // rp5.b
    public boolean c(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView = this.f275432a;
        if (!(walletPhoneInputView.f180721h == 0)) {
            return (com.tencent.mm.sdk.platformtools.t8.K0(walletPhoneInputView.f180724n) || com.tencent.mm.sdk.platformtools.t8.K0(walletPhoneInputView.f180723m) || com.tencent.mm.sdk.platformtools.t8.K0(walletPhoneInputView.f180718e.getText())) ? false : true;
        }
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = walletFormView.f214161h;
        if (tenpaySecureEditText == null) {
            return false;
        }
        return tenpaySecureEditText.isPhoneNum();
    }

    @Override // rp5.b
    public boolean d(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        return false;
    }

    @Override // rp5.b
    public java.lang.String e(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        return null;
    }
}

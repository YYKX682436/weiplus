package qp5;

/* loaded from: classes9.dex */
public class b extends qp5.o {
    public b() {
        super(null);
    }

    @Override // qp5.o, rp5.b
    public boolean a(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() > 5) {
            return false;
        }
        walletFormView.setSelection(0);
        walletFormView.set3DesToView(str);
        walletFormView.setMaxInputLength(24 - str.length());
        walletFormView.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(walletFormView.getMaxInputLength())});
        return true;
    }

    @Override // qp5.o, rp5.b
    public boolean c(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = walletFormView.f214161h;
        if (tenpaySecureEditText == null) {
            return false;
        }
        return tenpaySecureEditText.isBankcardNum();
    }

    @Override // qp5.o, rp5.b
    public boolean d(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() > 5) {
            return false;
        }
        walletFormView.setSelection(0);
        walletFormView.setBankcardTail(str);
        walletFormView.setMaxInputLength(24 - str.length());
        walletFormView.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(walletFormView.getMaxInputLength())});
        return true;
    }

    @Override // qp5.o, rp5.b
    public java.lang.String e(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.replaceAll(" ", "");
    }
}

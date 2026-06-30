package qp5;

/* loaded from: classes9.dex */
public class a extends qp5.o {
    public a() {
        super(null);
    }

    @Override // qp5.o, rp5.b
    public boolean c(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = walletFormView.f214161h;
        if (tenpaySecureEditText == null) {
            return false;
        }
        return tenpaySecureEditText.isMoneyAmount();
    }
}

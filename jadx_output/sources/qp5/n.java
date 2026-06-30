package qp5;

/* loaded from: classes9.dex */
public class n extends qp5.o {

    /* renamed from: a, reason: collision with root package name */
    public int f365845a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.ui.formview.WalletFormView f365846b;

    public n(int i17, com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        super(null);
        this.f365846b = walletFormView;
        this.f365845a = i17;
        if (i17 == 1) {
            if (walletFormView != null) {
                walletFormView.setKeyListener(new qp5.m(this));
            }
        } else if (walletFormView != null) {
            walletFormView.setInputType(1);
        }
    }

    @Override // qp5.o, rp5.b
    public boolean c(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        int i17 = this.f365845a;
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = walletFormView.f214161h;
        if (tenpaySecureEditText == null) {
            return false;
        }
        return tenpaySecureEditText.isAreaIDCardNum(i17);
    }

    public void f(int i17) {
        this.f365845a = i17;
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f365846b;
        if (i17 == 1) {
            if (walletFormView != null) {
                walletFormView.setKeyListener(new qp5.m(this));
            }
        } else if (walletFormView != null) {
            walletFormView.setInputType(1);
        }
    }
}

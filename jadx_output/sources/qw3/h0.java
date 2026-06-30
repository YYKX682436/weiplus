package qw3;

/* loaded from: classes5.dex */
public class h0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f367163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tenpay.android.wechat.TenpaySecureEditText f367164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qw3.k0 f367165f;

    public h0(qw3.k0 k0Var, android.widget.TextView textView, com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText) {
        this.f367165f = k0Var;
        this.f367163d = textView;
        this.f367164e = tenpaySecureEditText;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) ((android.view.View) obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.widget.TextView textView = this.f367163d;
        if (textView != null) {
            sb6.append(((java.lang.Object) textView.getText()) + ",");
        }
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f367164e;
        if (tenpaySecureEditText != null) {
            sb6.append(((java.lang.Object) tenpaySecureEditText.getText()) + ",");
        }
        qw3.k0 k0Var = this.f367165f;
        sb6.append(k0Var.getString(com.tencent.mm.R.string.aeh));
        if (!walletFormView.isClickable()) {
            sb6.append(k0Var.getString(com.tencent.mm.R.string.l1k));
        }
        return sb6.toString();
    }
}

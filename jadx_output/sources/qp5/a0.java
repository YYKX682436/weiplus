package qp5;

/* loaded from: classes9.dex */
public class a0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public boolean f365830d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.formview.WalletFormView f365831e;

    public a0(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        this.f365831e = walletFormView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        boolean startsWith = obj.startsWith(".");
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = this.f365831e;
        if (startsWith) {
            editable.insert(0, "0");
        } else if (walletFormView.U && com.tencent.mm.wallet_core.ui.formview.WalletFormView.f(obj, walletFormView.f214161h)) {
            return;
        }
        boolean n17 = walletFormView.n();
        qp5.i0 i0Var = walletFormView.f214165n;
        if (i0Var != null) {
            if (n17 != this.f365830d) {
                i0Var.onInputValidChange(n17);
                this.f365830d = walletFormView.n();
            }
            qp5.i0 i0Var2 = walletFormView.f214165n;
        }
        walletFormView.s();
        if (walletFormView.f214173t) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView.a(walletFormView, editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        qp5.k0 k0Var = this.f365831e.f214157d;
        if (k0Var != null) {
            k0Var.a(charSequence);
        }
    }
}

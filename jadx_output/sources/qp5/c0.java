package qp5;

/* loaded from: classes9.dex */
public class c0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.formview.WalletFormView f365833d;

    public c0(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView) {
        this.f365833d = walletFormView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.wallet_core.ui.formview.WalletFormView.a(this.f365833d, editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

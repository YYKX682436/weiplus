package ut4;

/* loaded from: classes9.dex */
public class c implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI f431185d;

    public c(com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI walletPayUStartOpenUI) {
        this.f431185d = walletPayUStartOpenUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI.f181249m;
        this.f431185d.U6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

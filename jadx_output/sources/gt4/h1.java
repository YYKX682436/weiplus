package gt4;

/* loaded from: classes9.dex */
public class h1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView f275445d;

    public h1(com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView) {
        this.f275445d = walletPhoneInputView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(editable.toString());
        com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView = this.f275445d;
        if (K0) {
            walletPhoneInputView.f180717d.setText("");
            walletPhoneInputView.f180717d.setContentTextColorRes(com.tencent.mm.R.color.a0c);
            walletPhoneInputView.f180719f.setTextColor(walletPhoneInputView.getResources().getColor(com.tencent.mm.R.color.a0c));
            return;
        }
        if (!walletPhoneInputView.f180725o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPhoneInputView", "manual pick don't search");
            walletPhoneInputView.f180717d.setContentTextColorRes(com.tencent.mm.R.color.a0c);
            walletPhoneInputView.f180719f.setTextColor(walletPhoneInputView.getResources().getColor(com.tencent.mm.R.color.a0c));
            walletPhoneInputView.f180725o = true;
            return;
        }
        u11.a aVar = (u11.a) ((java.util.HashMap) walletPhoneInputView.f180722i).get(editable.toString());
        editable.toString();
        if (aVar != null) {
            walletPhoneInputView.f180724n = aVar.f423728b;
            java.lang.String str = aVar.f423729c;
            walletPhoneInputView.f180723m = str;
            walletPhoneInputView.f180717d.setText(str);
            walletPhoneInputView.f180717d.setContentTextColorRes(com.tencent.mm.R.color.a0c);
            walletPhoneInputView.f180719f.setTextColor(walletPhoneInputView.getResources().getColor(com.tencent.mm.R.color.a0c));
        } else {
            walletPhoneInputView.f180724n = "";
            walletPhoneInputView.f180723m = "";
            walletPhoneInputView.f180717d.setText(walletPhoneInputView.getContext().getString(com.tencent.mm.R.string.kwl));
        }
        walletPhoneInputView.f180718e.getInputValidChangeListener().onInputValidChange(walletPhoneInputView.f180718e.n());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}

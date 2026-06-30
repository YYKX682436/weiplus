package gt4;

/* loaded from: classes9.dex */
public class i1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView f275451d;

    public i1(com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView) {
        this.f275451d = walletPhoneInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView = this.f275451d;
        if (((u11.a) ((java.util.HashMap) walletPhoneInputView.f180722i).get(walletPhoneInputView.f180719f.getText().toString())) == null) {
            walletPhoneInputView.f180717d.setContentTextColorRes(com.tencent.mm.R.color.f479482a31);
            walletPhoneInputView.f180719f.setTextColor(walletPhoneInputView.getResources().getColor(com.tencent.mm.R.color.f479482a31));
        } else {
            walletPhoneInputView.f180717d.setContentTextColorRes(com.tencent.mm.R.color.a0c);
            walletPhoneInputView.f180719f.setTextColor(walletPhoneInputView.getResources().getColor(com.tencent.mm.R.color.a0c));
        }
    }
}

package gt4;

/* loaded from: classes.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView f275425d;

    public e1(com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView) {
        this.f275425d = walletPhoneInputView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView = this.f275425d;
        java.lang.String str = walletPhoneInputView.f180726p;
        java.lang.String string = walletPhoneInputView.getContext().getString(com.tencent.mm.R.string.kix);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = walletPhoneInputView.getContext().getString(com.tencent.mm.R.string.kiy);
        }
        db5.e1.y(walletPhoneInputView.getContext(), str, string, walletPhoneInputView.getContext().getString(com.tencent.mm.R.string.kmf), new gt4.g1(walletPhoneInputView));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

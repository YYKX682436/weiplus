package gt4;

/* loaded from: classes.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView f275414d;

    public d1(com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView) {
        this.f275414d = walletPhoneInputView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView walletPhoneInputView = this.f275414d;
        intent.setClassName(walletPhoneInputView.getContext(), "com.tencent.mm.ui.tools.CountryCodeUI");
        ((com.tencent.mm.ui.MMActivity) walletPhoneInputView.getContext()).startActivityForResult(intent, com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHN_ABS);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletPhoneInputView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

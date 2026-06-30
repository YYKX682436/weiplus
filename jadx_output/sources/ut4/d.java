package ut4;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI f431186d;

    public d(com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI walletPayUStartOpenUI) {
        this.f431186d = walletPayUStartOpenUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_payu/create/ui/WalletPayUStartOpenUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUStartOpenUI walletPayUStartOpenUI = this.f431186d;
        if (walletPayUStartOpenUI.f181250d.getVisibility() == 0) {
            walletPayUStartOpenUI.getInput().putString("key_mobile", walletPayUStartOpenUI.f181254h);
            walletPayUStartOpenUI.getInput().putString("dial_code", walletPayUStartOpenUI.f181255i);
        }
        walletPayUStartOpenUI.getNetController().d(new java.lang.Object[0]);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_payu/create/ui/WalletPayUStartOpenUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package st4;

/* loaded from: classes9.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI f412614d;

    public e(com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI walletPayUCardElementUI) {
        this.f412614d = walletPayUCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI walletPayUCardElementUI = this.f412614d;
        com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement netScenePayUElementQuery$PayUBankcardElement = (com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery$PayUBankcardElement) walletPayUCardElementUI.f181242p.get(walletPayUCardElementUI.f181233d.getText());
        if (netScenePayUElementQuery$PayUBankcardElement == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPayUCardElementUI", "hy: should not be NULL!!!");
            yj0.a.h(this, "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        walletPayUCardElementUI.f181233d.setEncryptType(50);
        walletPayUCardElementUI.getInput().putParcelable("key_card_element", netScenePayUElementQuery$PayUBankcardElement);
        walletPayUCardElementUI.getInput().putString("key_card_id", walletPayUCardElementUI.f181233d.getText());
        walletPayUCardElementUI.getInput().putString("key_cvv", walletPayUCardElementUI.f181235f.getText());
        walletPayUCardElementUI.getInput().putString("key_expire_data", walletPayUCardElementUI.f181234e.getText());
        walletPayUCardElementUI.getNetController().d(new java.lang.Object[0]);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

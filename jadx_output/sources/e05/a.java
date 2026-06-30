package e05;

/* loaded from: classes9.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI f246170d;

    public a(com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI walletBindDepositUI) {
        this.f246170d = walletBindDepositUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI walletBindDepositUI = this.f246170d;
        java.lang.String text = walletBindDepositUI.f188515d.getText();
        if (com.tencent.mm.sdk.platformtools.t8.K0(text)) {
            yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (walletBindDepositUI.f188519h) {
            walletBindDepositUI.getNetController().f(text);
            walletBindDepositUI.f188519h = false;
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_support_bankcard", 1);
            bundle.putString("key_bank_type", walletBindDepositUI.f188520i.f179659s);
            bundle.putInt("key_bankcard_type", 1);
            com.tencent.mm.wallet_core.a.g(walletBindDepositUI).E(walletBindDepositUI, com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI.class, bundle, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package e05;

/* loaded from: classes9.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI f246196d;

    public y(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI walletWXCreditOpenResultUI) {
        this.f246196d = walletWXCreditOpenResultUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI.f188552e;
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI walletWXCreditOpenResultUI = this.f246196d;
        walletWXCreditOpenResultUI.getNetController().d(java.lang.Boolean.valueOf(walletWXCreditOpenResultUI.f188553d.isChecked()));
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

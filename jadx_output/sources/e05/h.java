package e05;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI f246179d;

    public h(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f246179d = walletWXCreditChangeAmountUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f246179d;
        walletWXCreditChangeAmountUI.f188529i = false;
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI.U6(walletWXCreditChangeAmountUI);
        walletWXCreditChangeAmountUI.showDialog(1);
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

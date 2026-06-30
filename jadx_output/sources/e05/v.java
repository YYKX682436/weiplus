package e05;

/* loaded from: classes8.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI f246193d;

    public v(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI walletWXCreditErrDetailUI) {
        this.f246193d = walletWXCreditErrDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditErrDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI walletWXCreditErrDetailUI = this.f246193d;
        com.tencent.mm.wallet_core.a.d(walletWXCreditErrDetailUI, walletWXCreditErrDetailUI.getInput());
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditErrDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

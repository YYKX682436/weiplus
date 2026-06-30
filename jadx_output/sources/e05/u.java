package e05;

/* loaded from: classes3.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI f246192d;

    public u(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI walletWXCreditErrDetailUI) {
        this.f246192d = walletWXCreditErrDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditErrDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI walletWXCreditErrDetailUI = this.f246192d;
        com.tencent.mm.wallet_core.ui.r1.V(walletWXCreditErrDetailUI, walletWXCreditErrDetailUI.f188550e, false);
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditErrDetailUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

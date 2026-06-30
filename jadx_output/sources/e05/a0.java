package e05;

/* loaded from: classes8.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI f246171d;

    public a0(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI walletWXCreditOpenUI) {
        this.f246171d = walletWXCreditOpenUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI walletWXCreditOpenUI = this.f246171d;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletWXCreditOpenUI.f188555e;
        com.tencent.mm.wallet_core.ui.r1.R(walletWXCreditOpenUI, bankcard.field_bankcardType, bankcard.field_bankName, true, false);
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package e05;

/* loaded from: classes9.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI f246195d;

    public x(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI walletWXCreditOpenNotifyUI) {
        this.f246195d = walletWXCreditOpenNotifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenNotifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenNotifyUI walletWXCreditOpenNotifyUI = this.f246195d;
        bundle.putParcelable("key_bankcard", walletWXCreditOpenNotifyUI.getInput().getParcelable("key_bankcard"));
        com.tencent.mm.wallet_core.a.j(walletWXCreditOpenNotifyUI, c05.c.class, bundle, null);
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenNotifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

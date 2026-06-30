package e05;

/* loaded from: classes9.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI f246189d;

    public r(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI walletWXCreditDetailUI) {
        this.f246189d = walletWXCreditDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        d05.k kVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI walletWXCreditDetailUI = this.f246189d;
        if (id6 == com.tencent.mm.R.id.pfm) {
            d05.k kVar2 = walletWXCreditDetailUI.f188546m;
            if (kVar2 != null) {
                com.tencent.mm.wallet_core.ui.r1.d0(walletWXCreditDetailUI, kVar2.f225608n.f225594a);
            }
        } else if (view.getId() == com.tencent.mm.R.id.pfk && (kVar = walletWXCreditDetailUI.f188546m) != null) {
            com.tencent.mm.wallet_core.ui.r1.V(walletWXCreditDetailUI, kVar.f225607m, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

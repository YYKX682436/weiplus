package e05;

/* loaded from: classes9.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI f246181d;

    public j(com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI) {
        this.f246181d = walletWXCreditChangeAmountUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI walletWXCreditChangeAmountUI = this.f246181d;
        if ((walletWXCreditChangeAmountUI.f188526f == null || walletWXCreditChangeAmountUI.f188527g == null || (walletWXCreditChangeAmountUI.f188537t.getVisibility() == 0 && com.tencent.mm.sdk.platformtools.t8.K0(walletWXCreditChangeAmountUI.f188537t.getText().toString())) || ((walletWXCreditChangeAmountUI.f188538u.getVisibility() == 0 && com.tencent.mm.sdk.platformtools.t8.K0(walletWXCreditChangeAmountUI.f188538u.getText().toString())) || ((walletWXCreditChangeAmountUI.f188535r.getVisibility() == 0 && com.tencent.mm.sdk.platformtools.t8.K0(walletWXCreditChangeAmountUI.f188535r.getText().toString())) || ((walletWXCreditChangeAmountUI.f188539v.getVisibility() == 0 && com.tencent.mm.sdk.platformtools.t8.K0(walletWXCreditChangeAmountUI.f188539v.getText().toString())) || ((walletWXCreditChangeAmountUI.f188540w.getVisibility() == 0 && com.tencent.mm.sdk.platformtools.t8.K0(walletWXCreditChangeAmountUI.f188540w.getText().toString())) || (walletWXCreditChangeAmountUI.f188536s.getVisibility() == 0 && com.tencent.mm.sdk.platformtools.t8.K0(walletWXCreditChangeAmountUI.f188536s.getText().toString()))))))) ? false : true) {
            d05.l lVar = walletWXCreditChangeAmountUI.f188526f;
            if (lVar.f225616h == null) {
                lVar.f225611c = walletWXCreditChangeAmountUI.f188537t.getText().toString();
            } else if (walletWXCreditChangeAmountUI.f188538u.getVisibility() == 0) {
                walletWXCreditChangeAmountUI.f188526f.f225616h.f225611c = walletWXCreditChangeAmountUI.f188538u.getText().toString();
            }
            d05.l lVar2 = walletWXCreditChangeAmountUI.f188527g;
            if (lVar2.f225616h == null) {
                lVar2.f225611c = walletWXCreditChangeAmountUI.f188539v.getText().toString();
            } else if (walletWXCreditChangeAmountUI.f188540w.getVisibility() == 0) {
                walletWXCreditChangeAmountUI.f188527g.f225616h.f225611c = walletWXCreditChangeAmountUI.f188540w.getText().toString();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(walletWXCreditChangeAmountUI.f188526f);
            arrayList2.add(walletWXCreditChangeAmountUI.f188527g);
            walletWXCreditChangeAmountUI.doSceneForceProgress(new d05.c(arrayList2, walletWXCreditChangeAmountUI.getInput().getString("kreq_token"), walletWXCreditChangeAmountUI.getInput().getString("key_bank_type")));
        } else {
            db5.t7.makeText(walletWXCreditChangeAmountUI.getContext(), com.tencent.mm.R.string.l2x, 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

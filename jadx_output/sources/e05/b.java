package e05;

/* loaded from: classes9.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI f246172d;

    public b(com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI walletBindDepositUI) {
        this.f246172d = walletBindDepositUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI walletBindDepositUI = this.f246172d;
        boolean z17 = false;
        if (!walletBindDepositUI.f188515d.n()) {
            db5.t7.makeText(walletBindDepositUI, com.tencent.mm.R.string.f493506ki3, 0).show();
        } else if (!walletBindDepositUI.f188517f.n()) {
            db5.t7.makeText(walletBindDepositUI, com.tencent.mm.R.string.kh_, 0).show();
        } else if (walletBindDepositUI.f188516e.n()) {
            z17 = true;
        } else {
            db5.t7.makeText(walletBindDepositUI, com.tencent.mm.R.string.kim, 0).show();
        }
        if (z17) {
            walletBindDepositUI.getNetController().d(walletBindDepositUI.f188515d.getText(), walletBindDepositUI.f188520i.f179659s, walletBindDepositUI.f188516e.getText(), walletBindDepositUI.f188520i.f179662v, java.lang.Boolean.FALSE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

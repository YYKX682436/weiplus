package e05;

/* loaded from: classes9.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI f246174d;

    public c(com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI walletCheckIdentityUI) {
        this.f246174d = walletCheckIdentityUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletCheckIdentityUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI walletCheckIdentityUI = this.f246174d;
        java.lang.String text = walletCheckIdentityUI.f188521d.getText();
        java.lang.String text2 = walletCheckIdentityUI.f188522e.getText();
        walletCheckIdentityUI.getClass();
        boolean z17 = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(text)) {
            db5.t7.makeText(walletCheckIdentityUI, com.tencent.mm.R.string.kjv, 0).show();
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(text2) || text2.length() < 4 || (com.tencent.mm.sdk.platformtools.t8.K0(walletCheckIdentityUI.f188523f) && !walletCheckIdentityUI.f188522e.n())) {
            db5.t7.makeText(walletCheckIdentityUI, com.tencent.mm.R.string.kia, 0).show();
        } else {
            z17 = true;
        }
        if (z17) {
            walletCheckIdentityUI.getNetController().d(text, text2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletCheckIdentityUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180505d;

    public n2(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180505d = walletCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180505d;
        com.tencent.mm.ui.widget.picker.o oVar = new com.tencent.mm.ui.widget.picker.o(walletCardElementUI.getContext());
        oVar.f212307n = new com.tencent.mm.plugin.wallet_core.ui.m2(this, oVar);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i19 = calendar.get(1);
        int i27 = calendar.get(2) + 1;
        int i28 = calendar.get(5);
        oVar.e(i19, i27, i28);
        java.lang.String obj = walletCardElementUI.G.getContentEt().getText().toString();
        int i29 = walletCardElementUI.f179896b2;
        if (i29 > 0 && (i17 = walletCardElementUI.f179897c2) > 0 && (i18 = walletCardElementUI.f179899d2) > 0) {
            oVar.d(i29, i17, i18);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(obj) && obj.length() == 8) {
            walletCardElementUI.f179896b2 = com.tencent.mm.sdk.platformtools.t8.P(obj.substring(0, 4), i19);
            walletCardElementUI.f179897c2 = com.tencent.mm.sdk.platformtools.t8.P(obj.substring(4, 6), i27);
            walletCardElementUI.f179899d2 = com.tencent.mm.sdk.platformtools.t8.P(obj.substring(6, 8), i28);
            oVar.d(walletCardElementUI.f179896b2, walletCardElementUI.f179897c2, walletCardElementUI.f179899d2);
        }
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

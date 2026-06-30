package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180569d;

    public p2(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180569d = walletCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180569d;
        com.tencent.mm.ui.widget.picker.o oVar = new com.tencent.mm.ui.widget.picker.o(walletCardElementUI.getContext());
        oVar.f212307n = new com.tencent.mm.plugin.wallet_core.ui.o2(this, oVar);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(1);
        int i18 = calendar.get(2) + 1;
        int i19 = calendar.get(5);
        oVar.f(i17, i18, i19);
        oVar.e(i17 + 200, 12, 31);
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = oVar.f212306m;
        if (customDatePickerNew != null) {
            customDatePickerNew.setLongTermYear(true);
        }
        java.lang.String obj = walletCardElementUI.H.getContentEt().getText().toString();
        if (walletCardElementUI.Y1 <= 0 || walletCardElementUI.Z1 <= 0 || walletCardElementUI.f179895a2 <= 0) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(obj) && obj.length() == 8) {
                walletCardElementUI.Y1 = com.tencent.mm.sdk.platformtools.t8.P(obj.substring(0, 4), i17);
                walletCardElementUI.Z1 = com.tencent.mm.sdk.platformtools.t8.P(obj.substring(4, 6), i18);
                walletCardElementUI.f179895a2 = com.tencent.mm.sdk.platformtools.t8.P(obj.substring(6, 8), i19);
            } else if (obj.equals(walletCardElementUI.getString(com.tencent.mm.R.string.l48))) {
                walletCardElementUI.Y1 = 9999;
                walletCardElementUI.Z1 = 12;
                walletCardElementUI.f179895a2 = 31;
            }
        }
        int i27 = walletCardElementUI.Y1;
        if (i27 == 9999) {
            oVar.d(1, 1, 1);
        } else {
            oVar.d(i27, walletCardElementUI.Z1, walletCardElementUI.f179895a2);
        }
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180759d;

    public w1(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180759d = walletCardElementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180759d;
        com.tencent.mm.ui.widget.picker.o oVar = new com.tencent.mm.ui.widget.picker.o(walletCardElementUI.getContext());
        oVar.f212307n = new com.tencent.mm.plugin.wallet_core.ui.v1(this, oVar);
        int i19 = walletCardElementUI.f179901e2;
        if (i19 > 0 && (i17 = walletCardElementUI.f179903f2) > 0 && (i18 = walletCardElementUI.f179905g2) > 0) {
            oVar.d(i19, i17, i18);
        }
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

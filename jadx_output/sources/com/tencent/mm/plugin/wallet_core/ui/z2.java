package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class z2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI f180820d;

    public z2(com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI) {
        this.f180820d = walletCardImportUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI walletCardImportUI = this.f180820d;
        linkedList.add(walletCardImportUI.getString(com.tencent.mm.R.string.f493499kh2));
        linkedList2.add(0);
        com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = walletCardImportUI.f179960z;
        if (elementQuery != null && elementQuery.M) {
            linkedList.add(walletCardImportUI.getString(com.tencent.mm.R.string.f493498kh1));
            linkedList2.add(1);
        }
        db5.e1.b(this.f180820d, "", linkedList, linkedList2, "", new com.tencent.mm.plugin.wallet_core.ui.y2(this));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

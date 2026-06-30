package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI f180301d;

    public h3(com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI walletCardSelectUI) {
        this.f180301d = walletCardSelectUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI.f179961s;
        this.f180301d.U6(true);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

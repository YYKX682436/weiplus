package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI f180328d;

    public i3(com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI walletCardSelectUI) {
        this.f180328d = walletCardSelectUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI.f179961s;
        this.f180328d.U6(false);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardSelectUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

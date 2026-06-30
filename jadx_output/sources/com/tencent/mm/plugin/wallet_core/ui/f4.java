package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes3.dex */
public class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI f180266d;

    public f4(com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI walletConfirmCardIDUI) {
        this.f180266d = walletConfirmCardIDUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f180266d.hideTenpayKB();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

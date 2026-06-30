package com.tencent.mm.wallet_core.ui;

/* loaded from: classes3.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.WalletBaseUI f214139d;

    public f0(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        this.f214139d = walletBaseUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/WalletBaseUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f214139d.hideTenpayKB();
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/WalletBaseUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

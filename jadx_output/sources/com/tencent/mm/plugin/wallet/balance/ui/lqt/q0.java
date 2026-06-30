package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f178330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178331e;

    public q0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, android.view.ViewGroup viewGroup) {
        this.f178331e = walletLqtDetailUI;
        this.f178330d = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wallet_core.ui.r1.X(this.f178331e, (java.lang.String) this.f178330d.getTag(), false);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

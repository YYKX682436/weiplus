package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout f178361d;

    public s(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout walletLqtArriveTimeLayout) {
        this.f178361d = walletLqtArriveTimeLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtArriveTimeLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout walletLqtArriveTimeLayout = this.f178361d;
        java.util.Iterator it = ((java.util.ArrayList) walletLqtArriveTimeLayout.f177927e).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() != null && ((com.tencent.mm.plugin.wallet.balance.ui.lqt.u) weakReference.get()).f178387c.isEnabled()) {
                ((com.tencent.mm.plugin.wallet.balance.ui.lqt.u) weakReference.get()).f178387c.setChecked(false);
            }
        }
        com.tencent.mm.plugin.wallet.balance.ui.lqt.u uVar = (com.tencent.mm.plugin.wallet.balance.ui.lqt.u) view.getTag();
        java.util.List list = walletLqtArriveTimeLayout.f177926d;
        if (list == null || ((java.util.ArrayList) list).size() <= uVar.f178389e) {
            walletLqtArriveTimeLayout.f177928f = null;
        } else {
            uVar.f178387c.setChecked(true);
            walletLqtArriveTimeLayout.f177928f = (r45.bn5) ((java.util.ArrayList) walletLqtArriveTimeLayout.f177926d).get(uVar.f178389e);
        }
        walletLqtArriveTimeLayout.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtArriveTimeLayout", "click item: %s, %s", java.lang.Integer.valueOf(uVar.f178389e), uVar.f178385a.getText());
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtArriveTimeLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

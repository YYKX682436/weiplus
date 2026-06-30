package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178183d;

    public g3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI) {
        this.f178183d = walletLqtPlanAddUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hs4.d dVar = this.f178183d.Z;
        if (dVar != null) {
            dVar.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.i1 f178765d;

    public g1(com.tencent.mm.plugin.wallet.pay.ui.i1 i1Var) {
        this.f178765d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.pay.ui.i1 i1Var = this.f178765d;
        com.tencent.mars.xlog.Log.i(i1Var.f178771a.f178774d.f178712d, "Balance amount not meet, after favor selection! payWithNewBankcard");
        i1Var.f178771a.f178774d.n7(false, 0, "");
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class c5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n85 f178118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.d5 f178119e;

    public c5(com.tencent.mm.plugin.wallet.balance.ui.lqt.d5 d5Var, r45.n85 n85Var) {
        this.f178119e = d5Var;
        this.f178118d = n85Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI walletLqtPlanHomeUI = this.f178119e.f178148k;
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI.f178023s;
        walletLqtPlanHomeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanHomeUI", "go to Plan DetailUI");
        android.content.Intent intent = new android.content.Intent(walletLqtPlanHomeUI, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanDetailUI.class);
        intent.putExtra("key_plan_item_detail", com.tencent.mm.plugin.wallet.balance.model.lqt.u.t(this.f178118d));
        walletLqtPlanHomeUI.startActivityForResult(intent, 5);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

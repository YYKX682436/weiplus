package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class q2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f178333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f178334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f178335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178336g;

    public q2(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, org.json.JSONObject jSONObject, r45.du4 du4Var, android.view.ViewGroup viewGroup) {
        this.f178336g = walletLqtDetailUI;
        this.f178333d = jSONObject;
        this.f178334e = du4Var;
        this.f178335f = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "go to lqt make plan");
        r45.du4 du4Var = this.f178334e;
        android.view.ViewGroup viewGroup = this.f178335f;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178336g;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.U6(walletLqtDetailUI, this.f178333d, du4Var, viewGroup);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22449, 2);
        ((h45.q) i95.n0.c(h45.q.class)).startLqtFixedDepositMakePlanUseCase(walletLqtDetailUI.getContext(), new android.os.Bundle());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

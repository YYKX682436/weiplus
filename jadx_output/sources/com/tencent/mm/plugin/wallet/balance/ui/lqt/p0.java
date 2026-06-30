package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f178311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f178312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f178313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178314g;

    public p0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, org.json.JSONObject jSONObject, r45.du4 du4Var, android.view.ViewGroup viewGroup) {
        this.f178314g = walletLqtDetailUI;
        this.f178311d = jSONObject;
        this.f178312e = du4Var;
        this.f178313f = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        org.json.JSONObject jSONObject = this.f178311d;
        android.view.ViewGroup viewGroup = this.f178313f;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178314g;
        r45.du4 du4Var = this.f178312e;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.U6(walletLqtDetailUI, jSONObject, du4Var, viewGroup);
        com.tencent.mm.wallet_core.ui.r1.b0(du4Var.f372753i, du4Var.f372750f, 0, 1061);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16807, 2, 2, du4Var.f372750f, du4Var.f372753i);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

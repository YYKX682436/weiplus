package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f178293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f178294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f178295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178296g;

    public o0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, org.json.JSONObject jSONObject, r45.du4 du4Var, android.view.ViewGroup viewGroup) {
        this.f178296g = walletLqtDetailUI;
        this.f178293d = jSONObject;
        this.f178294e = du4Var;
        this.f178295f = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        org.json.JSONObject jSONObject = this.f178293d;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178296g;
        r45.du4 du4Var = this.f178294e;
        android.view.ViewGroup viewGroup = this.f178295f;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.U6(walletLqtDetailUI, jSONObject, du4Var, viewGroup);
        com.tencent.mm.wallet_core.ui.r1.X(walletLqtDetailUI, (java.lang.String) viewGroup.getTag(), false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16807, 2, 2, du4Var.f372750f);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

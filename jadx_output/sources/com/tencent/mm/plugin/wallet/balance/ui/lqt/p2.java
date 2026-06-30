package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes3.dex */
public class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f178316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f178317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f178318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178319g;

    public p2(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, org.json.JSONObject jSONObject, r45.du4 du4Var, android.view.ViewGroup viewGroup) {
        this.f178319g = walletLqtDetailUI;
        this.f178316d = jSONObject;
        this.f178317e = du4Var;
        this.f178318f = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "go to lqt auto charge home");
        org.json.JSONObject jSONObject = this.f178316d;
        android.view.ViewGroup viewGroup = this.f178318f;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI = this.f178319g;
        r45.du4 du4Var = this.f178317e;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.U6(walletLqtDetailUI, jSONObject, du4Var, viewGroup);
        android.content.Intent intent = new android.content.Intent(walletLqtDetailUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI.class);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI2 = this.f178319g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(walletLqtDetailUI2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        walletLqtDetailUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(walletLqtDetailUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16807, 2, 1, "", "", java.lang.Integer.valueOf(du4Var.f372751g));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f178249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.du4 f178250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f178251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI f178252g;

    public l0(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI walletLqtDetailUI, org.json.JSONObject jSONObject, r45.du4 du4Var, android.view.ViewGroup viewGroup) {
        this.f178252g = walletLqtDetailUI;
        this.f178249d = jSONObject;
        this.f178250e = du4Var;
        this.f178251f = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtDetailUI", "go to lqt hhc make plan");
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.U6(this.f178252g, this.f178249d, this.f178250e, this.f178251f);
        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("HHCMakePlanUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.mm.plugin.wallet.balance.ui.lqt.k0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

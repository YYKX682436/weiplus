package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes4.dex */
public class an implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f146720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.bn f146721e;

    public an(com.tencent.mm.plugin.luckymoney.ui.bn bnVar, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, int i17) {
        this.f146721e = bnVar;
        this.f146720d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22302, 3);
        com.tencent.mm.plugin.luckymoney.ui.bn bnVar = this.f146721e;
        android.content.Intent intent = new android.content.Intent(bnVar.f146766g.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI.class);
        if (this.f146720d == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "click HistoryEnvelopeEntranceVH: %s", java.lang.Integer.valueOf(bnVar.getLayoutPosition()));
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = bnVar.f146766g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(luckyMoneyPickEnvelopeUI, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyPickEnvelopeUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(luckyMoneyPickEnvelopeUI, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$HistoryEnvelopeEntranceVH$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

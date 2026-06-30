package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class gc extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        super(false);
        this.f146940d = luckyMoneyNewPrepareUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146940d;
        g0Var.d(11701, 4, 0, 0, java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.k7()), 9);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(luckyMoneyNewPrepareUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI.class);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = this.f146940d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyNewPrepareUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$onSceneEnd$9", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyNewPrepareUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyNewPrepareUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewPrepareUI$onSceneEnd$9", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

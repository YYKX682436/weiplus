package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f146926d;

    public g3(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f146926d = luckyMoneyDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f146926d;
        com.tencent.mm.plugin.wallet_core.utils.n nVar = luckyMoneyDetailUI.f146081n2;
        if (nVar == null) {
            luckyMoneyDetailUI.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (!com.tencent.mm.plugin.wallet_core.utils.l0.d(nVar)) {
            luckyMoneyDetailUI.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            luckyMoneyDetailUI.f146084o2.b(luckyMoneyDetailUI.f146081n2, new com.tencent.mm.plugin.luckymoney.ui.f3(this));
            luckyMoneyDetailUI.f146081n2 = null;
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}

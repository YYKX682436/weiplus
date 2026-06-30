package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public class ag implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f146711d;

    public ag(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f146711d = luckyMoneyNewYearReceiveUIV2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "goto detail!");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f146711d;
        intent.putExtra("key_native_url", luckyMoneyNewYearReceiveUIV2.Q);
        j45.l.j(luckyMoneyNewYearReceiveUIV2.getContext(), "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

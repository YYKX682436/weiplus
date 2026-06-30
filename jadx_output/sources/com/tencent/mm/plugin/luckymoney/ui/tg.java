package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class tg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147461d;

    public tg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f147461d = luckyMoneyNewYearReceiveUIV2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f147461d;
        luckyMoneyNewYearReceiveUIV2.finish();
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.Y1;
        luckyMoneyNewYearReceiveUIV2.d7(6);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

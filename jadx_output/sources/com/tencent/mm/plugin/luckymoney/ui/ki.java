package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ki implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147108d;

    public ki(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147108d = luckyMoneyNewYearSendUIV2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147108d;
        fc3.j.a(luckyMoneyNewYearSendUIV2.getContext(), luckyMoneyNewYearSendUIV2.S1);
        luckyMoneyNewYearSendUIV2.T1.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

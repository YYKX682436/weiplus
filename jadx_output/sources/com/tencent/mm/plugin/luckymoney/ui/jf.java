package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class jf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI f147058d;

    public jf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI) {
        this.f147058d = luckyMoneyNewYearReceiveUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.P;
        this.f147058d.Y6();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

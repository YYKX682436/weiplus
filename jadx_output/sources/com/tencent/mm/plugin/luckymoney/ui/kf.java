package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public class kf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI f147105d;

    public kf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI) {
        this.f147105d = luckyMoneyNewYearReceiveUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f147105d.finish();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13079, 6, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

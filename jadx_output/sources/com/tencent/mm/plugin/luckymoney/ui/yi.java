package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class yi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI f147743d;

    public yi(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI luckyMoneyNewYearStateReceiveUI) {
        this.f147743d = luckyMoneyNewYearStateReceiveUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearStateReceiveUI$initViewOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("msg", "user close");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearStateReceiveUI luckyMoneyNewYearStateReceiveUI = this.f147743d;
        luckyMoneyNewYearStateReceiveUI.setResult(-1, intent);
        luckyMoneyNewYearStateReceiveUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearStateReceiveUI$initViewOnCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

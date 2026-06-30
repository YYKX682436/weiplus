package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class s7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147411d;

    public s7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147411d = luckyMoneyNewDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$addOptionsMenuIfNeed$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gb3.o.f270035a.a(7);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147411d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) luckyMoneyNewDetailUI, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.luckymoney.ui.q7(luckyMoneyNewDetailUI);
        k0Var.f211881s = new com.tencent.mm.plugin.luckymoney.ui.r7(luckyMoneyNewDetailUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$addOptionsMenuIfNeed$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

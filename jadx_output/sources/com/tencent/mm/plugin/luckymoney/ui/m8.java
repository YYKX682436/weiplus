package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class m8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147171d;

    public m8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147171d = luckyMoneyNewDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147171d;
        com.tencent.mm.plugin.wallet_core.utils.n nVar = luckyMoneyNewDetailUI.f146205n2;
        if (nVar == null) {
            luckyMoneyNewDetailUI.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            if (!com.tencent.mm.plugin.wallet_core.utils.l0.d(nVar)) {
                luckyMoneyNewDetailUI.finish();
                yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.tencent.mm.plugin.wallet_core.utils.l0 l0Var = luckyMoneyNewDetailUI.f146208o2;
            if (l0Var != null) {
                l0Var.b(luckyMoneyNewDetailUI.f146205n2, new com.tencent.mm.plugin.luckymoney.ui.l8(luckyMoneyNewDetailUI));
            }
            luckyMoneyNewDetailUI.f146205n2 = null;
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}

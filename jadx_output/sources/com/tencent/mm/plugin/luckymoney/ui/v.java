package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class v extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f147519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI f147520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        super(false);
        this.f147520e = luckyMoneyBusiDetailUI;
        this.f147519d = e1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i17 = this.f147519d.f145233J;
        int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI.P;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = this.f147520e;
        luckyMoneyBusiDetailUI.getClass();
        g0Var.d(11701, java.lang.Integer.valueOf(i17 == 2 ? 13 : 7), 0, 0, 0, 4);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(luckyMoneyBusiDetailUI.getContext(), com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.class);
        intent.putExtra("key_type", 2);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI2 = this.f147520e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(luckyMoneyBusiDetailUI2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$14", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        luckyMoneyBusiDetailUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(luckyMoneyBusiDetailUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$14", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}

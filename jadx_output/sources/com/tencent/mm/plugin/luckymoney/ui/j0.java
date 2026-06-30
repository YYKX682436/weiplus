package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI f147038d;

    public j0(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI) {
        this.f147038d = luckyMoneyBusiReceiveUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11701, 10, 0, 0, 0, 2);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = this.f147038d;
        if (luckyMoneyBusiReceiveUI.f146022z.isChecked()) {
            g0Var.d(13050, java.lang.Integer.valueOf(luckyMoneyBusiReceiveUI.F), 2, luckyMoneyBusiReceiveUI.G.f145628w);
        } else {
            g0Var.d(13050, java.lang.Integer.valueOf(luckyMoneyBusiReceiveUI.F), 2, "");
        }
        java.lang.String stringExtra = luckyMoneyBusiReceiveUI.getIntent().getStringExtra("key_username");
        com.tencent.mm.plugin.luckymoney.model.s5 s5Var = luckyMoneyBusiReceiveUI.G;
        luckyMoneyBusiReceiveUI.doSceneProgress(new com.tencent.mm.plugin.luckymoney.model.r5(s5Var.f145617i, s5Var.f145616h, s5Var.f145618m, luckyMoneyBusiReceiveUI.getIntent().getStringExtra("packageExt"), stringExtra), false);
        luckyMoneyBusiReceiveUI.f146010n.setVisibility(8);
        com.tencent.mm.plugin.luckymoney.model.m5.G(luckyMoneyBusiReceiveUI.f146011o, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

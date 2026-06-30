package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class qg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147350d;

    public qg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f147350d = luckyMoneyNewYearReceiveUIV2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click voicePlayer");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f147350d;
        if (luckyMoneyNewYearReceiveUIV2.A1) {
            luckyMoneyNewYearReceiveUIV2.f7(true);
        } else {
            int i17 = luckyMoneyNewYearReceiveUIV2.M1;
            if (i17 == 3) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.V6(luckyMoneyNewYearReceiveUIV2);
            } else if (i17 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "voice is downloading");
                luckyMoneyNewYearReceiveUIV2.N1 = true;
                com.tencent.mm.ui.widget.dialog.u3 u3Var = luckyMoneyNewYearReceiveUIV2.A;
                if (u3Var != null) {
                    u3Var.show();
                }
            } else if (i17 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "voice down fail");
                db5.t7.m(luckyMoneyNewYearReceiveUIV2.getContext(), luckyMoneyNewYearReceiveUIV2.getContext().getResources().getString(com.tencent.mm.R.string.f492419gk4));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

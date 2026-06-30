package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class uf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.f6 f147501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147502e;

    public uf(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, com.tencent.mm.plugin.luckymoney.model.f6 f6Var) {
        this.f147502e = luckyMoneyNewYearReceiveUIV2;
        this.f147501d = f6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.Y1;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f147502e;
        if (luckyMoneyNewYearReceiveUIV2.isFinishing() || luckyMoneyNewYearReceiveUIV2.isDestroyed()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "this activity has finished");
            return;
        }
        com.tencent.mm.plugin.luckymoney.model.f6 f6Var = this.f147501d;
        java.lang.String o17 = com.tencent.mm.wallet_core.ui.r1.o(f6Var.f145280h.f145245q / 100.0d);
        android.view.View findViewById = luckyMoneyNewYearReceiveUIV2.findViewById(com.tencent.mm.R.id.j4g);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "doUpdateAmount", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2", "doUpdateAmount", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneOpenLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        luckyMoneyNewYearReceiveUIV2.f146346n.setVisibility(0);
        luckyMoneyNewYearReceiveUIV2.f146345m.setVisibility(0);
        luckyMoneyNewYearReceiveUIV2.f146345m.setContentDescription(o17);
        luckyMoneyNewYearReceiveUIV2.f146345m.setFinalText(o17);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = luckyMoneyNewYearReceiveUIV2.f146345m;
        luckyMoneyAutoScrollView.f145971x = new com.tencent.mm.plugin.luckymoney.ui.ig(luckyMoneyNewYearReceiveUIV2, f6Var);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.j(luckyMoneyAutoScrollView));
    }
}

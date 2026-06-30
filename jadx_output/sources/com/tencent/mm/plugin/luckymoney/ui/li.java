package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class li implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147149d;

    public li(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147149d = luckyMoneyNewYearSendUIV2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147149d;
        java.lang.String d17 = com.tencent.mm.plugin.luckymoney.model.e5.d(luckyMoneyNewYearSendUIV2.J1, luckyMoneyNewYearSendUIV2.C1);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            luckyMoneyNewYearSendUIV2.d7(6);
            return;
        }
        android.view.View view = luckyMoneyNewYearSendUIV2.f146438x0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = luckyMoneyNewYearSendUIV2.f146413m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = luckyMoneyNewYearSendUIV2.f146417o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$30", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (luckyMoneyNewYearSendUIV2.C1.equals("loop")) {
            if (luckyMoneyNewYearSendUIV2.f146442y0.getVisibility() == 0) {
                com.tencent.mm.plugin.luckymoney.model.e5.m(luckyMoneyNewYearSendUIV2.C1, d17, luckyMoneyNewYearSendUIV2.f146442y0, luckyMoneyNewYearSendUIV2.f146411l1, luckyMoneyNewYearSendUIV2.f146421p1, luckyMoneyNewYearSendUIV2.f146439x1);
                return;
            } else {
                com.tencent.mm.plugin.luckymoney.model.e5.m(luckyMoneyNewYearSendUIV2.C1, d17, luckyMoneyNewYearSendUIV2.f146411l1, luckyMoneyNewYearSendUIV2.f146442y0, luckyMoneyNewYearSendUIV2.f146421p1, luckyMoneyNewYearSendUIV2.f146439x1);
                return;
            }
        }
        if (luckyMoneyNewYearSendUIV2.f146442y0.getVisibility() == 0) {
            com.tencent.mm.plugin.luckymoney.model.e5.m(luckyMoneyNewYearSendUIV2.C1, d17, luckyMoneyNewYearSendUIV2.f146411l1, luckyMoneyNewYearSendUIV2.f146442y0, luckyMoneyNewYearSendUIV2.f146421p1, luckyMoneyNewYearSendUIV2.f146439x1);
        } else {
            com.tencent.mm.plugin.luckymoney.model.e5.m(luckyMoneyNewYearSendUIV2.C1, d17, luckyMoneyNewYearSendUIV2.f146442y0, luckyMoneyNewYearSendUIV2.f146411l1, luckyMoneyNewYearSendUIV2.f146421p1, luckyMoneyNewYearSendUIV2.f146439x1);
        }
    }
}

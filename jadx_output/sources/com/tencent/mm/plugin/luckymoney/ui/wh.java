package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class wh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147653d;

    public wh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147653d = luckyMoneyNewYearSendUIV2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147653d;
        luckyMoneyNewYearSendUIV2.L.setVisibility(0);
        luckyMoneyNewYearSendUIV2.E.setVisibility(0);
        luckyMoneyNewYearSendUIV2.M.setVisibility(0);
        luckyMoneyNewYearSendUIV2.D.setVisibility(0);
        android.view.View view = luckyMoneyNewYearSendUIV2.f146445z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$18", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$18", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        luckyMoneyNewYearSendUIV2.f146396J.setVisibility(0);
        luckyMoneyNewYearSendUIV2.K.setVisibility(8);
        luckyMoneyNewYearSendUIV2.T.setVisibility(8);
        luckyMoneyNewYearSendUIV2.X.setVisibility(8);
        if (!luckyMoneyNewYearSendUIV2.g7()) {
            luckyMoneyNewYearSendUIV2.Y.setChecked(true);
            luckyMoneyNewYearSendUIV2.R.setVisibility(0);
        }
        luckyMoneyNewYearSendUIV2.r7(true, luckyMoneyNewYearSendUIV2.L);
        luckyMoneyNewYearSendUIV2.r7(true, luckyMoneyNewYearSendUIV2.N);
    }
}

package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class gg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f146948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f146949e;

    public gg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, int i17) {
        this.f146949e = luckyMoneyNewYearReceiveUIV2;
        this.f146948d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f146949e;
        int i17 = this.f146948d;
        if (i17 == 0) {
            android.view.View view = luckyMoneyNewYearReceiveUIV2.F;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            luckyMoneyNewYearReceiveUIV2.E.setVisibility(0);
            luckyMoneyNewYearReceiveUIV2.b7();
            return;
        }
        if (i17 == 1) {
            android.view.View view2 = luckyMoneyNewYearReceiveUIV2.F;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            luckyMoneyNewYearReceiveUIV2.E.setVisibility(8);
            android.view.View view3 = luckyMoneyNewYearReceiveUIV2.R;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            luckyMoneyNewYearReceiveUIV2.S.setVisibility(0);
            com.tencent.mm.view.MMPAGView mMPAGView = luckyMoneyNewYearReceiveUIV2.S;
            if (mMPAGView != null) {
                mMPAGView.post(new com.tencent.mm.plugin.luckymoney.ui.fg(luckyMoneyNewYearReceiveUIV2, "start"));
                return;
            }
            return;
        }
        if (i17 == 2) {
            android.view.View view4 = luckyMoneyNewYearReceiveUIV2.F;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            luckyMoneyNewYearReceiveUIV2.E.setVisibility(8);
            luckyMoneyNewYearReceiveUIV2.b7();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2.W6(luckyMoneyNewYearReceiveUIV2);
            return;
        }
        if (i17 != 3) {
            return;
        }
        android.view.View view5 = luckyMoneyNewYearReceiveUIV2.F;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        luckyMoneyNewYearReceiveUIV2.E.setVisibility(8);
        luckyMoneyNewYearReceiveUIV2.G.setVisibility(8);
        luckyMoneyNewYearReceiveUIV2.f146356v.setVisibility(0);
        luckyMoneyNewYearReceiveUIV2.f146357w.setImageResource(com.tencent.mm.R.raw.lucky_money_newyear_creat_loading);
        luckyMoneyNewYearReceiveUIV2.f146357w.setImageResource(com.tencent.mm.R.drawable.aml);
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        luckyMoneyNewYearReceiveUIV2.f146357w.startAnimation(rotateAnimation);
        luckyMoneyNewYearReceiveUIV2.S1.alive();
        com.tencent.mm.plugin.luckymoney.model.s4 s4Var = luckyMoneyNewYearReceiveUIV2.V;
        com.tencent.mm.plugin.luckymoney.model.e5.b(s4Var.f145604d, s4Var.f145605e);
    }
}

package ub3;

/* loaded from: classes15.dex */
public class e implements ub3.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI f426098a;

    public e(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI) {
        this.f426098a = luckyMoneyF2FQRCodeUI;
    }

    public void a(android.animation.ValueAnimator valueAnimator, android.view.View view) {
        float f17;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = this.f426098a;
        if (floatValue == 0.0f) {
            luckyMoneyF2FQRCodeUI.N = view.getTranslationX();
            luckyMoneyF2FQRCodeUI.P = view.getTranslationY();
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.j1z);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        float f18 = 1.0f - floatValue;
        view.setTranslationX(luckyMoneyF2FQRCodeUI.N * f18);
        view.setTranslationY((luckyMoneyF2FQRCodeUI.P * f18) - ((luckyMoneyF2FQRCodeUI.f145093z.getHeight() + (luckyMoneyF2FQRCodeUI.P * 8.0f)) * floatValue));
        float f19 = (0.5f * floatValue) + 1.0f;
        view.setScaleX(f19);
        view.setScaleY(f19);
        android.util.Pair pair = (android.util.Pair) ((java.util.LinkedList) luckyMoneyF2FQRCodeUI.f145085v).peek();
        if (pair != null && !com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyF2FQRCodeUI.L) && luckyMoneyF2FQRCodeUI.L.equals(pair.first)) {
            android.view.View view2 = luckyMoneyF2FQRCodeUI.E;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mars.xlog.Log.i("LuckyMoneyF2FQRCodeUI", "fireworkBottomLayer %f", java.lang.Float.valueOf(floatValue));
        if (floatValue >= 0.9f) {
            float f27 = f18 * 10.0f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(f27));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view3 = luckyMoneyF2FQRCodeUI.f145072i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(1.0f - f27));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            luckyMoneyF2FQRCodeUI.f145072i.setScaleX(floatValue);
            luckyMoneyF2FQRCodeUI.f145072i.setScaleY(floatValue);
            android.view.View view4 = luckyMoneyF2FQRCodeUI.f145072i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f17 = 1.0f;
        } else {
            f17 = 1.0f;
        }
        if (floatValue == f17) {
            luckyMoneyF2FQRCodeUI.H.a("packet_received.m4a");
            com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = luckyMoneyF2FQRCodeUI.f145093z;
            shuffleView.removeView(shuffleView.getExitView());
            luckyMoneyF2FQRCodeUI.f145074m = (android.widget.ImageView) luckyMoneyF2FQRCodeUI.f145072i.findViewById(com.tencent.mm.R.id.j67);
            luckyMoneyF2FQRCodeUI.f145075n = (android.widget.TextView) luckyMoneyF2FQRCodeUI.f145072i.findViewById(com.tencent.mm.R.id.j68);
            luckyMoneyF2FQRCodeUI.f145076o = (android.widget.TextView) luckyMoneyF2FQRCodeUI.f145072i.findViewById(com.tencent.mm.R.id.j5p);
            android.util.Pair pair2 = (android.util.Pair) ((java.util.LinkedList) luckyMoneyF2FQRCodeUI.f145085v).poll();
            if (pair2 != null) {
                com.tencent.mm.plugin.luckymoney.model.m5.b(luckyMoneyF2FQRCodeUI.f145074m, null, (java.lang.String) pair2.first);
                com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyF2FQRCodeUI, luckyMoneyF2FQRCodeUI.f145075n, com.tencent.mm.plugin.luckymoney.model.m5.m((java.lang.String) pair2.first));
                luckyMoneyF2FQRCodeUI.f145076o.setText(com.tencent.mm.wallet_core.ui.r1.o(((java.lang.Integer) pair2.second).intValue() / 100.0d));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyF2FQRCodeUI.L) && luckyMoneyF2FQRCodeUI.L.equals(pair2.first)) {
                    e51.a.a(luckyMoneyF2FQRCodeUI.C, luckyMoneyF2FQRCodeUI.D1).d(800, 100L);
                    e51.a.a(luckyMoneyF2FQRCodeUI.D, luckyMoneyF2FQRCodeUI.E1).d(800, 100L);
                    luckyMoneyF2FQRCodeUI.H.a("most_lucky.m4a");
                    if (((java.lang.Integer) pair2.second).intValue() >= 19000) {
                        luckyMoneyF2FQRCodeUI.H.a("whistle.m4a");
                    }
                }
            }
            luckyMoneyF2FQRCodeUI.M.start();
        }
    }
}

package ec3;

/* loaded from: classes2.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ec3.r1 f251087a = new ec3.r1();

    public static void a(ec3.r1 r1Var, android.view.View view, float f17, float f18, yz5.a aVar, int i17, java.lang.Object obj) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator withEndAction;
        if ((i17 & 8) != 0) {
            aVar = null;
        }
        r1Var.getClass();
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil", "doAlphaAnimation", "(Landroid/view/View;FFLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil", "doAlphaAnimation", "(Landroid/view/View;FFLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (f18 > 0.0f) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil", "doAlphaAnimation", "(Landroid/view/View;FFLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil", "doAlphaAnimation", "(Landroid/view/View;FFLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewPropertyAnimator animate = view.animate();
        if (animate == null || (alpha = animate.alpha(f18)) == null || (duration = alpha.setDuration(150L)) == null || (interpolator = duration.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator())) == null || (withEndAction = interpolator.withEndAction(new ec3.m1(f18, view, aVar))) == null) {
            return;
        }
        withEndAction.start();
    }

    public final void b(android.widget.RelativeLayout relativeLayout, float f17, yz5.a aVar) {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (relativeLayout == null || (layoutParams = relativeLayout.getLayoutParams()) == null) {
            return;
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        float f18 = 0.0f;
        if (f17 > 0.0f) {
            c0Var.f310112d = true;
        } else {
            float f19 = layoutParams.height;
            c0Var.f310112d = false;
            f18 = f19;
            f17 = 0.0f;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f18, f17);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new ec3.n1(layoutParams, relativeLayout, c0Var));
        ofFloat.addListener(new ec3.o1(c0Var, relativeLayout, aVar));
        ofFloat.start();
    }

    public final void c(android.view.View view, ec3.m mVar, android.content.Context context, yz5.a aVar) {
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator interpolator;
        android.view.ViewPropertyAnimator withEndAction;
        android.view.ViewPropertyAnimator translationY2;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator interpolator2;
        android.view.ViewPropertyAnimator withEndAction2;
        if (view == null || context == null) {
            return;
        }
        float f17 = -i65.a.b(context, 6);
        int i17 = mVar == null ? -1 : ec3.l1.f251049a[mVar.ordinal()];
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            if (!(view.getTranslationY() == 0.0f)) {
                view.setTranslationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            if (animate == null || (translationY2 = animate.translationY(f17)) == null || (alpha2 = translationY2.alpha(0.0f)) == null || (duration2 = alpha2.setDuration(200L)) == null || (interpolator2 = duration2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator())) == null || (withEndAction2 = interpolator2.withEndAction(new ec3.q1(view, aVar))) == null) {
                return;
            }
            withEndAction2.start();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil", "doTranslateAnimation", "(Landroid/view/View;Lcom/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$AnimatorDirection;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil", "doTranslateAnimation", "(Landroid/view/View;Lcom/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$AnimatorDirection;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        if (!(view.getTranslationY() == f17)) {
            view.setTranslationY(f17);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil", "doTranslateAnimation", "(Landroid/view/View;Lcom/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$AnimatorDirection;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil", "doTranslateAnimation", "(Landroid/view/View;Lcom/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$AnimatorDirection;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewPropertyAnimator animate2 = view.animate();
        if (animate2 == null || (translationY = animate2.translationY(0.0f)) == null || (alpha = translationY.alpha(1.0f)) == null || (duration = alpha.setDuration(230L)) == null || (interpolator = duration.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator())) == null || (withEndAction = interpolator.withEndAction(new ec3.p1(aVar))) == null) {
            return;
        }
        withEndAction.start();
    }
}

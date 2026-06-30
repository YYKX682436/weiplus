package jq4;

/* loaded from: classes2.dex */
public final class u implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f301200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301203g;

    public u(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.view.View view, android.view.View view2, android.view.View view3) {
        this.f301200d = weImageView;
        this.f301201e = view;
        this.f301202f = view2;
        this.f301203g = view3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        android.view.View view;
        kotlin.jvm.internal.o.g(animator, "animator");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f301200d;
        if (weImageView != null) {
            java.lang.Object animatedValue = animator.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            weImageView.setAlpha(((java.lang.Float) animatedValue).floatValue());
        }
        android.view.View view2 = this.f301201e;
        if (view2 != null) {
            java.lang.Object animatedValue2 = animator.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((java.lang.Float) animatedValue2).floatValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view3 = this.f301202f;
        if (view3 != null) {
            java.lang.Object animatedValue3 = animator.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
            float floatValue2 = ((java.lang.Float) animatedValue3).floatValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(floatValue2));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view4 = this.f301203g;
        if (view4 != null) {
            java.lang.Object animatedValue4 = animator.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
            float floatValue3 = ((java.lang.Float) animatedValue4).floatValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(floatValue3));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (view3 == null) {
            view = view4;
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            view = view4;
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (weImageView != null) {
            weImageView.setVisibility(0);
        }
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager$showRejectCard$fadeInAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

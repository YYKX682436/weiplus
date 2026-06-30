package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class dd implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC f134135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134137g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f134138h;

    public dd(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC, android.view.View view2, int i17, int i18) {
        this.f134134d = view;
        this.f134135e = finderFeedMegaVideoBtnAnimUIC;
        this.f134136f = view2;
        this.f134137g = i17;
        this.f134138h = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        float animatedFraction = anim.getAnimatedFraction();
        android.view.View view = this.f134134d;
        float width = view.getWidth();
        int width2 = view.getWidth();
        com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = this.f134135e;
        float f17 = width - ((width2 - finderFeedMegaVideoBtnAnimUIC.f133558f) * animatedFraction);
        android.view.View view2 = this.f134136f;
        view2.getLayoutParams().width = (int) f17;
        view2.requestLayout();
        view2.setBackgroundColor(com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.O6(finderFeedMegaVideoBtnAnimUIC, animatedFraction, this.f134137g, this.f134138h));
        if (animatedFraction >= 1.0f) {
            android.view.View view3 = this.f134134d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startDisappearAnim$1$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startDisappearAnim$1$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

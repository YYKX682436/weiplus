package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class zc implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC f136677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136679f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f136680g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f136681h;

    public zc(com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC, android.view.View view, android.view.View view2, int i17, int i18) {
        this.f136677d = finderFeedMegaVideoBtnAnimUIC;
        this.f136678e = view;
        this.f136679f = view2;
        this.f136680g = i17;
        this.f136681h = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        float animatedFraction = anim.getAnimatedFraction();
        com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = this.f136677d;
        float f17 = finderFeedMegaVideoBtnAnimUIC.f133558f;
        android.view.View view = this.f136678e;
        android.view.View view2 = this.f136679f;
        view2.getLayoutParams().width = (int) (f17 + ((view.getWidth() - finderFeedMegaVideoBtnAnimUIC.f133558f) * animatedFraction));
        view2.requestLayout();
        view2.setBackgroundColor(com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC.O6(finderFeedMegaVideoBtnAnimUIC, animatedFraction, this.f136680g, this.f136681h));
        if (animatedFraction > 0.5f) {
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.iqr)).setAlpha((animatedFraction - 0.5f) * 2);
        }
    }
}

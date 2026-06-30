package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class mh implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostRemindLayout f132662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f132663e;

    public mh(com.tencent.mm.plugin.finder.view.FinderPostRemindLayout finderPostRemindLayout, int i17) {
        this.f132662d = finderPostRemindLayout;
        this.f132663e = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        com.tencent.mm.plugin.finder.view.FinderPostRemindLayout finderPostRemindLayout = this.f132662d;
        finderPostRemindLayout.d((int) (finderPostRemindLayout.f131404o + ((finderPostRemindLayout.f131405p - r1) * animatedFraction)), (int) (finderPostRemindLayout.f131406q + ((finderPostRemindLayout.f131407r - r2) * animatedFraction)));
        int i17 = finderPostRemindLayout.f131408s;
        int i18 = finderPostRemindLayout.f131409t;
        float f17 = i17 + ((i18 - i17) * animatedFraction);
        int i19 = finderPostRemindLayout.f131410u;
        int i27 = finderPostRemindLayout.f131413x;
        int i28 = (int) f17;
        android.widget.FrameLayout frameLayout = finderPostRemindLayout.f131397e;
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = i28;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = i28;
        layoutParams2.setMarginStart((int) (i19 + ((i27 - i19) * animatedFraction)));
        frameLayout.setLayoutParams(layoutParams2);
        finderPostRemindLayout.f131398f.setStrokeWidth(i27 + ((finderPostRemindLayout.f131415z - i27) * animatedFraction));
        int i29 = finderPostRemindLayout.f131411v;
        int i37 = finderPostRemindLayout.f131412w;
        finderPostRemindLayout.setTipsLayoutMargin((int) (i29 + ((i37 - i29) * animatedFraction)));
        finderPostRemindLayout.f131400h.setTextSize(1, 15.0f - (1.0f * animatedFraction));
        finderPostRemindLayout.f131401i.setHeight((int) (this.f132663e + ((0 - r4) * animatedFraction)));
        float f18 = i29 + ((i37 - i29) * animatedFraction);
        float f19 = finderPostRemindLayout.f131414y + ((i19 - r2) * animatedFraction);
        float f27 = i18 + ((i27 - i18) * animatedFraction);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = finderPostRemindLayout.f131402m;
        android.view.ViewGroup.LayoutParams layoutParams3 = weImageView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).width = (int) f18;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).height = (int) f19;
        layoutParams4.setMarginEnd((int) f27);
        weImageView.setLayoutParams(layoutParams4);
    }
}

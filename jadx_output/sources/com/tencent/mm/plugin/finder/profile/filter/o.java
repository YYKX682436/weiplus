package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView f123381d;

    public o(com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView) {
        this.f123381d = finderTopicFilterView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        com.tencent.mm.view.recyclerview.WxRecyclerView foldRecyclerView = this.f123381d.getFoldRecyclerView();
        if (foldRecyclerView != null) {
            java.lang.Object animatedValue = anim.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) animatedValue).intValue();
            android.view.ViewGroup.LayoutParams layoutParams = foldRecyclerView.getLayoutParams();
            layoutParams.height = intValue;
            foldRecyclerView.setLayoutParams(layoutParams);
        }
    }
}

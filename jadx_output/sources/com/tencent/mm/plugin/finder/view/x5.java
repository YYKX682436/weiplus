package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class x5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f133316d;

    public x5(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f133316d = finderCommentFooter;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f133316d;
        android.view.ViewGroup.LayoutParams layoutParams = finderCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = a06.d.b(intValue);
        finderCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        finderCommentFooter.getReplyBtn().setAlpha(intValue / finderCommentFooter.getReplyBtnWidth());
    }
}

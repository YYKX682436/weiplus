package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class y5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f133377d;

    public y5(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f133377d = finderCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f133377d;
        android.view.ViewGroup.LayoutParams layoutParams = finderCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = finderCommentFooter.getReplyBtnWidth();
        finderCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        finderCommentFooter.getReplyBtn().setAlpha(1.0f);
        com.tencent.mm.plugin.finder.view.FinderCommentFooter.a(finderCommentFooter);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f133377d;
        android.view.ViewGroup.LayoutParams layoutParams = finderCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = finderCommentFooter.getReplyBtnWidth();
        finderCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        finderCommentFooter.getReplyBtn().setAlpha(1.0f);
        com.tencent.mm.plugin.finder.view.FinderCommentFooter.a(finderCommentFooter);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f133377d.getReplyBtn().setVisibility(0);
    }
}

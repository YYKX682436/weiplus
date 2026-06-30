package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class a6 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f131620d;

    public a6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f131620d = finderCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f131620d;
        finderCommentFooter.getReplyBtn().setVisibility(8);
        com.tencent.mm.plugin.finder.view.FinderCommentFooter.a(finderCommentFooter);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f131620d;
        finderCommentFooter.getReplyBtn().setVisibility(8);
        com.tencent.mm.plugin.finder.view.FinderCommentFooter.a(finderCommentFooter);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f131620d.getReplyBtn().setVisibility(0);
    }
}

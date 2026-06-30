package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class c7 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f131757d;

    public c7(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f131757d = finderCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f131757d;
        finderCommentFooter.getSmileyPanel().setAlpha(1.0f);
        finderCommentFooter.getSmileyPanel().setVisibility(4);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}

package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class d7 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f131879d;

    public d7(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f131879d = finderCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f131879d;
        finderCommentFooter.setFooterMode(2);
        finderCommentFooter.setSmileyIcon(false);
        finderCommentFooter.getSmileyBtn().setTag(java.lang.Boolean.FALSE);
        finderCommentFooter.getSmileyPanel().setVisibility(4);
        finderCommentFooter.getQuickPickEmoji().setVisibility(0);
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

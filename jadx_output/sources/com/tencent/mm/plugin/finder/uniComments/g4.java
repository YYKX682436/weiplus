package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class g4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130252d;

    public g4(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter) {
        this.f130252d = uniCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130252d;
        uniCommentFooter.setFooterMode(0);
        if (uniCommentFooter.getAutoHideWithKeyboard()) {
            uniCommentFooter.setVisibility(8);
        }
        uniCommentFooter.getCommentFooterStateListener();
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

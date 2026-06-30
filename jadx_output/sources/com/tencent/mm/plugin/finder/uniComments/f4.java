package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class f4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f130245e;

    public f4(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter, boolean z17, int i17) {
        this.f130244d = uniCommentFooter;
        this.f130245e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130244d;
        uniCommentFooter.setFooterMode(2);
        uniCommentFooter.setSmileyIcon(false);
        uniCommentFooter.getSmileyBtn().setTag(java.lang.Boolean.FALSE);
        if (this.f130245e) {
            uniCommentFooter.getCommentFooterStateListener();
        } else {
            uniCommentFooter.getCommentFooterStateListener();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130244d;
        if (uniCommentFooter.getAutoHideWithKeyboard()) {
            uniCommentFooter.setVisibility(0);
        }
    }
}

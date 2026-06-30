package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class f1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130242d;

    public f1(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter) {
        this.f130242d = textStatusCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130242d;
        textStatusCommentFooter.setFooterMode(2);
        textStatusCommentFooter.setSmileyIcon(false);
        textStatusCommentFooter.getSmileyBtn().setTag(java.lang.Boolean.FALSE);
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

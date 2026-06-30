package yk4;

/* loaded from: classes10.dex */
public final class u implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462856d;

    public u(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter) {
        this.f462856d = tingCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462856d;
        tingCommentFooter.setFooterMode(0);
        if (tingCommentFooter.getAutoHideWithKeyboard()) {
            tingCommentFooter.setVisibility(8);
        }
        yk4.a commentFooterStateListener = tingCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.g();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        yk4.a commentFooterStateListener = this.f462856d.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.b();
        }
    }
}

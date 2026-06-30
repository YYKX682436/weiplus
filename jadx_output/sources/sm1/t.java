package sm1;

/* loaded from: classes10.dex */
public final class t implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409336d;

    public t(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        this.f409336d = bizCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409336d;
        bizCommentFooter.setFooterMode(0);
        if (bizCommentFooter.getAutoHideWithKeyboard()) {
            bizCommentFooter.setVisibility(8);
        }
        sm1.a commentFooterStateListener = bizCommentFooter.getCommentFooterStateListener();
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
        sm1.a commentFooterStateListener = this.f409336d.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.b();
        }
    }
}

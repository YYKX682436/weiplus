package sm1;

/* loaded from: classes10.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409333d;

    public r(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        this.f409333d = bizCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409333d;
        bizCommentFooter.getSmileyPanel().setAlpha(1.0f);
        bizCommentFooter.getSmileyPanel().setVisibility(4);
        sm1.a commentFooterStateListener = bizCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.c();
        }
        sm1.a commentFooterStateListener2 = bizCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener2 != null) {
            commentFooterStateListener2.a(bizCommentFooter.getEditLayoutMinHeight() + ((int) bizCommentFooter.f92486v));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409333d;
        sm1.a commentFooterStateListener = bizCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.h(bizCommentFooter.getEditLayoutMinHeight() + ((int) bizCommentFooter.f92486v));
        }
    }
}

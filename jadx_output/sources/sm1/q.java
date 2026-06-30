package sm1;

/* loaded from: classes10.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f409332e;

    public q(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter, boolean z17) {
        this.f409331d = bizCommentFooter;
        this.f409332e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409331d;
        bizCommentFooter.getSmileyPanel().setVisibility(4);
        bizCommentFooter.setSmileyIcon(false);
        if (this.f409332e) {
            bizCommentFooter.setFooterMode(0);
        }
        if (bizCommentFooter.getAutoHideWithKeyboard()) {
            bizCommentFooter.setVisibility(8);
        }
        sm1.a commentFooterStateListener = bizCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.c();
        }
        sm1.a commentFooterStateListener2 = bizCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener2 != null) {
            commentFooterStateListener2.g();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        sm1.a commentFooterStateListener = this.f409331d.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.b();
        }
    }
}

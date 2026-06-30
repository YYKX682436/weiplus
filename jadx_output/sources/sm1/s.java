package sm1;

/* loaded from: classes10.dex */
public final class s implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f409335e;

    public s(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter, int i17) {
        this.f409334d = bizCommentFooter;
        this.f409335e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409334d;
        bizCommentFooter.setFooterMode(2);
        bizCommentFooter.setSmileyIcon(false);
        bizCommentFooter.getSmileyBtn().setTag(java.lang.Boolean.FALSE);
        sm1.a commentFooterStateListener = bizCommentFooter.getCommentFooterStateListener();
        int i17 = this.f409335e;
        if (commentFooterStateListener != null) {
            commentFooterStateListener.e(i17);
        }
        sm1.a commentFooterStateListener2 = bizCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener2 != null) {
            commentFooterStateListener2.a(bizCommentFooter.getEditLayoutMinHeight() + i17);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409334d;
        if (bizCommentFooter.getAutoHideWithKeyboard()) {
            bizCommentFooter.setVisibility(0);
        }
        sm1.a commentFooterStateListener = bizCommentFooter.getCommentFooterStateListener();
        if (commentFooterStateListener != null) {
            commentFooterStateListener.h(bizCommentFooter.getEditLayoutMinHeight() + this.f409335e);
        }
    }
}

package sm1;

/* loaded from: classes3.dex */
public final class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409317d;

    public d(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        this.f409317d = bizCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409317d;
        android.view.ViewGroup.LayoutParams layoutParams = bizCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = bizCommentFooter.getReplyBtnWidth();
        bizCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        bizCommentFooter.getReplyBtn().setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409317d;
        android.view.ViewGroup.LayoutParams layoutParams = bizCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = bizCommentFooter.getReplyBtnWidth();
        bizCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        bizCommentFooter.getReplyBtn().setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f409317d.getReplyBtn().setVisibility(0);
    }
}

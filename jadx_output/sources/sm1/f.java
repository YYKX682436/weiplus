package sm1;

/* loaded from: classes3.dex */
public final class f implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409319d;

    public f(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        this.f409319d = bizCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f409319d.getReplyBtn().setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f409319d.getReplyBtn().setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f409319d.getReplyBtn().setVisibility(0);
    }
}

package yk4;

/* loaded from: classes3.dex */
public final class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462836d;

    public d(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter) {
        this.f462836d = tingCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462836d;
        android.view.ViewGroup.LayoutParams layoutParams = tingCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = tingCommentFooter.getReplyBtnWidth();
        tingCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        tingCommentFooter.getReplyBtn().setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462836d;
        android.view.ViewGroup.LayoutParams layoutParams = tingCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = tingCommentFooter.getReplyBtnWidth();
        tingCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        tingCommentFooter.getReplyBtn().setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f462836d.getReplyBtn().setVisibility(0);
    }
}

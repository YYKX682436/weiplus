package sm1;

/* loaded from: classes3.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409318d;

    public e(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter) {
        this.f409318d = bizCommentFooter;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter = this.f409318d;
        android.view.ViewGroup.LayoutParams layoutParams = bizCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = a06.d.b(intValue);
        bizCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        bizCommentFooter.getReplyBtn().setAlpha(intValue / bizCommentFooter.getReplyBtnWidth());
    }
}

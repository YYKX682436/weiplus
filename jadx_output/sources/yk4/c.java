package yk4;

/* loaded from: classes3.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462834d;

    public c(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter) {
        this.f462834d = tingCommentFooter;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter = this.f462834d;
        android.view.ViewGroup.LayoutParams layoutParams = tingCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = a06.d.b(intValue);
        tingCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        tingCommentFooter.getReplyBtn().setAlpha(intValue / tingCommentFooter.getReplyBtnWidth());
    }
}

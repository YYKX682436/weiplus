package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes3.dex */
public final class q0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130364d;

    public q0(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter) {
        this.f130364d = textStatusCommentFooter;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130364d;
        android.view.ViewGroup.LayoutParams layoutParams = textStatusCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = a06.d.b(intValue);
        textStatusCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        android.view.View replyBtn = textStatusCommentFooter.getReplyBtn();
        float replyBtnWidth = intValue / textStatusCommentFooter.getReplyBtnWidth();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(replyBtnWidth));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(replyBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$checkShowReplyBtn$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        replyBtn.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(replyBtn, "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$checkShowReplyBtn$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}

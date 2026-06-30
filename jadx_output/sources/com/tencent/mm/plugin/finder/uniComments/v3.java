package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes3.dex */
public final class v3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130436d;

    public v3(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter) {
        this.f130436d = uniCommentFooter;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130436d;
        android.view.ViewGroup.LayoutParams layoutParams = uniCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = a06.d.b(intValue);
        uniCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        android.view.View replyBtn = uniCommentFooter.getReplyBtn();
        float replyBtnWidth = intValue / uniCommentFooter.getReplyBtnWidth();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(replyBtnWidth));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(replyBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        replyBtn.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}

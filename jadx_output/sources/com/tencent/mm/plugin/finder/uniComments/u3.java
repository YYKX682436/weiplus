package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes3.dex */
public final class u3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130427d;

    public u3(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter) {
        this.f130427d = uniCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130427d;
        android.view.ViewGroup.LayoutParams layoutParams = uniCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = uniCommentFooter.getReplyBtnWidth();
        uniCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        android.view.View replyBtn = uniCommentFooter.getReplyBtn();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(replyBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        replyBtn.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter = this.f130427d;
        android.view.ViewGroup.LayoutParams layoutParams = uniCommentFooter.getReplyBtn().getLayoutParams();
        layoutParams.width = uniCommentFooter.getReplyBtnWidth();
        uniCommentFooter.getReplyBtn().setLayoutParams(layoutParams);
        android.view.View replyBtn = uniCommentFooter.getReplyBtn();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(replyBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        replyBtn.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View replyBtn = this.f130427d.getReplyBtn();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(replyBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

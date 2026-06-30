package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes3.dex */
public final class w3 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130443d;

    public w3(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter) {
        this.f130443d = uniCommentFooter;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View replyBtn = this.f130443d.getReplyBtn();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(replyBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View replyBtn = this.f130443d.getReplyBtn();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(replyBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View replyBtn = this.f130443d.getReplyBtn();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(replyBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        replyBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(replyBtn, "com/tencent/mm/plugin/finder/uniComments/UniCommentFooter$checkShowReplyBtn$4", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

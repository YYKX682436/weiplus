package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class nh implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostRemindLayout f132714d;

    public nh(com.tencent.mm.plugin.finder.view.FinderPostRemindLayout finderPostRemindLayout) {
        this.f132714d = finderPostRemindLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("FinderPostRemindLayout", "[onAnimationCancel]");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.view.lh lhVar = com.tencent.mm.plugin.finder.view.lh.f132603f;
        com.tencent.mm.plugin.finder.view.FinderPostRemindLayout finderPostRemindLayout = this.f132714d;
        finderPostRemindLayout.A = lhVar;
        int ordinal = finderPostRemindLayout.B.ordinal();
        if (ordinal == 1) {
            finderPostRemindLayout.e();
        } else if (ordinal != 2) {
            finderPostRemindLayout.c();
        } else {
            finderPostRemindLayout.b();
        }
        com.tencent.mars.xlog.Log.i("FinderPostRemindLayout", "[onAnimationEnd]");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("FinderPostRemindLayout", "[onAnimationStart]");
    }
}

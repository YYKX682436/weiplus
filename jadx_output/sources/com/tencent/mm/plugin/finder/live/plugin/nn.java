package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nn implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tn f113663d;

    public nn(com.tencent.mm.plugin.finder.live.plugin.tn tnVar) {
        this.f113663d = tnVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = this.f113663d;
        tnVar.f(false);
        java.lang.Object target = tnVar.A.getTarget();
        android.view.View view = target instanceof android.view.View ? (android.view.View) target : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo$registerCntTransferAnimatorSetListener$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo$registerCntTransferAnimatorSetListener$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.lang.Object target2 = tnVar.f114458y.getTarget();
        android.view.View view2 = target2 instanceof android.view.View ? (android.view.View) target2 : null;
        if (view2 != null) {
            view2.setScaleX(1.0f);
        }
        java.lang.Object target3 = tnVar.f114459z.getTarget();
        android.view.View view3 = target3 instanceof android.view.View ? (android.view.View) target3 : null;
        if (view3 == null) {
            return;
        }
        view3.setScaleY(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f113663d.f(true);
    }
}

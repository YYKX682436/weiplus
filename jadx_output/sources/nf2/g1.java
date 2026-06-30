package nf2;

/* loaded from: classes5.dex */
public final class g1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.i1 f336745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f336746e;

    public g1(nf2.i1 i1Var, yz5.a aVar) {
        this.f336745d = i1Var;
        this.f336746e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f336745d.f336756e = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        nf2.i1 i1Var = this.f336745d;
        i1Var.f336756e = false;
        android.view.View view = i1Var.f336752a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator$animateCollapse$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator$animateCollapse$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = i1Var.f336753b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator$animateCollapse$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator$animateCollapse$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nf2.i1.a(i1Var, i1Var.f336752a);
        nf2.i1.a(i1Var, i1Var.f336753b);
        yz5.a aVar = this.f336746e;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mars.xlog.Log.i("LyricsCollapseAnimator", "animateCollapse: completed");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f336745d.f336756e = true;
    }
}

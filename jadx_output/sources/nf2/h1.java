package nf2;

/* loaded from: classes5.dex */
public final class h1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.i1 f336748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f336749e;

    public h1(nf2.i1 i1Var, yz5.a aVar) {
        this.f336748d = i1Var;
        this.f336749e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f336748d.f336756e = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        nf2.i1 i1Var = this.f336748d;
        i1Var.f336756e = false;
        android.view.View view = i1Var.f336754c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator$animateExpand$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/LiveLyricsCollapseAnimator$animateExpand$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nf2.i1.a(i1Var, i1Var.f336754c);
        yz5.a aVar = this.f336749e;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mars.xlog.Log.i("LyricsCollapseAnimator", "animateExpand: completed");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f336748d.f336756e = true;
    }
}

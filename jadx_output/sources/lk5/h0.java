package lk5;

/* loaded from: classes7.dex */
public final class h0 extends lk5.j0 {
    @Override // lk5.j0, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        nk5.c cVar;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.ui.vas.VASActivity.Companion.getClass();
        cVar = com.tencent.mm.ui.vas.VASActivity.vasController;
        cVar.f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        nk5.c cVar;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.ui.vas.VASActivity.Companion.getClass();
        cVar = com.tencent.mm.ui.vas.VASActivity.vasController;
        cVar.b();
    }
}

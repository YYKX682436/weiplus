package lk5;

/* loaded from: classes3.dex */
public abstract class j0 extends android.animation.AnimatorListenerAdapter {
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        animation.removeListener(this);
    }
}

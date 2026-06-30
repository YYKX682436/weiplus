package qn5;

/* loaded from: classes14.dex */
public abstract class a extends android.animation.AnimatorListenerAdapter {
    public void a(android.animation.Animator animator) {
        if (animator != null) {
            super.onAnimationCancel(animator);
        }
    }

    public void b(android.animation.Animator animator) {
        if (animator != null) {
            super.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        a(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        b(animation);
    }
}

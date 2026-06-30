package i81;

/* loaded from: classes7.dex */
public class o extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f289604d;

    public o(i81.q qVar, java.lang.Runnable runnable) {
        this.f289604d = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Runnable runnable = this.f289604d;
        if (runnable != null) {
            runnable.run();
        }
    }
}

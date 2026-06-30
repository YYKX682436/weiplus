package sd;

/* loaded from: classes8.dex */
public class i extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f406605d;

    public i(sd.k kVar, java.lang.Runnable runnable) {
        this.f406605d = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Runnable runnable = this.f406605d;
        if (runnable != null) {
            runnable.run();
        }
    }
}

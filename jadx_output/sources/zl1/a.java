package zl1;

/* loaded from: classes7.dex */
public class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f473567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f473568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zl1.t f473569f;

    public a(zl1.t tVar, java.lang.Runnable runnable, android.animation.Animator animator) {
        this.f473569f = tVar;
        this.f473567d = runnable;
        this.f473568e = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Runnable runnable = this.f473567d;
        if (runnable != null) {
            this.f473569f.post(runnable);
        }
        this.f473568e.removeListener(this);
    }
}

package x9;

/* loaded from: classes15.dex */
public class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.behavior.HideBottomViewOnScrollBehavior f452603d;

    public a(com.google.android.material.behavior.HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f452603d = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f452603d.f44354f = null;
    }
}

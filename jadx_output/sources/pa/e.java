package pa;

/* loaded from: classes13.dex */
public class e extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ca.j f352939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f352940e;

    public e(com.google.android.material.transformation.FabTransformationBehavior fabTransformationBehavior, ca.j jVar, android.graphics.drawable.Drawable drawable) {
        this.f352939d = jVar;
        this.f352940e = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f352939d.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f352939d.setCircularRevealOverlayDrawable(this.f352940e);
    }
}

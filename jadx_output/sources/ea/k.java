package ea;

/* loaded from: classes15.dex */
public abstract class k extends android.animation.AnimatorListenerAdapter implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f250475d;

    /* renamed from: e, reason: collision with root package name */
    public float f250476e;

    /* renamed from: f, reason: collision with root package name */
    public float f250477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ea.l f250478g;

    public k(ea.l lVar, ea.c cVar) {
        this.f250478g = lVar;
    }

    public abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f250478g.getClass();
        throw null;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        boolean z17 = this.f250475d;
        ea.l lVar = this.f250478g;
        if (!z17) {
            lVar.getClass();
            throw null;
        }
        lVar.getClass();
        valueAnimator.getAnimatedFraction();
        throw null;
    }
}

package ox2;

/* loaded from: classes2.dex */
public final class s implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f349706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f349707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349708f;

    public s(yz5.a aVar, yz5.a aVar2, android.view.View view) {
        this.f349706d = aVar;
        this.f349707e = aVar2;
        this.f349708f = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f349707e.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f349706d.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.animation.ValueAnimator valueAnimator = animator instanceof android.animation.ValueAnimator ? (android.animation.ValueAnimator) animator : null;
        if (valueAnimator != null) {
            valueAnimator.setFloatValues(this.f349708f.getScaleX(), 0.0f);
        }
    }
}

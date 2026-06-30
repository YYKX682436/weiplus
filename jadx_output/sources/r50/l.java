package r50;

/* loaded from: classes3.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f392601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f392602e;

    public l(android.animation.ValueAnimator valueAnimator, yz5.a aVar) {
        this.f392601d = valueAnimator;
        this.f392602e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f392601d.removeListener(this);
        yz5.a aVar = this.f392602e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}

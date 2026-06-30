package u4;

/* loaded from: classes13.dex */
public class w0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.b f424570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.transition.Transition f424571e;

    public w0(androidx.transition.Transition transition, x.b bVar) {
        this.f424571e = transition;
        this.f424570d = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f424570d.remove(animator);
        this.f424571e.f12400z.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f424571e.f12400z.add(animator);
    }
}

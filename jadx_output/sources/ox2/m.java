package ox2;

/* loaded from: classes2.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f349685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f349686e;

    public m(yz5.a aVar, yz5.a aVar2) {
        this.f349685d = aVar;
        this.f349686e = aVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f349686e.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f349685d.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

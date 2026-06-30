package ht2;

/* loaded from: classes2.dex */
public final class e0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f284821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f284822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f284823f;

    public e0(yz5.l lVar, yz5.l lVar2, yz5.l lVar3) {
        this.f284821d = lVar;
        this.f284822e = lVar2;
        this.f284823f = lVar3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f284822e.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f284821d.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f284823f.invoke(animator);
    }
}

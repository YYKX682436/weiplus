package fc3;

/* loaded from: classes9.dex */
public final class p implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f261070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f261071e;

    public p(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        this.f261070d = weakReference;
        this.f261071e = weakReference2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        fc3.k kVar;
        kotlin.jvm.internal.o.g(animation, "animation");
        fc3.s sVar = (fc3.s) this.f261070d.get();
        if (sVar == null || (kVar = (fc3.k) this.f261071e.get()) == null || sVar.f261091p) {
            return;
        }
        fc3.s.a(sVar, kVar);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}

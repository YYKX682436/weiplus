package fc3;

/* loaded from: classes9.dex */
public final class n implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc3.s f261065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc3.k f261066e;

    public n(fc3.s sVar, fc3.k kVar) {
        this.f261065d = sVar;
        this.f261066e = kVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        fc3.s sVar = this.f261065d;
        boolean z17 = sVar.f261083h;
        fc3.k kVar = this.f261066e;
        if (z17) {
            sVar.b(kVar);
        } else {
            if (!sVar.f261089n) {
                kVar.f261056g = 2;
                return;
            }
            sVar.f261091p = false;
            kVar.f261056g = 3;
            fc3.s.a(sVar, kVar);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

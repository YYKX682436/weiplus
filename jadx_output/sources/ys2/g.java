package ys2;

/* loaded from: classes3.dex */
public final class g implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f465157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ys2.h f465158e;

    public g(ys2.h hVar) {
        this.f465158e = hVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f465157d = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        boolean z17 = this.f465157d;
        ys2.h hVar = this.f465158e;
        if (z17) {
            java.lang.String str = hVar.f465159m;
        } else {
            animation.start();
            java.lang.String str2 = hVar.f465159m;
        }
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

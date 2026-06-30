package uw2;

/* loaded from: classes.dex */
public final class g extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431666d;

    public g(android.view.View view) {
        this.f431666d = view;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f431666d;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f431666d;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}

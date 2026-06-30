package kg3;

/* loaded from: classes8.dex */
public final class i implements kg3.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f307712a;

    public i(android.view.View targetView) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        this.f307712a = targetView;
    }

    public final void b() {
        android.view.animation.AlphaAnimation alphaAnimation;
        android.view.View view = this.f307712a;
        if (view.getVisibility() == 0) {
            a("startSwitchAnimation fadeOutAnimation", new java.lang.Object[0]);
            alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setAnimationListener(new kg3.h(this));
            alphaAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator(10.0f));
        } else {
            a("startSwitchAnimation fadeInAnimation", new java.lang.Object[0]);
            alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150L);
            alphaAnimation.setAnimationListener(new kg3.g(this));
        }
        view.clearAnimation();
        view.startAnimation(alphaAnimation);
    }
}

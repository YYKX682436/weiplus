package mi1;

/* loaded from: classes7.dex */
public abstract class g0 implements mi1.x0 {
    public final android.animation.Animator l(android.view.View view) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        return ofFloat;
    }

    public abstract void m(java.lang.Runnable runnable);
}

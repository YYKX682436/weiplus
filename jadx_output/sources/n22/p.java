package n22;

/* loaded from: classes2.dex */
public abstract class p {
    public static final android.animation.ValueAnimator a(android.graphics.Rect rect, android.graphics.Rect target, long j17, yz5.a action) {
        kotlin.jvm.internal.o.g(rect, "<this>");
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(action, "action");
        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j17);
        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new n22.o(rect, rect2, target.left - rect.left, target.top - rect.top, target.right - rect.right, target.bottom - rect.bottom, action));
        ofFloat.start();
        return ofFloat;
    }
}

package mi1;

/* loaded from: classes7.dex */
public abstract class e3 {
    public static final android.animation.ObjectAnimator a(android.view.View view, long j17) {
        kotlin.jvm.internal.o.g(view, "<this>");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(j17);
        return ofFloat;
    }

    public static android.animation.ObjectAnimator b(android.view.View view, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = 150;
        }
        kotlin.jvm.internal.o.g(view, "<this>");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(j17);
        return ofFloat;
    }
}

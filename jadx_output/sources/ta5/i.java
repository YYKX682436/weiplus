package ta5;

/* loaded from: classes2.dex */
public class i extends android.view.animation.DecelerateInterpolator {
    @Override // android.view.animation.DecelerateInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        if (f17 <= 0.5d) {
            return super.getInterpolation(f17 * 2.0f);
        }
        return 1.0f;
    }
}

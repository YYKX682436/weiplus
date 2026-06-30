package n31;

/* loaded from: classes8.dex */
public final class a implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        if (f17 < 0.5f) {
            float f18 = f17 * 2.0f;
            return 0.5f * f18 * f18 * f18 * f18 * f18;
        }
        float f19 = 1;
        float f27 = ((f17 - 0.5f) * 2) - f19;
        return (0.5f * f27 * f27 * f27 * f27 * f27) + f19;
    }
}

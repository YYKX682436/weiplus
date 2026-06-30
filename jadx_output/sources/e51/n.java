package e51;

/* loaded from: classes8.dex */
public class n implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        if (f17 >= 0.9f) {
            return 1.0f - ((f17 - 0.9f) * 10.0f);
        }
        return 1.0f;
    }
}

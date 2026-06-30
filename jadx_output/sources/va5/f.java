package va5;

/* loaded from: classes11.dex */
public final class f implements android.view.animation.Interpolator {
    public f(float f17, float f18) {
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        return (float) ((1.0f * java.lang.Math.pow(2.0d, (-10) * f17) * java.lang.Math.sin(((f17 - ((float) ((r0 / 6.283185307179586d) * java.lang.Math.asin(1 / 1.0f)))) * 6.283185307179586d) / 0.3f)) + 1);
    }
}

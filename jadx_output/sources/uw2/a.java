package uw2;

/* loaded from: classes2.dex */
public final class a implements android.view.animation.Interpolator {
    public a(float f17) {
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        double pow;
        double d17 = f17;
        if (d17 < 0.5d) {
            pow = (1.0f - java.lang.Math.pow(1.0d - (2 * f17), 0.6f * 2.0d)) / 2;
        } else {
            double d18 = 2;
            pow = (java.lang.Math.pow((d17 - 0.5d) * d18, 0.6f * 2.0d) / d18) + 0.5f;
        }
        return (float) pow;
    }
}

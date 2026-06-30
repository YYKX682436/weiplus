package qs3;

/* loaded from: classes3.dex */
public final class w implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        float f18 = f17 - 1.0f;
        return (f18 * f18 * (((1 + 1.3f) * f18) + 1.3f)) + 1.0f;
    }
}

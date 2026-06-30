package pn5;

/* loaded from: classes13.dex */
public final class a implements android.view.animation.Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public static float f357277a;

    /* renamed from: b, reason: collision with root package name */
    public static float f357278b;

    public a(int i17) {
        float a17 = 1.0f / a(1.0f);
        f357277a = a17;
        f357278b = 1.0f - (a17 * a(1.0f));
    }

    public final float a(float f17) {
        float f18 = f17 * 8.0f;
        return f18 < 1.0f ? f18 - (1.0f - ((float) java.lang.Math.exp(-f18))) : 0.36787945f + ((1.0f - ((float) java.lang.Math.exp(1.0f - f18))) * 0.63212055f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f17) {
        float a17 = f357277a * a(f17);
        return a17 > 0.0f ? a17 + f357278b : a17;
    }
}

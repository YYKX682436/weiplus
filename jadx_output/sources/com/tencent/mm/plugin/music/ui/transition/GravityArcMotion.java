package com.tencent.mm.plugin.music.ui.transition;

/* loaded from: classes5.dex */
public class GravityArcMotion extends android.transition.ArcMotion {

    /* renamed from: g, reason: collision with root package name */
    public static final float f150792g = (float) java.lang.Math.tan(java.lang.Math.toRadians(35.0d));

    /* renamed from: a, reason: collision with root package name */
    public float f150793a;

    /* renamed from: b, reason: collision with root package name */
    public float f150794b;

    /* renamed from: c, reason: collision with root package name */
    public float f150795c;

    /* renamed from: d, reason: collision with root package name */
    public float f150796d;

    /* renamed from: e, reason: collision with root package name */
    public float f150797e;

    /* renamed from: f, reason: collision with root package name */
    public float f150798f;

    public GravityArcMotion() {
        this.f150793a = 0.0f;
        this.f150794b = 0.0f;
        this.f150795c = 70.0f;
        this.f150796d = 0.0f;
        this.f150797e = 0.0f;
        this.f150798f = f150792g;
    }

    public static float a(float f17) {
        if (f17 < 0.0f || f17 > 90.0f) {
            throw new java.lang.IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) java.lang.Math.tan(java.lang.Math.toRadians(f17 / 2.0f));
    }

    @Override // android.transition.ArcMotion
    public float getMaximumAngle() {
        return this.f150795c;
    }

    @Override // android.transition.ArcMotion
    public float getMinimumHorizontalAngle() {
        return this.f150793a;
    }

    @Override // android.transition.ArcMotion
    public float getMinimumVerticalAngle() {
        return this.f150794b;
    }

    @Override // android.transition.ArcMotion, android.transition.PathMotion
    public android.graphics.Path getPath(float f17, float f18, float f19, float f27) {
        float f28;
        float f29;
        float f37;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f17, f18);
        if (f18 == f27) {
            f28 = (f17 + f19) / 2.0f;
            f37 = ((this.f150796d * java.lang.Math.abs(f19 - f17)) / 2.0f) + f18;
        } else if (f17 == f19) {
            f28 = ((this.f150797e * java.lang.Math.abs(f27 - f18)) / 2.0f) + f17;
            f37 = (f18 + f27) / 2.0f;
        } else {
            float f38 = f19 - f17;
            float f39 = f27 < f18 ? f18 - f27 : f27 - f18;
            float f47 = (f38 * f38) + (f39 * f39);
            float f48 = (f17 + f19) / 2.0f;
            float f49 = (f18 + f27) / 2.0f;
            float f57 = 0.25f * f47;
            if (java.lang.Math.abs(f38) < java.lang.Math.abs(f39)) {
                float f58 = f27 + (f47 / (f39 * 2.0f));
                float f59 = this.f150797e;
                f29 = f57 * f59 * f59;
                f37 = f58;
                f28 = f19;
            } else {
                f28 = f19 + (f47 / (f38 * 2.0f));
                float f66 = this.f150796d;
                f29 = f57 * f66 * f66;
                f37 = f27;
            }
            float f67 = f48 - f28;
            float f68 = f49 - f37;
            float f69 = (f67 * f67) + (f68 * f68);
            float f76 = this.f150798f;
            float f77 = f57 * f76 * f76;
            if (f69 >= f29) {
                f29 = f69 > f77 ? f77 : 0.0f;
            }
            if (f29 != 0.0f) {
                float sqrt = (float) java.lang.Math.sqrt(f29 / f69);
                f28 = ((f28 - f48) * sqrt) + f48;
                f37 = f49 + (sqrt * (f37 - f49));
            }
        }
        path.cubicTo((f17 + f28) / 2.0f, (f18 + f37) / 2.0f, (f28 + f19) / 2.0f, (f37 + f27) / 2.0f, f19, f27);
        return path;
    }

    @Override // android.transition.ArcMotion
    public void setMaximumAngle(float f17) {
        this.f150795c = f17;
        this.f150798f = a(f17);
    }

    @Override // android.transition.ArcMotion
    public void setMinimumHorizontalAngle(float f17) {
        this.f150793a = f17;
        this.f150796d = a(f17);
    }

    @Override // android.transition.ArcMotion
    public void setMinimumVerticalAngle(float f17) {
        this.f150794b = f17;
        this.f150797e = a(f17);
    }

    public GravityArcMotion(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150793a = 0.0f;
        this.f150794b = 0.0f;
        this.f150795c = 70.0f;
        this.f150796d = 0.0f;
        this.f150797e = 0.0f;
        this.f150798f = f150792g;
    }
}

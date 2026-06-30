package d3;

/* loaded from: classes13.dex */
public final class s {

    /* renamed from: k, reason: collision with root package name */
    public static final d3.s f226111k;

    /* renamed from: a, reason: collision with root package name */
    public final float f226112a;

    /* renamed from: b, reason: collision with root package name */
    public final float f226113b;

    /* renamed from: c, reason: collision with root package name */
    public final float f226114c;

    /* renamed from: d, reason: collision with root package name */
    public final float f226115d;

    /* renamed from: e, reason: collision with root package name */
    public final float f226116e;

    /* renamed from: f, reason: collision with root package name */
    public final float f226117f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f226118g;

    /* renamed from: h, reason: collision with root package name */
    public final float f226119h;

    /* renamed from: i, reason: collision with root package name */
    public final float f226120i;

    /* renamed from: j, reason: collision with root package name */
    public final float f226121j;

    static {
        float f17;
        float f18;
        float[] fArr = d3.b.f226081c;
        float c17 = (float) ((d3.b.c(50.0f) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = d3.b.f226079a;
        float f19 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f27 = fArr3[0] * f19;
        float f28 = fArr[1];
        float f29 = f27 + (fArr3[1] * f28);
        float f37 = fArr[2];
        float f38 = f29 + (fArr3[2] * f37);
        float[] fArr4 = fArr2[1];
        float f39 = (fArr4[0] * f19) + (fArr4[1] * f28) + (fArr4[2] * f37);
        float[] fArr5 = fArr2[2];
        float f47 = (f19 * fArr5[0]) + (f28 * fArr5[1]) + (f37 * fArr5[2]);
        if (1.0f >= 0.9d) {
            f17 = 0.100000046f;
            f18 = 0.59f;
        } else {
            f17 = 0.12999998f;
            f18 = 0.525f;
        }
        float f48 = f18 + f17;
        float exp = (1.0f - (((float) java.lang.Math.exp(((-c17) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d17 = exp;
        if (d17 > 1.0d) {
            exp = 1.0f;
        } else if (d17 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f38) * exp) + 1.0f) - exp, (((100.0f / f39) * exp) + 1.0f) - exp, (((100.0f / f47) * exp) + 1.0f) - exp};
        float f49 = 1.0f / ((5.0f * c17) + 1.0f);
        float f57 = f49 * f49 * f49 * f49;
        float f58 = 1.0f - f57;
        float cbrt = (0.1f * f58 * f58 * ((float) java.lang.Math.cbrt(c17 * 5.0d))) + (f57 * c17);
        float c18 = d3.b.c(50.0f) / fArr[1];
        double d18 = c18;
        float sqrt = ((float) java.lang.Math.sqrt(d18)) + 1.48f;
        float pow = 0.725f / ((float) java.lang.Math.pow(d18, 0.2d));
        float pow2 = (float) java.lang.Math.pow(((fArr6[2] * cbrt) * f47) / 100.0d, 0.42d);
        float[] fArr7 = {(float) java.lang.Math.pow(((fArr6[0] * cbrt) * f38) / 100.0d, 0.42d), (float) java.lang.Math.pow(((fArr6[1] * cbrt) * f39) / 100.0d, 0.42d), pow2};
        float f59 = fArr7[0];
        float f66 = fArr7[1];
        f226111k = new d3.s(c18, ((((f59 * 400.0f) / (f59 + 27.13f)) * 2.0f) + ((f66 * 400.0f) / (f66 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, f48, 1.0f, fArr6, cbrt, (float) java.lang.Math.pow(cbrt, 0.25d), sqrt);
    }

    public s(float f17, float f18, float f19, float f27, float f28, float f29, float[] fArr, float f37, float f38, float f39) {
        this.f226117f = f17;
        this.f226112a = f18;
        this.f226113b = f19;
        this.f226114c = f27;
        this.f226115d = f28;
        this.f226116e = f29;
        this.f226118g = fArr;
        this.f226119h = f37;
        this.f226120i = f38;
        this.f226121j = f39;
    }
}

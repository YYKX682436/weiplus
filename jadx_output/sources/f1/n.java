package f1;

/* loaded from: classes14.dex */
public final class n extends f1.d {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f258509d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f258510e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f258511f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f258512g;

    static {
        float[] f17 = f1.e.f(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, f1.e.b(f1.b.f258464b.f258465a, new float[]{0.34567f / 0.3585f, 1.0f, ((1.0f - 0.34567f) - 0.3585f) / 0.3585f}, new float[]{0.31271f / 0.32902f, 1.0f, ((1.0f - 0.31271f) - 0.32902f) / 0.32902f}));
        f258509d = f17;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f258510e = fArr;
        f258511f = f1.e.e(f17);
        f258512g = f1.e.e(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String name, int i17) {
        super(name, f1.c.f258468c, i17, null);
        kotlin.jvm.internal.o.g(name, "name");
        int i18 = f1.c.f258470e;
    }

    @Override // f1.d
    public float[] a(float[] v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        f1.e.h(f258509d, v17);
        double d17 = 0.33333334f;
        v17[0] = java.lang.Math.signum(v17[0]) * ((float) java.lang.Math.pow(java.lang.Math.abs(v17[0]), d17));
        v17[1] = java.lang.Math.signum(v17[1]) * ((float) java.lang.Math.pow(java.lang.Math.abs(v17[1]), d17));
        v17[2] = java.lang.Math.signum(v17[2]) * ((float) java.lang.Math.pow(java.lang.Math.abs(v17[2]), d17));
        f1.e.h(f258510e, v17);
        return v17;
    }

    @Override // f1.d
    public float b(int i17) {
        return i17 == 0 ? 1.0f : 0.5f;
    }

    @Override // f1.d
    public float c(int i17) {
        return i17 == 0 ? 0.0f : -0.5f;
    }

    @Override // f1.d
    public float[] e(float[] v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        v17[0] = e06.p.e(v17[0], 0.0f, 1.0f);
        v17[1] = e06.p.e(v17[1], -0.5f, 0.5f);
        v17[2] = e06.p.e(v17[2], -0.5f, 0.5f);
        f1.e.h(f258512g, v17);
        float f17 = v17[0];
        v17[0] = f17 * f17 * f17;
        float f18 = v17[1];
        v17[1] = f18 * f18 * f18;
        float f19 = v17[2];
        v17[2] = f19 * f19 * f19;
        f1.e.h(f258511f, v17);
        return v17;
    }
}

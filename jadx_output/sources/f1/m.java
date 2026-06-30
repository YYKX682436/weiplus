package f1;

/* loaded from: classes14.dex */
public final class m extends f1.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String name, int i17) {
        super(name, f1.c.f258468c, i17, null);
        kotlin.jvm.internal.o.g(name, "name");
        int i18 = f1.c.f258470e;
    }

    @Override // f1.d
    public float[] a(float[] v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        float f17 = v17[0];
        float[] fArr = f1.l.f258508e;
        float f18 = f17 / fArr[0];
        float f19 = v17[1] / fArr[1];
        float f27 = v17[2] / fArr[2];
        float pow = f18 > 0.008856452f ? (float) java.lang.Math.pow(f18, 0.33333334f) : (f18 * 7.787037f) + 0.13793103f;
        float pow2 = f19 > 0.008856452f ? (float) java.lang.Math.pow(f19, 0.33333334f) : (f19 * 7.787037f) + 0.13793103f;
        float pow3 = f27 > 0.008856452f ? (float) java.lang.Math.pow(f27, 0.33333334f) : (f27 * 7.787037f) + 0.13793103f;
        v17[0] = e06.p.e((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        v17[1] = e06.p.e((pow - pow2) * 500.0f, -128.0f, 128.0f);
        v17[2] = e06.p.e((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        return v17;
    }

    @Override // f1.d
    public float b(int i17) {
        return i17 == 0 ? 100.0f : 128.0f;
    }

    @Override // f1.d
    public float c(int i17) {
        return i17 == 0 ? 0.0f : -128.0f;
    }

    @Override // f1.d
    public float[] e(float[] v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        v17[0] = e06.p.e(v17[0], 0.0f, 100.0f);
        v17[1] = e06.p.e(v17[1], -128.0f, 128.0f);
        float e17 = e06.p.e(v17[2], -128.0f, 128.0f);
        v17[2] = e17;
        float f17 = (v17[0] + 16.0f) / 116.0f;
        float f18 = (v17[1] * 0.002f) + f17;
        float f19 = f17 - (e17 * 0.005f);
        float f27 = f18 > 0.20689656f ? f18 * f18 * f18 : (f18 - 0.13793103f) * 0.12841855f;
        float f28 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        float f29 = f19 > 0.20689656f ? f19 * f19 * f19 : (f19 - 0.13793103f) * 0.12841855f;
        float[] fArr = f1.l.f258508e;
        v17[0] = f27 * fArr[0];
        v17[1] = f28 * fArr[1];
        v17[2] = f29 * fArr[2];
        return v17;
    }
}

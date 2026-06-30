package y;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final y.b f458309a = new y.b();

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f458310b;

    static {
        float f17;
        float f18;
        float f19;
        float f27;
        float f28;
        float f29;
        float f37;
        float f38;
        float[] fArr = new float[101];
        f458310b = fArr;
        float[] fArr2 = new float[101];
        float f39 = 0.0f;
        float f47 = 0.0f;
        for (int i17 = 0; i17 < 100; i17++) {
            float f48 = i17 / 100;
            float f49 = 1.0f;
            while (true) {
                f17 = ((f49 - f39) / 2.0f) + f39;
                f18 = 1.0f - f17;
                f19 = f17 * 3.0f * f18;
                f27 = f17 * f17 * f17;
                float f57 = (((f18 * 0.175f) + (f17 * 0.35000002f)) * f19) + f27;
                if (java.lang.Math.abs(f57 - f48) < 1.0E-5d) {
                    break;
                } else if (f57 > f48) {
                    f49 = f17;
                } else {
                    f39 = f17;
                }
            }
            float f58 = 0.5f;
            fArr[i17] = (f19 * ((f18 * 0.5f) + f17)) + f27;
            float f59 = 1.0f;
            while (true) {
                f28 = ((f59 - f47) / 2.0f) + f47;
                f29 = 1.0f - f28;
                f37 = f28 * 3.0f * f29;
                f38 = f28 * f28 * f28;
                float f66 = (((f29 * f58) + f28) * f37) + f38;
                if (java.lang.Math.abs(f66 - f48) >= 1.0E-5d) {
                    if (f66 > f48) {
                        f59 = f28;
                    } else {
                        f47 = f28;
                    }
                    f58 = 0.5f;
                }
            }
            fArr2[i17] = (f37 * ((f29 * 0.175f) + (f28 * 0.35000002f))) + f38;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public final y.a a(float f17) {
        float f18;
        float f19;
        float f27 = 100;
        int i17 = (int) (f27 * f17);
        if (i17 < 100) {
            float f28 = i17 / f27;
            int i18 = i17 + 1;
            float f29 = i18 / f27;
            float[] fArr = f458310b;
            float f37 = fArr[i17];
            f19 = (fArr[i18] - f37) / (f29 - f28);
            f18 = f37 + ((f17 - f28) * f19);
        } else {
            f18 = 1.0f;
            f19 = 0.0f;
        }
        return new y.a(f18, f19);
    }
}

package e1;

/* loaded from: classes14.dex */
public abstract class j0 {
    public static float[] a(float[] values, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 1) != 0) {
            values = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        kotlin.jvm.internal.o.g(values, "values");
        return values;
    }

    public static final long b(float[] fArr, long j17) {
        float c17 = d1.e.c(j17);
        float d17 = d1.e.d(j17);
        float f17 = (fArr[3] * c17) + (fArr[7] * d17) + fArr[15];
        float f18 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) == 0 ? 0.0f : 1.0f / f17;
        return d1.f.a(((fArr[0] * c17) + (fArr[4] * d17) + fArr[12]) * f18, f18 * ((fArr[1] * c17) + (fArr[5] * d17) + fArr[13]));
    }

    public static final void c(float[] fArr, d1.d rect) {
        kotlin.jvm.internal.o.g(rect, "rect");
        long b17 = b(fArr, d1.f.a(rect.f225619a, rect.f225620b));
        long b18 = b(fArr, d1.f.a(rect.f225619a, rect.f225622d));
        long b19 = b(fArr, d1.f.a(rect.f225621c, rect.f225620b));
        long b27 = b(fArr, d1.f.a(rect.f225621c, rect.f225622d));
        rect.f225619a = java.lang.Math.min(java.lang.Math.min(d1.e.c(b17), d1.e.c(b18)), java.lang.Math.min(d1.e.c(b19), d1.e.c(b27)));
        rect.f225620b = java.lang.Math.min(java.lang.Math.min(d1.e.d(b17), d1.e.d(b18)), java.lang.Math.min(d1.e.d(b19), d1.e.d(b27)));
        rect.f225621c = java.lang.Math.max(java.lang.Math.max(d1.e.c(b17), d1.e.c(b18)), java.lang.Math.max(d1.e.c(b19), d1.e.c(b27)));
        rect.f225622d = java.lang.Math.max(java.lang.Math.max(d1.e.d(b17), d1.e.d(b18)), java.lang.Math.max(d1.e.d(b19), d1.e.d(b27)));
    }

    public static final void d(float[] fArr) {
        int i17 = 0;
        while (i17 < 4) {
            int i18 = 0;
            while (i18 < 4) {
                fArr[(i18 * 4) + i17] = i17 == i18 ? 1.0f : 0.0f;
                i18++;
            }
            i17++;
        }
    }

    public static void e(float[] fArr, float f17, float f18, float f19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = 0.0f;
        }
        if ((i17 & 2) != 0) {
            f18 = 0.0f;
        }
        if ((i17 & 4) != 0) {
            f19 = 0.0f;
        }
        float f27 = (fArr[0] * f17) + (fArr[4] * f18) + (fArr[8] * f19) + fArr[12];
        float f28 = (fArr[1] * f17) + (fArr[5] * f18) + (fArr[9] * f19) + fArr[13];
        float f29 = (fArr[2] * f17) + (fArr[6] * f18) + (fArr[10] * f19) + fArr[14];
        float f37 = (fArr[3] * f17) + (fArr[7] * f18) + (fArr[11] * f19) + fArr[15];
        fArr[12] = f27;
        fArr[13] = f28;
        fArr[14] = f29;
        fArr[15] = f37;
    }
}

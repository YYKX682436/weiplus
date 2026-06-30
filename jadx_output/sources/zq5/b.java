package zq5;

/* loaded from: classes13.dex */
public abstract class b {
    public static final boolean a(float f17, float f18, float f19, int i17) {
        return c(java.lang.Math.abs(f17 - f18), i17) <= f19;
    }

    public static final float b(float f17) {
        if (f17 == -0.0f) {
            return 0.0f;
        }
        return f17;
    }

    public static final float c(float f17, int i17) {
        if (java.lang.Float.isNaN(f17)) {
            return f17;
        }
        double pow = java.lang.Math.pow(10.0d, i17);
        return (float) (java.lang.Math.rint(f17 * pow) / pow);
    }

    public static final void d() {
        if (!kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException("This method must be executed in the UI thread".toString());
        }
    }

    public static final java.lang.String e(float f17, int i17) {
        int max = java.lang.Math.max(i17, 0);
        float pow = (float) java.lang.Math.pow(10.0f, max);
        float f18 = f17 * pow;
        int i18 = (int) f18;
        if (f18 - i18 >= 0.5f) {
            i18++;
        }
        float f19 = i18 / pow;
        return max > 0 ? java.lang.String.valueOf(f19) : java.lang.String.valueOf((int) f19);
    }
}

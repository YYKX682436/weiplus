package org.chromium.base;

/* loaded from: classes4.dex */
public class MathUtils {
    public static final float EPSILON = 0.001f;

    private MathUtils() {
    }

    public static boolean areFloatsEqual(float f17, float f18) {
        return java.lang.Math.abs(f17 - f18) < 0.001f;
    }

    public static float clamp(float f17, float f18, float f19) {
        float f27 = f18 > f19 ? f19 : f18;
        if (f18 <= f19) {
            f18 = f19;
        }
        return f17 < f27 ? f27 : f17 > f18 ? f18 : f17;
    }

    public static int compareLongs(long j17, long j18) {
        if (j17 < j18) {
            return -1;
        }
        return j17 == j18 ? 0 : 1;
    }

    public static float distance(float f17, float f18, float f19, float f27) {
        float f28 = f19 - f17;
        float f29 = f27 - f18;
        return (float) java.lang.Math.sqrt((f28 * f28) + (f29 * f29));
    }

    public static float flipSignIf(float f17, boolean z17) {
        return z17 ? -f17 : f17;
    }

    public static float interpolate(float f17, float f18, float f19) {
        return f17 + ((f18 - f17) * f19);
    }

    public static float map(float f17, float f18, float f19, float f27, float f28) {
        return f27 + ((f28 - f27) * ((f17 - f18) / (f19 - f18)));
    }

    public static int positiveModulo(int i17, int i18) {
        int i19 = i17 % i18;
        return i19 >= 0 ? i19 : i19 + i18;
    }

    public static double roundTwoDecimalPlaces(double d17) {
        return java.lang.Math.round(d17 * 100.0d) / 100.0d;
    }

    public static float scaleToFitTargetSize(int[] iArr, int i17, int i18) {
        int i19;
        int i27;
        if (iArr.length < 2 || (i19 = iArr[0]) <= 0 || (i27 = iArr[1]) <= 0) {
            throw new java.lang.IllegalArgumentException("Expected dimensions to have length >= 2 && dimensions[0] > 0 && dimensions[1] > 0");
        }
        float max = java.lang.Math.max(i17 / i19, i18 / i27);
        iArr[0] = (int) (iArr[0] * max);
        iArr[1] = (int) (iArr[1] * max);
        return max;
    }

    public static float smoothstep(float f17) {
        return f17 * f17 * (3.0f - (f17 * 2.0f));
    }

    public static int clamp(int i17, int i18, int i19) {
        int i27 = i18 > i19 ? i19 : i18;
        if (i18 <= i19) {
            i18 = i19;
        }
        return i17 < i27 ? i27 : i17 > i18 ? i18 : i17;
    }

    public static int flipSignIf(int i17, boolean z17) {
        return z17 ? -i17 : i17;
    }

    public static long clamp(long j17, long j18, long j19) {
        long j27 = j18 > j19 ? j19 : j18;
        if (j18 <= j19) {
            j18 = j19;
        }
        return j17 < j27 ? j27 : j17 > j18 ? j18 : j17;
    }
}

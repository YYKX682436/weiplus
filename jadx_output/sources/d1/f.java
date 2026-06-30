package d1;

/* loaded from: classes14.dex */
public abstract class f {
    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.flutter.embedding.android.KeyboardMap.kValueMask) | (java.lang.Float.floatToIntBits(f17) << 32);
        int i17 = d1.e.f225626e;
        return floatToIntBits;
    }

    public static final boolean b(long j17) {
        float c17 = d1.e.c(j17);
        if ((java.lang.Float.isInfinite(c17) || java.lang.Float.isNaN(c17)) ? false : true) {
            float d17 = d1.e.d(j17);
            if ((java.lang.Float.isInfinite(d17) || java.lang.Float.isNaN(d17)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(long j17) {
        int i17 = d1.e.f225626e;
        return j17 != d1.e.f225625d;
    }
}

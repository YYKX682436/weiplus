package s1;

/* loaded from: classes14.dex */
public abstract class y1 {
    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.flutter.embedding.android.KeyboardMap.kValueMask) | (java.lang.Float.floatToIntBits(f17) << 32);
        int i17 = s1.x1.f402094b;
        return floatToIntBits;
    }

    public static final long b(long j17, long j18) {
        float d17 = d1.k.d(j17);
        long j19 = s1.x1.f402093a;
        if (!(j18 != j19)) {
            throw new java.lang.IllegalStateException("ScaleFactor is unspecified".toString());
        }
        float intBitsToFloat = d17 * java.lang.Float.intBitsToFloat((int) (j18 >> 32));
        float b17 = d1.k.b(j17);
        if (j18 != j19) {
            return d1.l.a(intBitsToFloat, b17 * java.lang.Float.intBitsToFloat((int) (j18 & io.flutter.embedding.android.KeyboardMap.kValueMask)));
        }
        throw new java.lang.IllegalStateException("ScaleFactor is unspecified".toString());
    }
}

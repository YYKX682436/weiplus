package zq5;

/* loaded from: classes15.dex */
public abstract class u {
    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.flutter.embedding.android.KeyboardMap.kValueMask) | (java.lang.Float.floatToIntBits(f17) << 32);
        int i17 = zq5.t.f475092c;
        return floatToIntBits;
    }

    public static final long b(long j17) {
        return zq5.m.a(zq5.t.b(j17) / 2.0f, zq5.t.a(j17) / 2.0f);
    }
}

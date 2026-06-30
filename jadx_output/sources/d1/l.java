package d1;

/* loaded from: classes14.dex */
public abstract class l {
    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.flutter.embedding.android.KeyboardMap.kValueMask) | (java.lang.Float.floatToIntBits(f17) << 32);
        int i17 = d1.k.f225643d;
        return floatToIntBits;
    }

    public static final long b(long j17) {
        return d1.f.a(d1.k.d(j17) / 2.0f, d1.k.b(j17) / 2.0f);
    }
}

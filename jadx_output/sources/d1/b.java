package d1;

/* loaded from: classes14.dex */
public abstract class b {
    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.flutter.embedding.android.KeyboardMap.kValueMask) | (java.lang.Float.floatToIntBits(f17) << 32);
        int i17 = d1.a.f225618b;
        return floatToIntBits;
    }

    public static /* synthetic */ long b(float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            f18 = f17;
        }
        return a(f17, f18);
    }
}

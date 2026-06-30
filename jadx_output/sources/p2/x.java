package p2;

/* loaded from: classes14.dex */
public abstract class x {
    public static final long a(float f17, float f18) {
        long floatToIntBits = (java.lang.Float.floatToIntBits(f18) & io.flutter.embedding.android.KeyboardMap.kValueMask) | (java.lang.Float.floatToIntBits(f17) << 32);
        int i17 = p2.w.f351405c;
        return floatToIntBits;
    }
}

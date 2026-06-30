package e1;

/* loaded from: classes14.dex */
public final class i1 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f246272b = (java.lang.Float.floatToIntBits(0.5f) << 32) | (java.lang.Float.floatToIntBits(0.5f) & io.flutter.embedding.android.KeyboardMap.kValueMask);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f246273c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f246274a;

    public static final float a(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof e1.i1) {
            return this.f246274a == ((e1.i1) obj).f246274a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f246274a);
    }

    public java.lang.String toString() {
        return "TransformOrigin(packedValue=" + this.f246274a + ')';
    }
}

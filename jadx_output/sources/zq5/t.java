package zq5;

/* loaded from: classes15.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final long f475091b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f475092c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f475093a;

    static {
        zq5.u.a(0.0f, 0.0f);
        f475091b = zq5.u.a(Float.NaN, Float.NaN);
    }

    public static final float a(long j17) {
        if (j17 != f475091b) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
        }
        throw new java.lang.IllegalStateException("SizeCompat is unspecified".toString());
    }

    public static final float b(long j17) {
        if (j17 != f475091b) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("SizeCompat is unspecified".toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof zq5.t) {
            return this.f475093a == ((zq5.t) obj).f475093a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f475093a);
    }

    public java.lang.String toString() {
        long j17 = f475091b;
        long j18 = this.f475093a;
        if (!(j18 != j17)) {
            return "SizeCompat.Unspecified";
        }
        return "SizeCompat(" + zq5.b.e(b(j18), 1) + ", " + zq5.b.e(a(j18), 1) + ')';
    }
}

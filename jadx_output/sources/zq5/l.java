package zq5;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final long f475077b = zq5.m.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final long f475078c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f475079d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f475080a;

    static {
        zq5.m.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
        f475078c = zq5.m.a(Float.NaN, Float.NaN);
    }

    public static final long a(long j17, float f17) {
        return zq5.m.a(b(j17) / f17, c(j17) / f17);
    }

    public static final float b(long j17) {
        if (j17 != f475078c) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("OffsetCompat is unspecified".toString());
    }

    public static final float c(long j17) {
        if (j17 != f475078c) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
        }
        throw new java.lang.IllegalStateException("OffsetCompat is unspecified".toString());
    }

    public static final long d(long j17, long j18) {
        return zq5.m.a(b(j17) - b(j18), c(j17) - c(j18));
    }

    public static final long e(long j17, long j18) {
        return zq5.m.a(b(j17) + b(j18), c(j17) + c(j18));
    }

    public static final long f(long j17, float f17) {
        return zq5.m.a(b(j17) * f17, c(j17) * f17);
    }

    public static java.lang.String g(long j17) {
        if (!(j17 != f475078c)) {
            return "OffsetCompat.Unspecified";
        }
        return "OffsetCompat(" + zq5.b.e(b(j17), 1) + ", " + zq5.b.e(c(j17), 1) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof zq5.l) {
            return this.f475080a == ((zq5.l) obj).f475080a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f475080a);
    }

    public java.lang.String toString() {
        return g(this.f475080a);
    }
}

package d1;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f225641b = d1.l.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final long f225642c = d1.l.a(Float.NaN, Float.NaN);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f225643d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f225644a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final float b(long j17) {
        if (j17 != f225642c) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
        }
        throw new java.lang.IllegalStateException("Size is unspecified".toString());
    }

    public static final float c(long j17) {
        return java.lang.Math.min(java.lang.Math.abs(d(j17)), java.lang.Math.abs(b(j17)));
    }

    public static final float d(long j17) {
        if (j17 != f225642c) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("Size is unspecified".toString());
    }

    public static final boolean e(long j17) {
        return d(j17) <= 0.0f || b(j17) <= 0.0f;
    }

    public static java.lang.String f(long j17) {
        if (!(j17 != f225642c)) {
            return "Size.Unspecified";
        }
        return "Size(" + d1.c.a(d(j17), 1) + ", " + d1.c.a(b(j17), 1) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof d1.k) {
            return this.f225644a == ((d1.k) obj).f225644a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f225644a);
    }

    public java.lang.String toString() {
        return f(this.f225644a);
    }
}

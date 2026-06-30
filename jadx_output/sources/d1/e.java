package d1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final long f225623b = d1.f.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final long f225624c = d1.f.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final long f225625d = d1.f.a(Float.NaN, Float.NaN);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f225626e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f225627a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final float b(long j17) {
        return (float) java.lang.Math.sqrt((c(j17) * c(j17)) + (d(j17) * d(j17)));
    }

    public static final float c(long j17) {
        if (j17 != f225625d) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("Offset is unspecified".toString());
    }

    public static final float d(long j17) {
        if (j17 != f225625d) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
        }
        throw new java.lang.IllegalStateException("Offset is unspecified".toString());
    }

    public static final long e(long j17, long j18) {
        return d1.f.a(c(j17) - c(j18), d(j17) - d(j18));
    }

    public static final long f(long j17, long j18) {
        return d1.f.a(c(j17) + c(j18), d(j17) + d(j18));
    }

    public static final long g(long j17, float f17) {
        return d1.f.a(c(j17) * f17, d(j17) * f17);
    }

    public static java.lang.String h(long j17) {
        if (!d1.f.c(j17)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + d1.c.a(c(j17), 1) + ", " + d1.c.a(d(j17), 1) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof d1.e) {
            return this.f225627a == ((d1.e) obj).f225627a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f225627a);
    }

    public java.lang.String toString() {
        return h(this.f225627a);
    }
}

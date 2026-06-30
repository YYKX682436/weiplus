package p2;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final p2.v[] f351400b = {new p2.v(0), new p2.v(4294967296L), new p2.v(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f351401c = p2.u.d(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f351402a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final long b(long j17) {
        return f351400b[(int) ((j17 & 1095216660480L) >>> 32)].f351403a;
    }

    public static final float c(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
    }

    public static java.lang.String d(long j17) {
        long b17 = b(j17);
        if (p2.v.a(b17, 0L)) {
            return "Unspecified";
        }
        if (p2.v.a(b17, 4294967296L)) {
            return c(j17) + ".sp";
        }
        if (!p2.v.a(b17, 8589934592L)) {
            return "Invalid";
        }
        return c(j17) + ".em";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p2.t) {
            return this.f351402a == ((p2.t) obj).f351402a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f351402a);
    }

    public java.lang.String toString() {
        return d(this.f351402a);
    }
}

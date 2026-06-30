package p2;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f351384b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f351385c = p2.i.b(Float.NaN, Float.NaN);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f351386d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f351387a;

    static {
        float f17 = 0;
        f351384b = p2.i.b(f17, f17);
    }

    public static final float a(long j17) {
        if (j17 != f351385c) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
        }
        throw new java.lang.IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float b(long j17) {
        if (j17 != f351385c) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("DpSize is unspecified".toString());
    }

    public static java.lang.String c(long j17) {
        if (!(j17 != f351385c)) {
            return "DpSize.Unspecified";
        }
        return ((java.lang.Object) p2.h.b(b(j17))) + " x " + ((java.lang.Object) p2.h.b(a(j17)));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p2.k) {
            return this.f351387a == ((p2.k) obj).f351387a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f351387a);
    }

    public java.lang.String toString() {
        return c(this.f351387a);
    }
}

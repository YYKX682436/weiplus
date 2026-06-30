package p2;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f351381b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f351382c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f351383a;

    static {
        float f17 = 0;
        p2.i.a(f17, f17);
        f351381b = p2.i.a(Float.NaN, Float.NaN);
    }

    public static final float a(long j17) {
        if (j17 != f351381b) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("DpOffset is unspecified".toString());
    }

    public static final float b(long j17) {
        if (j17 != f351381b) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
        }
        throw new java.lang.IllegalStateException("DpOffset is unspecified".toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p2.j) {
            return this.f351383a == ((p2.j) obj).f351383a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f351383a);
    }

    public java.lang.String toString() {
        long j17 = f351381b;
        long j18 = this.f351383a;
        if (!(j18 != j17)) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((java.lang.Object) p2.h.b(a(j18))) + ", " + ((java.lang.Object) p2.h.b(b(j18))) + ')';
    }
}

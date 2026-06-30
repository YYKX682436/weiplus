package p2;

/* loaded from: classes14.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final long f351404b = p2.x.a(0.0f, 0.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f351405c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f351406a;

    public static long a(long j17, float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = b(j17);
        }
        if ((i17 & 2) != 0) {
            f18 = c(j17);
        }
        return p2.x.a(f17, f18);
    }

    public static final float b(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
    }

    public static final float c(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
    }

    public static final long d(long j17, long j18) {
        return p2.x.a(b(j17) - b(j18), c(j17) - c(j18));
    }

    public static final long e(long j17, long j18) {
        return p2.x.a(b(j17) + b(j18), c(j17) + c(j18));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p2.w) {
            return this.f351406a == ((p2.w) obj).f351406a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f351406a);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        long j17 = this.f351406a;
        sb6.append(b(j17));
        sb6.append(", ");
        sb6.append(c(j17));
        sb6.append(") px/sec");
        return sb6.toString();
    }
}

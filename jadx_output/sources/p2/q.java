package p2;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final p2.p f351395b = new p2.p(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f351396a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final int b(long j17) {
        return (int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask);
    }

    public static java.lang.String c(long j17) {
        return ((int) (j17 >> 32)) + " x " + b(j17);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p2.q) {
            return this.f351396a == ((p2.q) obj).f351396a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f351396a);
    }

    public java.lang.String toString() {
        return c(this.f351396a);
    }
}

package p2;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final long f351388b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f351389c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f351390a;

    static {
        new p2.l(null);
        f351388b = p2.n.a(0, 0);
    }

    public static long a(long j17, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = (int) (j17 >> 32);
        }
        if ((i19 & 2) != 0) {
            i18 = b(j17);
        }
        return p2.n.a(i17, i18);
    }

    public static final int b(long j17) {
        return (int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask);
    }

    public static java.lang.String c(long j17) {
        return "(" + ((int) (j17 >> 32)) + ", " + b(j17) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p2.m) {
            return this.f351390a == ((p2.m) obj).f351390a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f351390a);
    }

    public java.lang.String toString() {
        return c(this.f351390a);
    }
}

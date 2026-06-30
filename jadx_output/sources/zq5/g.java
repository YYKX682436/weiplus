package zq5;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final long f475065b = zq5.h.a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f475066c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f475067a;

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
        if (obj instanceof zq5.g) {
            return this.f475067a == ((zq5.g) obj).f475067a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f475067a);
    }

    public java.lang.String toString() {
        return c(this.f475067a);
    }
}

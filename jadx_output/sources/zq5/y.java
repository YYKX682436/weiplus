package zq5;

/* loaded from: classes15.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final zq5.x f475100b = new zq5.x(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f475101a;

    static {
        zq5.a0.a(0.5f, 0.5f);
    }

    public /* synthetic */ y(long j17) {
        this.f475101a = j17;
    }

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static java.lang.String b(long j17) {
        return "TransformOriginCompat(" + zq5.b.c(java.lang.Float.intBitsToFloat((int) (j17 >> 32)), 2) + ", " + zq5.b.c(java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask)), 2) + "))";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof zq5.y) {
            return this.f475101a == ((zq5.y) obj).f475101a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f475101a);
    }

    public java.lang.String toString() {
        return b(this.f475101a);
    }
}

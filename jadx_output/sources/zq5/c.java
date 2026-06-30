package zq5;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final long f475057b = zq5.d.a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f475058c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f475059a;

    public static final int a(long j17) {
        return (int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask);
    }

    public static java.lang.String b(long j17) {
        return "(" + ((int) (j17 >> 32)) + ", " + a(j17) + ')';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof zq5.c) {
            return this.f475059a == ((zq5.c) obj).f475059a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f475059a);
    }

    public java.lang.String toString() {
        return b(this.f475059a);
    }
}

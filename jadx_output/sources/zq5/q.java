package zq5;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static final zq5.p f475086b = new zq5.p(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f475087c = zq5.s.a(Float.NaN, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f475088a;

    public /* synthetic */ q(long j17) {
        this.f475088a = j17;
    }

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final float b(long j17) {
        if (j17 != f475087c) {
            return java.lang.Float.intBitsToFloat((int) (j17 >> 32));
        }
        throw new java.lang.IllegalStateException("ScaleFactorCompat is unspecified".toString());
    }

    public static final float c(long j17) {
        if (j17 != f475087c) {
            return java.lang.Float.intBitsToFloat((int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
        }
        throw new java.lang.IllegalStateException("ScaleFactorCompat is unspecified".toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof zq5.q) {
            return this.f475088a == ((zq5.q) obj).f475088a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f475088a);
    }

    public java.lang.String toString() {
        long j17 = this.f475088a;
        if (!(j17 != f475087c)) {
            return "ScaleFactorCompat.Unspecified";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ScaleFactorCompat(");
        float f17 = 10;
        float b17 = b(j17) * f17;
        int i17 = (int) b17;
        if (b17 - i17 >= 0.5f) {
            i17++;
        }
        sb6.append(i17 / f17);
        sb6.append(", ");
        float c17 = c(j17) * f17;
        int i18 = (int) c17;
        if (c17 - i18 >= 0.5f) {
            i18++;
        }
        sb6.append(i18 / f17);
        sb6.append(')');
        return sb6.toString();
    }
}

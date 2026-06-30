package gl5;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f272999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f273000b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f273001c;

    public g0(int i17, int i18, int[] loc) {
        kotlin.jvm.internal.o.g(loc, "loc");
        this.f272999a = i17;
        this.f273000b = i18;
        this.f273001c = loc;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl5.g0)) {
            return false;
        }
        gl5.g0 g0Var = (gl5.g0) obj;
        return this.f272999a == g0Var.f272999a && this.f273000b == g0Var.f273000b && kotlin.jvm.internal.o.b(this.f273001c, g0Var.f273001c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f272999a) * 31) + java.lang.Integer.hashCode(this.f273000b)) * 31) + java.util.Arrays.hashCode(this.f273001c);
    }

    public java.lang.String toString() {
        return "AnimViewParam(width=" + this.f272999a + ", height=" + this.f273000b + ", loc=" + java.util.Arrays.toString(this.f273001c) + ')';
    }
}

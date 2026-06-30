package xe0;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: e, reason: collision with root package name */
    public static final xe0.t0 f453795e = new xe0.t0(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f453796a;

    /* renamed from: b, reason: collision with root package name */
    public final int f453797b;

    /* renamed from: c, reason: collision with root package name */
    public final int f453798c;

    /* renamed from: d, reason: collision with root package name */
    public final int f453799d;

    public t0(int i17, int i18, int i19, int i27) {
        this.f453796a = i17;
        this.f453797b = i18;
        this.f453798c = i19;
        this.f453799d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe0.t0)) {
            return false;
        }
        xe0.t0 t0Var = (xe0.t0) obj;
        return this.f453796a == t0Var.f453796a && this.f453797b == t0Var.f453797b && this.f453798c == t0Var.f453798c && this.f453799d == t0Var.f453799d;
    }

    public int hashCode() {
        return (((((this.f453796a * 31) + this.f453797b) * 31) + this.f453798c) * 31) + this.f453799d;
    }
}

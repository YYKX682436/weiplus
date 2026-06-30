package cx;

/* loaded from: classes14.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f224411a;

    /* renamed from: b, reason: collision with root package name */
    public final int f224412b;

    /* renamed from: c, reason: collision with root package name */
    public final int f224413c;

    /* renamed from: d, reason: collision with root package name */
    public final int f224414d;

    /* renamed from: e, reason: collision with root package name */
    public final int f224415e;

    public i0(int i17, int i18, int i19, int i27, int i28) {
        this.f224411a = i17;
        this.f224412b = i18;
        this.f224413c = i19;
        this.f224414d = i27;
        this.f224415e = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx.i0)) {
            return false;
        }
        cx.i0 i0Var = (cx.i0) obj;
        return this.f224411a == i0Var.f224411a && this.f224412b == i0Var.f224412b && this.f224413c == i0Var.f224413c && this.f224414d == i0Var.f224414d && this.f224415e == i0Var.f224415e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f224411a) * 31) + java.lang.Integer.hashCode(this.f224412b)) * 31) + java.lang.Integer.hashCode(this.f224413c)) * 31) + java.lang.Integer.hashCode(this.f224414d)) * 31) + java.lang.Integer.hashCode(this.f224415e);
    }

    public java.lang.String toString() {
        return "BrandCoverViewAttribute(left=" + this.f224411a + ", top=" + this.f224412b + ", width=" + this.f224413c + ", height=" + this.f224414d + ", hide=" + this.f224415e + ')';
    }
}

package pr3;

/* loaded from: classes.dex */
public final class a extends pr3.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f357950d;

    /* renamed from: e, reason: collision with root package name */
    public final int f357951e;

    public a(int i17, int i18) {
        super(i17, null);
        this.f357950d = i17;
        this.f357951e = i18;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return equals(other);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f357950d, other.i());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr3.a)) {
            return false;
        }
        pr3.a aVar = (pr3.a) obj;
        return this.f357950d == aVar.f357950d && this.f357951e == aVar.f357951e;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f357950d;
    }

    @Override // in5.c
    public int h() {
        return 2;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f357950d) * 31) + java.lang.Integer.hashCode(this.f357951e);
    }

    @Override // pr3.e
    public int i() {
        return this.f357950d;
    }

    @Override // xm3.d
    public boolean s0(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (other instanceof pr3.a) {
            if (this.f357951e == ((pr3.a) other).f357951e) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return "Gap(id=" + this.f357950d + ", height=" + this.f357951e + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f357950d);
    }

    @Override // xm3.d
    public java.lang.Object y0() {
        return new pr3.a(this.f357950d, this.f357951e);
    }
}

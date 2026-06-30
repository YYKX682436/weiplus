package pr3;

/* loaded from: classes.dex */
public final class d extends pr3.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f357967d;

    /* renamed from: e, reason: collision with root package name */
    public final int f357968e;

    /* renamed from: f, reason: collision with root package name */
    public final int f357969f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f357970g;

    public d(int i17, int i18, int i19, boolean z17) {
        super(i17, null);
        this.f357967d = i17;
        this.f357968e = i18;
        this.f357969f = i19;
        this.f357970g = z17;
    }

    public static pr3.d j(pr3.d dVar, int i17, int i18, int i19, boolean z17, int i27, java.lang.Object obj) {
        if ((i27 & 1) != 0) {
            i17 = dVar.f357967d;
        }
        if ((i27 & 2) != 0) {
            i18 = dVar.f357968e;
        }
        if ((i27 & 4) != 0) {
            i19 = dVar.f357969f;
        }
        if ((i27 & 8) != 0) {
            z17 = dVar.f357970g;
        }
        dVar.getClass();
        return new pr3.d(i17, i18, i19, z17);
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
        return kotlin.jvm.internal.o.i(this.f357967d, other.i());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr3.d)) {
            return false;
        }
        pr3.d dVar = (pr3.d) obj;
        return this.f357967d == dVar.f357967d && this.f357968e == dVar.f357968e && this.f357969f == dVar.f357969f && this.f357970g == dVar.f357970g;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f357968e;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f357967d) * 31) + java.lang.Integer.hashCode(this.f357968e)) * 31) + java.lang.Integer.hashCode(this.f357969f)) * 31) + java.lang.Boolean.hashCode(this.f357970g);
    }

    @Override // pr3.e
    public int i() {
        return this.f357967d;
    }

    @Override // xm3.d
    public boolean s0(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (other instanceof pr3.d) {
            if (this.f357968e == ((pr3.d) other).f357968e) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return "Label(id=" + this.f357967d + ", title=" + this.f357968e + ", marginTop=" + this.f357969f + ", hasChildren=" + this.f357970g + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f357968e);
    }

    @Override // xm3.d
    public java.lang.Object y0() {
        return j(this, 0, 0, 0, false, 15, null);
    }
}

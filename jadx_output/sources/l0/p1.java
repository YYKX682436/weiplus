package l0;

/* loaded from: classes8.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f314420a;

    /* renamed from: b, reason: collision with root package name */
    public final float f314421b;

    /* renamed from: c, reason: collision with root package name */
    public final float f314422c;

    public p1(float f17, float f18, float f19) {
        this.f314420a = f17;
        this.f314421b = f18;
        this.f314422c = f19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0.p1)) {
            return false;
        }
        l0.p1 p1Var = (l0.p1) obj;
        if (!(this.f314420a == p1Var.f314420a)) {
            return false;
        }
        if (this.f314421b == p1Var.f314421b) {
            return (this.f314422c > p1Var.f314422c ? 1 : (this.f314422c == p1Var.f314422c ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((java.lang.Float.hashCode(this.f314420a) * 31) + java.lang.Float.hashCode(this.f314421b)) * 31) + java.lang.Float.hashCode(this.f314422c);
    }

    public java.lang.String toString() {
        return "ResistanceConfig(basis=" + this.f314420a + ", factorAtMin=" + this.f314421b + ", factorAtMax=" + this.f314422c + ')';
    }
}

package ym5;

/* loaded from: classes5.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public float f463415a;

    /* renamed from: b, reason: collision with root package name */
    public float f463416b;

    /* renamed from: c, reason: collision with root package name */
    public float f463417c;

    /* renamed from: d, reason: collision with root package name */
    public float f463418d;

    public k3(float f17, float f18, float f19, float f27) {
        this.f463415a = f17;
        this.f463416b = f18;
        this.f463417c = f19;
        this.f463418d = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5.k3)) {
            return false;
        }
        ym5.k3 k3Var = (ym5.k3) obj;
        return java.lang.Float.compare(this.f463415a, k3Var.f463415a) == 0 && java.lang.Float.compare(this.f463416b, k3Var.f463416b) == 0 && java.lang.Float.compare(this.f463417c, k3Var.f463417c) == 0 && java.lang.Float.compare(this.f463418d, k3Var.f463418d) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f463415a) * 31) + java.lang.Float.hashCode(this.f463416b)) * 31) + java.lang.Float.hashCode(this.f463417c)) * 31) + java.lang.Float.hashCode(this.f463418d);
    }

    public java.lang.String toString() {
        return "topLeft:" + this.f463415a + ", topRight:" + this.f463416b + ", bottomLeft:" + this.f463417c + ", bottomRight:" + this.f463418d;
    }
}

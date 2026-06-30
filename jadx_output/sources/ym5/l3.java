package ym5;

/* loaded from: classes5.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public float f463426a;

    /* renamed from: b, reason: collision with root package name */
    public float f463427b;

    /* renamed from: c, reason: collision with root package name */
    public float f463428c;

    /* renamed from: d, reason: collision with root package name */
    public float f463429d;

    public l3(float f17, float f18, float f19, float f27) {
        this.f463426a = f17;
        this.f463427b = f18;
        this.f463428c = f19;
        this.f463429d = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5.l3)) {
            return false;
        }
        ym5.l3 l3Var = (ym5.l3) obj;
        return java.lang.Float.compare(this.f463426a, l3Var.f463426a) == 0 && java.lang.Float.compare(this.f463427b, l3Var.f463427b) == 0 && java.lang.Float.compare(this.f463428c, l3Var.f463428c) == 0 && java.lang.Float.compare(this.f463429d, l3Var.f463429d) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f463426a) * 31) + java.lang.Float.hashCode(this.f463427b)) * 31) + java.lang.Float.hashCode(this.f463428c)) * 31) + java.lang.Float.hashCode(this.f463429d);
    }

    public java.lang.String toString() {
        return "topLeft:" + this.f463426a + ", topRight:" + this.f463427b + ", bottomLeft:" + this.f463428c + ", bottomRight:" + this.f463429d;
    }
}

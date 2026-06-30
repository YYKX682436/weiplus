package dv4;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final float f244024a;

    /* renamed from: b, reason: collision with root package name */
    public final float f244025b;

    /* renamed from: c, reason: collision with root package name */
    public final float f244026c;

    /* renamed from: d, reason: collision with root package name */
    public final float f244027d;

    public o(float f17, float f18, float f19, float f27) {
        this.f244024a = f17;
        this.f244025b = f18;
        this.f244026c = f19;
        this.f244027d = f27;
    }

    public final org.json.JSONObject a() {
        return ri.l0.a(kz5.c1.k(new jz5.l("x1", java.lang.Float.valueOf(this.f244024a)), new jz5.l("y1", java.lang.Float.valueOf(this.f244025b)), new jz5.l("x2", java.lang.Float.valueOf(this.f244026c)), new jz5.l("y2", java.lang.Float.valueOf(this.f244027d))));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv4.o)) {
            return false;
        }
        dv4.o oVar = (dv4.o) obj;
        return java.lang.Float.compare(this.f244024a, oVar.f244024a) == 0 && java.lang.Float.compare(this.f244025b, oVar.f244025b) == 0 && java.lang.Float.compare(this.f244026c, oVar.f244026c) == 0 && java.lang.Float.compare(this.f244027d, oVar.f244027d) == 0;
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f244024a) * 31) + java.lang.Float.hashCode(this.f244025b)) * 31) + java.lang.Float.hashCode(this.f244026c)) * 31) + java.lang.Float.hashCode(this.f244027d);
    }

    public java.lang.String toString() {
        return "SliceBox(x1=" + this.f244024a + ", y1=" + this.f244025b + ", x2=" + this.f244026c + ", y2=" + this.f244027d + ')';
    }
}

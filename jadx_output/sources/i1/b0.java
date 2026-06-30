package i1;

/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public float f286832a;

    /* renamed from: b, reason: collision with root package name */
    public float f286833b;

    public b0(float f17, float f18, int i17, kotlin.jvm.internal.i iVar) {
        f17 = (i17 & 1) != 0 ? 0.0f : f17;
        f18 = (i17 & 2) != 0 ? 0.0f : f18;
        this.f286832a = f17;
        this.f286833b = f18;
    }

    public final void a() {
        this.f286832a = 0.0f;
        this.f286833b = 0.0f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.b0)) {
            return false;
        }
        i1.b0 b0Var = (i1.b0) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286832a), java.lang.Float.valueOf(b0Var.f286832a)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286833b), java.lang.Float.valueOf(b0Var.f286833b));
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f286832a) * 31) + java.lang.Float.hashCode(this.f286833b);
    }

    public java.lang.String toString() {
        return "PathPoint(x=" + this.f286832a + ", y=" + this.f286833b + ')';
    }
}

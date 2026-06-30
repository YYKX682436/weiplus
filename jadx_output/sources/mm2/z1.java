package mm2;

/* loaded from: classes3.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public mm2.b2 f329599a;

    /* renamed from: b, reason: collision with root package name */
    public mm2.d2 f329600b;

    public z1(mm2.b2 range, mm2.d2 trans) {
        kotlin.jvm.internal.o.g(range, "range");
        kotlin.jvm.internal.o.g(trans, "trans");
        this.f329599a = range;
        this.f329600b = trans;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.z1)) {
            return false;
        }
        mm2.z1 z1Var = (mm2.z1) obj;
        return this.f329599a == z1Var.f329599a && this.f329600b == z1Var.f329600b;
    }

    public int hashCode() {
        return (this.f329599a.hashCode() * 31) + this.f329600b.hashCode();
    }

    public java.lang.String toString() {
        return "DanmakuConfig(range=" + this.f329599a + ", trans=" + this.f329600b + ')';
    }
}

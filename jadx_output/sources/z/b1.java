package z;

/* loaded from: classes13.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f468593a;

    /* renamed from: b, reason: collision with root package name */
    public z.h0 f468594b;

    public b1(java.lang.Object obj, z.h0 easing, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 2) != 0) {
            z.h0 h0Var = z.j0.f468704a;
            easing = z.i0.f468696a;
        }
        kotlin.jvm.internal.o.g(easing, "easing");
        this.f468593a = obj;
        this.f468594b = easing;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof z.b1) {
            z.b1 b1Var = (z.b1) obj;
            if (kotlin.jvm.internal.o.b(b1Var.f468593a, this.f468593a) && kotlin.jvm.internal.o.b(b1Var.f468594b, this.f468594b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.Object obj = this.f468593a;
        return ((obj != null ? obj.hashCode() : 0) * 31) + this.f468594b.hashCode();
    }
}

package k0;

/* loaded from: classes14.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final j0.u1 f302969a;

    /* renamed from: b, reason: collision with root package name */
    public final long f302970b;

    public x(j0.u1 u1Var, long j17, kotlin.jvm.internal.i iVar) {
        this.f302969a = u1Var;
        this.f302970b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0.x)) {
            return false;
        }
        k0.x xVar = (k0.x) obj;
        return this.f302969a == xVar.f302969a && d1.e.a(this.f302970b, xVar.f302970b);
    }

    public int hashCode() {
        int hashCode = this.f302969a.hashCode() * 31;
        int i17 = d1.e.f225626e;
        return hashCode + java.lang.Long.hashCode(this.f302970b);
    }

    public java.lang.String toString() {
        return "SelectionHandleInfo(handle=" + this.f302969a + ", position=" + ((java.lang.Object) d1.e.h(this.f302970b)) + ')';
    }
}

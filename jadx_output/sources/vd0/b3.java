package vd0;

/* loaded from: classes8.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final a24.t f435371a;

    /* renamed from: b, reason: collision with root package name */
    public final int f435372b;

    /* renamed from: c, reason: collision with root package name */
    public final a24.t f435373c;

    public b3(a24.t node, int i17, a24.t tVar) {
        kotlin.jvm.internal.o.g(node, "node");
        this.f435371a = node;
        this.f435372b = i17;
        this.f435373c = tVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0.b3)) {
            return false;
        }
        vd0.b3 b3Var = (vd0.b3) obj;
        return kotlin.jvm.internal.o.b(this.f435371a, b3Var.f435371a) && this.f435372b == b3Var.f435372b && kotlin.jvm.internal.o.b(this.f435373c, b3Var.f435373c);
    }

    public int hashCode() {
        int hashCode = ((this.f435371a.hashCode() * 31) + java.lang.Integer.hashCode(this.f435372b)) * 31;
        a24.t tVar = this.f435373c;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    public java.lang.String toString() {
        return "QueueItem(node=" + this.f435371a + ", depth=" + this.f435372b + ", parent=" + this.f435373c + ')';
    }
}

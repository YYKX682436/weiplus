package oc2;

/* loaded from: classes8.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f344321a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f344322b;

    /* renamed from: c, reason: collision with root package name */
    public r45.st3 f344323c;

    public y0(int i17, java.util.ArrayList nodes) {
        kotlin.jvm.internal.o.g(nodes, "nodes");
        this.f344321a = i17;
        this.f344322b = nodes;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.y0)) {
            return false;
        }
        oc2.y0 y0Var = (oc2.y0) obj;
        return this.f344321a == y0Var.f344321a && kotlin.jvm.internal.o.b(this.f344322b, y0Var.f344322b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f344321a) * 31) + this.f344322b.hashCode();
    }

    public java.lang.String toString() {
        return "SplitNode(style=" + this.f344321a + ", nodes=" + this.f344322b + ')';
    }
}

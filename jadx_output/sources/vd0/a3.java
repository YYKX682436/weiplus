package vd0;

/* loaded from: classes8.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final vd0.z2 f435367a;

    /* renamed from: b, reason: collision with root package name */
    public final wd0.w1 f435368b;

    public a3(vd0.z2 indexedNode, wd0.w1 matchType) {
        kotlin.jvm.internal.o.g(indexedNode, "indexedNode");
        kotlin.jvm.internal.o.g(matchType, "matchType");
        this.f435367a = indexedNode;
        this.f435368b = matchType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0.a3)) {
            return false;
        }
        vd0.a3 a3Var = (vd0.a3) obj;
        return kotlin.jvm.internal.o.b(this.f435367a, a3Var.f435367a) && this.f435368b == a3Var.f435368b;
    }

    public int hashCode() {
        return (this.f435367a.hashCode() * 31) + this.f435368b.hashCode();
    }

    public java.lang.String toString() {
        return "MatchedNode(indexedNode=" + this.f435367a + ", matchType=" + this.f435368b + ')';
    }
}

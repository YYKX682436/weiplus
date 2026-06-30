package vd0;

/* loaded from: classes8.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f435381a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f435382b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f435383c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f435384d;

    public c3(java.util.List indexedNodes, java.util.Map nodeByKey, java.util.Map indexedByKey, java.util.Map visibleByKey) {
        kotlin.jvm.internal.o.g(indexedNodes, "indexedNodes");
        kotlin.jvm.internal.o.g(nodeByKey, "nodeByKey");
        kotlin.jvm.internal.o.g(indexedByKey, "indexedByKey");
        kotlin.jvm.internal.o.g(visibleByKey, "visibleByKey");
        this.f435381a = indexedNodes;
        this.f435382b = nodeByKey;
        this.f435383c = indexedByKey;
        this.f435384d = visibleByKey;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0.c3)) {
            return false;
        }
        vd0.c3 c3Var = (vd0.c3) obj;
        return kotlin.jvm.internal.o.b(this.f435381a, c3Var.f435381a) && kotlin.jvm.internal.o.b(this.f435382b, c3Var.f435382b) && kotlin.jvm.internal.o.b(this.f435383c, c3Var.f435383c) && kotlin.jvm.internal.o.b(this.f435384d, c3Var.f435384d);
    }

    public int hashCode() {
        return (((((this.f435381a.hashCode() * 31) + this.f435382b.hashCode()) * 31) + this.f435383c.hashCode()) * 31) + this.f435384d.hashCode();
    }

    public java.lang.String toString() {
        return "SearchIndex(indexedNodes=" + this.f435381a + ", nodeByKey=" + this.f435382b + ", indexedByKey=" + this.f435383c + ", visibleByKey=" + this.f435384d + ')';
    }
}

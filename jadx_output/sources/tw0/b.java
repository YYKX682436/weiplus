package tw0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f422417a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f422418b;

    public b(boolean z17, java.util.LinkedList titleList) {
        kotlin.jvm.internal.o.g(titleList, "titleList");
        this.f422417a = z17;
        this.f422418b = titleList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw0.b)) {
            return false;
        }
        tw0.b bVar = (tw0.b) obj;
        return this.f422417a == bVar.f422417a && kotlin.jvm.internal.o.b(this.f422418b, bVar.f422418b);
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f422417a) * 31) + this.f422418b.hashCode();
    }

    public java.lang.String toString() {
        return "RecommendResult(showTitle=" + this.f422417a + ", titleList=" + this.f422418b + ')';
    }
}

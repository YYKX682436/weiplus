package gr5;

/* loaded from: classes14.dex */
public final class i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final gr5.i0 f274931c;

    /* renamed from: a, reason: collision with root package name */
    public final gr5.v f274932a;

    /* renamed from: b, reason: collision with root package name */
    public final gr5.v f274933b;

    static {
        gr5.v vVar = gr5.v.f274952g;
        f274931c = new gr5.i0(vVar, vVar);
    }

    public i0(gr5.v horizontal, gr5.v vertical) {
        kotlin.jvm.internal.o.g(horizontal, "horizontal");
        kotlin.jvm.internal.o.g(vertical, "vertical");
        this.f274932a = horizontal;
        this.f274933b = vertical;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.i0)) {
            return false;
        }
        gr5.i0 i0Var = (gr5.i0) obj;
        return this.f274932a == i0Var.f274932a && this.f274933b == i0Var.f274933b;
    }

    public int hashCode() {
        return (this.f274932a.hashCode() * 31) + this.f274933b.hashCode();
    }

    public java.lang.String toString() {
        return "ScrollEdge(horizontal=" + this.f274932a + ", vertical=" + this.f274933b + ')';
    }
}

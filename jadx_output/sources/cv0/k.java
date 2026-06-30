package cv0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner f222539a;

    /* renamed from: b, reason: collision with root package name */
    public final cv0.m f222540b;

    public k(com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner corner, cv0.m option) {
        kotlin.jvm.internal.o.g(corner, "corner");
        kotlin.jvm.internal.o.g(option, "option");
        this.f222539a = corner;
        this.f222540b = option;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv0.k)) {
            return false;
        }
        cv0.k kVar = (cv0.k) obj;
        return this.f222539a == kVar.f222539a && this.f222540b == kVar.f222540b;
    }

    public int hashCode() {
        return (this.f222539a.hashCode() * 31) + this.f222540b.hashCode();
    }

    public java.lang.String toString() {
        return "MJRectCornerOptionMapping(corner=" + this.f222539a + ", option=" + this.f222540b + ')';
    }
}

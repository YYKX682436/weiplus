package nx0;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f341126a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f341127b;

    public h2(java.lang.String name, java.util.List itemList) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(itemList, "itemList");
        this.f341126a = name;
        this.f341127b = itemList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0.h2)) {
            return false;
        }
        nx0.h2 h2Var = (nx0.h2) obj;
        return kotlin.jvm.internal.o.b(this.f341126a, h2Var.f341126a) && kotlin.jvm.internal.o.b(this.f341127b, h2Var.f341127b);
    }

    public int hashCode() {
        return (this.f341126a.hashCode() * 31) + this.f341127b.hashCode();
    }

    public java.lang.String toString() {
        return "FilterGroup(name=" + this.f341126a + ", itemList=" + this.f341127b + ')';
    }
}

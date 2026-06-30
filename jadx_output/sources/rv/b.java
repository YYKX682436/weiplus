package rv;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399825a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f399826b;

    public b(java.lang.String groupName, java.util.List groupActions) {
        kotlin.jvm.internal.o.g(groupName, "groupName");
        kotlin.jvm.internal.o.g(groupActions, "groupActions");
        this.f399825a = groupName;
        this.f399826b = groupActions;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv.b)) {
            return false;
        }
        rv.b bVar = (rv.b) obj;
        return kotlin.jvm.internal.o.b(this.f399825a, bVar.f399825a) && kotlin.jvm.internal.o.b(this.f399826b, bVar.f399826b);
    }

    public int hashCode() {
        return (this.f399825a.hashCode() * 31) + this.f399826b.hashCode();
    }

    public java.lang.String toString() {
        return "BrandCustomSharePanelActionGroup(groupName=" + this.f399825a + ", groupActions=" + this.f399826b + ')';
    }
}

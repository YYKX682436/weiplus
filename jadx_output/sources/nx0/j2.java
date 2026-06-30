package nx0;

/* loaded from: classes5.dex */
public final class j2 {

    /* renamed from: b, reason: collision with root package name */
    public static final nx0.j2 f341143b = new nx0.j2(kz5.p0.f313996d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f341144a;

    public j2(java.util.List groupList) {
        kotlin.jvm.internal.o.g(groupList, "groupList");
        this.f341144a = groupList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx0.j2) && kotlin.jvm.internal.o.b(this.f341144a, ((nx0.j2) obj).f341144a);
    }

    public int hashCode() {
        return this.f341144a.hashCode();
    }

    public java.lang.String toString() {
        return "FilterModel(groupList=" + this.f341144a + ')';
    }
}

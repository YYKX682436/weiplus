package nx0;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final nx0.y f341264b = new nx0.y(kz5.p0.f313996d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f341265a;

    public y(java.util.List groupList) {
        kotlin.jvm.internal.o.g(groupList, "groupList");
        this.f341265a = groupList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx0.y) && kotlin.jvm.internal.o.b(this.f341265a, ((nx0.y) obj).f341265a);
    }

    public int hashCode() {
        return this.f341265a.hashCode();
    }

    public java.lang.String toString() {
        return "BeautyModel(groupList=" + this.f341265a + ')';
    }
}

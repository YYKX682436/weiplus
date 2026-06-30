package nx0;

/* loaded from: classes5.dex */
public final class c3 {

    /* renamed from: b, reason: collision with root package name */
    public static final nx0.c3 f341087b = new nx0.c3(kz5.p0.f313996d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f341088a;

    public c3(java.util.List groupList) {
        kotlin.jvm.internal.o.g(groupList, "groupList");
        this.f341088a = groupList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx0.c3) && kotlin.jvm.internal.o.b(this.f341088a, ((nx0.c3) obj).f341088a);
    }

    public int hashCode() {
        return this.f341088a.hashCode();
    }

    public java.lang.String toString() {
        return "MakeupModel(groupList=" + this.f341088a + ')';
    }
}

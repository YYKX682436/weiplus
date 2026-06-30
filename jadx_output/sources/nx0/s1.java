package nx0;

/* loaded from: classes5.dex */
public final class s1 {

    /* renamed from: b, reason: collision with root package name */
    public static final nx0.s1 f341222b = new nx0.s1(kz5.p0.f313996d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f341223a;

    public s1(java.util.List groupList) {
        kotlin.jvm.internal.o.g(groupList, "groupList");
        this.f341223a = groupList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx0.s1) && kotlin.jvm.internal.o.b(this.f341223a, ((nx0.s1) obj).f341223a);
    }

    public int hashCode() {
        return this.f341223a.hashCode();
    }

    public java.lang.String toString() {
        return "FaceEffectModel(groupList=" + this.f341223a + ')';
    }
}

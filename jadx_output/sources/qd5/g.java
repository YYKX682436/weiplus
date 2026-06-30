package qd5;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f361908a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f361909b;

    public g(java.lang.String groupId, java.util.Map map) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        this.f361908a = groupId;
        this.f361909b = map;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd5.g)) {
            return false;
        }
        qd5.g gVar = (qd5.g) obj;
        return kotlin.jvm.internal.o.b(this.f361908a, gVar.f361908a) && kotlin.jvm.internal.o.b(this.f361909b, gVar.f361909b);
    }

    public int hashCode() {
        int hashCode = this.f361908a.hashCode() * 31;
        java.util.Map map = this.f361909b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public java.lang.String toString() {
        return "UIData(groupId=" + this.f361908a + ", startViews=" + this.f361909b + ')';
    }
}

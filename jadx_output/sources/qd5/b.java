package qd5;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f361902a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f361903b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.l f361904c;

    public b(java.lang.String groupId, java.lang.String uniqueId, jz5.l lVar) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        this.f361902a = groupId;
        this.f361903b = uniqueId;
        this.f361904c = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd5.b)) {
            return false;
        }
        qd5.b bVar = (qd5.b) obj;
        return kotlin.jvm.internal.o.b(this.f361902a, bVar.f361902a) && kotlin.jvm.internal.o.b(this.f361903b, bVar.f361903b) && kotlin.jvm.internal.o.b(this.f361904c, bVar.f361904c);
    }

    public int hashCode() {
        int hashCode = ((this.f361902a.hashCode() * 31) + this.f361903b.hashCode()) * 31;
        jz5.l lVar = this.f361904c;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public java.lang.String toString() {
        return "UIData(groupId=" + this.f361902a + ", uniqueId=" + this.f361903b + ", targetView=" + this.f361904c + ')';
    }
}

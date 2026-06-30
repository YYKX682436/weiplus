package ru0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f399660a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f399661b;

    public d(com.tencent.maas.base.MJID segmentID, java.lang.String roleID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(roleID, "roleID");
        this.f399660a = segmentID;
        this.f399661b = roleID;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.d)) {
            return false;
        }
        ru0.d dVar = (ru0.d) obj;
        return kotlin.jvm.internal.o.b(this.f399660a, dVar.f399660a) && kotlin.jvm.internal.o.b(this.f399661b, dVar.f399661b);
    }

    public int hashCode() {
        return (this.f399660a.hashCode() * 31) + this.f399661b.hashCode();
    }

    public java.lang.String toString() {
        return "RequestIdentity(segmentID=" + this.f399660a + ", roleID=" + this.f399661b + ')';
    }
}

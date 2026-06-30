package yu0;

/* loaded from: classes5.dex */
public final class p implements yu0.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f465826a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f465827b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f465828c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f465829d;

    public p(java.lang.String text, java.lang.String roleID, java.lang.String roleName, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(roleID, "roleID");
        kotlin.jvm.internal.o.g(roleName, "roleName");
        this.f465826a = text;
        this.f465827b = roleID;
        this.f465828c = roleName;
        this.f465829d = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.p)) {
            return false;
        }
        yu0.p pVar = (yu0.p) obj;
        return kotlin.jvm.internal.o.b(this.f465826a, pVar.f465826a) && kotlin.jvm.internal.o.b(this.f465827b, pVar.f465827b) && kotlin.jvm.internal.o.b(this.f465828c, pVar.f465828c) && kotlin.jvm.internal.o.b(this.f465829d, pVar.f465829d);
    }

    public int hashCode() {
        int hashCode = ((((this.f465826a.hashCode() * 31) + this.f465827b.hashCode()) * 31) + this.f465828c.hashCode()) * 31;
        java.lang.Object obj = this.f465829d;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "TTSTaskRequest(text=" + this.f465826a + ", roleID=" + this.f465827b + ", roleName=" + this.f465828c + ", identity=" + this.f465829d + ')';
    }
}

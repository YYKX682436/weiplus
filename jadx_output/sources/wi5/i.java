package wi5;

/* loaded from: classes.dex */
public final class i extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f446293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f446294c;

    public i(java.lang.String username, int i17) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f446293b = username;
        this.f446294c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.i)) {
            return false;
        }
        wi5.i iVar = (wi5.i) obj;
        return kotlin.jvm.internal.o.b(this.f446293b, iVar.f446293b) && this.f446294c == iVar.f446294c;
    }

    public int hashCode() {
        return (this.f446293b.hashCode() * 31) + java.lang.Integer.hashCode(this.f446294c);
    }

    public java.lang.String toString() {
        return "CreateGroupSelectRelatedGroupReportAction(username=" + this.f446293b + ", position=" + this.f446294c + ')';
    }
}

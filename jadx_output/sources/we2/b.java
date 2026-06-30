package we2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final r45.r71 f445214a;

    /* renamed from: b, reason: collision with root package name */
    public final int f445215b;

    public b(r45.r71 r71Var, int i17) {
        this.f445214a = r71Var;
        this.f445215b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we2.b)) {
            return false;
        }
        we2.b bVar = (we2.b) obj;
        return kotlin.jvm.internal.o.b(this.f445214a, bVar.f445214a) && this.f445215b == bVar.f445215b;
    }

    public int hashCode() {
        r45.r71 r71Var = this.f445214a;
        return ((r71Var == null ? 0 : r71Var.hashCode()) * 31) + java.lang.Integer.hashCode(this.f445215b);
    }

    public java.lang.String toString() {
        return "FinderGetLiveMsgRespWrapper(resp=" + this.f445214a + ", reqVisitorRoleType=" + this.f445215b + ')';
    }

    public /* synthetic */ b(r45.r71 r71Var, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(r71Var, (i18 & 2) != 0 ? 4 : i17);
    }
}

package mk3;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public r45.kr4 f327141a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f327142b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f327143c;

    public a(r45.kr4 kr4Var, boolean z17, boolean z18) {
        this.f327141a = kr4Var;
        this.f327142b = z17;
        this.f327143c = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk3.a)) {
            return false;
        }
        mk3.a aVar = (mk3.a) obj;
        return kotlin.jvm.internal.o.b(this.f327141a, aVar.f327141a) && this.f327142b == aVar.f327142b && this.f327143c == aVar.f327143c;
    }

    public int hashCode() {
        r45.kr4 kr4Var = this.f327141a;
        return ((((kr4Var == null ? 0 : kr4Var.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f327142b)) * 31) + java.lang.Boolean.hashCode(this.f327143c);
    }

    public java.lang.String toString() {
        return "MultiTaskAddExtraParams(reportData=" + this.f327141a + ", starOpt=" + this.f327142b + ", isSync=" + this.f327143c + ')';
    }

    public /* synthetic */ a(r45.kr4 kr4Var, boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : kr4Var, (i17 & 2) != 0 ? true : z17, (i17 & 4) != 0 ? false : z18);
    }
}

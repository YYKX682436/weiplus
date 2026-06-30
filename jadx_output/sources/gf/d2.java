package gf;

/* loaded from: classes5.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f271034a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f271035b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f271036c;

    public d2(boolean z17, java.util.List pathWhiteList, java.util.List exptList) {
        kotlin.jvm.internal.o.g(pathWhiteList, "pathWhiteList");
        kotlin.jvm.internal.o.g(exptList, "exptList");
        this.f271034a = z17;
        this.f271035b = pathWhiteList;
        this.f271036c = exptList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf.d2)) {
            return false;
        }
        gf.d2 d2Var = (gf.d2) obj;
        return this.f271034a == d2Var.f271034a && kotlin.jvm.internal.o.b(this.f271035b, d2Var.f271035b) && kotlin.jvm.internal.o.b(this.f271036c, d2Var.f271036c);
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f271034a) * 31) + this.f271035b.hashCode()) * 31) + this.f271036c.hashCode();
    }

    public java.lang.String toString() {
        return "SkylineExptGroup(isEnabled=" + this.f271034a + ", pathWhiteList=" + this.f271035b + ", exptList=" + this.f271036c + ')';
    }
}

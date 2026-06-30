package cx;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f224419a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f224420b;

    public j0(java.lang.String script, yz5.l lVar) {
        kotlin.jvm.internal.o.g(script, "script");
        this.f224419a = script;
        this.f224420b = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx.j0)) {
            return false;
        }
        cx.j0 j0Var = (cx.j0) obj;
        return kotlin.jvm.internal.o.b(this.f224419a, j0Var.f224419a) && kotlin.jvm.internal.o.b(this.f224420b, j0Var.f224420b);
    }

    public int hashCode() {
        int hashCode = this.f224419a.hashCode() * 31;
        yz5.l lVar = this.f224420b;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public java.lang.String toString() {
        return "PendingJs(script=" + this.f224419a + ", callback=" + this.f224420b + ')';
    }
}

package pr4;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.g f357995a;

    /* renamed from: b, reason: collision with root package name */
    public final pr4.o f357996b;

    public f(pr4.g status, pr4.o oVar) {
        kotlin.jvm.internal.o.g(status, "status");
        this.f357995a = status;
        this.f357996b = oVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr4.f)) {
            return false;
        }
        pr4.f fVar = (pr4.f) obj;
        return this.f357995a == fVar.f357995a && kotlin.jvm.internal.o.b(this.f357996b, fVar.f357996b);
    }

    public int hashCode() {
        int hashCode = this.f357995a.hashCode() * 31;
        pr4.o oVar = this.f357996b;
        return hashCode + (oVar == null ? 0 : oVar.hashCode());
    }

    public java.lang.String toString() {
        return "WCCoinSubscribeMemberResult(status=" + this.f357995a + ", data=" + this.f357996b + ')';
    }
}

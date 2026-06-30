package z0;

/* loaded from: classes14.dex */
public final class n extends z0.j {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f468914e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f468915f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f468916g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String fqName, java.lang.Object obj, java.lang.Object obj2, yz5.l inspectorInfo, yz5.q factory) {
        super(inspectorInfo, factory);
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        kotlin.jvm.internal.o.g(factory, "factory");
        this.f468914e = fqName;
        this.f468915f = obj;
        this.f468916g = obj2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof z0.n) {
            z0.n nVar = (z0.n) obj;
            if (kotlin.jvm.internal.o.b(this.f468914e, nVar.f468914e) && kotlin.jvm.internal.o.b(this.f468915f, nVar.f468915f) && kotlin.jvm.internal.o.b(this.f468916g, nVar.f468916g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f468914e.hashCode() * 31;
        java.lang.Object obj = this.f468915f;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        java.lang.Object obj2 = this.f468916g;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }
}

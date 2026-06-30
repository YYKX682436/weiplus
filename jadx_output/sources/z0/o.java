package z0;

/* loaded from: classes14.dex */
public final class o extends z0.j {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f468917e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f468918f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f468919g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f468920h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String fqName, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, yz5.l inspectorInfo, yz5.q factory) {
        super(inspectorInfo, factory);
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        kotlin.jvm.internal.o.g(factory, "factory");
        this.f468917e = fqName;
        this.f468918f = obj;
        this.f468919g = obj2;
        this.f468920h = obj3;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof z0.o) {
            z0.o oVar = (z0.o) obj;
            if (kotlin.jvm.internal.o.b(this.f468917e, oVar.f468917e) && kotlin.jvm.internal.o.b(this.f468918f, oVar.f468918f) && kotlin.jvm.internal.o.b(this.f468919g, oVar.f468919g) && kotlin.jvm.internal.o.b(this.f468920h, oVar.f468920h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f468917e.hashCode() * 31;
        java.lang.Object obj = this.f468918f;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        java.lang.Object obj2 = this.f468919g;
        int hashCode3 = (hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        java.lang.Object obj3 = this.f468920h;
        return hashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }
}

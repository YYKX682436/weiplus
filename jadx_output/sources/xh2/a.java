package xh2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public km2.q f454520a;

    /* renamed from: b, reason: collision with root package name */
    public xh2.i f454521b;

    public a(km2.q qVar, xh2.i layoutInfo) {
        kotlin.jvm.internal.o.g(layoutInfo, "layoutInfo");
        this.f454520a = qVar;
        this.f454521b = layoutInfo;
    }

    public final xh2.a a() {
        km2.q qVar = this.f454520a;
        return new xh2.a(qVar != null ? qVar.a() : null, this.f454521b.a());
    }

    public final java.lang.String b() {
        java.lang.String str;
        km2.q qVar = this.f454520a;
        return (qVar == null || (str = qVar.f309170a) == null) ? "" : str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.a)) {
            return false;
        }
        xh2.a aVar = (xh2.a) obj;
        return kotlin.jvm.internal.o.b(this.f454520a, aVar.f454520a) && kotlin.jvm.internal.o.b(this.f454521b, aVar.f454521b);
    }

    public int hashCode() {
        km2.q qVar = this.f454520a;
        return ((qVar == null ? 0 : qVar.hashCode()) * 31) + this.f454521b.hashCode();
    }

    public java.lang.String toString() {
        return "sdkUserId: " + b() + " layoutInfo: " + this.f454521b;
    }
}

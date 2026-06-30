package ip0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f293573a;

    /* renamed from: b, reason: collision with root package name */
    public final ip0.b f293574b;

    public a(java.lang.String str) {
        this.f293573a = str;
        this.f293574b = ip0.b.URI;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.Object obj2 = this.f293573a;
        if (obj2 != null) {
            if ((obj2 instanceof ip0.c) && (obj instanceof ip0.a)) {
                ip0.a aVar = (ip0.a) obj;
                if (aVar.f293573a instanceof ip0.c) {
                    return ((ip0.c) obj2).n().equals(((ip0.c) aVar.f293573a).n());
                }
            }
            if (obj instanceof ip0.a) {
                return obj2.equals(((ip0.a) obj).f293573a);
            }
        }
        return super.equals(obj);
    }

    public int hashCode() {
        java.lang.Object obj = this.f293573a;
        return obj != null ? obj.hashCode() : super.hashCode();
    }

    public java.lang.String toString() {
        java.lang.Object obj = this.f293573a;
        return obj == null ? "" : obj instanceof ip0.c ? ((ip0.c) obj).n() : obj.toString();
    }

    public a(ip0.c cVar) {
        this.f293573a = cVar;
        this.f293574b = ip0.b.URI;
    }

    public a(java.lang.String str, ip0.b bVar) {
        this.f293573a = str;
        this.f293574b = bVar;
    }
}

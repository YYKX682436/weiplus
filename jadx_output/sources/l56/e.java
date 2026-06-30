package l56;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f316680a;

    public e() {
        this.f316680a = new java.util.ArrayList();
    }

    public java.lang.String a() {
        java.util.List list = this.f316680a;
        if (((java.util.ArrayList) list).size() == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            l56.d dVar = (l56.d) it.next();
            sb6.append('&');
            sb6.append(n56.b.b(dVar.f316678d).concat("=").concat(n56.b.b(dVar.f316679e)));
        }
        return sb6.toString().substring(1);
    }

    public e(java.util.List list) {
        this.f316680a = new java.util.ArrayList(list);
    }
}

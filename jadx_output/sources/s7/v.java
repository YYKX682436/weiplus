package s7;

/* loaded from: classes16.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final s7.g f403851a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f403852b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f403853c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f403854d = null;

    public v(s7.g gVar, java.lang.String str) {
        this.f403851a = null;
        this.f403852b = null;
        this.f403851a = gVar == null ? s7.g.DESCENDANT : gVar;
        this.f403852b = str;
    }

    public void a(java.lang.String str, s7.d dVar, java.lang.String str2) {
        if (this.f403853c == null) {
            this.f403853c = new java.util.ArrayList();
        }
        this.f403853c.add(new s7.c(str, dVar, str2));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        s7.g gVar = s7.g.CHILD;
        s7.g gVar2 = this.f403851a;
        if (gVar2 == gVar) {
            sb6.append("> ");
        } else if (gVar2 == s7.g.FOLLOWS) {
            sb6.append("+ ");
        }
        java.lang.String str = this.f403852b;
        if (str == null) {
            str = "*";
        }
        sb6.append(str);
        java.util.List list = this.f403853c;
        if (list != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                s7.c cVar = (s7.c) it.next();
                sb6.append('[');
                sb6.append(cVar.f403602a);
                int ordinal = cVar.f403603b.ordinal();
                java.lang.String str2 = cVar.f403604c;
                if (ordinal == 1) {
                    sb6.append('=');
                    sb6.append(str2);
                } else if (ordinal == 2) {
                    sb6.append("~=");
                    sb6.append(str2);
                } else if (ordinal == 3) {
                    sb6.append("|=");
                    sb6.append(str2);
                }
                sb6.append(']');
            }
        }
        java.util.List list2 = this.f403854d;
        if (list2 != null) {
            java.util.Iterator it6 = ((java.util.ArrayList) list2).iterator();
            while (it6.hasNext()) {
                s7.i iVar = (s7.i) it6.next();
                sb6.append(':');
                sb6.append(iVar);
            }
        }
        return sb6.toString();
    }
}

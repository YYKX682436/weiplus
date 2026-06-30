package x6;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final x6.g f452152a = new x6.g(null);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f452153b = new java.util.HashMap();

    public java.lang.Object a(x6.q qVar) {
        java.util.HashMap hashMap = (java.util.HashMap) this.f452153b;
        x6.g gVar = (x6.g) hashMap.get(qVar);
        if (gVar == null) {
            gVar = new x6.g(qVar);
            hashMap.put(qVar, gVar);
        } else {
            qVar.a();
        }
        x6.g gVar2 = gVar.f452151d;
        gVar2.f452150c = gVar.f452150c;
        gVar.f452150c.f452151d = gVar2;
        x6.g gVar3 = this.f452152a;
        gVar.f452151d = gVar3;
        x6.g gVar4 = gVar3.f452150c;
        gVar.f452150c = gVar4;
        gVar4.f452151d = gVar;
        gVar.f452151d.f452150c = gVar;
        java.util.List list = gVar.f452149b;
        int size = list != null ? ((java.util.ArrayList) list).size() : 0;
        if (size > 0) {
            return ((java.util.ArrayList) gVar.f452149b).remove(size - 1);
        }
        return null;
    }

    public void b(x6.q qVar, java.lang.Object obj) {
        java.util.HashMap hashMap = (java.util.HashMap) this.f452153b;
        x6.g gVar = (x6.g) hashMap.get(qVar);
        if (gVar == null) {
            gVar = new x6.g(qVar);
            x6.g gVar2 = gVar.f452151d;
            gVar2.f452150c = gVar.f452150c;
            gVar.f452150c.f452151d = gVar2;
            x6.g gVar3 = this.f452152a;
            gVar.f452151d = gVar3.f452151d;
            gVar.f452150c = gVar3;
            gVar3.f452151d = gVar;
            gVar.f452151d.f452150c = gVar;
            hashMap.put(qVar, gVar);
        } else {
            qVar.a();
        }
        if (gVar.f452149b == null) {
            gVar.f452149b = new java.util.ArrayList();
        }
        ((java.util.ArrayList) gVar.f452149b).add(obj);
    }

    public java.lang.Object c() {
        x6.g gVar = this.f452152a;
        x6.g gVar2 = gVar.f452151d;
        while (true) {
            if (gVar2.equals(gVar)) {
                return null;
            }
            java.util.List list = gVar2.f452149b;
            int size = list != null ? ((java.util.ArrayList) list).size() : 0;
            java.lang.Object remove = size > 0 ? ((java.util.ArrayList) gVar2.f452149b).remove(size - 1) : null;
            if (remove != null) {
                return remove;
            }
            x6.g gVar3 = gVar2.f452151d;
            gVar3.f452150c = gVar2.f452150c;
            gVar2.f452150c.f452151d = gVar3;
            java.util.HashMap hashMap = (java.util.HashMap) this.f452153b;
            java.lang.Object obj = gVar2.f452148a;
            hashMap.remove(obj);
            ((x6.q) obj).a();
            gVar2 = gVar2.f452151d;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GroupedLinkedMap( ");
        x6.g gVar = this.f452152a;
        x6.g gVar2 = gVar.f452150c;
        boolean z17 = false;
        while (!gVar2.equals(gVar)) {
            sb6.append('{');
            sb6.append(gVar2.f452148a);
            sb6.append(':');
            java.util.List list = gVar2.f452149b;
            sb6.append(list != null ? ((java.util.ArrayList) list).size() : 0);
            sb6.append("}, ");
            gVar2 = gVar2.f452150c;
            z17 = true;
        }
        if (z17) {
            sb6.delete(sb6.length() - 2, sb6.length());
        }
        sb6.append(" )");
        return sb6.toString();
    }
}

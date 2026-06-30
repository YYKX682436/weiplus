package l36;

/* loaded from: classes16.dex */
public class o0 extends m36.a {
    @Override // m36.a
    public java.net.Socket a(l36.t tVar, l36.a aVar, o36.j jVar) {
        java.util.Iterator it = ((java.util.ArrayDeque) tVar.f315642d).iterator();
        while (it.hasNext()) {
            o36.d dVar = (o36.d) it.next();
            if (dVar.g(aVar, null)) {
                if ((dVar.f342765h != null) && dVar != jVar.b()) {
                    if (jVar.f342799n != null || ((java.util.ArrayList) jVar.f342795j.f342771n).size() != 1) {
                        throw new java.lang.IllegalStateException();
                    }
                    java.lang.ref.Reference reference = (java.lang.ref.Reference) ((java.util.ArrayList) jVar.f342795j.f342771n).get(0);
                    java.net.Socket c17 = jVar.c(true, false, false);
                    jVar.f342795j = dVar;
                    ((java.util.ArrayList) dVar.f342771n).add(reference);
                    return c17;
                }
            }
        }
        return null;
    }

    @Override // m36.a
    public o36.d b(l36.t tVar, l36.a aVar, o36.j jVar, l36.d1 d1Var) {
        java.util.Iterator it = ((java.util.ArrayDeque) tVar.f315642d).iterator();
        while (it.hasNext()) {
            o36.d dVar = (o36.d) it.next();
            if (dVar.g(aVar, d1Var)) {
                jVar.a(dVar, true);
                return dVar;
            }
        }
        return null;
    }
}

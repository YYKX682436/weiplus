package t2;

/* loaded from: classes14.dex */
public abstract class p {
    public static wa.a a(t2.m mVar) {
        t2.k kVar = new t2.k();
        t2.o oVar = new t2.o(kVar);
        kVar.f414653b = oVar;
        kVar.f414652a = mVar.getClass();
        try {
            java.lang.Object attachCompleter = mVar.attachCompleter(kVar);
            if (attachCompleter != null) {
                kVar.f414652a = attachCompleter;
            }
        } catch (java.lang.Exception e17) {
            t2.j jVar = oVar.f414658e;
            jVar.getClass();
            if (t2.j.f414647i.b(jVar, null, new t2.e(e17))) {
                t2.j.b(jVar);
            }
        }
        return oVar;
    }
}

package n0;

/* loaded from: classes14.dex */
public final class m3 {
    public m3(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(n0.m3 m3Var, n0.n3 n3Var) {
        kotlinx.coroutines.flow.h3 h3Var;
        p0.g gVar;
        s0.b bVar;
        m3Var.getClass();
        do {
            h3Var = (kotlinx.coroutines.flow.h3) n0.b4.f333443r;
            gVar = (p0.g) h3Var.getValue();
            bVar = (s0.b) gVar;
            r0.d dVar = bVar.f401844f;
            s0.a aVar = (s0.a) dVar.get(n3Var);
            if (aVar != null) {
                int hashCode = n3Var != null ? n3Var.hashCode() : 0;
                r0.u uVar = dVar.f367963d;
                r0.u v17 = uVar.v(hashCode, n3Var, 0);
                if (uVar != v17) {
                    dVar = v17 == null ? r0.d.f367962f : new r0.d(v17, dVar.f367964e - 1);
                }
                t0.b bVar2 = t0.b.f414261a;
                java.lang.Object obj = aVar.f401839a;
                boolean z17 = obj != bVar2;
                java.lang.Object obj2 = aVar.f401840b;
                if (z17) {
                    java.lang.Object obj3 = dVar.get(obj);
                    kotlin.jvm.internal.o.d(obj3);
                    dVar = dVar.b(obj, new s0.a(((s0.a) obj3).f401839a, obj2));
                }
                if (obj2 != bVar2) {
                    java.lang.Object obj4 = dVar.get(obj2);
                    kotlin.jvm.internal.o.d(obj4);
                    dVar = dVar.b(obj2, new s0.a(obj, ((s0.a) obj4).f401840b));
                }
                java.lang.Object obj5 = !(obj != bVar2) ? obj2 : bVar.f401842d;
                if (obj2 != bVar2) {
                    obj = bVar.f401843e;
                }
                bVar = new s0.b(obj5, obj, dVar);
            }
            if (gVar == bVar) {
                return;
            }
        } while (!h3Var.j(gVar, bVar));
    }
}

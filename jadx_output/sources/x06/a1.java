package x06;

/* loaded from: classes15.dex */
public abstract class a1 {
    public static final java.lang.String a(o06.d callableMemberDescriptor) {
        kotlin.jvm.internal.o.g(callableMemberDescriptor, "callableMemberDescriptor");
        o06.d b17 = l06.o.A(callableMemberDescriptor) ? b(callableMemberDescriptor) : null;
        if (b17 == null) {
            return null;
        }
        o06.d l17 = v16.f.l(b17);
        if (l17 instanceof o06.o1) {
            l06.o.A(l17);
            o06.d b18 = v16.f.b(v16.f.l(l17), false, x06.m.f451275d, 1, null);
            if (b18 == null) {
                return null;
            }
            java.util.Map map = x06.k.f451266a;
            n16.g gVar = (n16.g) x06.k.f451266a.get(v16.f.g(b18));
            if (gVar != null) {
                return gVar.h();
            }
            return null;
        }
        if (!(l17 instanceof o06.v1)) {
            return null;
        }
        int i17 = x06.g.f451241m;
        java.util.Map map2 = x06.g1.f451251j;
        java.lang.String b19 = g16.w0.b((o06.v1) l17);
        n16.g gVar2 = b19 == null ? null : (n16.g) ((java.util.LinkedHashMap) map2).get(b19);
        if (gVar2 != null) {
            return gVar2.h();
        }
        return null;
    }

    public static final o06.d b(o06.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        x06.c1 c1Var = x06.g1.f451242a;
        if (!((java.util.ArrayList) x06.g1.f451252k).contains(dVar.getName())) {
            java.util.Map map = x06.k.f451266a;
            if (!x06.k.f451269d.contains(v16.f.l(dVar).getName())) {
                return null;
            }
        }
        if (dVar instanceof o06.o1 ? true : dVar instanceof o06.n1) {
            return v16.f.b(dVar, false, x06.x0.f451336d, 1, null);
        }
        if (dVar instanceof o06.v1) {
            return v16.f.b(dVar, false, x06.y0.f451337d, 1, null);
        }
        return null;
    }

    public static final o06.d c(o06.d dVar) {
        kotlin.jvm.internal.o.g(dVar, "<this>");
        o06.d b17 = b(dVar);
        if (b17 != null) {
            return b17;
        }
        x06.j jVar = x06.j.f451264m;
        n16.g name = dVar.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        if (jVar.b(name)) {
            return v16.f.b(dVar, false, x06.z0.f451341d, 1, null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x014a, code lost:
    
        if (r6 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014d, code lost:
    
        if (r0 == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
    
        return !l06.o.A(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(o06.g r12, o06.b r13) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x06.a1.d(o06.g, o06.b):boolean");
    }
}

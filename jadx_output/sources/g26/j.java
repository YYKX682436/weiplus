package g26;

/* loaded from: classes16.dex */
public abstract class j extends f26.m {
    public f26.c3 a(i26.i type) {
        f26.c3 a17;
        kotlin.jvm.internal.o.g(type, "type");
        if (!(type instanceof f26.o0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        f26.c3 origin = ((f26.o0) type).z0();
        if (origin instanceof f26.z0) {
            a17 = b((f26.z0) origin);
        } else {
            if (!(origin instanceof f26.e0)) {
                throw new jz5.j();
            }
            f26.e0 e0Var = (f26.e0) origin;
            f26.z0 b17 = b(e0Var.f259153e);
            f26.z0 b18 = b(e0Var.f259154f);
            a17 = (b17 == e0Var.f259153e && b18 == e0Var.f259154f) ? origin : f26.r0.a(b17, b18);
        }
        g26.i iVar = new g26.i(this);
        kotlin.jvm.internal.o.g(a17, "<this>");
        kotlin.jvm.internal.o.g(origin, "origin");
        f26.o0 a18 = f26.b3.a(origin);
        return f26.b3.c(a17, a18 != null ? (f26.o0) iVar.invoke(a18) : null);
    }

    public final f26.z0 b(f26.z0 z0Var) {
        f26.o0 type;
        f26.c2 w07 = z0Var.w0();
        boolean z17 = false;
        f26.n0 n0Var = null;
        r5 = null;
        f26.c3 c3Var = null;
        if (!(w07 instanceof s16.c)) {
            if (!(w07 instanceof f26.n0) || !z0Var.x0()) {
                return z0Var;
            }
            f26.n0 n0Var2 = (f26.n0) w07;
            java.util.LinkedHashSet linkedHashSet = n0Var2.f259198b;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedHashSet, 10));
            java.util.Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(j26.c.j((f26.o0) it.next()));
                z17 = true;
            }
            if (z17) {
                f26.o0 o0Var = n0Var2.f259197a;
                f26.o0 j17 = o0Var != null ? j26.c.j(o0Var) : null;
                arrayList.isEmpty();
                java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                n0Var = new f26.n0(linkedHashSet2, j17);
            }
            if (n0Var != null) {
                n0Var2 = n0Var;
            }
            return n0Var2.b();
        }
        s16.c cVar = (s16.c) w07;
        f26.l2 l2Var = cVar.f402190a;
        if (!(l2Var.c() == f26.d3.f259144g)) {
            l2Var = null;
        }
        if (l2Var != null && (type = l2Var.getType()) != null) {
            c3Var = type.z0();
        }
        f26.c3 c3Var2 = c3Var;
        if (cVar.f402191b == null) {
            f26.l2 projection = cVar.f402190a;
            java.util.Collection a17 = cVar.a();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(a17, 10));
            java.util.Iterator it6 = a17.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((f26.o0) it6.next()).z0());
            }
            kotlin.jvm.internal.o.g(projection, "projection");
            cVar.f402191b = new g26.s(projection, new g26.o(arrayList2), null, null, 8, null);
        }
        i26.b bVar = i26.b.f288087d;
        g26.s sVar = cVar.f402191b;
        kotlin.jvm.internal.o.d(sVar);
        return new g26.n(bVar, sVar, c3Var2, z0Var.v0(), z0Var.x0(), false, 32, null);
    }
}

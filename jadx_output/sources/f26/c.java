package f26;

/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final f26.c f259137a = new f26.c();

    public final boolean a(f26.b2 b2Var, i26.j type, f26.a2 supertypesPolicy) {
        kotlin.jvm.internal.o.g(b2Var, "<this>");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(supertypesPolicy, "supertypesPolicy");
        i26.o oVar = b2Var.f259131c;
        if (!((oVar.N(type) && !oVar.r0(type)) || oVar.U(type))) {
            b2Var.c();
            java.util.ArrayDeque arrayDeque = b2Var.f259135g;
            kotlin.jvm.internal.o.d(arrayDeque);
            java.util.Set set = b2Var.f259136h;
            kotlin.jvm.internal.o.d(set);
            arrayDeque.push(type);
            while (!arrayDeque.isEmpty()) {
                o26.u uVar = (o26.u) set;
                if (uVar.f342616e > 1000) {
                    throw new java.lang.IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + kz5.n0.g0(set, null, null, null, 0, null, null, 63, null)).toString());
                }
                i26.j jVar = (i26.j) arrayDeque.pop();
                kotlin.jvm.internal.o.d(jVar);
                if (uVar.add(jVar)) {
                    f26.a2 a2Var = oVar.r0(jVar) ? f26.y1.f259239a : supertypesPolicy;
                    if (!(!kotlin.jvm.internal.o.b(a2Var, r10))) {
                        a2Var = null;
                    }
                    if (a2Var == null) {
                        continue;
                    } else {
                        java.util.Iterator it = oVar.V(oVar.o(jVar)).iterator();
                        while (it.hasNext()) {
                            i26.j a17 = a2Var.a(b2Var, (i26.i) it.next());
                            if ((oVar.N(a17) && !oVar.r0(a17)) || oVar.U(a17)) {
                                b2Var.a();
                            } else {
                                arrayDeque.add(a17);
                            }
                        }
                    }
                }
            }
            b2Var.a();
            return false;
        }
        return true;
    }

    public final boolean b(f26.b2 b2Var, i26.j jVar, i26.m mVar) {
        i26.o oVar = b2Var.f259131c;
        if (oVar.p(jVar)) {
            return true;
        }
        if (oVar.r0(jVar)) {
            return false;
        }
        if (b2Var.f259130b && oVar.t(jVar)) {
            return true;
        }
        return oVar.L(oVar.o(jVar), mVar);
    }
}

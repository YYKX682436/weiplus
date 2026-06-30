package l06;

/* loaded from: classes15.dex */
public abstract class j {
    public static final int a(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        p06.c a17 = o0Var.getAnnotations().a(l06.w.f314937r);
        if (a17 == null) {
            return 0;
        }
        t16.g gVar = (t16.g) kz5.c1.h(a17.c(), l06.x.f314950e);
        kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((java.lang.Number) ((t16.o) gVar).f414613a).intValue();
    }

    public static final f26.z0 b(l06.o builtIns, p06.k kVar, f26.o0 o0Var, java.util.List contextReceiverTypes, java.util.List parameterTypes, java.util.List list, f26.o0 returnType, boolean z17) {
        o06.g k17;
        n16.g gVar;
        p06.k annotations = kVar;
        kotlin.jvm.internal.o.g(builtIns, "builtIns");
        kotlin.jvm.internal.o.g(annotations, "annotations");
        kotlin.jvm.internal.o.g(contextReceiverTypes, "contextReceiverTypes");
        kotlin.jvm.internal.o.g(parameterTypes, "parameterTypes");
        kotlin.jvm.internal.o.g(returnType, "returnType");
        java.util.ArrayList arrayList = new java.util.ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (o0Var != null ? 1 : 0) + 1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(contextReceiverTypes, 10));
        java.util.Iterator it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList2.add(j26.c.a((f26.o0) it.next()));
        }
        arrayList.addAll(arrayList2);
        o26.a.a(arrayList, o0Var != null ? j26.c.a(o0Var) : null);
        java.util.Iterator it6 = parameterTypes.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it6.hasNext();
            p06.k kVar2 = p06.i.f350765a;
            if (!hasNext) {
                arrayList.add(j26.c.a(returnType));
                int size = parameterTypes.size() + contextReceiverTypes.size() + (o0Var == null ? 0 : 1);
                if (z17) {
                    k17 = builtIns.w(size);
                } else {
                    n16.g gVar2 = l06.x.f314946a;
                    k17 = builtIns.k("Function" + size);
                }
                kotlin.jvm.internal.o.d(k17);
                if (o0Var != null) {
                    n16.c cVar = l06.w.f314936q;
                    if (!annotations.I(cVar)) {
                        java.util.List s07 = kz5.n0.s0(annotations, new p06.o(builtIns, cVar, kz5.q0.f314001d, false));
                        annotations = ((java.util.ArrayList) s07).isEmpty() ? kVar2 : new p06.l(s07);
                    }
                }
                if (!contextReceiverTypes.isEmpty()) {
                    int size2 = contextReceiverTypes.size();
                    n16.c cVar2 = l06.w.f314937r;
                    if (annotations.I(cVar2)) {
                        kVar2 = annotations;
                    } else {
                        java.util.List s08 = kz5.n0.s0(annotations, new p06.o(builtIns, cVar2, kz5.b1.e(new jz5.l(l06.x.f314950e, new t16.o(size2))), false));
                        if (!((java.util.ArrayList) s08).isEmpty()) {
                            kVar2 = new p06.l(s08);
                        }
                    }
                    annotations = kVar2;
                }
                return f26.r0.c(f26.s1.b(annotations), k17, arrayList);
            }
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            f26.o0 o0Var2 = (f26.o0) next;
            if (list == null || (gVar = (n16.g) list.get(i17)) == null || gVar.f334170e) {
                gVar = null;
            }
            if (gVar != null) {
                n16.c cVar3 = l06.w.f314938s;
                n16.g gVar3 = l06.x.f314949d;
                java.lang.String h17 = gVar.h();
                kotlin.jvm.internal.o.f(h17, "asString(...)");
                java.util.List s09 = kz5.n0.s0(o0Var2.getAnnotations(), new p06.o(builtIns, cVar3, kz5.b1.e(new jz5.l(gVar3, new t16.b0(h17))), false));
                if (!((java.util.ArrayList) s09).isEmpty()) {
                    kVar2 = new p06.l(s09);
                }
                o0Var2 = j26.c.k(o0Var2, kVar2);
            }
            arrayList.add(j26.c.a(o0Var2));
            i17 = i18;
        }
    }

    public static final n16.g c(f26.o0 o0Var) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        p06.c a17 = o0Var.getAnnotations().a(l06.w.f314938s);
        if (a17 == null) {
            return null;
        }
        java.lang.Object A0 = kz5.n0.A0(a17.c().values());
        t16.b0 b0Var = A0 instanceof t16.b0 ? (t16.b0) A0 : null;
        if (b0Var != null && (str = (java.lang.String) b0Var.f414613a) != null) {
            if (!n16.g.l(str)) {
                str = null;
            }
            if (str != null) {
                return n16.g.k(str);
            }
        }
        return null;
    }

    public static final java.util.List d(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        h(o0Var);
        int a17 = a(o0Var);
        if (a17 == 0) {
            return kz5.p0.f313996d;
        }
        java.util.List subList = o0Var.u0().subList(0, a17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        java.util.Iterator it = subList.iterator();
        while (it.hasNext()) {
            f26.o0 type = ((f26.l2) it.next()).getType();
            kotlin.jvm.internal.o.f(type, "getType(...)");
            arrayList.add(type);
        }
        return arrayList;
    }

    public static final m06.m e(o06.m mVar) {
        kotlin.jvm.internal.o.g(mVar, "<this>");
        if (!(mVar instanceof o06.g) || !l06.o.L(mVar)) {
            return null;
        }
        n16.e h17 = v16.f.h(mVar);
        if (!h17.e() || h17.d()) {
            return null;
        }
        m06.o oVar = m06.o.f322611b;
        n16.c e17 = h17.h().e();
        kotlin.jvm.internal.o.f(e17, "parent(...)");
        java.lang.String h18 = h17.g().h();
        kotlin.jvm.internal.o.f(h18, "asString(...)");
        oVar.getClass();
        m06.n a17 = oVar.a(e17, h18);
        if (a17 != null) {
            return a17.f322609a;
        }
        return null;
    }

    public static final f26.o0 f(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        h(o0Var);
        if (o0Var.getAnnotations().a(l06.w.f314936q) != null) {
            return ((f26.l2) o0Var.u0().get(a(o0Var))).getType();
        }
        return null;
    }

    public static final java.util.List g(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        h(o0Var);
        java.util.List u07 = o0Var.u0();
        int a17 = a(o0Var);
        int i17 = 0;
        if (h(o0Var)) {
            if (o0Var.getAnnotations().a(l06.w.f314936q) != null) {
                i17 = 1;
            }
        }
        return u07.subList(a17 + i17, u07.size() - 1);
    }

    public static final boolean h(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        o06.j i17 = o0Var.w0().i();
        if (i17 == null) {
            return false;
        }
        m06.m e17 = e(i17);
        return kotlin.jvm.internal.o.b(e17, m06.i.f322603c) || kotlin.jvm.internal.o.b(e17, m06.l.f322606c);
    }

    public static final boolean i(f26.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        o06.j i17 = o0Var.w0().i();
        return kotlin.jvm.internal.o.b(i17 != null ? e(i17) : null, m06.l.f322606c);
    }
}

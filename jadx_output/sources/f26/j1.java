package f26;

/* loaded from: classes16.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final f26.n1 f259179a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f259180b;

    static {
        new f26.j1(f26.m1.f259196a, false);
    }

    public j1(f26.n1 reportStrategy, boolean z17) {
        kotlin.jvm.internal.o.g(reportStrategy, "reportStrategy");
        this.f259179a = reportStrategy;
        this.f259180b = z17;
    }

    public final void a(p06.k kVar, p06.k kVar2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((p06.c) it.next()).a());
        }
        java.util.Iterator it6 = kVar2.iterator();
        while (it6.hasNext()) {
            if (hashSet.contains(((p06.c) it6.next()).a())) {
                ((f26.m1) this.f259179a).getClass();
            }
        }
    }

    public final f26.z0 b(f26.l1 l1Var, f26.r1 r1Var, boolean z17, int i17, boolean z18) {
        f26.r1 b17;
        f26.o oVar;
        f26.o oVar2;
        f26.l2 c17 = c(new f26.n2(f26.d3.f259143f, ((d26.p0) l1Var.f259192b).v0()), l1Var, null, i17);
        f26.o0 type = c17.getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        f26.z0 a17 = f26.r2.a(type);
        if (f26.s0.a(a17)) {
            return a17;
        }
        c17.c();
        a(a17.getAnnotations(), f26.p.a(r1Var));
        if (!f26.s0.a(a17)) {
            if (f26.s0.a(a17)) {
                b17 = a17.v0();
            } else {
                f26.r1 other = a17.v0();
                kotlin.jvm.internal.o.g(other, "other");
                if (r1Var.isEmpty() && other.isEmpty()) {
                    b17 = r1Var;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    f26.q1 q1Var = f26.r1.f259214e;
                    java.util.Collection values = q1Var.f315269a.values();
                    kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                    java.util.Iterator it = values.iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Number) it.next()).intValue();
                        f26.o1 o1Var = (f26.o1) r1Var.f315227d.get(intValue);
                        f26.o1 o1Var2 = (f26.o1) other.f315227d.get(intValue);
                        if (o1Var == null) {
                            if (o1Var2 != null) {
                                oVar2 = (f26.o) o1Var2;
                                f26.o oVar3 = (f26.o) o1Var;
                                if (oVar3 != null) {
                                    oVar = new f26.o(p06.m.a(oVar2.f259202a, oVar3.f259202a));
                                    oVar2 = oVar;
                                }
                            } else {
                                oVar2 = null;
                            }
                            o26.a.a(arrayList, oVar2);
                        } else {
                            f26.o oVar4 = (f26.o) o1Var;
                            f26.o oVar5 = (f26.o) o1Var2;
                            if (oVar5 == null) {
                                oVar2 = oVar4;
                                o26.a.a(arrayList, oVar2);
                            } else {
                                oVar = new f26.o(p06.m.a(oVar4.f259202a, oVar5.f259202a));
                                oVar2 = oVar;
                                o26.a.a(arrayList, oVar2);
                            }
                        }
                    }
                    b17 = q1Var.b(arrayList);
                }
            }
            a17 = f26.r2.d(a17, null, b17, 1, null);
        }
        f26.z0 k17 = f26.z2.k(a17, z17);
        kotlin.jvm.internal.o.f(k17, "let(...)");
        if (!z18) {
            return k17;
        }
        r06.k kVar = ((r06.l) l1Var.f259192b).f368482n;
        kotlin.jvm.internal.o.f(kVar, "getTypeConstructor(...)");
        return f26.d1.c(k17, f26.r0.f(r1Var, kVar, l1Var.f259193c, z17, y16.r.f458973b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f26.l2 c(f26.l2 l2Var, f26.l1 l1Var, o06.e2 e2Var, int i17) {
        f26.d3 d3Var;
        f26.o oVar;
        f26.o oVar2;
        f26.d3 d3Var2;
        f26.d3 d3Var3;
        f26.n2 n2Var;
        o06.x0 x0Var = l1Var.f259192b;
        if (i17 > 100) {
            throw new java.lang.AssertionError("Too deep recursion while expanding type alias " + ((r06.v) x0Var).getName());
        }
        if (l2Var.b()) {
            kotlin.jvm.internal.o.d(e2Var);
            return f26.z2.l(e2Var);
        }
        f26.o0 type = l2Var.getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        f26.c2 constructor = type.w0();
        kotlin.jvm.internal.o.g(constructor, "constructor");
        o06.j i18 = constructor.i();
        f26.l2 l2Var2 = i18 instanceof o06.e2 ? (f26.l2) l1Var.f259194d.get(i18) : null;
        f26.n1 n1Var = this.f259179a;
        if (l2Var2 == null) {
            f26.c3 z07 = l2Var.getType().z0();
            kotlin.jvm.internal.o.g(z07, "<this>");
            f26.z0 a17 = f26.r2.a(z07);
            if (f26.s0.a(a17) || !f26.z2.c(a17, j26.b.f297330d)) {
                return l2Var;
            }
            f26.c2 w07 = a17.w0();
            o06.j i19 = w07.i();
            w07.getParameters().size();
            a17.u0().size();
            if (i19 instanceof o06.e2) {
                return l2Var;
            }
            int i27 = 0;
            if (i19 instanceof o06.d2) {
                o06.d2 d2Var = (o06.d2) i19;
                if (l1Var.a(d2Var)) {
                    ((f26.m1) n1Var).getClass();
                    f26.d3 d3Var4 = f26.d3.f259143f;
                    h26.l lVar = h26.l.f278357i;
                    java.lang.String str = ((r06.v) d2Var).getName().f334169d;
                    kotlin.jvm.internal.o.f(str, "toString(...)");
                    return new f26.n2(d3Var4, h26.m.c(lVar, str));
                }
                java.util.List u07 = a17.u0();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(u07, 10));
                for (java.lang.Object obj : u07) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    arrayList.add(c((f26.l2) obj, l1Var, (o06.e2) w07.getParameters().get(i27), i17 + 1));
                    i27 = i28;
                }
                n2Var = new f26.n2(l2Var.c(), f26.d1.c(b(f26.l1.f259190e.a(l1Var, d2Var, arrayList), a17.v0(), a17.x0(), i17 + 1, false), d(a17, l1Var, i17)));
            } else {
                f26.z0 d17 = d(a17, l1Var, i17);
                f26.v2.d(d17);
                for (java.lang.Object obj2 : d17.u0()) {
                    int i29 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    f26.l2 l2Var3 = (f26.l2) obj2;
                    if (!l2Var3.b()) {
                        f26.o0 type2 = l2Var3.getType();
                        kotlin.jvm.internal.o.f(type2, "getType(...)");
                        if (!f26.z2.c(type2, j26.a.f297329d)) {
                            f26.l2 l2Var4 = (f26.l2) a17.u0().get(i27);
                            o06.e2 e2Var2 = (o06.e2) a17.w0().getParameters().get(i27);
                            if (this.f259180b) {
                                kotlin.jvm.internal.o.f(l2Var4.getType(), "getType(...)");
                                kotlin.jvm.internal.o.f(l2Var3.getType(), "getType(...)");
                                kotlin.jvm.internal.o.d(e2Var2);
                                ((f26.m1) n1Var).getClass();
                            }
                        }
                    }
                    i27 = i29;
                }
                n2Var = new f26.n2(l2Var.c(), d17);
            }
            return n2Var;
        }
        if (l2Var2.b()) {
            kotlin.jvm.internal.o.d(e2Var);
            return f26.z2.l(e2Var);
        }
        f26.c3 substitutedArgument = l2Var2.getType().z0();
        f26.d3 c17 = l2Var2.c();
        kotlin.jvm.internal.o.f(c17, "getProjectionKind(...)");
        f26.d3 c18 = l2Var.c();
        kotlin.jvm.internal.o.f(c18, "getProjectionKind(...)");
        o06.d2 typeAlias = l1Var.f259192b;
        if (c18 != c17 && c18 != (d3Var3 = f26.d3.f259143f)) {
            if (c17 == d3Var3) {
                c17 = c18;
            } else {
                ((f26.m1) n1Var).getClass();
                kotlin.jvm.internal.o.g(typeAlias, "typeAlias");
                kotlin.jvm.internal.o.g(substitutedArgument, "substitutedArgument");
            }
        }
        if (e2Var == null || (d3Var = e2Var.q()) == null) {
            d3Var = f26.d3.f259143f;
        }
        if (d3Var != c17 && d3Var != (d3Var2 = f26.d3.f259143f)) {
            if (c17 == d3Var2) {
                c17 = d3Var2;
            } else {
                ((f26.m1) n1Var).getClass();
                kotlin.jvm.internal.o.g(typeAlias, "typeAlias");
                kotlin.jvm.internal.o.g(substitutedArgument, "substitutedArgument");
            }
        }
        a(type.getAnnotations(), substitutedArgument.getAnnotations());
        f26.z0 k17 = f26.z2.k(f26.r2.a(substitutedArgument), type.x0());
        kotlin.jvm.internal.o.f(k17, "makeNullableIfNeeded(...)");
        f26.r1 v07 = type.v0();
        if (!f26.s0.a(k17)) {
            if (f26.s0.a(k17)) {
                v07 = k17.v0();
            } else {
                f26.r1 other = k17.v0();
                v07.getClass();
                kotlin.jvm.internal.o.g(other, "other");
                if (!v07.isEmpty() || !other.isEmpty()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    f26.q1 q1Var = f26.r1.f259214e;
                    java.util.Collection values = q1Var.f315269a.values();
                    kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                    java.util.Iterator it = values.iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Number) it.next()).intValue();
                        f26.o1 o1Var = (f26.o1) v07.f315227d.get(intValue);
                        f26.o1 o1Var2 = (f26.o1) other.f315227d.get(intValue);
                        if (o1Var == null) {
                            if (o1Var2 != null) {
                                oVar2 = (f26.o) o1Var2;
                                f26.o oVar3 = (f26.o) o1Var;
                                if (oVar3 != null) {
                                    oVar = new f26.o(p06.m.a(oVar2.f259202a, oVar3.f259202a));
                                    oVar2 = oVar;
                                }
                            } else {
                                oVar2 = null;
                            }
                            o26.a.a(arrayList2, oVar2);
                        } else {
                            f26.o oVar4 = (f26.o) o1Var;
                            f26.o oVar5 = (f26.o) o1Var2;
                            if (oVar5 == null) {
                                oVar2 = oVar4;
                                o26.a.a(arrayList2, oVar2);
                            } else {
                                oVar = new f26.o(p06.m.a(oVar4.f259202a, oVar5.f259202a));
                                oVar2 = oVar;
                                o26.a.a(arrayList2, oVar2);
                            }
                        }
                    }
                    v07 = q1Var.b(arrayList2);
                }
            }
            k17 = f26.r2.d(k17, null, v07, 1, null);
        }
        return new f26.n2(c17, k17);
    }

    public final f26.z0 d(f26.z0 z0Var, f26.l1 l1Var, int i17) {
        f26.c2 w07 = z0Var.w0();
        java.util.List u07 = z0Var.u0();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(u07, 10));
        int i18 = 0;
        for (java.lang.Object obj : u07) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            f26.l2 l2Var = (f26.l2) obj;
            f26.l2 c17 = c(l2Var, l1Var, (o06.e2) w07.getParameters().get(i18), i17 + 1);
            if (!c17.b()) {
                c17 = new f26.n2(c17.c(), f26.z2.j(c17.getType(), l2Var.getType().x0()));
            }
            arrayList.add(c17);
            i18 = i19;
        }
        return f26.r2.d(z0Var, arrayList, null, 2, null);
    }
}

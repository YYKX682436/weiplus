package f26;

/* loaded from: classes16.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final f26.b0 f259184a;

    /* renamed from: b, reason: collision with root package name */
    public final f26.g2 f259185b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f259186c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.v f259187d;

    public k2(f26.b0 projectionComputer, f26.g2 options, int i17, kotlin.jvm.internal.i iVar) {
        options = (i17 & 2) != 0 ? new f26.g2(false, false) : options;
        kotlin.jvm.internal.o.g(projectionComputer, "projectionComputer");
        kotlin.jvm.internal.o.g(options, "options");
        this.f259184a = projectionComputer;
        this.f259185b = options;
        e26.u uVar = new e26.u("Type parameter upper bound erasure results");
        this.f259186c = jz5.h.b(new f26.i2(this));
        this.f259187d = uVar.c(new f26.j2(this));
    }

    public final f26.o0 a(f26.c0 c0Var) {
        f26.o0 l17;
        f26.z0 z0Var = ((c16.a) c0Var).f37949f;
        return (z0Var == null || (l17 = j26.c.l(z0Var)) == null) ? (h26.j) ((jz5.n) this.f259186c).getValue() : l17;
    }

    public final f26.o0 b(o06.e2 typeParameter, f26.c0 typeAttr) {
        kotlin.jvm.internal.o.g(typeParameter, "typeParameter");
        kotlin.jvm.internal.o.g(typeAttr, "typeAttr");
        java.lang.Object invoke = ((e26.r) this.f259187d).invoke(new f26.h2(typeParameter, typeAttr));
        kotlin.jvm.internal.o.f(invoke, "invoke(...)");
        return (f26.o0) invoke;
    }

    public final java.util.Set c(f26.v2 substitutor, java.util.List list, f26.c0 c0Var) {
        f26.c3 c3Var;
        java.util.Iterator it;
        lz5.q qVar = new lz5.q();
        java.util.Iterator it6 = list.iterator();
        if (it6.hasNext()) {
            f26.o0 o0Var = (f26.o0) it6.next();
            o06.j i17 = o0Var.w0().i();
            boolean z17 = i17 instanceof o06.g;
            f26.g2 g2Var = this.f259185b;
            if (z17) {
                java.util.Set set = ((c16.a) c0Var).f37948e;
                g2Var.getClass();
                kotlin.jvm.internal.o.g(substitutor, "substitutor");
                f26.c3 z07 = o0Var.z0();
                if (z07 instanceof f26.e0) {
                    f26.e0 e0Var = (f26.e0) z07;
                    f26.z0 z0Var = e0Var.f259153e;
                    if (!z0Var.w0().getParameters().isEmpty() && z0Var.w0().i() != null) {
                        java.util.List parameters = z0Var.w0().getParameters();
                        kotlin.jvm.internal.o.f(parameters, "getParameters(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(parameters, 10));
                        java.util.Iterator it7 = parameters.iterator();
                        while (it7.hasNext()) {
                            o06.e2 e2Var = (o06.e2) it7.next();
                            f26.l2 l2Var = (f26.l2) kz5.n0.a0(o0Var.u0(), e2Var.getIndex());
                            boolean z18 = set != null && set.contains(e2Var);
                            if (l2Var == null || z18) {
                                it = it7;
                            } else {
                                f26.q2 g17 = substitutor.g();
                                it = it7;
                                f26.o0 type = l2Var.getType();
                                kotlin.jvm.internal.o.f(type, "getType(...)");
                                if (g17.d(type) != null) {
                                    arrayList.add(l2Var);
                                    it7 = it;
                                }
                            }
                            l2Var = new f26.g1(e2Var);
                            arrayList.add(l2Var);
                            it7 = it;
                        }
                        z0Var = f26.r2.d(z0Var, arrayList, null, 2, null);
                    }
                    f26.z0 z0Var2 = e0Var.f259154f;
                    if (!z0Var2.w0().getParameters().isEmpty() && z0Var2.w0().i() != null) {
                        java.util.List<o06.e2> parameters2 = z0Var2.w0().getParameters();
                        kotlin.jvm.internal.o.f(parameters2, "getParameters(...)");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(parameters2, 10));
                        for (o06.e2 e2Var2 : parameters2) {
                            f26.l2 l2Var2 = (f26.l2) kz5.n0.a0(o0Var.u0(), e2Var2.getIndex());
                            boolean z19 = set != null && set.contains(e2Var2);
                            if (l2Var2 != null && !z19) {
                                f26.q2 g18 = substitutor.g();
                                f26.o0 type2 = l2Var2.getType();
                                kotlin.jvm.internal.o.f(type2, "getType(...)");
                                if (g18.d(type2) != null) {
                                    arrayList2.add(l2Var2);
                                }
                            }
                            l2Var2 = new f26.g1(e2Var2);
                            arrayList2.add(l2Var2);
                        }
                        z0Var2 = f26.r2.d(z0Var2, arrayList2, null, 2, null);
                    }
                    c3Var = f26.r0.a(z0Var, z0Var2);
                } else {
                    if (!(z07 instanceof f26.z0)) {
                        throw new jz5.j();
                    }
                    f26.z0 z0Var3 = (f26.z0) z07;
                    if (z0Var3.w0().getParameters().isEmpty() || z0Var3.w0().i() == null) {
                        c3Var = z0Var3;
                    } else {
                        java.util.List<o06.e2> parameters3 = z0Var3.w0().getParameters();
                        kotlin.jvm.internal.o.f(parameters3, "getParameters(...)");
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(parameters3, 10));
                        for (o06.e2 e2Var3 : parameters3) {
                            f26.l2 l2Var3 = (f26.l2) kz5.n0.a0(o0Var.u0(), e2Var3.getIndex());
                            boolean z27 = set != null && set.contains(e2Var3);
                            if (l2Var3 != null && !z27) {
                                f26.q2 g19 = substitutor.g();
                                f26.o0 type3 = l2Var3.getType();
                                kotlin.jvm.internal.o.f(type3, "getType(...)");
                                if (g19.d(type3) != null) {
                                    arrayList3.add(l2Var3);
                                }
                            }
                            l2Var3 = new f26.g1(e2Var3);
                            arrayList3.add(l2Var3);
                        }
                        c3Var = f26.r2.d(z0Var3, arrayList3, null, 2, null);
                    }
                }
                f26.o0 i18 = substitutor.i(f26.b3.b(c3Var, z07), f26.d3.f259145h);
                kotlin.jvm.internal.o.f(i18, "safeSubstitute(...)");
                qVar.add(i18);
            } else if (i17 instanceof o06.e2) {
                java.util.Set set2 = ((c16.a) c0Var).f37948e;
                if (set2 != null && set2.contains(i17)) {
                    qVar.add(a(c0Var));
                } else {
                    java.util.List upperBounds = ((o06.e2) i17).getUpperBounds();
                    kotlin.jvm.internal.o.f(upperBounds, "getUpperBounds(...)");
                    qVar.addAll(c(substitutor, upperBounds, c0Var));
                }
            }
            g2Var.getClass();
        }
        return kz5.o1.a(qVar);
    }
}

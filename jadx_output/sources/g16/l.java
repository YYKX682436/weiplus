package g16;

/* loaded from: classes15.dex */
public abstract class l implements b26.h {

    /* renamed from: b, reason: collision with root package name */
    public static final g16.i f267635b = new g16.i(null);

    /* renamed from: a, reason: collision with root package name */
    public final g16.k0 f267636a;

    public l(g16.k0 kotlinClassFinder) {
        kotlin.jvm.internal.o.g(kotlinClassFinder, "kotlinClassFinder");
        this.f267636a = kotlinClassFinder;
    }

    public static /* synthetic */ java.util.List m(g16.l lVar, b26.x0 x0Var, g16.u0 u0Var, boolean z17, boolean z18, java.lang.Boolean bool, boolean z19, int i17, java.lang.Object obj) {
        if (obj == null) {
            return lVar.l(x0Var, u0Var, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? false : z18, (i17 & 16) != 0 ? null : bool, (i17 & 32) != 0 ? false : z19);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ g16.u0 o(g16.l lVar, p16.h0 h0Var, k16.g gVar, k16.k kVar, b26.c cVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i17 & 16) != 0) {
            z17 = false;
        }
        return lVar.n(h0Var, gVar, kVar, cVar, z17);
    }

    @Override // b26.h
    public java.util.List a(b26.x0 container, i16.u0 proto) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        return s(container, proto, g16.j.f267631f);
    }

    @Override // b26.h
    public java.util.List b(b26.x0 container, p16.h0 proto, b26.c kind) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(kind, "kind");
        if (kind == b26.c.PROPERTY) {
            return s(container, (i16.u0) proto, g16.j.f267629d);
        }
        g16.u0 o17 = o(this, proto, container.f17537a, container.f17538b, kind, false, 16, null);
        return o17 == null ? kz5.p0.f313996d : m(this, container, o17, false, false, null, false, 60, null);
    }

    @Override // b26.h
    public java.util.List c(b26.x0 container, p16.h0 proto, b26.c kind) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(kind, "kind");
        g16.u0 o17 = o(this, proto, container.f17537a, container.f17538b, kind, false, 16, null);
        if (o17 == null) {
            return kz5.p0.f313996d;
        }
        return m(this, container, new g16.u0(o17.f267667a + "@0", null), false, false, null, false, 60, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r12 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r12 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        if (r12.f17533h != false) goto L45;
     */
    @Override // b26.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List d(b26.x0 r11, p16.h0 r12, b26.c r13, int r14, i16.y1 r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g16.l.d(b26.x0, p16.h0, b26.c, int, i16.y1):java.util.List");
    }

    @Override // b26.h
    public java.util.List e(i16.s1 proto, k16.g nameResolver) {
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        java.lang.Object f17 = proto.f(l16.r.f315099h);
        kotlin.jvm.internal.o.f(f17, "getExtension(...)");
        java.lang.Iterable<i16.k> iterable = (java.lang.Iterable) f17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        for (i16.k kVar : iterable) {
            kotlin.jvm.internal.o.d(kVar);
            arrayList.add(((g16.t) this).f267664f.a(kVar, nameResolver));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List f(b26.v0 container) {
        kotlin.jvm.internal.o.g(container, "container");
        o06.x1 x1Var = container.f17539c;
        g16.s0 s0Var = x1Var instanceof g16.s0 ? (g16.s0) x1Var : null;
        g16.q0 q0Var = s0Var != null ? s0Var.f267661b : null;
        if (q0Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            t06.c.f414533a.b(((t06.g) q0Var).f414536a, new g16.k(this, arrayList));
            return arrayList;
        }
        throw new java.lang.IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // b26.h
    public java.util.List h(b26.x0 container, i16.u0 proto) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        return s(container, proto, g16.j.f267630e);
    }

    @Override // b26.h
    public java.util.List j(i16.l1 proto, k16.g nameResolver) {
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        java.lang.Object f17 = proto.f(l16.r.f315097f);
        kotlin.jvm.internal.o.f(f17, "getExtension(...)");
        java.lang.Iterable<i16.k> iterable = (java.lang.Iterable) f17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        for (i16.k kVar : iterable) {
            kotlin.jvm.internal.o.d(kVar);
            arrayList.add(((g16.t) this).f267664f.a(kVar, nameResolver));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List k(b26.x0 container, i16.c0 proto) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        java.lang.String name = container.f17537a.getString(proto.f287378g);
        java.lang.String c17 = ((b26.v0) container).f17531f.c();
        kotlin.jvm.internal.o.f(c17, "asString(...)");
        java.lang.String desc = m16.b.b(c17);
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(desc, "desc");
        return m(this, container, new g16.u0(name + '#' + desc, null), false, false, null, false, 60, null);
    }

    public final java.util.List l(b26.x0 x0Var, g16.u0 u0Var, boolean z17, boolean z18, java.lang.Boolean bool, boolean z19) {
        java.util.List list;
        g16.q0 a17 = f267635b.a(x0Var, z17, z18, bool, z19, this.f267636a, ((g16.t) this).f267665g);
        if (a17 == null) {
            if (x0Var instanceof b26.v0) {
                o06.x1 x1Var = ((b26.v0) x0Var).f17539c;
                g16.s0 s0Var = x1Var instanceof g16.s0 ? (g16.s0) x1Var : null;
                if (s0Var != null) {
                    a17 = s0Var.f267661b;
                }
            }
            a17 = null;
        }
        kz5.p0 p0Var = kz5.p0.f313996d;
        return (a17 == null || (list = (java.util.List) ((g16.n) ((e26.r) ((g16.g) this).f267626c).invoke(a17)).f267637a.get(u0Var)) == null) ? p0Var : list;
    }

    public final g16.u0 n(p16.h0 proto, k16.g nameResolver, k16.k typeTable, b26.c kind, boolean z17) {
        g16.u0 u0Var;
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        kotlin.jvm.internal.o.g(kind, "kind");
        boolean z18 = proto instanceof i16.r;
        g16.t0 t0Var = g16.u0.f267666b;
        if (z18) {
            m16.e a17 = m16.j.f322899a.a((i16.r) proto, nameResolver, typeTable);
            if (a17 == null) {
                return null;
            }
            return t0Var.a(a17);
        }
        if (proto instanceof i16.j0) {
            m16.e c17 = m16.j.f322899a.c((i16.j0) proto, nameResolver, typeTable);
            if (c17 == null) {
                return null;
            }
            return t0Var.a(c17);
        }
        if (!(proto instanceof i16.u0)) {
            return null;
        }
        p16.u propertySignature = l16.r.f315095d;
        kotlin.jvm.internal.o.f(propertySignature, "propertySignature");
        l16.j jVar = (l16.j) k16.i.a((p16.s) proto, propertySignature);
        if (jVar == null) {
            return null;
        }
        int ordinal = kind.ordinal();
        if (ordinal == 1) {
            return g16.m.a((i16.u0) proto, nameResolver, typeTable, true, true, z17);
        }
        if (ordinal == 2) {
            if (!((jVar.f315047e & 4) == 4)) {
                return null;
            }
            l16.g gVar = jVar.f315050h;
            kotlin.jvm.internal.o.f(gVar, "getGetter(...)");
            java.lang.String name = nameResolver.getString(gVar.f315034f);
            java.lang.String desc = nameResolver.getString(gVar.f315035g);
            kotlin.jvm.internal.o.g(name, "name");
            kotlin.jvm.internal.o.g(desc, "desc");
            u0Var = new g16.u0(name.concat(desc), null);
        } else {
            if (ordinal != 3) {
                return null;
            }
            if (!((jVar.f315047e & 8) == 8)) {
                return null;
            }
            l16.g gVar2 = jVar.f315051i;
            kotlin.jvm.internal.o.f(gVar2, "getSetter(...)");
            java.lang.String name2 = nameResolver.getString(gVar2.f315034f);
            java.lang.String desc2 = nameResolver.getString(gVar2.f315035g);
            kotlin.jvm.internal.o.g(name2, "name");
            kotlin.jvm.internal.o.g(desc2, "desc");
            u0Var = new g16.u0(name2.concat(desc2), null);
        }
        return u0Var;
    }

    public final boolean p(n16.b classId) {
        kotlin.jvm.internal.o.g(classId, "classId");
        if (classId.g() == null || !kotlin.jvm.internal.o.b(classId.j().h(), "Container")) {
            return false;
        }
        g16.q0 a17 = g16.l0.a(this.f267636a, classId, ((g16.t) this).f267665g);
        if (a17 == null) {
            return false;
        }
        java.util.Set set = k06.a.f303160a;
        java.lang.Class klass = ((t06.g) a17).f414536a;
        kotlin.jvm.internal.o.g(klass, "klass");
        java.lang.annotation.Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        kotlin.jvm.internal.o.f(declaredAnnotations, "getDeclaredAnnotations(...)");
        boolean z17 = false;
        for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
            kotlin.jvm.internal.o.d(annotation);
            n16.b a18 = u06.i.a(xz5.a.b(xz5.a.a(annotation)));
            new t06.b(annotation);
            n16.c cVar = x06.o0.f451282a;
            if (kotlin.jvm.internal.o.b(a18, x06.o0.f451283b)) {
                z17 = true;
            }
        }
        return z17;
    }

    public abstract g16.m0 q(n16.b bVar, o06.x1 x1Var, java.util.List list);

    public final g16.m0 r(n16.b annotationClassId, o06.x1 source, java.util.List result) {
        kotlin.jvm.internal.o.g(annotationClassId, "annotationClassId");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.Set set = k06.a.f303160a;
        if (k06.a.f303160a.contains(annotationClassId)) {
            return null;
        }
        return q(annotationClassId, source, result);
    }

    public final java.util.List s(b26.x0 x0Var, i16.u0 u0Var, g16.j jVar) {
        java.lang.Boolean c17 = k16.f.B.c(u0Var.f287763g);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        boolean booleanValue = c17.booleanValue();
        boolean d17 = m16.j.d(u0Var);
        g16.j jVar2 = g16.j.f267629d;
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (jVar == jVar2) {
            g16.u0 b17 = g16.m.b(u0Var, x0Var.f17537a, x0Var.f17538b, false, true, false, 40, null);
            return b17 == null ? p0Var : m(this, x0Var, b17, true, false, java.lang.Boolean.valueOf(booleanValue), d17, 8, null);
        }
        g16.u0 b18 = g16.m.b(u0Var, x0Var.f17537a, x0Var.f17538b, true, false, false, 48, null);
        if (b18 == null) {
            return p0Var;
        }
        return r26.n0.D(b18.f267667a, "$delegate", false, 2, null) != (jVar == g16.j.f267631f) ? p0Var : l(x0Var, b18, true, true, java.lang.Boolean.valueOf(booleanValue), d17);
    }
}

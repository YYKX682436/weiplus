package r16;

/* loaded from: classes16.dex */
public final class z implements g26.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f368684a;

    /* renamed from: b, reason: collision with root package name */
    public final g26.f f368685b;

    /* renamed from: c, reason: collision with root package name */
    public final g26.l f368686c;

    /* renamed from: d, reason: collision with root package name */
    public final g26.j f368687d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f368688e;

    public z(java.util.Map map, g26.f equalityAxioms, g26.l kotlinTypeRefiner, g26.j kotlinTypePreparator, yz5.p pVar) {
        kotlin.jvm.internal.o.g(equalityAxioms, "equalityAxioms");
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlin.jvm.internal.o.g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f368684a = map;
        this.f368685b = equalityAxioms;
        this.f368686c = kotlinTypeRefiner;
        this.f368687d = kotlinTypePreparator;
        this.f368688e = pVar;
    }

    @Override // i26.o
    public boolean A(i26.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        return g26.b.L(this, g0(iVar)) != g26.b.L(this, l0(iVar));
    }

    @Override // i26.o
    public boolean B(i26.i iVar) {
        return g26.b.H(this, iVar);
    }

    @Override // i26.o
    public boolean C(i26.m mVar) {
        return g26.b.D(this, mVar);
    }

    @Override // i26.o
    public boolean D(i26.m mVar) {
        return g26.b.G(this, mVar);
    }

    @Override // i26.o
    public boolean E(i26.m mVar) {
        return g26.b.M(this, mVar);
    }

    @Override // i26.o
    public boolean F(i26.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        return (iVar instanceof i26.j) && g26.b.L(this, (i26.j) iVar);
    }

    @Override // i26.o
    public boolean G(i26.m mVar) {
        return g26.b.F(this, mVar);
    }

    @Override // i26.o
    public boolean H(i26.d receiver) {
        kotlin.jvm.internal.o.g(receiver, "$receiver");
        return receiver instanceof s16.a;
    }

    @Override // i26.o
    public i26.r I(i26.n nVar) {
        return g26.b.z(this, nVar);
    }

    @Override // i26.o
    public boolean J(i26.n nVar, i26.m mVar) {
        return g26.b.B(this, nVar, mVar);
    }

    @Override // i26.o
    public i26.l K(i26.c cVar) {
        return g26.b.a0(this, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (kotlin.jvm.internal.o.b(r3, r6) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, r5) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // i26.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean L(i26.m r5, i26.m r6) {
        /*
            r4 = this;
            java.lang.String r0 = "c1"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "c2"
            kotlin.jvm.internal.o.g(r6, r0)
            boolean r0 = r5 instanceof f26.c2
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L5c
            boolean r0 = r6 instanceof f26.c2
            if (r0 == 0) goto L52
            boolean r0 = g26.b.a(r4, r5, r6)
            r1 = 1
            if (r0 != 0) goto L51
            f26.c2 r5 = (f26.c2) r5
            f26.c2 r6 = (f26.c2) r6
            g26.f r0 = r4.f368685b
            boolean r0 = r0.a(r5, r6)
            r2 = 0
            if (r0 == 0) goto L29
            goto L4a
        L29:
            java.util.Map r0 = r4.f368684a
            if (r0 != 0) goto L2e
            goto L4c
        L2e:
            java.lang.Object r3 = r0.get(r5)
            f26.c2 r3 = (f26.c2) r3
            java.lang.Object r0 = r0.get(r6)
            f26.c2 r0 = (f26.c2) r0
            if (r3 == 0) goto L42
            boolean r6 = kotlin.jvm.internal.o.b(r3, r6)
            if (r6 != 0) goto L4a
        L42:
            if (r0 == 0) goto L4c
            boolean r5 = kotlin.jvm.internal.o.b(r0, r5)
            if (r5 == 0) goto L4c
        L4a:
            r5 = r1
            goto L4d
        L4c:
            r5 = r2
        L4d:
            if (r5 == 0) goto L50
            goto L51
        L50:
            r1 = r2
        L51:
            return r1
        L52:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L5c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r16.z.L(i26.m, i26.m):boolean");
    }

    @Override // i26.o
    public i26.j M(i26.g gVar) {
        return g26.b.U(this, gVar);
    }

    @Override // i26.o
    public boolean N(i26.j jVar) {
        kotlin.jvm.internal.o.g(jVar, "<this>");
        return g26.b.E(this, g26.b.e0(this, jVar));
    }

    @Override // g26.d
    public i26.i O(i26.j jVar, i26.j jVar2) {
        return g26.b.l(this, jVar, jVar2);
    }

    @Override // i26.o
    public boolean P(i26.d dVar) {
        return g26.b.P(this, dVar);
    }

    @Override // i26.o
    public i26.n Q(i26.m mVar, int i17) {
        return g26.b.p(this, mVar, i17);
    }

    @Override // i26.o
    public i26.g R(i26.i iVar) {
        return g26.b.g(this, iVar);
    }

    @Override // i26.o
    public i26.m S(i26.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        i26.j h17 = g26.b.h(this, iVar);
        if (h17 == null) {
            h17 = g0(iVar);
        }
        return g26.b.e0(this, h17);
    }

    @Override // i26.o
    public int T(i26.m mVar) {
        return g26.b.Y(this, mVar);
    }

    @Override // i26.o
    public boolean U(i26.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        i26.j h17 = g26.b.h(this, iVar);
        return (h17 != null ? g26.b.e(this, h17) : null) != null;
    }

    @Override // i26.o
    public java.util.Collection V(i26.m mVar) {
        return g26.b.c0(this, mVar);
    }

    @Override // i26.o
    public i26.b W(i26.d dVar) {
        return g26.b.k(this, dVar);
    }

    @Override // i26.o
    public i26.l X(i26.i iVar, int i17) {
        return g26.b.m(this, iVar, i17);
    }

    @Override // i26.o
    public boolean Y(i26.m mVar) {
        return g26.b.K(this, mVar);
    }

    @Override // f26.w2
    public i26.i Z(i26.i iVar) {
        i26.j h07;
        kotlin.jvm.internal.o.g(iVar, "<this>");
        i26.j h17 = g26.b.h(this, iVar);
        return (h17 == null || (h07 = g26.b.h0(this, h17, true)) == null) ? iVar : h07;
    }

    @Override // i26.o
    public boolean a(i26.j jVar) {
        return g26.b.O(this, jVar);
    }

    @Override // i26.o
    public java.util.List a0(i26.j jVar, i26.m constructor) {
        kotlin.jvm.internal.o.g(jVar, "<this>");
        kotlin.jvm.internal.o.g(constructor, "constructor");
        return null;
    }

    @Override // i26.o
    public i26.j b(i26.e eVar) {
        return g26.b.X(this, eVar);
    }

    @Override // i26.o
    public int b0(i26.k kVar) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        if (kVar instanceof i26.j) {
            return g26.b.b(this, (i26.i) kVar);
        }
        if (kVar instanceof i26.a) {
            return ((i26.a) kVar).size();
        }
        throw new java.lang.IllegalStateException(("unknown type argument list type: " + kVar + ", " + kotlin.jvm.internal.i0.a(kVar.getClass())).toString());
    }

    @Override // i26.o
    public f26.a2 c(i26.j jVar) {
        return g26.b.b0(this, jVar);
    }

    @Override // i26.o
    public i26.j c0(i26.j jVar, boolean z17) {
        return g26.b.h0(this, jVar, z17);
    }

    @Override // i26.o
    public i26.j d(i26.g gVar) {
        return g26.b.f0(this, gVar);
    }

    @Override // i26.o
    public boolean d0(i26.m mVar) {
        return g26.b.J(this, mVar);
    }

    @Override // i26.o
    public i26.l e(i26.i iVar) {
        return g26.b.i(this, iVar);
    }

    @Override // i26.o
    public boolean e0(i26.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        i26.j h17 = g26.b.h(this, iVar);
        return (h17 != null ? g26.b.d(this, h17) : null) != null;
    }

    @Override // i26.o
    public i26.i f(i26.l lVar) {
        return g26.b.u(this, lVar);
    }

    @Override // i26.o
    public i26.n f0(i26.m mVar) {
        return g26.b.v(this, mVar);
    }

    @Override // i26.o
    public boolean g(i26.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        i26.g g17 = g26.b.g(this, iVar);
        if (g17 == null) {
            return false;
        }
        g26.b.f(this, g17);
        return false;
    }

    @Override // i26.o
    public i26.j g0(i26.i iVar) {
        i26.j U;
        kotlin.jvm.internal.o.g(iVar, "<this>");
        i26.g g17 = g26.b.g(this, iVar);
        if (g17 != null && (U = g26.b.U(this, g17)) != null) {
            return U;
        }
        i26.j h17 = g26.b.h(this, iVar);
        kotlin.jvm.internal.o.d(h17);
        return h17;
    }

    @Override // i26.o
    public boolean h(i26.j jVar) {
        kotlin.jvm.internal.o.g(jVar, "<this>");
        return g26.b.J(this, g26.b.e0(this, jVar));
    }

    @Override // f26.w2
    public boolean h0(i26.m mVar) {
        return g26.b.I(this, mVar);
    }

    @Override // f26.w2
    public i26.i i(i26.i iVar) {
        return g26.b.w(this, iVar);
    }

    @Override // i26.o
    public i26.d i0(i26.j jVar) {
        return g26.b.d(this, jVar);
    }

    @Override // i26.o
    public i26.i j(i26.d dVar) {
        return g26.b.V(this, dVar);
    }

    @Override // i26.o
    public boolean j0(i26.m mVar) {
        return g26.b.E(this, mVar);
    }

    @Override // i26.o
    public i26.l k(i26.j jVar, int i17) {
        kotlin.jvm.internal.o.g(jVar, "<this>");
        boolean z17 = false;
        if (i17 >= 0 && i17 < g26.b.b(this, jVar)) {
            z17 = true;
        }
        if (z17) {
            return g26.b.m(this, jVar, i17);
        }
        return null;
    }

    @Override // i26.o
    public boolean k0(i26.j jVar) {
        g26.b.S(this, jVar);
        return false;
    }

    @Override // i26.o
    public i26.c l(i26.d dVar) {
        return g26.b.d0(this, dVar);
    }

    @Override // i26.o
    public i26.j l0(i26.i iVar) {
        i26.j f07;
        kotlin.jvm.internal.o.g(iVar, "<this>");
        i26.g g17 = g26.b.g(this, iVar);
        if (g17 != null && (f07 = g26.b.f0(this, g17)) != null) {
            return f07;
        }
        i26.j h17 = g26.b.h(this, iVar);
        kotlin.jvm.internal.o.d(h17);
        return h17;
    }

    @Override // i26.o
    public i26.l m(i26.k kVar, int i17) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        if (kVar instanceof i26.j) {
            return g26.b.m(this, (i26.i) kVar, i17);
        }
        if (kVar instanceof i26.a) {
            E e17 = ((i26.a) kVar).get(i17);
            kotlin.jvm.internal.o.f(e17, "get(...)");
            return (i26.l) e17;
        }
        throw new java.lang.IllegalStateException(("unknown type argument list type: " + kVar + ", " + kotlin.jvm.internal.i0.a(kVar.getClass())).toString());
    }

    @Override // i26.o
    public i26.j m0(i26.i iVar) {
        return g26.b.h(this, iVar);
    }

    @Override // i26.o
    public i26.r n(i26.l lVar) {
        return g26.b.y(this, lVar);
    }

    @Override // i26.o
    public boolean n0(i26.i iVar) {
        return g26.b.N(this, iVar);
    }

    @Override // i26.o
    public i26.m o(i26.j jVar) {
        return g26.b.e0(this, jVar);
    }

    @Override // i26.o
    public i26.i o0(i26.i iVar, boolean z17) {
        return g26.b.g0(this, iVar, z17);
    }

    @Override // i26.o
    public boolean p(i26.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        return g26.b.M(this, S(iVar)) && !g26.b.N(this, iVar);
    }

    @Override // f26.w2
    public i26.i p0(i26.n nVar) {
        return g26.b.t(this, nVar);
    }

    @Override // i26.o
    public i26.i q(i26.i iVar) {
        return g26.b.W(this, iVar);
    }

    @Override // i26.o
    public boolean q0(i26.l lVar) {
        return g26.b.Q(this, lVar);
    }

    @Override // i26.o
    public i26.e r(i26.j jVar) {
        return g26.b.e(this, jVar);
    }

    @Override // i26.o
    public boolean r0(i26.j jVar) {
        return g26.b.L(this, jVar);
    }

    @Override // i26.o
    public java.util.Collection s(i26.j jVar) {
        return g26.b.Z(this, jVar);
    }

    @Override // i26.o
    public boolean s0(i26.i receiver) {
        kotlin.jvm.internal.o.g(receiver, "$receiver");
        return receiver instanceof f26.w0;
    }

    @Override // i26.o
    public boolean t(i26.j jVar) {
        g26.b.R(this, jVar);
        return false;
    }

    @Override // i26.o
    public i26.i u(java.util.List types) {
        kotlin.jvm.internal.o.g(types, "types");
        return g26.e.a(types);
    }

    @Override // i26.o
    public int v(i26.i iVar) {
        return g26.b.b(this, iVar);
    }

    @Override // i26.o
    public i26.k w(i26.j jVar) {
        return g26.b.c(this, jVar);
    }

    @Override // i26.q
    public boolean x(i26.j jVar, i26.j jVar2) {
        return g26.b.C(this, jVar, jVar2);
    }

    @Override // i26.o
    public i26.j y(i26.j jVar) {
        i26.j X;
        kotlin.jvm.internal.o.g(jVar, "<this>");
        i26.e e17 = g26.b.e(this, jVar);
        return (e17 == null || (X = g26.b.X(this, e17)) == null) ? jVar : X;
    }

    @Override // i26.o
    public i26.j z(i26.j jVar, i26.b bVar) {
        return g26.b.j(this, jVar, bVar);
    }
}

package q16;

/* loaded from: classes16.dex */
public final class a0 extends q16.s implements q16.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final q16.g0 f359701d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f359702e;

    public a0(q16.g0 options) {
        kotlin.jvm.internal.o.g(options, "options");
        this.f359701d = options;
        this.f359702e = jz5.h.b(new q16.w(this));
    }

    public static /* synthetic */ void G(q16.a0 a0Var, java.lang.StringBuilder sb6, p06.a aVar, p06.e eVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            eVar = null;
        }
        a0Var.F(sb6, aVar, eVar);
    }

    public static final void w(q16.a0 a0Var, o06.o1 o1Var, java.lang.StringBuilder sb6) {
        if (!a0Var.A()) {
            q16.g0 g0Var = a0Var.f359701d;
            b06.d dVar = g0Var.f359736g;
            f06.v[] vVarArr = q16.g0.X;
            if (!((java.lang.Boolean) ((b06.b) dVar).b(g0Var, vVarArr[5])).booleanValue()) {
                if (a0Var.z().contains(q16.b0.f359709m)) {
                    a0Var.F(sb6, o1Var, null);
                    o06.i0 J2 = o1Var.J();
                    if (J2 != null) {
                        a0Var.F(sb6, J2, p06.e.f350748e);
                    }
                    o06.i0 x17 = o1Var.x();
                    if (x17 != null) {
                        a0Var.F(sb6, x17, p06.e.f350756p);
                    }
                    if (((q16.l0) ((b06.b) g0Var.H).b(g0Var, vVarArr[32])) == q16.l0.f359771e) {
                        o06.p1 c17 = o1Var.c();
                        if (c17 != null) {
                            a0Var.F(sb6, c17, p06.e.f350751h);
                        }
                        o06.q1 b17 = o1Var.b();
                        if (b17 != null) {
                            a0Var.F(sb6, b17, p06.e.f350752i);
                            java.util.List W = ((r06.h1) b17).W();
                            kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
                            o06.l2 l2Var = (o06.l2) kz5.n0.z0(W);
                            kotlin.jvm.internal.o.d(l2Var);
                            a0Var.F(sb6, l2Var, p06.e.f350755o);
                        }
                    }
                }
                java.util.List p07 = o1Var.p0();
                kotlin.jvm.internal.o.f(p07, "getContextReceiverParameters(...)");
                a0Var.J(p07, sb6);
                o06.g0 visibility = o1Var.getVisibility();
                kotlin.jvm.internal.o.f(visibility, "getVisibility(...)");
                a0Var.l0(visibility, sb6);
                a0Var.T(sb6, a0Var.z().contains(q16.b0.f359716t) && o1Var.C(), "const");
                a0Var.Q(o1Var, sb6);
                a0Var.S(o1Var, sb6);
                a0Var.X(o1Var, sb6);
                a0Var.T(sb6, a0Var.z().contains(q16.b0.f359717u) && o1Var.q0(), "lateinit");
                a0Var.P(o1Var, sb6);
            }
            a0Var.i0(o1Var, sb6, false);
            java.util.List typeParameters = o1Var.getTypeParameters();
            kotlin.jvm.internal.o.f(typeParameters, "getTypeParameters(...)");
            a0Var.h0(typeParameters, sb6, true);
            a0Var.a0(o1Var, sb6);
        }
        a0Var.U(o1Var, sb6, true);
        sb6.append(": ");
        f26.o0 type = o1Var.getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        sb6.append(a0Var.v(type));
        a0Var.b0(o1Var, sb6);
        a0Var.N(o1Var, sb6);
        java.util.List typeParameters2 = o1Var.getTypeParameters();
        kotlin.jvm.internal.o.f(typeParameters2, "getTypeParameters(...)");
        a0Var.m0(typeParameters2, sb6);
    }

    public boolean A() {
        q16.g0 g0Var = this.f359701d;
        return ((java.lang.Boolean) ((b06.b) g0Var.f359735f).b(g0Var, q16.g0.X[4])).booleanValue();
    }

    public q16.o0 B() {
        q16.g0 g0Var = this.f359701d;
        return (q16.o0) ((b06.b) g0Var.D).b(g0Var, q16.g0.X[28]);
    }

    public q16.r C() {
        q16.g0 g0Var = this.f359701d;
        return (q16.r) ((b06.b) g0Var.C).b(g0Var, q16.g0.X[27]);
    }

    public boolean D() {
        q16.g0 g0Var = this.f359701d;
        return ((java.lang.Boolean) ((b06.b) g0Var.f359739j).b(g0Var, q16.g0.X[8])).booleanValue();
    }

    public final o06.t0 E(o06.r0 r0Var) {
        if (r0Var instanceof o06.g) {
            return ((o06.g) r0Var).j() == o06.h.f341961e ? o06.t0.f341988h : o06.t0.f341985e;
        }
        o06.m e17 = r0Var.e();
        o06.g gVar = e17 instanceof o06.g ? (o06.g) e17 : null;
        if (gVar != null && (r0Var instanceof o06.d)) {
            o06.d dVar = (o06.d) r0Var;
            kotlin.jvm.internal.o.f(dVar.i(), "getOverriddenDescriptors(...)");
            if ((!r1.isEmpty()) && gVar.f() != o06.t0.f341985e) {
                return o06.t0.f341987g;
            }
            if (gVar.j() != o06.h.f341961e || kotlin.jvm.internal.o.b(dVar.getVisibility(), o06.f0.f341941a)) {
                return o06.t0.f341985e;
            }
            o06.t0 f17 = dVar.f();
            o06.t0 t0Var = o06.t0.f341988h;
            return f17 == t0Var ? t0Var : o06.t0.f341987g;
        }
        return o06.t0.f341985e;
    }

    public final void F(java.lang.StringBuilder sb6, p06.a aVar, p06.e eVar) {
        if (z().contains(q16.b0.f359709m)) {
            boolean z17 = aVar instanceof f26.o0;
            q16.g0 g0Var = this.f359701d;
            java.util.Set b17 = z17 ? b() : (java.util.Set) ((b06.b) g0Var.K).b(g0Var, q16.g0.X[35]);
            yz5.l lVar = (yz5.l) ((b06.b) g0Var.M).b(g0Var, q16.g0.X[37]);
            for (p06.c cVar : aVar.getAnnotations()) {
                if (!kz5.n0.O(b17, cVar.a()) && !kotlin.jvm.internal.o.b(cVar.a(), l06.w.f314938s) && (lVar == null || ((java.lang.Boolean) lVar.invoke(cVar)).booleanValue())) {
                    sb6.append(q(cVar, eVar));
                    if (((java.lang.Boolean) ((b06.b) g0Var.f359729J).b(g0Var, q16.g0.X[34])).booleanValue()) {
                        sb6.append('\n');
                    } else {
                        sb6.append(" ");
                    }
                }
            }
        }
    }

    public final void H(o06.k kVar, java.lang.StringBuilder sb6) {
        java.util.List m17 = kVar.m();
        kotlin.jvm.internal.o.f(m17, "getDeclaredTypeParameters(...)");
        java.util.List parameters = kVar.g().getParameters();
        kotlin.jvm.internal.o.f(parameters, "getParameters(...)");
        if (D() && kVar.p() && parameters.size() > m17.size()) {
            sb6.append(" /*captured type parameters: ");
            g0(sb6, parameters.subList(m17.size(), parameters.size()));
            sb6.append("*/");
        }
    }

    public final java.lang.String I(t16.g gVar) {
        q16.g0 g0Var = this.f359701d;
        yz5.l lVar = (yz5.l) ((b06.b) g0Var.f359751v).b(g0Var, q16.g0.X[20]);
        if (lVar != null) {
            return (java.lang.String) lVar.invoke(gVar);
        }
        if (gVar instanceof t16.b) {
            java.lang.Iterable iterable = (java.lang.Iterable) ((t16.b) gVar).f414613a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                java.lang.String I = I((t16.g) it.next());
                if (I != null) {
                    arrayList.add(I);
                }
            }
            return kz5.n0.g0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (gVar instanceof t16.a) {
            return r26.n0.W(q16.s.r(this, (p06.c) ((t16.a) gVar).f414613a, null, 2, null), "@");
        }
        if (!(gVar instanceof t16.x)) {
            return gVar.toString();
        }
        t16.w wVar = (t16.w) ((t16.x) gVar).f414613a;
        if (wVar instanceof t16.u) {
            return ((t16.u) wVar).f414627a + "::class";
        }
        if (!(wVar instanceof t16.v)) {
            throw new jz5.j();
        }
        t16.v vVar = (t16.v) wVar;
        java.lang.String b17 = vVar.f414628a.f414611a.b().b();
        kotlin.jvm.internal.o.f(b17, "asString(...)");
        for (int i17 = 0; i17 < vVar.f414628a.f414612b; i17++) {
            b17 = "kotlin.Array<" + b17 + '>';
        }
        return b17 + "::class";
    }

    public final void J(java.util.List list, java.lang.StringBuilder sb6) {
        if (!list.isEmpty()) {
            sb6.append("context(");
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                int i18 = i17 + 1;
                o06.r1 r1Var = (o06.r1) it.next();
                F(sb6, r1Var, p06.e.f350753m);
                f26.o0 type = ((r06.g) r1Var).getType();
                kotlin.jvm.internal.o.f(type, "getType(...)");
                sb6.append(M(type));
                if (i17 == kz5.c0.h(list)) {
                    sb6.append(") ");
                } else {
                    sb6.append(", ");
                }
                i17 = i18;
            }
        }
    }

    public final void K(java.lang.StringBuilder sb6, f26.o0 o0Var) {
        F(sb6, o0Var, null);
        if (o0Var instanceof f26.v) {
        }
        if (f26.s0.a(o0Var)) {
            boolean z17 = o0Var instanceof h26.j;
            boolean z18 = z17 && ((h26.j) o0Var).f278345g.f278373e;
            q16.g0 g0Var = this.f359701d;
            if (z18) {
                if (((java.lang.Boolean) ((b06.b) g0Var.U).b(g0Var, q16.g0.X[46])).booleanValue()) {
                    h26.m mVar = h26.m.f278374a;
                    if (z17) {
                        boolean z19 = ((h26.j) o0Var).f278345g.f278373e;
                    }
                    f26.c2 w07 = o0Var.w0();
                    kotlin.jvm.internal.o.e(w07, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                    sb6.append(L(((h26.k) w07).f278351b[0]));
                }
            }
            if (z17) {
                if (!((java.lang.Boolean) ((b06.b) g0Var.W).b(g0Var, q16.g0.X[48])).booleanValue()) {
                    sb6.append(((h26.j) o0Var).f278349n);
                    sb6.append(d0(o0Var.u0()));
                }
            }
            sb6.append(o0Var.w0().toString());
            sb6.append(d0(o0Var.u0()));
        } else {
            f26.c2 w08 = o0Var.w0();
            o06.j i17 = o0Var.w0().i();
            o06.m1 a17 = o06.i2.a(o0Var, i17 instanceof o06.k ? (o06.k) i17 : null, 0);
            if (a17 == null) {
                sb6.append(e0(w08));
                sb6.append(d0(o0Var.u0()));
            } else {
                Z(sb6, a17);
            }
        }
        if (o0Var.x0()) {
            sb6.append("?");
        }
        if (o0Var.z0() instanceof f26.v) {
            sb6.append(" & Any");
        }
    }

    public final java.lang.String L(java.lang.String str) {
        int ordinal = B().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    public final java.lang.String M(f26.o0 o0Var) {
        java.lang.String v17 = v(o0Var);
        if ((!n0(o0Var) || f26.z2.f(o0Var)) && !(o0Var instanceof f26.v)) {
            return v17;
        }
        return "(" + v17 + ')';
    }

    public final void N(o06.m2 m2Var, java.lang.StringBuilder sb6) {
        t16.g n07;
        java.lang.String I;
        q16.g0 g0Var = this.f359701d;
        if (!((java.lang.Boolean) ((b06.b) g0Var.f359750u).b(g0Var, q16.g0.X[19])).booleanValue() || (n07 = m2Var.n0()) == null || (I = I(n07)) == null) {
            return;
        }
        sb6.append(" = ");
        sb6.append(x(I));
    }

    public final java.lang.String O(java.lang.String str) {
        int ordinal = B().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        q16.g0 g0Var = this.f359701d;
        if (((java.lang.Boolean) ((b06.b) g0Var.V).b(g0Var, q16.g0.X[47])).booleanValue()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    public final void P(o06.d dVar, java.lang.StringBuilder sb6) {
        if (z().contains(q16.b0.f359711o) && D() && dVar.j() != o06.c.DECLARATION) {
            sb6.append("/*");
            sb6.append(m26.a.c(dVar.j().name()));
            sb6.append("*/ ");
        }
    }

    public final void Q(o06.r0 r0Var, java.lang.StringBuilder sb6) {
        T(sb6, r0Var.isExternal(), "external");
        T(sb6, z().contains(q16.b0.f359714r) && r0Var.l0(), "expect");
        T(sb6, z().contains(q16.b0.f359715s) && r0Var.e0(), "actual");
    }

    public final void R(o06.t0 t0Var, java.lang.StringBuilder sb6, o06.t0 t0Var2) {
        q16.g0 g0Var = this.f359701d;
        if (((java.lang.Boolean) ((b06.b) g0Var.f359745p).b(g0Var, q16.g0.X[14])).booleanValue() || t0Var != t0Var2) {
            T(sb6, z().contains(q16.b0.f359707h), m26.a.c(t0Var.name()));
        }
    }

    public final void S(o06.d dVar, java.lang.StringBuilder sb6) {
        if (r16.i.u(dVar) && dVar.f() == o06.t0.f341985e) {
            return;
        }
        q16.g0 g0Var = this.f359701d;
        if (((q16.j0) ((b06.b) g0Var.B).b(g0Var, q16.g0.X[26])) == q16.j0.f359761d && dVar.f() == o06.t0.f341987g && (!dVar.i().isEmpty())) {
            return;
        }
        o06.t0 f17 = dVar.f();
        kotlin.jvm.internal.o.f(f17, "getModality(...)");
        R(f17, sb6, E(dVar));
    }

    public final void T(java.lang.StringBuilder sb6, boolean z17, java.lang.String str) {
        if (z17) {
            sb6.append(O(str));
            sb6.append(" ");
        }
    }

    public final void U(o06.m mVar, java.lang.StringBuilder sb6, boolean z17) {
        n16.g name = mVar.getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        sb6.append(u(name, z17));
    }

    public final void V(java.lang.StringBuilder sb6, f26.o0 o0Var) {
        f26.c3 z07 = o0Var.z0();
        f26.a aVar = z07 instanceof f26.a ? (f26.a) z07 : null;
        if (aVar == null) {
            W(sb6, o0Var);
            return;
        }
        q16.g0 g0Var = this.f359701d;
        b06.d dVar = g0Var.R;
        f06.v[] vVarArr = q16.g0.X;
        boolean booleanValue = ((java.lang.Boolean) ((b06.b) dVar).b(g0Var, vVarArr[42])).booleanValue();
        f26.z0 z0Var = aVar.f259119e;
        if (booleanValue) {
            W(sb6, z0Var);
            return;
        }
        W(sb6, aVar.f259120f);
        if (((java.lang.Boolean) ((b06.b) g0Var.Q).b(g0Var, vVarArr[41])).booleanValue()) {
            q16.o0 B = B();
            q16.o0 o0Var2 = q16.o0.f359777e;
            if (B == o0Var2) {
                sb6.append("<font color=\"808080\"><i>");
            }
            sb6.append(" /* = ");
            W(sb6, z0Var);
            sb6.append(" */");
            if (B() == o0Var2) {
                sb6.append("</i></font>");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(java.lang.StringBuilder r29, f26.o0 r30) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q16.a0.W(java.lang.StringBuilder, f26.o0):void");
    }

    public final void X(o06.d dVar, java.lang.StringBuilder sb6) {
        if (z().contains(q16.b0.f359708i) && (!dVar.i().isEmpty())) {
            q16.g0 g0Var = this.f359701d;
            if (((q16.j0) ((b06.b) g0Var.B).b(g0Var, q16.g0.X[26])) != q16.j0.f359762e) {
                T(sb6, true, "override");
                if (D()) {
                    sb6.append("/*");
                    sb6.append(dVar.i().size());
                    sb6.append("*/ ");
                }
            }
        }
    }

    public final void Y(n16.c cVar, java.lang.String str, java.lang.StringBuilder sb6) {
        sb6.append(O(str));
        n16.e i17 = cVar.i();
        kotlin.jvm.internal.o.f(i17, "toUnsafe(...)");
        java.lang.String t17 = t(i17);
        if (t17.length() > 0) {
            sb6.append(" ");
            sb6.append(t17);
        }
    }

    public final void Z(java.lang.StringBuilder sb6, o06.m1 m1Var) {
        o06.m1 m1Var2 = m1Var.f341974c;
        o06.k kVar = m1Var.f341972a;
        if (m1Var2 != null) {
            Z(sb6, m1Var2);
            sb6.append('.');
            n16.g name = kVar.getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            sb6.append(u(name, false));
        } else {
            f26.c2 g17 = kVar.g();
            kotlin.jvm.internal.o.f(g17, "getTypeConstructor(...)");
            sb6.append(e0(g17));
        }
        sb6.append(d0(m1Var.f341973b));
    }

    @Override // q16.c0
    public boolean a() {
        return this.f359701d.a();
    }

    public final void a0(o06.b bVar, java.lang.StringBuilder sb6) {
        o06.r1 c07 = bVar.c0();
        if (c07 != null) {
            F(sb6, c07, p06.e.f350753m);
            f26.o0 type = ((r06.g) c07).getType();
            kotlin.jvm.internal.o.f(type, "getType(...)");
            sb6.append(M(type));
            sb6.append(".");
        }
    }

    @Override // q16.c0
    public java.util.Set b() {
        return this.f359701d.b();
    }

    public final void b0(o06.b bVar, java.lang.StringBuilder sb6) {
        o06.r1 c07;
        q16.g0 g0Var = this.f359701d;
        if (((java.lang.Boolean) ((b06.b) g0Var.F).b(g0Var, q16.g0.X[30])).booleanValue() && (c07 = bVar.c0()) != null) {
            sb6.append(" on ");
            f26.o0 type = ((r06.g) c07).getType();
            kotlin.jvm.internal.o.f(type, "getType(...)");
            sb6.append(v(type));
        }
    }

    @Override // q16.c0
    public boolean c() {
        return this.f359701d.c();
    }

    public final void c0(java.lang.StringBuilder sb6) {
        int length = sb6.length();
        if (length == 0 || sb6.charAt(length - 1) != ' ') {
            sb6.append(' ');
        }
    }

    @Override // q16.c0
    public void d(java.util.Set set) {
        kotlin.jvm.internal.o.g(set, "<set-?>");
        this.f359701d.d(set);
    }

    public java.lang.String d0(java.util.List typeArguments) {
        kotlin.jvm.internal.o.g(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(x("<"));
        kz5.n0.f0(typeArguments, sb6, ", ", null, null, 0, null, new q16.u(this), 60, null);
        sb6.append(x(">"));
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // q16.c0
    public void e(java.util.Set set) {
        kotlin.jvm.internal.o.g(set, "<set-?>");
        this.f359701d.e(set);
    }

    public java.lang.String e0(f26.c2 typeConstructor) {
        kotlin.jvm.internal.o.g(typeConstructor, "typeConstructor");
        o06.j klass = typeConstructor.i();
        if (klass instanceof o06.e2 ? true : klass instanceof o06.g ? true : klass instanceof o06.d2) {
            kotlin.jvm.internal.o.g(klass, "klass");
            return h26.m.f(klass) ? klass.g().toString() : y().a(klass, this);
        }
        if (klass == null) {
            return typeConstructor instanceof f26.n0 ? ((f26.n0) typeConstructor).c(q16.z.f359789d) : typeConstructor.toString();
        }
        throw new java.lang.IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    @Override // q16.c0
    public void f(q16.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.f359701d.f(eVar);
    }

    public final void f0(o06.e2 e2Var, java.lang.StringBuilder sb6, boolean z17) {
        if (z17) {
            sb6.append(x("<"));
        }
        if (D()) {
            sb6.append("/*");
            sb6.append(e2Var.getIndex());
            sb6.append("*/ ");
        }
        T(sb6, e2Var.o(), "reified");
        java.lang.String str = e2Var.q().f259147d;
        T(sb6, str.length() > 0, str);
        F(sb6, e2Var, null);
        U(e2Var, sb6, z17);
        int size = e2Var.getUpperBounds().size();
        if ((size > 1 && !z17) || size == 1) {
            f26.o0 o0Var = (f26.o0) e2Var.getUpperBounds().iterator().next();
            if (o0Var == null) {
                l06.o.a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
                throw null;
            }
            if (!(l06.o.y(o0Var) && o0Var.x0())) {
                sb6.append(" : ");
                sb6.append(v(o0Var));
            }
        } else if (z17) {
            boolean z18 = true;
            for (f26.o0 o0Var2 : e2Var.getUpperBounds()) {
                if (o0Var2 == null) {
                    l06.o.a(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
                    throw null;
                }
                if (!(l06.o.y(o0Var2) && o0Var2.x0())) {
                    if (z18) {
                        sb6.append(" : ");
                    } else {
                        sb6.append(" & ");
                    }
                    sb6.append(v(o0Var2));
                    z18 = false;
                }
            }
        }
        if (z17) {
            sb6.append(x(">"));
        }
    }

    @Override // q16.c0
    public void g(boolean z17) {
        this.f359701d.g(z17);
    }

    public final void g0(java.lang.StringBuilder sb6, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f0((o06.e2) it.next(), sb6, false);
            if (it.hasNext()) {
                sb6.append(", ");
            }
        }
    }

    @Override // q16.c0
    public void h(q16.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<set-?>");
        this.f359701d.h(o0Var);
    }

    public final void h0(java.util.List list, java.lang.StringBuilder sb6, boolean z17) {
        q16.g0 g0Var = this.f359701d;
        if (!((java.lang.Boolean) ((b06.b) g0Var.f359752w).b(g0Var, q16.g0.X[21])).booleanValue() && (!list.isEmpty())) {
            sb6.append(x("<"));
            g0(sb6, list);
            sb6.append(x(">"));
            if (z17) {
                sb6.append(" ");
            }
        }
    }

    @Override // q16.c0
    public void i(boolean z17) {
        this.f359701d.i(z17);
    }

    public final void i0(o06.m2 m2Var, java.lang.StringBuilder sb6, boolean z17) {
        if (z17 || !(m2Var instanceof o06.l2)) {
            sb6.append(O(m2Var.v() ? "var" : com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
            sb6.append(" ");
        }
    }

    @Override // q16.c0
    public void j(boolean z17) {
        this.f359701d.j(z17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0104, code lost:
    
        if ((c() ? r1.s0() : v16.f.a(r12)) != false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(o06.l2 r12, boolean r13, java.lang.StringBuilder r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q16.a0.j0(o06.l2, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // q16.c0
    public void k(boolean z17) {
        this.f359701d.k(z17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r8 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(java.util.Collection r7, boolean r8, java.lang.StringBuilder r9) {
        /*
            r6 = this;
            q16.g0 r0 = r6.f359701d
            b06.d r1 = r0.E
            f06.v[] r2 = q16.g0.X
            r3 = 29
            r2 = r2[r3]
            b06.b r1 = (b06.b) r1
            java.lang.Object r0 = r1.b(r0, r2)
            q16.k0 r0 = (q16.k0) r0
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L26
            r8 = 2
            if (r0 != r8) goto L20
            goto L29
        L20:
            jz5.j r7 = new jz5.j
            r7.<init>()
            throw r7
        L26:
            if (r8 != 0) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r8 = r7.size()
            q16.r r0 = r6.C()
            q16.q r0 = (q16.q) r0
            r0.getClass()
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "("
            r9.append(r0)
            java.util.Iterator r7 = r7.iterator()
            r0 = r2
        L46:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L79
            int r3 = r0 + 1
            java.lang.Object r4 = r7.next()
            o06.l2 r4 = (o06.l2) r4
            q16.r r5 = r6.C()
            q16.q r5 = (q16.q) r5
            r5.getClass()
            java.lang.String r5 = "parameter"
            kotlin.jvm.internal.o.g(r4, r5)
            r6.j0(r4, r1, r9, r2)
            q16.r r4 = r6.C()
            q16.q r4 = (q16.q) r4
            r4.getClass()
            int r4 = r8 + (-1)
            if (r0 == r4) goto L77
            java.lang.String r0 = ", "
            r9.append(r0)
        L77:
            r0 = r3
            goto L46
        L79:
            q16.r r7 = r6.C()
            q16.q r7 = (q16.q) r7
            r7.getClass()
            java.lang.String r7 = ")"
            r9.append(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q16.a0.k0(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    @Override // q16.c0
    public void l(boolean z17) {
        this.f359701d.l(z17);
    }

    public final boolean l0(o06.g0 g0Var, java.lang.StringBuilder sb6) {
        if (!z().contains(q16.b0.f359706g)) {
            return false;
        }
        q16.g0 g0Var2 = this.f359701d;
        b06.d dVar = g0Var2.f359743n;
        f06.v[] vVarArr = q16.g0.X;
        if (((java.lang.Boolean) ((b06.b) dVar).b(g0Var2, vVarArr[12])).booleanValue()) {
            g0Var = o06.f0.g(((o06.r) g0Var).f341981a.c());
        }
        if (!((java.lang.Boolean) ((b06.b) g0Var2.f359744o).b(g0Var2, vVarArr[13])).booleanValue() && kotlin.jvm.internal.o.b(g0Var, o06.f0.f341950j)) {
            return false;
        }
        sb6.append(O(((o06.r) g0Var).f341981a.b()));
        sb6.append(" ");
        return true;
    }

    @Override // q16.c0
    public void m(boolean z17) {
        this.f359701d.m(z17);
    }

    public final void m0(java.util.List list, java.lang.StringBuilder sb6) {
        q16.g0 g0Var = this.f359701d;
        if (((java.lang.Boolean) ((b06.b) g0Var.f359752w).b(g0Var, q16.g0.X[21])).booleanValue()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            o06.e2 e2Var = (o06.e2) it.next();
            java.util.List upperBounds = e2Var.getUpperBounds();
            kotlin.jvm.internal.o.f(upperBounds, "getUpperBounds(...)");
            for (f26.o0 o0Var : kz5.n0.R(upperBounds, 1)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                n16.g name = e2Var.getName();
                kotlin.jvm.internal.o.f(name, "getName(...)");
                sb7.append(u(name, false));
                sb7.append(" : ");
                kotlin.jvm.internal.o.d(o0Var);
                sb7.append(v(o0Var));
                arrayList.add(sb7.toString());
            }
        }
        if (!arrayList.isEmpty()) {
            sb6.append(" ");
            sb6.append(O("where"));
            sb6.append(" ");
            kz5.n0.f0(arrayList, sb6, ", ", null, null, 0, null, null, 124, null);
        }
    }

    @Override // q16.c0
    public void n(q16.k0 k0Var) {
        kotlin.jvm.internal.o.g(k0Var, "<set-?>");
        this.f359701d.n(k0Var);
    }

    public final boolean n0(f26.o0 o0Var) {
        boolean z17;
        if (!l06.j.h(o0Var)) {
            return false;
        }
        java.util.List u07 = o0Var.u0();
        if (!(u07 instanceof java.util.Collection) || !u07.isEmpty()) {
            java.util.Iterator it = u07.iterator();
            while (it.hasNext()) {
                if (((f26.l2) it.next()).b()) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        return z17;
    }

    @Override // q16.c0
    public void o(boolean z17) {
        this.f359701d.o(z17);
    }

    @Override // q16.s
    public java.lang.String p(o06.m declarationDescriptor) {
        o06.m e17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(declarationDescriptor, "declarationDescriptor");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        declarationDescriptor.w(new q16.t(this), sb6);
        q16.g0 g0Var = this.f359701d;
        b06.d dVar = g0Var.f359732c;
        f06.v[] vVarArr = q16.g0.X;
        if (((java.lang.Boolean) ((b06.b) dVar).b(g0Var, vVarArr[1])).booleanValue() && !(declarationDescriptor instanceof o06.d1) && !(declarationDescriptor instanceof o06.k1) && (e17 = declarationDescriptor.e()) != null && !(e17 instanceof o06.v0)) {
            sb6.append(" ");
            int ordinal = B().ordinal();
            if (ordinal == 0) {
                str = "defined in";
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                str = "<i>defined in</i>";
            }
            sb6.append(str);
            sb6.append(" ");
            n16.e g17 = r16.i.g(e17);
            kotlin.jvm.internal.o.f(g17, "getFqName(...)");
            sb6.append(g17.d() ? "root package" : t(g17));
            if (((java.lang.Boolean) ((b06.b) g0Var.f359733d).b(g0Var, vVarArr[2])).booleanValue() && (e17 instanceof o06.d1) && (declarationDescriptor instanceof o06.p)) {
                ((o06.p) declarationDescriptor).getSource().b().getClass();
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q16.s
    public java.lang.String q(p06.c annotation, p06.e eVar) {
        o06.p s17;
        java.util.List W;
        kotlin.jvm.internal.o.g(annotation, "annotation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append('@');
        if (eVar != null) {
            sb6.append(eVar.f350758d + ':');
        }
        f26.o0 type = annotation.getType();
        sb6.append(v(type));
        q16.g0 g0Var = this.f359701d;
        if (g0Var.p().f359699d) {
            java.util.Map c17 = annotation.c();
            kz5.p0 p0Var = null;
            o06.g d17 = ((java.lang.Boolean) ((b06.b) g0Var.I).b(g0Var, q16.g0.X[33])).booleanValue() ? v16.f.d(annotation) : null;
            if (d17 != null && (s17 = d17.s()) != null && (W = ((r06.j0) s17).W()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : W) {
                    if (((r06.s1) ((o06.l2) obj)).s0()) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((r06.v) ((o06.l2) it.next())).getName());
                }
                p0Var = arrayList2;
            }
            if (p0Var == null) {
                p0Var = kz5.p0.f313996d;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : p0Var) {
                kotlin.jvm.internal.o.d((n16.g) obj2);
                if (!c17.containsKey(r7)) {
                    arrayList3.add(obj2);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                arrayList4.add(((n16.g) it6.next()).h() + " = ...");
            }
            java.util.Set<java.util.Map.Entry> entrySet = c17.entrySet();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(entrySet, 10));
            for (java.util.Map.Entry entry : entrySet) {
                n16.g gVar = (n16.g) entry.getKey();
                t16.g gVar2 = (t16.g) entry.getValue();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(gVar.h());
                sb7.append(" = ");
                sb7.append(!p0Var.contains(gVar) ? I(gVar2) : "...");
                arrayList5.add(sb7.toString());
            }
            java.util.List D0 = kz5.n0.D0(kz5.n0.t0(arrayList4, arrayList5));
            if (g0Var.p().f359700e || (!D0.isEmpty())) {
                kz5.n0.f0(D0, sb6, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (D() && (f26.s0.a(type) || (type.w0().i() instanceof o06.z0))) {
            sb6.append(" /* annotation class not found */");
        }
        java.lang.String sb8 = sb6.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        return sb8;
    }

    @Override // q16.s
    public java.lang.String s(java.lang.String lowerRendered, java.lang.String upperRendered, l06.o builtIns) {
        kotlin.jvm.internal.o.g(lowerRendered, "lowerRendered");
        kotlin.jvm.internal.o.g(upperRendered, "upperRendered");
        kotlin.jvm.internal.o.g(builtIns, "builtIns");
        if (q16.p0.d(lowerRendered, upperRendered)) {
            if (!r26.i0.y(upperRendered, "(", false)) {
                return lowerRendered.concat("!");
            }
            return "(" + lowerRendered + ")!";
        }
        q16.e y17 = y();
        o06.g j17 = builtIns.j(l06.w.C);
        if (j17 == null) {
            l06.o.a(35);
            throw null;
        }
        java.lang.String a17 = y17.a(j17, this);
        java.lang.String q07 = r26.n0.q0(a17, "Collection", a17);
        java.lang.String c17 = q16.p0.c(lowerRendered, q07.concat("Mutable"), upperRendered, q07, q07.concat("(Mutable)"));
        if (c17 != null) {
            return c17;
        }
        java.lang.String c18 = q16.p0.c(lowerRendered, q07.concat("MutableMap.MutableEntry"), upperRendered, q07.concat("Map.Entry"), q07.concat("(Mutable)Map.(Mutable)Entry"));
        if (c18 != null) {
            return c18;
        }
        q16.e y18 = y();
        o06.g k17 = builtIns.k("Array");
        kotlin.jvm.internal.o.f(k17, "getArray(...)");
        java.lang.String a18 = y18.a(k17, this);
        java.lang.String q08 = r26.n0.q0(a18, "Array", a18);
        java.lang.String c19 = q16.p0.c(lowerRendered, q08 + x("Array<"), upperRendered, q08 + x("Array<out "), q08 + x("Array<(out) "));
        if (c19 != null) {
            return c19;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    @Override // q16.s
    public java.lang.String t(n16.e fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        java.util.List f17 = fqName.f();
        kotlin.jvm.internal.o.f(f17, "pathSegments(...)");
        return x(q16.p0.b(f17));
    }

    @Override // q16.s
    public java.lang.String u(n16.g name, boolean z17) {
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String x17 = x(q16.p0.a(name));
        q16.g0 g0Var = this.f359701d;
        if (!((java.lang.Boolean) ((b06.b) g0Var.V).b(g0Var, q16.g0.X[47])).booleanValue() || B() != q16.o0.f359777e || !z17) {
            return x17;
        }
        return "<b>" + x17 + "</b>";
    }

    @Override // q16.s
    public java.lang.String v(f26.o0 type) {
        kotlin.jvm.internal.o.g(type, "type");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        q16.g0 g0Var = this.f359701d;
        V(sb6, (f26.o0) ((yz5.l) ((b06.b) g0Var.f359754y).b(g0Var, q16.g0.X[23])).invoke(type));
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String x(java.lang.String str) {
        return B().a(str);
    }

    public q16.e y() {
        q16.g0 g0Var = this.f359701d;
        return (q16.e) ((b06.b) g0Var.f359731b).b(g0Var, q16.g0.X[0]);
    }

    public java.util.Set z() {
        q16.g0 g0Var = this.f359701d;
        return (java.util.Set) ((b06.b) g0Var.f359734e).b(g0Var, q16.g0.X[3]);
    }
}

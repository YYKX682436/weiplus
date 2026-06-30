package r06;

/* loaded from: classes16.dex */
public class r0 extends r06.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final r06.s0 f368512d;

    /* renamed from: e, reason: collision with root package name */
    public final f26.v2 f368513e;

    /* renamed from: f, reason: collision with root package name */
    public f26.v2 f368514f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f368515g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f368516h;

    /* renamed from: i, reason: collision with root package name */
    public f26.c2 f368517i;

    public r0(r06.s0 s0Var, f26.v2 v2Var) {
        this.f368512d = s0Var;
        this.f368513e = v2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void j0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r06.r0.j0(int):void");
    }

    @Override // o06.g
    public y16.s A() {
        v16.f.i(r16.i.d(this.f368512d));
        y16.s P = P(g26.k.f267994a);
        if (P != null) {
            return P;
        }
        j0(12);
        throw null;
    }

    @Override // o06.g
    public y16.s F(f26.q2 q2Var) {
        if (q2Var == null) {
            j0(10);
            throw null;
        }
        v16.f.i(r16.i.d(this));
        y16.s G = G(q2Var, g26.k.f267994a);
        if (G != null) {
            return G;
        }
        j0(11);
        throw null;
    }

    @Override // r06.s0
    public y16.s G(f26.q2 q2Var, g26.l lVar) {
        if (q2Var == null) {
            j0(5);
            throw null;
        }
        if (lVar == null) {
            j0(6);
            throw null;
        }
        y16.s G = this.f368512d.G(q2Var, lVar);
        if (!this.f368513e.h()) {
            return new y16.c0(G, s0());
        }
        if (G != null) {
            return G;
        }
        j0(7);
        throw null;
    }

    @Override // r06.s0
    public y16.s P(g26.l lVar) {
        if (lVar == null) {
            j0(13);
            throw null;
        }
        y16.s P = this.f368512d.P(lVar);
        if (!this.f368513e.h()) {
            return new y16.c0(P, s0());
        }
        if (P != null) {
            return P;
        }
        j0(14);
        throw null;
    }

    @Override // o06.g
    public o06.r1 R() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // o06.g
    public java.util.Collection S() {
        java.util.Collection<o06.p> S = this.f368512d.S();
        java.util.ArrayList arrayList = new java.util.ArrayList(S.size());
        for (o06.p pVar : S) {
            r06.i0 i0Var = (r06.i0) ((r06.j0) pVar).O();
            i0Var.f368434e = ((r06.r) pVar).a();
            r06.j0 j0Var = (r06.j0) pVar;
            i0Var.n(j0Var.f());
            i0Var.h(j0Var.getVisibility());
            i0Var.k(j0Var.j());
            i0Var.e(false);
            arrayList.add(((r06.r) ((o06.f) i0Var.build())).d(s0()));
        }
        return arrayList;
    }

    @Override // o06.g
    public java.util.Collection T() {
        java.util.Collection T = this.f368512d.T();
        if (T != null) {
            return T;
        }
        j0(31);
        throw null;
    }

    @Override // r06.s0, o06.g, o06.m
    public o06.g a() {
        o06.g a17 = this.f368512d.a();
        if (a17 != null) {
            return a17;
        }
        j0(21);
        throw null;
    }

    @Override // o06.a2
    public o06.n d(f26.v2 v2Var) {
        if (v2Var != null) {
            return v2Var.h() ? this : new r06.r0(this, f26.v2.f(v2Var.g(), s0().g()));
        }
        j0(23);
        throw null;
    }

    @Override // o06.g
    public o06.j2 d0() {
        o06.j2 d07 = this.f368512d.d0();
        if (d07 == null) {
            return null;
        }
        r06.q0 q0Var = new r06.q0(this);
        if (d07 instanceof o06.o0) {
            o06.o0 o0Var = (o06.o0) d07;
            return new o06.o0(o0Var.f341975a, (i26.j) q0Var.invoke(o0Var.f341976b));
        }
        if (!(d07 instanceof o06.w0)) {
            throw new jz5.j();
        }
        java.util.List<jz5.l> b17 = d07.b();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        for (jz5.l lVar : b17) {
            arrayList.add(new jz5.l((n16.g) lVar.f302833d, q0Var.invoke((i26.j) lVar.f302834e)));
        }
        return new o06.w0(arrayList);
    }

    @Override // o06.m
    public o06.m e() {
        o06.m e17 = this.f368512d.e();
        if (e17 != null) {
            return e17;
        }
        j0(22);
        throw null;
    }

    @Override // o06.r0
    public boolean e0() {
        return this.f368512d.e0();
    }

    @Override // o06.g, o06.r0
    public o06.t0 f() {
        o06.t0 f17 = this.f368512d.f();
        if (f17 != null) {
            return f17;
        }
        j0(26);
        throw null;
    }

    @Override // o06.g
    public java.util.List f0() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        j0(17);
        throw null;
    }

    @Override // o06.j
    public f26.c2 g() {
        f26.c2 g17 = this.f368512d.g();
        if (this.f368513e.h()) {
            if (g17 != null) {
                return g17;
            }
            j0(0);
            throw null;
        }
        if (this.f368517i == null) {
            f26.v2 s07 = s0();
            java.util.Collection a17 = g17.a();
            java.util.ArrayList arrayList = new java.util.ArrayList(a17.size());
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                arrayList.add(s07.k((f26.o0) it.next(), f26.d3.f259143f));
            }
            this.f368517i = new f26.q(this, this.f368515g, arrayList, e26.u.f247037e);
        }
        f26.c2 c2Var = this.f368517i;
        if (c2Var != null) {
            return c2Var;
        }
        j0(1);
        throw null;
    }

    @Override // o06.g
    public boolean g0() {
        return this.f368512d.g0();
    }

    @Override // p06.a
    public p06.k getAnnotations() {
        p06.k annotations = this.f368512d.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        j0(19);
        throw null;
    }

    @Override // o06.x0
    public n16.g getName() {
        n16.g name = this.f368512d.getName();
        if (name != null) {
            return name;
        }
        j0(20);
        throw null;
    }

    @Override // o06.p
    public o06.x1 getSource() {
        return o06.x1.f342004a;
    }

    @Override // o06.g, o06.q, o06.r0
    public o06.g0 getVisibility() {
        o06.g0 visibility = this.f368512d.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        j0(27);
        throw null;
    }

    @Override // o06.g
    public boolean h0() {
        return this.f368512d.h0();
    }

    @Override // o06.r0
    public boolean isExternal() {
        return this.f368512d.isExternal();
    }

    @Override // o06.g
    public boolean isInline() {
        return this.f368512d.isInline();
    }

    @Override // o06.g
    public o06.h j() {
        o06.h j17 = this.f368512d.j();
        if (j17 != null) {
            return j17;
        }
        j0(25);
        throw null;
    }

    @Override // o06.g, o06.j
    public f26.z0 k() {
        f26.r1 b17;
        java.util.List e17 = f26.z2.e(g().getParameters());
        p06.k annotations = getAnnotations();
        kotlin.jvm.internal.o.g(annotations, "annotations");
        if (annotations.isEmpty()) {
            f26.r1.f259214e.getClass();
            b17 = f26.r1.f259215f;
        } else {
            b17 = f26.r1.f259214e.b(kz5.b0.c(new f26.o(annotations)));
        }
        return f26.r0.f(b17, g(), e17, false, A());
    }

    @Override // o06.g
    public boolean k0() {
        return this.f368512d.k0();
    }

    @Override // o06.r0
    public boolean l0() {
        return this.f368512d.l0();
    }

    @Override // o06.g, o06.k
    public java.util.List m() {
        s0();
        java.util.List list = this.f368516h;
        if (list != null) {
            return list;
        }
        j0(30);
        throw null;
    }

    @Override // o06.g
    public y16.s m0() {
        y16.s m07 = this.f368512d.m0();
        if (m07 != null) {
            return m07;
        }
        j0(15);
        throw null;
    }

    @Override // o06.k
    public boolean p() {
        return this.f368512d.p();
    }

    @Override // o06.g
    public o06.f s() {
        return this.f368512d.s();
    }

    public final f26.v2 s0() {
        if (this.f368514f == null) {
            f26.v2 v2Var = this.f368513e;
            if (v2Var.h()) {
                this.f368514f = v2Var;
            } else {
                java.util.List parameters = this.f368512d.g().getParameters();
                this.f368515g = new java.util.ArrayList(parameters.size());
                this.f368514f = f26.z.b(parameters, v2Var.g(), this, this.f368515g);
                this.f368516h = kz5.n0.U(this.f368515g, new r06.p0(this));
            }
        }
        return this.f368514f;
    }

    @Override // o06.g
    public boolean t0() {
        return this.f368512d.t0();
    }

    @Override // o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return oVar.f(this, obj);
    }

    @Override // o06.g
    public y16.s z() {
        y16.s z17 = this.f368512d.z();
        if (z17 != null) {
            return z17;
        }
        j0(28);
        throw null;
    }
}

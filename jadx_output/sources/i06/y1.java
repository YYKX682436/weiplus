package i06;

/* loaded from: classes15.dex */
public final class y1 extends i06.k0 implements kotlin.jvm.internal.k, f06.g, yz5.a, yz5.l, yz5.b, yz5.c, yz5.d, yz5.e, yz5.f, yz5.g, yz5.h, yz5.i, yz5.j, yz5.k, yz5.p, yz5.m, yz5.n, yz5.o, yz5.q, yz5.r, yz5.s, yz5.t, yz5.u, yz5.v, yz5.w {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f286793s = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(i06.y1.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* renamed from: m, reason: collision with root package name */
    public final i06.u1 f286794m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f286795n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f286796o;

    /* renamed from: p, reason: collision with root package name */
    public final i06.c4 f286797p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f286798q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f286799r;

    public y1(i06.u1 u1Var, java.lang.String str, java.lang.String str2, o06.n0 n0Var, java.lang.Object obj) {
        this.f286794m = u1Var;
        this.f286795n = str2;
        this.f286796o = obj;
        this.f286797p = new i06.c4(n0Var, new i06.x1(this, str));
        jz5.i iVar = jz5.i.f302830e;
        this.f286798q = jz5.h.a(iVar, new i06.v1(this));
        this.f286799r = jz5.h.a(iVar, new i06.w1(this));
    }

    public static final j06.j0 p(i06.y1 y1Var, java.lang.reflect.Constructor constructor, o06.n0 descriptor, boolean z17) {
        boolean z18;
        if (!z17) {
            y1Var.getClass();
            kotlin.jvm.internal.o.g(descriptor, "descriptor");
            o06.f fVar = descriptor instanceof o06.f ? (o06.f) descriptor : null;
            if (fVar != null) {
                r06.j0 j0Var = (r06.j0) fVar;
                if (!o06.f0.e(j0Var.getVisibility())) {
                    r06.r rVar = (r06.r) fVar;
                    o06.g D = rVar.D();
                    kotlin.jvm.internal.o.f(D, "getConstructedClass(...)");
                    if (!r16.m.e(D) && !r16.i.r(rVar.D())) {
                        java.util.List W = j0Var.W();
                        kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
                        if (!W.isEmpty()) {
                            java.util.Iterator it = W.iterator();
                            while (it.hasNext()) {
                                f26.o0 type = ((r06.t1) ((o06.l2) it.next())).getType();
                                kotlin.jvm.internal.o.f(type, "getType(...)");
                                if (w16.b.a(type)) {
                                    z18 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            z18 = false;
            if (z18) {
                if (y1Var.o()) {
                    return new j06.l(constructor, j06.s0.a(y1Var.f286796o, y1Var.l()));
                }
                return new j06.m(constructor);
            }
        }
        if (y1Var.o()) {
            return new j06.n(constructor, j06.s0.a(y1Var.f286796o, y1Var.l()));
        }
        return new j06.o(constructor);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // yz5.v
    public java.lang.Object D(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // yz5.t
    public java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // yz5.b
    public java.lang.Object V(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public boolean equals(java.lang.Object obj) {
        i06.y1 b17 = i06.o4.b(obj);
        return b17 != null && kotlin.jvm.internal.o.b(this.f286794m, b17.f286794m) && kotlin.jvm.internal.o.b(getName(), b17.getName()) && kotlin.jvm.internal.o.b(this.f286795n, b17.f286795n) && kotlin.jvm.internal.o.b(this.f286796o, b17.f286796o);
    }

    @Override // kotlin.jvm.internal.k
    public int getArity() {
        return j06.k0.a(i());
    }

    @Override // f06.c
    public java.lang.String getName() {
        java.lang.String h17 = ((r06.v) l()).getName().h();
        kotlin.jvm.internal.o.f(h17, "asString(...)");
        return h17;
    }

    public int hashCode() {
        return (((this.f286794m.hashCode() * 31) + getName().hashCode()) * 31) + this.f286795n.hashCode();
    }

    @Override // i06.k0
    public j06.k i() {
        return (j06.k) this.f286798q.getValue();
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return call(new java.lang.Object[0]);
    }

    @Override // f06.g
    public boolean isExternal() {
        return l().isExternal();
    }

    @Override // f06.g
    public boolean isInfix() {
        return l().isInfix();
    }

    @Override // f06.g
    public boolean isInline() {
        return l().isInline();
    }

    @Override // f06.g
    public boolean isOperator() {
        return l().isOperator();
    }

    @Override // f06.c
    public boolean isSuspend() {
        return l().isSuspend();
    }

    @Override // i06.k0
    public i06.u1 j() {
        return this.f286794m;
    }

    @Override // i06.k0
    public j06.k k() {
        return (j06.k) this.f286799r.getValue();
    }

    @Override // i06.k0
    public boolean o() {
        return !kotlin.jvm.internal.o.b(this.f286796o, kotlin.jvm.internal.e.NO_RECEIVER);
    }

    @Override // i06.k0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public o06.n0 l() {
        f06.v vVar = f286793s[0];
        java.lang.Object invoke = this.f286797p.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        return (o06.n0) invoke;
    }

    public java.lang.String toString() {
        return i06.j4.f286670a.b(l());
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return call(obj);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return call(obj, obj2);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return call(obj, obj2, obj3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y1(i06.u1 r8, o06.n0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.o.g(r9, r0)
            r0 = r9
            r06.v r0 = (r06.v) r0
            n16.g r0 = r0.getName()
            java.lang.String r3 = r0.h()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.o.f(r3, r0)
            i06.k4 r0 = i06.k4.f286686a
            i06.t r0 = r0.c(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = kotlin.jvm.internal.e.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i06.y1.<init>(i06.u1, o06.n0):void");
    }
}

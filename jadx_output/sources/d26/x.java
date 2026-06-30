package d26;

/* loaded from: classes16.dex */
public final class x extends r06.e implements o06.m {
    public final e26.y A;
    public final b26.v0 B;
    public final p06.k C;

    /* renamed from: h, reason: collision with root package name */
    public final i16.o f226053h;

    /* renamed from: i, reason: collision with root package name */
    public final k16.a f226054i;

    /* renamed from: m, reason: collision with root package name */
    public final o06.x1 f226055m;

    /* renamed from: n, reason: collision with root package name */
    public final n16.b f226056n;

    /* renamed from: o, reason: collision with root package name */
    public final o06.t0 f226057o;

    /* renamed from: p, reason: collision with root package name */
    public final o06.g0 f226058p;

    /* renamed from: q, reason: collision with root package name */
    public final o06.h f226059q;

    /* renamed from: r, reason: collision with root package name */
    public final b26.t f226060r;

    /* renamed from: s, reason: collision with root package name */
    public final y16.t f226061s;

    /* renamed from: t, reason: collision with root package name */
    public final d26.j f226062t;

    /* renamed from: u, reason: collision with root package name */
    public final o06.u1 f226063u;

    /* renamed from: v, reason: collision with root package name */
    public final d26.n f226064v;

    /* renamed from: w, reason: collision with root package name */
    public final o06.m f226065w;

    /* renamed from: x, reason: collision with root package name */
    public final e26.y f226066x;

    /* renamed from: y, reason: collision with root package name */
    public final e26.x f226067y;

    /* renamed from: z, reason: collision with root package name */
    public final e26.x f226068z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b26.t outerContext, i16.o classProto, k16.g nameResolver, k16.a metadataVersion, o06.x1 sourceElement) {
        super(outerContext.f17515a.f17483a, b26.t0.a(nameResolver, classProto.f287643h).j());
        o06.h hVar;
        y16.t tVar;
        kotlin.jvm.internal.o.g(outerContext, "outerContext");
        kotlin.jvm.internal.o.g(classProto, "classProto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.o.g(sourceElement, "sourceElement");
        this.f226053h = classProto;
        this.f226054i = metadataVersion;
        this.f226055m = sourceElement;
        this.f226056n = b26.t0.a(nameResolver, classProto.f287643h);
        b26.z0 z0Var = b26.z0.f17549a;
        this.f226057o = z0Var.a((i16.l0) k16.f.f303437e.c(classProto.f287642g));
        this.f226058p = b26.b1.a(z0Var, (i16.h2) k16.f.f303436d.c(classProto.f287642g));
        i16.n nVar = (i16.n) k16.f.f303438f.c(classProto.f287642g);
        switch (nVar == null ? -1 : b26.y0.f17547b[nVar.ordinal()]) {
            case 1:
                hVar = o06.h.f341960d;
                break;
            case 2:
                hVar = o06.h.f341961e;
                break;
            case 3:
                hVar = o06.h.f341962f;
                break;
            case 4:
                hVar = o06.h.f341963g;
                break;
            case 5:
                hVar = o06.h.f341964h;
                break;
            case 6:
            case 7:
                hVar = o06.h.f341965i;
                break;
            default:
                hVar = o06.h.f341960d;
                break;
        }
        this.f226059q = hVar;
        java.util.List list = classProto.f287645m;
        kotlin.jvm.internal.o.f(list, "getTypeParameterList(...)");
        i16.v1 v1Var = classProto.K;
        kotlin.jvm.internal.o.f(v1Var, "getTypeTable(...)");
        k16.k kVar = new k16.k(v1Var);
        k16.l lVar = k16.m.f303462a;
        i16.g2 g2Var = classProto.M;
        kotlin.jvm.internal.o.f(g2Var, "getVersionRequirementTable(...)");
        b26.t a17 = outerContext.a(this, list, nameResolver, kVar, lVar.a(g2Var), metadataVersion);
        this.f226060r = a17;
        o06.h hVar2 = o06.h.f341962f;
        b26.q qVar = a17.f17515a;
        if (hVar == hVar2) {
            java.lang.Boolean c17 = k16.f.f303445m.c(classProto.f287642g);
            kotlin.jvm.internal.o.f(c17, "get(...)");
            tVar = new y16.z(qVar.f17483a, this, c17.booleanValue() || kotlin.jvm.internal.o.b(qVar.f17501s.a(), java.lang.Boolean.TRUE));
        } else {
            tVar = y16.r.f458973b;
        }
        this.f226061s = tVar;
        this.f226062t = new d26.j(this);
        this.f226063u = o06.u1.f341993e.a(this, qVar.f17483a, ((g26.v) qVar.f17499q).f268015c, new d26.t(this));
        this.f226064v = hVar == hVar2 ? new d26.n(this) : null;
        o06.m mVar = outerContext.f17517c;
        this.f226065w = mVar;
        this.f226066x = ((e26.u) qVar.f17483a).e(new d26.u(this));
        this.f226067y = ((e26.u) qVar.f17483a).b(new d26.s(this));
        ((e26.u) qVar.f17483a).e(new d26.p(this));
        this.f226068z = ((e26.u) qVar.f17483a).b(new d26.v(this));
        this.A = ((e26.u) qVar.f17483a).e(new d26.w(this));
        k16.g gVar = a17.f17516b;
        k16.k kVar2 = a17.f17518d;
        d26.x xVar = mVar instanceof d26.x ? (d26.x) mVar : null;
        this.B = new b26.v0(classProto, gVar, kVar2, sourceElement, xVar != null ? xVar.B : null);
        this.C = !k16.f.f303435c.c(classProto.f287642g).booleanValue() ? p06.i.f350765a : new d26.s0(qVar.f17483a, new d26.o(this));
    }

    @Override // r06.s0
    public y16.s P(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        o06.u1 u1Var = this.f226063u;
        u1Var.getClass();
        v16.f.j(u1Var.f341995a);
        return (y16.s) e26.b0.a(u1Var.f341998d, u1Var, o06.u1.f341994f[0]);
    }

    @Override // o06.g
    public java.util.Collection S() {
        return (java.util.Collection) ((e26.o) this.f226067y).invoke();
    }

    @Override // o06.g
    public java.util.Collection T() {
        return (java.util.Collection) ((e26.o) this.f226068z).invoke();
    }

    @Override // o06.g
    public o06.j2 d0() {
        return (o06.j2) this.A.invoke();
    }

    @Override // o06.m
    public o06.m e() {
        return this.f226065w;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.g, o06.r0
    public o06.t0 f() {
        return this.f226057o;
    }

    @Override // r06.e, o06.g
    public java.util.List f0() {
        b26.t tVar = this.f226060r;
        k16.k typeTable = tVar.f17518d;
        i16.o oVar = this.f226053h;
        kotlin.jvm.internal.o.g(oVar, "<this>");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        java.util.List list = oVar.f287651s;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            java.util.List<java.lang.Integer> list2 = oVar.f287652t;
            kotlin.jvm.internal.o.f(list2, "getContextReceiverTypeIdList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (java.lang.Integer num : list2) {
                kotlin.jvm.internal.o.d(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
            list = arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f26.o0 g17 = tVar.f17522h.g((i16.l1) it.next());
            o06.r1 R = R();
            z16.b bVar = new z16.b(this, g17, null, null);
            int i17 = p06.k.Z0;
            arrayList2.add(new r06.i1(R, bVar, p06.i.f350765a));
        }
        return arrayList2;
    }

    @Override // o06.j
    public f26.c2 g() {
        return this.f226062t;
    }

    @Override // o06.g
    public boolean g0() {
        return k16.f.f303438f.c(this.f226053h.f287642g) == i16.n.COMPANION_OBJECT;
    }

    @Override // p06.a
    public p06.k getAnnotations() {
        return this.C;
    }

    @Override // o06.p
    public o06.x1 getSource() {
        return this.f226055m;
    }

    @Override // o06.g, o06.q, o06.r0
    public o06.g0 getVisibility() {
        return this.f226058p;
    }

    @Override // o06.g
    public boolean h0() {
        java.lang.Boolean c17 = k16.f.f303444l.c(this.f226053h.f287642g);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    @Override // o06.r0
    public boolean isExternal() {
        java.lang.Boolean c17 = k16.f.f303441i.c(this.f226053h.f287642g);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    @Override // o06.g
    public boolean isInline() {
        int i17;
        java.lang.Boolean c17 = k16.f.f303443k.c(this.f226053h.f287642g);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        if (!c17.booleanValue()) {
            return false;
        }
        k16.a aVar = this.f226054i;
        int i18 = aVar.f303425b;
        return i18 < 1 || (i18 <= 1 && ((i17 = aVar.f303426c) < 4 || (i17 <= 4 && aVar.f303427d <= 1)));
    }

    @Override // o06.g
    public o06.h j() {
        return this.f226059q;
    }

    @Override // o06.g
    public boolean k0() {
        java.lang.Boolean c17 = k16.f.f303443k.c(this.f226053h.f287642g);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        return c17.booleanValue() && this.f226054i.a(1, 4, 2);
    }

    @Override // o06.r0
    public boolean l0() {
        java.lang.Boolean c17 = k16.f.f303442j.c(this.f226053h.f287642g);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    @Override // o06.g, o06.k
    public java.util.List m() {
        return this.f226060r.f17522h.b();
    }

    @Override // o06.g
    public y16.s m0() {
        return this.f226061s;
    }

    @Override // o06.k
    public boolean p() {
        java.lang.Boolean c17 = k16.f.f303439g.c(this.f226053h.f287642g);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    @Override // o06.g
    public o06.f s() {
        return (o06.f) this.f226066x.invoke();
    }

    @Override // o06.g
    public boolean t0() {
        java.lang.Boolean c17 = k16.f.f303440h.c(this.f226053h.f287642g);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        return c17.booleanValue();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deserialized ");
        sb6.append(l0() ? "expect " : "");
        sb6.append("class ");
        sb6.append(getName());
        return sb6.toString();
    }

    public final d26.h u0() {
        g26.l kotlinTypeRefiner = ((g26.v) this.f226060r.f17515a.f17499q).f268015c;
        o06.u1 u1Var = this.f226063u;
        u1Var.getClass();
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        v16.f.j(u1Var.f341995a);
        return (d26.h) ((y16.s) e26.b0.a(u1Var.f341998d, u1Var, o06.u1.f341994f[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        if (r2 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f26.z0 v0(n16.g r8) {
        /*
            r7 = this;
            d26.h r0 = r7.u0()
            w06.d r1 = w06.d.f441952m
            java.util.Collection r8 = r0.c(r8, r1)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = r1
        L14:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L33
            java.lang.Object r4 = r8.next()
            r5 = r4
            o06.o1 r5 = (o06.o1) r5
            o06.r1 r5 = r5.c0()
            r6 = 1
            if (r5 != 0) goto L2a
            r5 = r6
            goto L2b
        L2a:
            r5 = r1
        L2b:
            if (r5 == 0) goto L14
            if (r2 == 0) goto L30
            goto L35
        L30:
            r3 = r4
            r2 = r6
            goto L14
        L33:
            if (r2 != 0) goto L36
        L35:
            r3 = r0
        L36:
            o06.o1 r3 = (o06.o1) r3
            if (r3 == 0) goto L3e
            f26.o0 r0 = r3.getType()
        L3e:
            f26.z0 r0 = (f26.z0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d26.x.v0(n16.g):f26.z0");
    }
}

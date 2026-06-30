package r06;

/* loaded from: classes16.dex */
public abstract class j0 extends r06.w implements o06.n0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public java.util.Collection E;
    public volatile yz5.a F;
    public final o06.n0 G;
    public final o06.c H;
    public o06.n0 I;

    /* renamed from: J */
    public java.util.Map f368457J;

    /* renamed from: h */
    public java.util.List f368458h;

    /* renamed from: i */
    public java.util.List f368459i;

    /* renamed from: m */
    public f26.o0 f368460m;

    /* renamed from: n */
    public java.util.List f368461n;

    /* renamed from: o */
    public o06.r1 f368462o;

    /* renamed from: p */
    public o06.r1 f368463p;

    /* renamed from: q */
    public o06.t0 f368464q;

    /* renamed from: r */
    public o06.g0 f368465r;

    /* renamed from: s */
    public boolean f368466s;

    /* renamed from: t */
    public boolean f368467t;

    /* renamed from: u */
    public boolean f368468u;

    /* renamed from: v */
    public boolean f368469v;

    /* renamed from: w */
    public boolean f368470w;

    /* renamed from: x */
    public boolean f368471x;

    /* renamed from: y */
    public boolean f368472y;

    /* renamed from: z */
    public boolean f368473z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(o06.m mVar, o06.n0 n0Var, p06.k kVar, n16.g gVar, o06.c cVar, o06.x1 x1Var) {
        super(mVar, kVar, gVar, x1Var);
        if (mVar == null) {
            G(0);
            throw null;
        }
        if (kVar == null) {
            G(1);
            throw null;
        }
        if (gVar == null) {
            G(2);
            throw null;
        }
        if (cVar == null) {
            G(3);
            throw null;
        }
        if (x1Var == null) {
            G(4);
            throw null;
        }
        this.f368465r = o06.f0.f341949i;
        this.f368466s = false;
        this.f368467t = false;
        this.f368468u = false;
        this.f368469v = false;
        this.f368470w = false;
        this.f368471x = false;
        this.f368472y = false;
        this.f368473z = false;
        this.A = false;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = null;
        this.F = null;
        this.I = null;
        this.f368457J = null;
        this.G = n0Var == null ? this : n0Var;
        this.H = cVar;
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i18 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = ya.b.SOURCE;
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i17) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i17) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new java.lang.IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v2, types: [r06.s1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [o06.l2] */
    public static java.util.List w0(o06.n0 containingDeclaration, java.util.List list, f26.v2 v2Var, boolean z17, boolean z18, boolean[] zArr) {
        if (list == null) {
            G(30);
            throw null;
        }
        if (v2Var == null) {
            G(31);
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ?? r47 = (o06.l2) it.next();
            r06.t1 t1Var = (r06.t1) r47;
            f26.o0 type = t1Var.getType();
            f26.d3 d3Var = f26.d3.f259144g;
            f26.o0 k17 = v2Var.k(type, d3Var);
            r06.s1 s1Var = (r06.s1) r47;
            f26.o0 o0Var = s1Var.f368526p;
            f26.o0 k18 = o0Var == null ? null : v2Var.k(o0Var, d3Var);
            if (k17 == null) {
                return null;
            }
            if ((k17 != t1Var.getType() || o0Var != k18) && zArr != null) {
                zArr[0] = true;
            }
            r06.h0 h0Var = r47 instanceof r06.r1 ? new r06.h0((java.util.List) ((jz5.n) ((r06.r1) r47).f368518r).getValue()) : null;
            o06.l2 l2Var = z17 ? null : r47;
            int i17 = s1Var.f368522i;
            p06.k annotations = ((p06.b) r47).getAnnotations();
            n16.g name = ((r06.v) r47).getName();
            boolean s07 = s1Var.s0();
            boolean z19 = s1Var.f368524n;
            boolean z27 = s1Var.f368525o;
            o06.x1 source = z18 ? ((r06.w) r47).getSource() : o06.x1.f342004a;
            kotlin.jvm.internal.o.g(containingDeclaration, "containingDeclaration");
            kotlin.jvm.internal.o.g(annotations, "annotations");
            kotlin.jvm.internal.o.g(name, "name");
            kotlin.jvm.internal.o.g(source, "source");
            arrayList.add(h0Var == null ? new r06.s1(containingDeclaration, l2Var, i17, annotations, name, k17, s07, z19, z27, k18, source) : new r06.r1(containingDeclaration, l2Var, i17, annotations, name, k17, s07, z19, z27, k18, source, h0Var));
        }
        return arrayList;
    }

    public void A0(boolean z17) {
        this.C = z17;
    }

    public java.lang.Object B(o06.a aVar) {
        java.util.Map map = this.f368457J;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public void B0(boolean z17) {
        this.D = z17;
    }

    public void C0(f26.o0 o0Var) {
        if (o0Var != null) {
            this.f368460m = o0Var;
        } else {
            G(11);
            throw null;
        }
    }

    public void M(java.util.Collection collection) {
        if (collection == null) {
            G(17);
            throw null;
        }
        this.E = collection;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((o06.n0) it.next()).N()) {
                this.A = true;
                return;
            }
        }
    }

    @Override // o06.n0
    public boolean N() {
        return this.A;
    }

    public o06.m0 O() {
        return y0(f26.v2.f259231b);
    }

    @Override // o06.b
    public java.util.List W() {
        java.util.List list = this.f368459i;
        if (list != null) {
            return list;
        }
        G(19);
        throw null;
    }

    @Override // o06.b
    public o06.r1 Z() {
        return this.f368463p;
    }

    @Override // r06.w, r06.v, o06.m
    public o06.n0 a() {
        o06.n0 n0Var = this.G;
        o06.n0 a17 = n0Var == this ? this : n0Var.a();
        if (a17 != null) {
            return a17;
        }
        G(20);
        throw null;
    }

    @Override // o06.b
    public o06.r1 c0() {
        return this.f368462o;
    }

    @Override // o06.r0
    public boolean e0() {
        return this.f368472y;
    }

    @Override // o06.r0
    public o06.t0 f() {
        o06.t0 t0Var = this.f368464q;
        if (t0Var != null) {
            return t0Var;
        }
        G(15);
        throw null;
    }

    @Override // o06.b
    public f26.o0 getReturnType() {
        return this.f368460m;
    }

    @Override // o06.b
    public java.util.List getTypeParameters() {
        java.util.List list = this.f368458h;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("typeParameters == null for " + this);
    }

    @Override // o06.q, o06.r0
    public o06.g0 getVisibility() {
        o06.g0 g0Var = this.f368465r;
        if (g0Var != null) {
            return g0Var;
        }
        G(16);
        throw null;
    }

    @Override // o06.d, o06.b
    public java.util.Collection i() {
        yz5.a aVar = this.F;
        if (aVar != null) {
            this.E = (java.util.Collection) aVar.invoke();
            this.F = null;
        }
        java.util.Collection collection = this.E;
        if (collection == null) {
            collection = java.util.Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        G(14);
        throw null;
    }

    @Override // o06.b
    public boolean i0() {
        return this.D;
    }

    public boolean isExternal() {
        return this.f368468u;
    }

    @Override // o06.n0
    public boolean isInfix() {
        if (this.f368467t) {
            return true;
        }
        java.util.Iterator it = a().i().iterator();
        while (it.hasNext()) {
            if (((o06.n0) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f368469v;
    }

    @Override // o06.n0
    public boolean isOperator() {
        if (this.f368466s) {
            return true;
        }
        java.util.Iterator it = a().i().iterator();
        while (it.hasNext()) {
            if (((o06.n0) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.B;
    }

    @Override // o06.d
    public o06.c j() {
        o06.c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        G(21);
        throw null;
    }

    @Override // o06.r0
    public boolean l0() {
        return this.f368471x;
    }

    @Override // o06.n0
    public o06.n0 o0() {
        return this.I;
    }

    @Override // o06.b
    public java.util.List p0() {
        java.util.List list = this.f368461n;
        if (list != null) {
            return list;
        }
        G(13);
        throw null;
    }

    public boolean r() {
        return this.f368470w;
    }

    @Override // o06.n0
    public boolean r0() {
        return this.f368473z;
    }

    public o06.n0 s0(o06.m mVar, o06.t0 t0Var, o06.g0 g0Var, o06.c cVar, boolean z17) {
        o06.n0 build = O().f(mVar).n(t0Var).h(g0Var).k(cVar).e(z17).build();
        if (build != null) {
            return build;
        }
        G(26);
        throw null;
    }

    public abstract r06.j0 u0(o06.m mVar, o06.n0 n0Var, o06.c cVar, n16.g gVar, p06.k kVar, o06.x1 x1Var);

    public o06.n0 v0(r06.i0 i0Var) {
        r06.i1 i1Var;
        o06.r1 r1Var;
        f26.o0 k17;
        if (i0Var == null) {
            G(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        p06.k a17 = i0Var.f368448s != null ? p06.m.a(getAnnotations(), i0Var.f368448s) : getAnnotations();
        o06.m mVar = i0Var.f368431b;
        o06.n0 n0Var = i0Var.f368434e;
        o06.c cVar = i0Var.f368435f;
        n16.g gVar = i0Var.f368441l;
        o06.x1 source = i0Var.f368444o ? ((r06.w) (n0Var != null ? n0Var : a())).getSource() : o06.x1.f342004a;
        if (source == null) {
            G(27);
            throw null;
        }
        r06.j0 u07 = u0(mVar, n0Var, cVar, gVar, a17, source);
        java.util.List list = i0Var.f368447r;
        if (list == null) {
            list = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        f26.v2 c17 = f26.z.c(list, i0Var.f368430a, u07, arrayList, zArr);
        if (c17 == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!i0Var.f368437h.isEmpty()) {
            java.util.Iterator it = i0Var.f368437h.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                r06.g gVar2 = (r06.g) ((o06.r1) it.next());
                f26.o0 k18 = c17.k(gVar2.getType(), f26.d3.f259144g);
                if (k18 == null) {
                    return null;
                }
                int i18 = i17 + 1;
                arrayList2.add(r16.h.b(u07, k18, ((z16.f) gVar2.getValue()).a(), gVar2.getAnnotations(), i17));
                zArr[0] = zArr[0] | (k18 != gVar2.getType());
                i17 = i18;
            }
        }
        o06.r1 r1Var2 = i0Var.f368438i;
        if (r1Var2 != null) {
            f26.o0 k19 = c17.k(((r06.g) r1Var2).getType(), f26.d3.f259144g);
            if (k19 == null) {
                return null;
            }
            r06.i1 i1Var2 = new r06.i1(u07, new z16.d(u07, k19, i0Var.f368438i.getValue()), ((p06.b) i0Var.f368438i).getAnnotations());
            zArr[0] = (k19 != ((r06.g) i0Var.f368438i).getType()) | zArr[0];
            i1Var = i1Var2;
        } else {
            i1Var = null;
        }
        o06.r1 r1Var3 = i0Var.f368439j;
        if (r1Var3 != null) {
            o06.r1 d17 = ((r06.g) r1Var3).d(c17);
            if (d17 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (d17 != i0Var.f368439j);
            r1Var = d17;
        } else {
            r1Var = null;
        }
        java.util.List w07 = w0(u07, i0Var.f368436g, c17, i0Var.f368445p, i0Var.f368444o, zArr);
        if (w07 == null || (k17 = c17.k(i0Var.f368440k, f26.d3.f259145h)) == null) {
            return null;
        }
        boolean z17 = zArr[0] | (k17 != i0Var.f368440k);
        zArr[0] = z17;
        if (!z17 && i0Var.f368452w) {
            return this;
        }
        u07.x0(i1Var, r1Var, arrayList2, arrayList, w07, k17, i0Var.f368432c, i0Var.f368433d);
        u07.f368466s = this.f368466s;
        u07.f368467t = this.f368467t;
        u07.f368468u = this.f368468u;
        u07.f368469v = this.f368469v;
        u07.f368470w = this.f368470w;
        u07.B = this.B;
        u07.f368471x = this.f368471x;
        u07.f368472y = this.f368472y;
        u07.A0(this.C);
        u07.f368473z = i0Var.f368446q;
        u07.A = i0Var.f368449t;
        java.lang.Boolean bool = i0Var.f368451v;
        u07.B0(bool != null ? bool.booleanValue() : this.D);
        if (!i0Var.f368450u.isEmpty() || this.f368457J != null) {
            java.util.Map map = i0Var.f368450u;
            java.util.Map map2 = this.f368457J;
            if (map2 != null) {
                for (java.util.Map.Entry entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
                u07.f368457J = java.util.Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
            } else {
                u07.f368457J = map;
            }
        }
        if (i0Var.f368443n || this.I != null) {
            o06.n0 n0Var2 = this.I;
            if (n0Var2 == null) {
                n0Var2 = this;
            }
            u07.I = n0Var2.d(c17);
        }
        if (i0Var.f368442m && !a().i().isEmpty()) {
            if (i0Var.f368430a.e()) {
                yz5.a aVar = this.F;
                if (aVar != null) {
                    u07.F = aVar;
                } else {
                    u07.M(i());
                }
            } else {
                u07.F = new r06.g0(this, c17);
            }
        }
        return u07;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return oVar.l(this, obj);
    }

    public r06.j0 x0(o06.r1 r1Var, o06.r1 r1Var2, java.util.List list, java.util.List list2, java.util.List list3, f26.o0 o0Var, o06.t0 t0Var, o06.g0 g0Var) {
        if (list == null) {
            G(5);
            throw null;
        }
        if (list2 == null) {
            G(6);
            throw null;
        }
        if (list3 == null) {
            G(7);
            throw null;
        }
        if (g0Var == null) {
            G(8);
            throw null;
        }
        this.f368458h = kz5.n0.S0(list2);
        this.f368459i = kz5.n0.S0(list3);
        this.f368460m = o0Var;
        this.f368464q = t0Var;
        this.f368465r = g0Var;
        this.f368462o = r1Var;
        this.f368463p = r1Var2;
        this.f368461n = list;
        for (int i17 = 0; i17 < list2.size(); i17++) {
            o06.e2 e2Var = (o06.e2) list2.get(i17);
            if (e2Var.getIndex() != i17) {
                throw new java.lang.IllegalStateException(e2Var + " index is " + e2Var.getIndex() + " but position is " + i17);
            }
        }
        for (int i18 = 0; i18 < list3.size(); i18++) {
            o06.l2 l2Var = (o06.l2) list3.get(i18);
            if (((r06.s1) l2Var).f368522i != i18 + 0) {
                throw new java.lang.IllegalStateException(l2Var + "index is " + ((r06.s1) l2Var).f368522i + " but position is " + i18);
            }
        }
        return this;
    }

    public r06.i0 y0(f26.v2 v2Var) {
        if (v2Var != null) {
            return new r06.i0(this, v2Var.g(), e(), f(), getVisibility(), j(), W(), p0(), this.f368462o, getReturnType(), null);
        }
        G(24);
        throw null;
    }

    public void z0(o06.a aVar, java.lang.Object obj) {
        if (this.f368457J == null) {
            this.f368457J = new java.util.LinkedHashMap();
        }
        this.f368457J.put(aVar, obj);
    }

    @Override // o06.a2
    public o06.n0 d(f26.v2 v2Var) {
        if (v2Var != null) {
            if (v2Var.h()) {
                return this;
            }
            r06.i0 y07 = y0(v2Var);
            y07.f368434e = a();
            y07.f368444o = true;
            y07.f368452w = true;
            return y07.build();
        }
        G(22);
        throw null;
    }
}

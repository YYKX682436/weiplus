package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class m0 {
    public zq5.e A;
    public java.util.Map B;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f214992a;

    /* renamed from: b, reason: collision with root package name */
    public final zq5.k f214993b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.zoomimage.subsampling.internal.y1 f214994c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f214995d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f214996e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.y0 f214997f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.zoomimage.subsampling.internal.v1 f214998g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.zoomimage.subsampling.internal.v0 f214999h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.zoomimage.subsampling.internal.w0 f215000i;

    /* renamed from: j, reason: collision with root package name */
    public kotlinx.coroutines.r2 f215001j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f215002k;

    /* renamed from: l, reason: collision with root package name */
    public long f215003l;

    /* renamed from: m, reason: collision with root package name */
    public long f215004m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.v f215005n;

    /* renamed from: o, reason: collision with root package name */
    public yq5.k f215006o;

    /* renamed from: p, reason: collision with root package name */
    public int f215007p;

    /* renamed from: q, reason: collision with root package name */
    public yq5.n f215008q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f215009r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f215010s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.lifecycle.o f215011t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f215012u;

    /* renamed from: v, reason: collision with root package name */
    public yq5.c f215013v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f215014w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f215015x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f215016y;

    /* renamed from: z, reason: collision with root package name */
    public int f215017z;

    public m0(java.lang.String module, zq5.k logger, com.tencent.mm.zoomimage.subsampling.internal.x0 x0Var, com.tencent.mm.zoomimage.subsampling.internal.y1 zoomableBridge, yz5.l onReadyChanged, yz5.l onTileChanged) {
        kotlin.jvm.internal.o.g(module, "module");
        kotlin.jvm.internal.o.g(logger, "logger");
        kotlin.jvm.internal.o.g(zoomableBridge, "zoomableBridge");
        kotlin.jvm.internal.o.g(onReadyChanged, "onReadyChanged");
        kotlin.jvm.internal.o.g(onTileChanged, "onTileChanged");
        this.f214992a = module;
        this.f214993b = logger;
        this.f214994c = zoomableBridge;
        this.f214995d = onReadyChanged;
        this.f214996e = onTileChanged;
        this.f215000i = new com.tencent.mm.zoomimage.subsampling.internal.w0();
        this.f215002k = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        int i17 = zq5.g.f475066c;
        long j17 = zq5.g.f475065b;
        this.f215003l = j17;
        this.f215004m = j17;
        this.f215005n = new androidx.lifecycle.v() { // from class: com.tencent.mm.zoomimage.subsampling.internal.SubsamplingCore$stoppedLifecycleObserver$1
            @Override // androidx.lifecycle.v
            public final void onStateChanged(androidx.lifecycle.y owner, androidx.lifecycle.m mVar) {
                com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var;
                kotlin.jvm.internal.o.g(owner, "owner");
                kotlin.jvm.internal.o.g(mVar, "<anonymous parameter 1>");
                com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var = com.tencent.mm.zoomimage.subsampling.internal.m0.this;
                m0Var.getClass();
                m0Var.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.j0(m0Var, owner, false));
                androidx.lifecycle.o oVar = m0Var.f215011t;
                if (oVar != null) {
                    boolean z17 = !oVar.b().a(androidx.lifecycle.n.STARTED);
                    zq5.b.d();
                    if (m0Var.f215010s != z17) {
                        m0Var.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.h0(m0Var, z17));
                        m0Var.f215010s = z17;
                        java.lang.String str = z17 ? "stopped" : "started";
                        if (z17 && (v1Var = m0Var.f214998g) != null) {
                            v1Var.a(str);
                        }
                        m0Var.d(str);
                    }
                }
            }
        };
        this.f215007p = 39;
        this.f215008q = yq5.n.f464614b;
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f215012u = p0Var;
        this.f215015x = p0Var;
        this.f215016y = p0Var;
        this.A = zq5.e.f475060e;
        this.B = kz5.q0.f314001d;
    }

    public static final java.lang.String a(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var) {
        java.lang.String a17;
        yq5.k kVar = m0Var.f215006o;
        return (kVar == null || (a17 = kVar.a()) == null) ? "null" : a17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        if ((r0 != null && r12 == r0.floatValue()) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0342 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.tencent.mm.zoomimage.subsampling.internal.m0 r28, zq5.e r29, float r30, int r31, int r32, java.lang.String r33, int r34, java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.zoomimage.subsampling.internal.m0.e(com.tencent.mm.zoomimage.subsampling.internal.m0, zq5.e, float, int, int, java.lang.String, int, java.lang.Object):void");
    }

    public final void b(java.lang.String str) {
        kotlinx.coroutines.r2 r2Var = this.f215001j;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            ((kotlinx.coroutines.c3) r2Var).b(kotlinx.coroutines.e2.a("cleanTileDecoder:" + str, null));
            this.f215001j = null;
        }
        com.tencent.mm.zoomimage.subsampling.internal.v0 v0Var = this.f214999h;
        yq5.c cVar = this.f215013v;
        if (v0Var != null) {
            this.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.f(this, str));
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.zoomimage.subsampling.internal.g(v0Var, null), 2, null);
            this.f214999h = null;
        }
        if (cVar != null) {
            this.f215013v = null;
        }
        if (v0Var != null || cVar != null) {
            d(str);
        }
        ((br5.b) this.f214994c).a(zq5.g.f475065b);
    }

    public final void c(java.lang.String str) {
        com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = this.f214998g;
        if (v1Var != null) {
            this.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.h(this, str));
            v1Var.a(str);
            this.f214998g = null;
            this.B = kz5.q0.f314001d;
            kz5.p0 p0Var = kz5.p0.f313996d;
            this.f215015x = p0Var;
            this.f215016y = p0Var;
            this.f215017z = 0;
            this.A = zq5.e.f475060e;
            d(str);
            this.f214996e.invoke(this);
        }
    }

    public final void d(java.lang.String str) {
        boolean z17 = false;
        boolean z18 = this.f215013v != null;
        boolean z19 = this.f214998g != null;
        boolean z27 = this.f214999h != null;
        boolean z28 = !this.f215010s;
        if (z18 && z19 && z27 && z28) {
            z17 = true;
        }
        this.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.s(this, str, z17, z18, z19, z27, z28));
        this.f215014w = z17;
        this.f214995d.invoke(this);
        kotlinx.coroutines.y0 y0Var = this.f214997f;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.zoomimage.subsampling.internal.t(this, str, null), 3, null);
        }
    }

    public final void f(java.lang.String str) {
        c(str);
        b(str);
        yq5.k kVar = this.f215006o;
        long j17 = this.f215004m;
        kotlinx.coroutines.y0 y0Var = this.f214997f;
        if (kVar != null && !zq5.h.b(j17) && y0Var != null) {
            this.f215001j = kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.zoomimage.subsampling.internal.y(this, kVar, j17, str, null), 3, null);
        } else {
            this.f214993b.a(new com.tencent.mm.zoomimage.subsampling.internal.v(this, str, kVar, j17, y0Var));
        }
    }

    public final void g(java.lang.String str) {
        c(str);
        yq5.k kVar = this.f215006o;
        com.tencent.mm.zoomimage.subsampling.internal.v0 v0Var = this.f214999h;
        yq5.c cVar = this.f215013v;
        long j17 = this.f215003l;
        long j18 = this.f215004m;
        zq5.k kVar2 = this.f214993b;
        if (kVar == null || v0Var == null || cVar == null || zq5.h.b(j17) || zq5.h.b(j18)) {
            kVar2.a(new com.tencent.mm.zoomimage.subsampling.internal.z(this, str, kVar, j18, j17, v0Var));
            return;
        }
        com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = new com.tencent.mm.zoomimage.subsampling.internal.v1(this.f214993b, kVar, v0Var, null, this.f215000i, cVar, j18, j17, new com.tencent.mm.zoomimage.subsampling.internal.b0(this), new com.tencent.mm.zoomimage.subsampling.internal.c0(this), new com.tencent.mm.zoomimage.subsampling.internal.d0(this), null);
        v1Var.f215139q = this.f215007p;
        boolean z17 = this.f215009r;
        if (v1Var.f215140r != z17) {
            v1Var.f215140r = z17;
            v1Var.d("disabledBackgroundTilesChanged");
        }
        yq5.n nVar = this.f215008q;
        kotlin.jvm.internal.o.g(nVar, "<set-?>");
        v1Var.f215141s = nVar;
        java.util.List list = v1Var.f215142t;
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            yq5.i iVar = (yq5.i) it.next();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(iVar.f464597a);
            long j19 = ((yq5.m) kz5.n0.i0(iVar.f464598b)).f464606a;
            linkedHashMap.put(valueOf, new zq5.c(zq5.d.a(((int) (j19 >> 32)) + 1, zq5.c.a(j19) + 1)));
        }
        this.B = linkedHashMap;
        kVar2.a(new com.tencent.mm.zoomimage.subsampling.internal.a0(this, str, cVar, j17, v1Var, kVar));
        this.f214998g = v1Var;
        d(str);
    }
}

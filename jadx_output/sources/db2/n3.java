package db2;

/* loaded from: classes2.dex */
public final class n3 implements ay1.m {
    public final java.lang.String A;
    public final db2.b3 B;
    public final db2.m3 C;

    /* renamed from: d, reason: collision with root package name */
    public final int f228079d;

    /* renamed from: e, reason: collision with root package name */
    public final int f228080e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f228081f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.qt2 f228082g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f228083h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f228084i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f228085m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f228086n;

    /* renamed from: o, reason: collision with root package name */
    public final int f228087o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f228088p;

    /* renamed from: q, reason: collision with root package name */
    public final rn5.a f228089q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f228090r;

    /* renamed from: s, reason: collision with root package name */
    public db2.z2 f228091s;

    /* renamed from: t, reason: collision with root package name */
    public db2.d3 f228092t;

    /* renamed from: u, reason: collision with root package name */
    public db2.e3 f228093u;

    /* renamed from: v, reason: collision with root package name */
    public im5.c f228094v;

    /* renamed from: w, reason: collision with root package name */
    public im5.c f228095w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f228096x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f228097y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f228098z;

    public n3(int i17, int i18, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, java.util.List list, boolean z17, boolean z18, boolean z19, int i19, boolean z27, r45.sx2 sx2Var, rn5.a aVar, com.tencent.mm.protobuf.g gVar2) {
        java.lang.String string;
        this.f228079d = i17;
        this.f228080e = i18;
        this.f228081f = gVar;
        this.f228082g = qt2Var;
        this.f228083h = list;
        this.f228084i = z17;
        this.f228085m = z18;
        this.f228086n = z19;
        this.f228087o = i19;
        this.f228088p = z27;
        this.f228089q = aVar;
        this.f228090r = gVar2;
        this.f228094v = new im5.c();
        this.f228096x = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f228097y = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f228098z = jz5.h.b(db2.f3.f227970d);
        com.tencent.mm.plugin.finder.report.v1.t(com.tencent.mm.plugin.finder.report.v1.f125393a, i17, i18, qt2Var, 0L, z27, 8, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderStream#");
        sb6.append(i17);
        sb6.append('#');
        sb6.append((sx2Var == null || (string = sx2Var.getString(1)) == null) ? "#" : string);
        sb6.append(i18);
        sb6.append('#');
        sb6.append(z17);
        sb6.append('@');
        sb6.append(hashCode());
        this.A = sb6.toString();
        this.B = new db2.b3();
        this.C = new db2.m3(this, qt2Var);
    }

    @Override // ay1.m
    public java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        db2.z2 z2Var = this.f228091s;
        if (z2Var == null) {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        this.f228093u = new db2.k3(c0Var, this, nVar);
        this.f228091s = new db2.l3(z2Var, c0Var, nVar);
        i();
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    @Override // ay1.m
    public void b() {
        this.f228097y.compareAndSet(false, true);
        com.tencent.mars.xlog.Log.i(this.A, "cancelTask: tabType = " + this.f228079d + ", pullType = " + this.f228080e);
    }

    @Override // ay1.m
    public void c(java.lang.Object obj) {
        db2.c3 value = (db2.c3) obj;
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i(this.A, "hitPreloadCache: tabType = " + this.f228079d + ", pullType = " + this.f228080e);
        g(value.f227922m, value.f227923n, value.f227924o, value);
    }

    public final db2.n3 e(fb2.m interceptor, int i17) {
        kotlin.jvm.internal.o.g(interceptor, "interceptor");
        this.f228096x.add(new fb2.n(interceptor, i17));
        return this;
    }

    public final db2.c3 f(r45.mx2 mx2Var) {
        db2.c3 c3Var = new db2.c3();
        db2.b3 b3Var = this.B;
        kotlin.jvm.internal.o.g(b3Var, "<set-?>");
        c3Var.f227921i = b3Var;
        c3Var.set(4, mx2Var.getString(4));
        c3Var.set(3, mx2Var.getString(3));
        c3Var.getList(1).addAll(mx2Var.getList(1));
        c3Var.getList(12).addAll(mx2Var.getList(12));
        c3Var.set(5, java.lang.Integer.valueOf(mx2Var.getInteger(5)));
        c3Var.set(6, java.lang.Integer.valueOf(mx2Var.getInteger(6)));
        c3Var.set(7, java.lang.Integer.valueOf(mx2Var.getInteger(7)));
        c3Var.set(9, (r45.sq2) mx2Var.getCustom(9));
        c3Var.set(11, java.lang.Integer.valueOf(mx2Var.getInteger(11)));
        c3Var.set(8, java.lang.Integer.valueOf(mx2Var.getInteger(8)));
        c3Var.set(25, java.lang.Integer.valueOf(mx2Var.getInteger(25)));
        c3Var.set(14, (r45.lw0) mx2Var.getCustom(14));
        c3Var.set(10, (r45.nz0) mx2Var.getCustom(10));
        c3Var.set(13, (r45.s03) mx2Var.getCustom(13));
        c3Var.set(2, mx2Var.getByteString(2));
        c3Var.f227917e = mx2Var.getList(1).size();
        c3Var.set(15, mx2Var.getString(15));
        c3Var.set(16, (r45.xu2) mx2Var.getCustom(16));
        c3Var.set(17, (r45.fx2) mx2Var.getCustom(17));
        c3Var.set(26, (r45.gx2) mx2Var.getCustom(26));
        c3Var.set(18, (r45.bx2) mx2Var.getCustom(18));
        c3Var.set(21, mx2Var.getByteString(21));
        c3Var.set(27, (r45.jt2) mx2Var.getCustom(27));
        c3Var.set(29, (r45.of6) mx2Var.getCustom(29));
        return c3Var;
    }

    public final void g(int i17, int i18, java.lang.String str, db2.c3 c3Var) {
        java.lang.String b17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLoadFinish tabType=");
        int i19 = this.f228079d;
        sb6.append(i19);
        sb6.append(" pullType:");
        int i27 = this.f228080e;
        sb6.append(i27);
        sb6.append(" lastBuffer=");
        if (c3Var.getByteString(2) == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g byteString = c3Var.getByteString(2);
            b17 = com.tencent.mm.sdk.platformtools.w2.b(byteString != null ? byteString.f192156a : null);
        }
        sb6.append(b17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.A;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        pf5.u uVar = pf5.u.f353936a;
        rn5.a aVar = this.f228089q;
        if (aVar != null) {
            ey2.l lVar = (ey2.l) uVar.e(c61.l7.class).a(ey2.l.class);
            lVar.getClass();
            com.tencent.mars.xlog.Log.i("FinderCgiEndVM", "store ext info=" + aVar + '!');
            java.util.HashSet hashSet = lVar.f257421e;
            if (hashSet == null) {
                hashSet = new java.util.HashSet();
            }
            lVar.f257421e = hashSet;
            hashSet.add(aVar);
        }
        db2.d3 d3Var = this.f228092t;
        if (d3Var == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        d3Var.onLoadFinish();
        yr2.a aVar2 = yr2.a.f464659a;
        r45.sq2 sq2Var = (r45.sq2) c3Var.getCustom(9);
        java.util.LinkedList list = c3Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        aVar2.b(sq2Var, list, 3901);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f228096x;
        java.util.List F0 = kz5.n0.F0(concurrentLinkedQueue, new db2.h3());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(F0, 10));
        java.util.Iterator it = F0.iterator();
        while (it.hasNext()) {
            arrayList.add((fb2.m) ((fb2.n) it.next()).f260848a);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            fb2.m mVar = (fb2.m) it6.next();
            if (mVar.a(c3Var, i19, i27)) {
                com.tencent.mars.xlog.Log.w(str2, "[onLoadFinish] Interceptor is interrupted by " + mVar);
                break;
            }
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.finder.report.v1.f125393a.w(i19, this.f228082g);
        }
        c3Var.f227922m = i17;
        c3Var.f227924o = str;
        db2.d3 d3Var2 = this.f228092t;
        if (d3Var2 == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        if (!d3Var2.isResultConsume(i17, i18, c3Var)) {
            db2.z2 z2Var = this.f228091s;
            if (z2Var == null) {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
            java.util.List F02 = kz5.n0.F0(concurrentLinkedQueue, new db2.g3());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(F02, 10));
            java.util.Iterator it7 = F02.iterator();
            while (it7.hasNext()) {
                arrayList2.add((fb2.m) ((fb2.n) it7.next()).f260848a);
            }
            z2Var.onCgiBack(i17, i18, str, c3Var, kz5.n0.S0(arrayList2));
            return;
        }
        if (!this.f228088p && (i27 == 0 || i27 == 1 || i27 == 4)) {
            bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).R6(i19);
            if (i17 == 0 && i18 == 0) {
                db2.c3 f17 = f(c3Var);
                if (R6 != null) {
                    bs2.h0 h0Var = bs2.h0.f23853p;
                    int i28 = this.f228080e;
                    bs2.f0 f0Var = new bs2.f0();
                    f0Var.f23836a = f17.d().getLong(12);
                    f0Var.f23837b = f17.d().getInteger(3);
                    R6.t(f17, h0Var, i28, f0Var, 0L);
                }
            } else if (R6 != null) {
                R6.x(false, bs2.h0.f23853p);
            }
        }
        db2.e3 e3Var = this.f228093u;
        if (e3Var != null) {
            ((db2.k3) e3Var).a(i17, i18, str, c3Var);
        }
    }

    @Override // ay1.m
    public java.lang.Object getKey() {
        int i17 = this.f228080e;
        if (i17 == 0 || i17 == 1 || i17 == 4) {
            i17 = 0;
        } else if (i17 == 3 || i17 == 5 || i17 == 6 || i17 == 7 || i17 == 8 || i17 == 17 || i17 == 9 || i17 == 20) {
            i17 = 3;
        }
        return "Finder.FinderStream.tabType" + this.f228079d + ",pullType" + i17;
    }

    public final void h() {
        db2.d3 d3Var = this.f228092t;
        if (d3Var == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        d3Var.onBuildRequest(this.B);
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        int i17 = this.f228079d;
        v1Var.p(i17, true, null, null);
        com.tencent.mm.plugin.finder.report.y0.f125442a.d(i17, true, this.f228086n, 1);
        pq5.g l17 = this.C.l();
        im5.c cVar = this.f228095w;
        if (cVar != null) {
            l17.f(cVar);
        }
    }

    public final void i() {
        db2.c3 w17;
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("run: tabType = ");
        int i17 = this.f228079d;
        sb6.append(i17);
        sb6.append(", pullType = ");
        int i18 = this.f228080e;
        sb6.append(i18);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.A;
        com.tencent.mars.xlog.Log.i(str, sb7);
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        com.tencent.mm.plugin.finder.report.v1.o(v1Var, this.f228079d, true, null, false, 0L, false, 60, null);
        db2.d3 d3Var = this.f228092t;
        jz5.f0 f0Var = null;
        if (d3Var == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        boolean isBeginHistory = d3Var.isBeginHistory();
        db2.b3 b3Var = this.B;
        b3Var.f227908d = isBeginHistory;
        b3Var.f227910f = android.os.SystemClock.elapsedRealtime();
        if (b3Var.f227908d) {
            v1Var.n(i17, true);
            new db2.a3(this, null, this.f228081f).l().f(this.f228094v);
            return;
        }
        bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).R6(i17);
        int i19 = this.f228080e;
        boolean z18 = (i19 == 1 || i19 == 0) ? false : true;
        if (this.f228084i || z18) {
            if (z18) {
                if (R6 != null ? R6.e(true, "CgiFinderStream") : false) {
                    bs2.g.a(bs2.g.f23841a, 0, 0, 3, 2, false, 0, false, 115, null);
                }
            }
            h();
            return;
        }
        if (this.f228087o == 1 && i17 == 4) {
            h();
            return;
        }
        if (R6 != null && (w17 = bs2.n1.w(R6, i19, false, new db2.i3(this), 2, null)) != null) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127797l0).getValue()).r()).booleanValue()) {
                pm0.v.X(new db2.j3(this));
            }
            com.tencent.mars.xlog.Log.i(str, "[run] use preload cache. tabType=" + i17 + " pullType=" + i18);
            java.util.LinkedList list = w17.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.Z(list);
            if (finderObject != null) {
                z17 = hc2.o0.j(finderObject) == 2;
            } else {
                z17 = false;
            }
            v1Var.r(this.f228079d, w17.getByteString(21), w17.f227925p, w17.f227926q, z17, false);
            g(0, 0, null, w17);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            h();
        }
    }

    public /* synthetic */ n3(int i17, int i18, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, java.util.List list, boolean z17, boolean z18, boolean z19, int i19, boolean z27, r45.sx2 sx2Var, rn5.a aVar, com.tencent.mm.protobuf.g gVar2, int i27, kotlin.jvm.internal.i iVar) {
        this(i17, i18, gVar, qt2Var, (i27 & 16) != 0 ? null : list, (i27 & 32) != 0 ? false : z17, (i27 & 64) != 0 ? false : z18, (i27 & 128) != 0 ? false : z19, (i27 & 256) != 0 ? 0 : i19, (i27 & 512) != 0 ? false : z27, (i27 & 1024) != 0 ? null : sx2Var, (i27 & 2048) != 0 ? null : aVar, (i27 & 4096) != 0 ? null : gVar2);
    }
}

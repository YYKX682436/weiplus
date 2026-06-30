package m8;

/* loaded from: classes15.dex */
public final class p implements android.os.Handler.Callback, d9.w, d9.y {
    public boolean A;
    public boolean B;
    public int C = 1;
    public int D;
    public int E;
    public int F;
    public long G;
    public int H;
    public m8.n I;

    /* renamed from: J, reason: collision with root package name */
    public long f324643J;
    public m8.l K;
    public m8.l L;
    public m8.l M;
    public m8.m0 N;

    /* renamed from: d, reason: collision with root package name */
    public final m8.b0[] f324644d;

    /* renamed from: e, reason: collision with root package name */
    public final m8.c0[] f324645e;

    /* renamed from: f, reason: collision with root package name */
    public final q9.o f324646f;

    /* renamed from: g, reason: collision with root package name */
    public final m8.u f324647g;

    /* renamed from: h, reason: collision with root package name */
    public final t9.y f324648h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f324649i;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.HandlerThread f324650m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f324651n;

    /* renamed from: o, reason: collision with root package name */
    public final m8.i f324652o;

    /* renamed from: p, reason: collision with root package name */
    public final m8.l0 f324653p;

    /* renamed from: q, reason: collision with root package name */
    public final m8.k0 f324654q;

    /* renamed from: r, reason: collision with root package name */
    public final m8.w f324655r;

    /* renamed from: s, reason: collision with root package name */
    public m8.m f324656s;

    /* renamed from: t, reason: collision with root package name */
    public m8.y f324657t;

    /* renamed from: u, reason: collision with root package name */
    public m8.b0 f324658u;

    /* renamed from: v, reason: collision with root package name */
    public t9.j f324659v;

    /* renamed from: w, reason: collision with root package name */
    public d9.a0 f324660w;

    /* renamed from: x, reason: collision with root package name */
    public m8.b0[] f324661x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f324662y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f324663z;

    public p(m8.b0[] b0VarArr, q9.o oVar, m8.u uVar, boolean z17, int i17, android.os.Handler handler, m8.m mVar, m8.i iVar) {
        this.f324644d = b0VarArr;
        this.f324646f = oVar;
        this.f324647g = uVar;
        this.f324663z = z17;
        this.D = i17;
        this.f324651n = handler;
        this.f324656s = mVar;
        this.f324652o = iVar;
        this.f324645e = new m8.c0[b0VarArr.length];
        for (int i18 = 0; i18 < b0VarArr.length; i18++) {
            m8.b0 b0Var = b0VarArr[i18];
            ((m8.a) b0Var).f324537f = i18;
            m8.c0[] c0VarArr = this.f324645e;
            m8.a aVar = (m8.a) b0Var;
            aVar.getClass();
            c0VarArr[i18] = aVar;
        }
        this.f324648h = new t9.y();
        this.f324661x = new m8.b0[0];
        this.f324653p = new m8.l0();
        this.f324654q = new m8.k0();
        this.f324655r = new m8.w();
        oVar.getClass();
        this.f324657t = m8.y.f324678d;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f324650m = handlerThread;
        handlerThread.start();
        this.f324649i = new android.os.Handler(handlerThread.getLooper(), this);
    }

    public final void A(m8.h[] hVarArr) {
        try {
            for (m8.h hVar : hVarArr) {
                hVar.f324557a.b(hVar.f324558b, hVar.f324559c);
            }
            int i17 = this.C;
            if (i17 == 3 || i17 == 2) {
                this.f324649i.sendEmptyMessage(2);
            }
            synchronized (this) {
                this.F++;
                notifyAll();
            }
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                this.F++;
                notifyAll();
                throw th6;
            }
        }
    }

    public final void C(boolean z17) {
        if (this.B != z17) {
            this.B = z17;
            this.f324651n.obtainMessage(2, z17 ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void D(boolean z17) {
        this.A = false;
        this.f324663z = z17;
        if (!z17) {
            K();
            L();
            return;
        }
        int i17 = this.C;
        android.os.Handler handler = this.f324649i;
        if (i17 == 3) {
            I();
            handler.sendEmptyMessage(2);
        } else if (i17 == 2) {
            handler.sendEmptyMessage(2);
        }
    }

    public final void E(m8.y yVar) {
        t9.j jVar = this.f324659v;
        if (jVar != null) {
            yVar = jVar.a(yVar);
        } else {
            this.f324648h.a(yVar);
        }
        this.f324657t = yVar;
        this.f324651n.obtainMessage(7, yVar).sendToTarget();
    }

    public final void F(m8.l lVar) {
        if (this.M == lVar) {
            return;
        }
        m8.b0[] b0VarArr = this.f324644d;
        boolean[] zArr = new boolean[b0VarArr.length];
        int i17 = 0;
        for (int i18 = 0; i18 < b0VarArr.length; i18++) {
            m8.b0 b0Var = b0VarArr[i18];
            m8.a aVar = (m8.a) b0Var;
            boolean z17 = aVar.f324538g != 0;
            zArr[i18] = z17;
            q9.m mVar = lVar.f324616k.f360871b.f360868b[i18];
            if (mVar != null) {
                i17++;
            }
            if (z17 && (mVar == null || (aVar.f324542n && aVar.f324539h == this.M.f324609d[i18]))) {
                if (b0Var == this.f324658u) {
                    t9.j jVar = this.f324659v;
                    t9.y yVar = this.f324648h;
                    yVar.getClass();
                    yVar.b(jVar.e());
                    yVar.f416563g = jVar.d();
                    this.f324659v = null;
                    this.f324658u = null;
                }
                e(b0Var);
                ((m8.a) b0Var).k();
            }
        }
        this.M = lVar;
        this.f324651n.obtainMessage(3, lVar.f324616k).sendToTarget();
        d(zArr, i17);
    }

    public final void G(int i17) {
        m8.l lVar;
        m8.l lVar2;
        this.D = i17;
        this.f324655r.f324677d = i17;
        m8.l lVar3 = this.M;
        if (lVar3 == null) {
            lVar3 = this.K;
        }
        if (lVar3 == null) {
            return;
        }
        while (true) {
            int b17 = this.N.b(lVar3.f324612g.f324667a.f227427a, this.f324654q, this.f324653p, i17);
            while (true) {
                lVar = lVar3.f324615j;
                if (lVar == null || lVar3.f324612g.f324672f) {
                    break;
                } else {
                    lVar3 = lVar;
                }
            }
            if (b17 == -1 || lVar == null || lVar.f324612g.f324667a.f227427a != b17) {
                break;
            } else {
                lVar3 = lVar;
            }
        }
        int i18 = this.K.f324608c;
        m8.l lVar4 = this.L;
        int i19 = lVar4 != null ? lVar4.f324608c : -1;
        if (lVar != null) {
            while (lVar != null) {
                lVar.b();
                lVar = lVar.f324615j;
            }
            lVar3.f324615j = null;
        }
        m8.w wVar = this.f324655r;
        m8.v vVar = lVar3.f324612g;
        wVar.getClass();
        lVar3.f324612g = wVar.d(vVar, vVar.f324667a);
        int i27 = lVar3.f324608c;
        if (!(i18 <= i27)) {
            this.K = lVar3;
        }
        if ((i19 != -1 && i19 <= i27) || (lVar2 = this.M) == null) {
            return;
        }
        d9.z zVar = lVar2.f324612g.f324667a;
        this.f324656s = new m8.m(zVar, y(zVar, this.f324656s.f324633d), this.f324656s.f324632c);
    }

    public final void H(int i17) {
        if (this.C != i17) {
            this.C = i17;
            this.f324651n.obtainMessage(1, i17, 0).sendToTarget();
        }
    }

    public final void I() {
        this.A = false;
        t9.y yVar = this.f324648h;
        if (!yVar.f416560d) {
            yVar.f416562f = android.os.SystemClock.elapsedRealtime();
            yVar.f416560d = true;
        }
        for (m8.b0 b0Var : this.f324661x) {
            m8.a aVar = (m8.a) b0Var;
            t9.a.d(aVar.f324538g == 1);
            aVar.f324538g = 2;
            aVar.o();
        }
    }

    public final void J() {
        q(true);
        ((m8.c) this.f324647g).a(true);
        H(1);
    }

    public final void K() {
        t9.y yVar = this.f324648h;
        if (yVar.f416560d) {
            yVar.b(yVar.e());
            yVar.f416560d = false;
        }
        for (m8.b0 b0Var : this.f324661x) {
            e(b0Var);
        }
    }

    public final void L() {
        m8.l lVar = this.M;
        if (lVar == null) {
            return;
        }
        long d17 = lVar.f324606a.d();
        if (d17 != -9223372036854775807L) {
            r(d17);
        } else {
            m8.b0 b0Var = this.f324658u;
            if (b0Var == null || b0Var.h()) {
                this.f324643J = this.f324648h.e();
            } else {
                long e17 = this.f324659v.e();
                this.f324643J = e17;
                this.f324648h.b(e17);
            }
            d17 = this.f324643J - this.M.a();
        }
        this.f324656s.f324633d = d17;
        this.G = android.os.SystemClock.elapsedRealtime() * 1000;
        long m17 = this.f324661x.length == 0 ? Long.MIN_VALUE : this.M.f324606a.m();
        m8.m mVar = this.f324656s;
        if (m17 == Long.MIN_VALUE) {
            m17 = this.M.f324612g.f324671e;
        }
        mVar.f324634e = m17;
    }

    @Override // d9.w
    public void a(d9.x xVar) {
        this.f324649i.obtainMessage(8, xVar).sendToTarget();
    }

    @Override // d9.h0
    public void b(d9.i0 i0Var) {
        this.f324649i.obtainMessage(9, (d9.x) i0Var).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022c A[LOOP:2: B:132:0x022c->B:136:0x023c, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0445  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.p.c():void");
    }

    public final void d(boolean[] zArr, int i17) {
        int i18;
        this.f324661x = new m8.b0[i17];
        int i19 = 0;
        int i27 = 0;
        while (true) {
            m8.b0[] b0VarArr = this.f324644d;
            if (i19 >= b0VarArr.length) {
                return;
            }
            m8.b0 b0Var = b0VarArr[i19];
            q9.p pVar = this.M.f324616k;
            q9.m mVar = pVar.f360871b.f360868b[i19];
            if (mVar != null) {
                int i28 = i27 + 1;
                this.f324661x[i27] = b0Var;
                m8.a aVar = (m8.a) b0Var;
                if (aVar.f324538g == 0) {
                    m8.d0 d0Var = pVar.f360873d[i19];
                    boolean z17 = this.f324663z && this.C == 3;
                    boolean z18 = !zArr[i19] && z17;
                    q9.e eVar = (q9.e) mVar;
                    int length = eVar.f360849c.length;
                    com.google.android.exoplayer2.Format[] formatArr = new com.google.android.exoplayer2.Format[length];
                    for (int i29 = 0; i29 < length; i29++) {
                        formatArr[i29] = eVar.f360850d[i29];
                    }
                    m8.l lVar = this.M;
                    d9.g0 g0Var = lVar.f324609d[i19];
                    long j17 = this.f324643J;
                    i18 = i19;
                    long a17 = lVar.a();
                    t9.a.d(aVar.f324538g == 0);
                    aVar.f324536e = d0Var;
                    aVar.f324538g = 1;
                    aVar.m(z18);
                    t9.a.d(!aVar.f324542n);
                    aVar.f324539h = g0Var;
                    aVar.f324541m = false;
                    aVar.f324540i = a17;
                    aVar.q(formatArr, a17);
                    aVar.n(j17, z18);
                    t9.j j18 = b0Var.j();
                    if (j18 != null) {
                        if (this.f324659v != null) {
                            throw new m8.e(2, null, new java.lang.IllegalStateException("Multiple renderer media clocks enabled."), -1);
                        }
                        this.f324659v = j18;
                        this.f324658u = b0Var;
                        j18.a(this.f324657t);
                    }
                    if (z17) {
                        t9.a.d(aVar.f324538g == 1);
                        aVar.f324538g = 2;
                        aVar.o();
                    }
                } else {
                    i18 = i19;
                }
                i27 = i28;
            } else {
                i18 = i19;
            }
            i19 = i18 + 1;
        }
    }

    public final void e(m8.b0 b0Var) {
        if (((m8.a) b0Var).f324538g == 2) {
            m8.a aVar = (m8.a) b0Var;
            t9.a.d(aVar.f324538g == 2);
            aVar.f324538g = 1;
            aVar.p();
        }
    }

    public final void g(d9.x xVar) {
        m8.l lVar = this.K;
        if (lVar == null || lVar.f324606a != xVar) {
            return;
        }
        lVar.f324613h = true;
        lVar.c();
        long d17 = lVar.d(lVar.f324612g.f324668b, false, new boolean[lVar.f324617l.length]);
        m8.v vVar = lVar.f324612g;
        lVar.f324612g = new m8.v(vVar.f324667a, d17, vVar.f324669c, vVar.f324670d, vVar.f324671e, vVar.f324672f, vVar.f324673g);
        if (this.M == null) {
            m8.l lVar2 = this.K;
            this.L = lVar2;
            r(lVar2.f324612g.f324668b);
            F(this.L);
        }
        k();
    }

    public final void h(java.lang.Object obj, int i17) {
        this.f324656s = new m8.m(0, 0L);
        m(obj, i17);
        this.f324656s = new m8.m(0, -9223372036854775807L);
        H(4);
        q(false);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        android.os.Handler handler = this.f324651n;
        try {
            switch (message.what) {
                case 0:
                    n((d9.a0) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    D(message.arg1 != 0);
                    return true;
                case 2:
                    c();
                    return true;
                case 3:
                    x((m8.n) message.obj);
                    return true;
                case 4:
                    E((m8.y) message.obj);
                    return true;
                case 5:
                    J();
                    return true;
                case 6:
                    o();
                    return true;
                case 7:
                    i((android.util.Pair) message.obj);
                    return true;
                case 8:
                    g((d9.x) message.obj);
                    return true;
                case 9:
                    d9.x xVar = (d9.x) message.obj;
                    m8.l lVar = this.K;
                    if (lVar != null && lVar.f324606a == xVar) {
                        k();
                    }
                    return true;
                case 10:
                    p();
                    return true;
                case 11:
                    A((m8.h[]) message.obj);
                    return true;
                case 12:
                    G(message.arg1);
                    return true;
                default:
                    return false;
            }
        } catch (java.io.IOException e17) {
            handler.obtainMessage(8, new m8.e(0, null, e17, -1)).sendToTarget();
            J();
            return true;
        } catch (java.lang.RuntimeException e18) {
            handler.obtainMessage(8, new m8.e(2, null, e18, -1)).sendToTarget();
            J();
            return true;
        } catch (m8.e e19) {
            handler.obtainMessage(8, e19).sendToTarget();
            J();
            return true;
        }
    }

    public final void i(android.util.Pair pair) {
        m8.l lVar;
        m8.l lVar2;
        java.lang.Object obj;
        java.lang.Object obj2;
        long j17;
        m8.m0 m0Var = this.N;
        m8.m0 m0Var2 = (m8.m0) pair.first;
        this.N = m0Var2;
        this.f324655r.f324676c = m0Var2;
        java.lang.Object obj3 = pair.second;
        if (m0Var == null) {
            if (this.H > 0) {
                android.util.Pair s17 = s(this.I);
                int i17 = this.H;
                this.H = 0;
                this.I = null;
                if (s17 == null) {
                    h(obj3, i17);
                    return;
                }
                int intValue = ((java.lang.Integer) s17.first).intValue();
                long longValue = ((java.lang.Long) s17.second).longValue();
                d9.z g17 = this.f324655r.g(intValue, longValue);
                this.f324656s = new m8.m(g17, g17.a() ? 0L : longValue, longValue);
                m(obj3, i17);
                return;
            }
            if (this.f324656s.f324631b != -9223372036854775807L) {
                m(obj3, 0);
                return;
            }
            if (m0Var2.j()) {
                h(obj3, 0);
                return;
            }
            android.util.Pair f17 = this.N.f(this.f324653p, this.f324654q, 0, -9223372036854775807L, 0L);
            int intValue2 = ((java.lang.Integer) f17.first).intValue();
            long longValue2 = ((java.lang.Long) f17.second).longValue();
            d9.z g18 = this.f324655r.g(intValue2, longValue2);
            this.f324656s = new m8.m(g18, g18.a() ? 0L : longValue2, longValue2);
            m(obj3, 0);
            return;
        }
        int i18 = this.f324656s.f324630a.f227427a;
        m8.l lVar3 = this.M;
        if (lVar3 == null) {
            lVar3 = this.K;
        }
        if (lVar3 == null && i18 >= m0Var.e()) {
            m(obj3, 0);
            return;
        }
        int a17 = this.N.a(lVar3 == null ? m0Var.d(i18, this.f324654q, true).f324596b : lVar3.f324607b);
        if (a17 == -1) {
            int t17 = t(i18, m0Var, this.N);
            if (t17 == -1) {
                h(obj3, 0);
                return;
            }
            android.util.Pair f18 = this.N.f(this.f324653p, this.f324654q, this.N.d(t17, this.f324654q, false).f324597c, -9223372036854775807L, 0L);
            int intValue3 = ((java.lang.Integer) f18.first).intValue();
            long longValue3 = ((java.lang.Long) f18.second).longValue();
            this.N.d(intValue3, this.f324654q, true);
            if (lVar3 != null) {
                java.lang.Object obj4 = this.f324654q.f324596b;
                m8.v vVar = lVar3.f324612g;
                d9.z zVar = vVar.f324667a;
                m8.l lVar4 = lVar3;
                lVar4.f324612g = new m8.v(zVar.f227427a == -1 ? zVar : new d9.z(-1, zVar.f227428b, zVar.f227429c), vVar.f324668b, vVar.f324669c, vVar.f324670d, vVar.f324671e, vVar.f324672f, vVar.f324673g);
                while (true) {
                    lVar4 = lVar4.f324615j;
                    if (lVar4 == null) {
                        break;
                    }
                    if (lVar4.f324607b.equals(obj4)) {
                        m8.w wVar = this.f324655r;
                        m8.v vVar2 = lVar4.f324612g;
                        wVar.getClass();
                        d9.z zVar2 = vVar2.f324667a;
                        if (zVar2.f227427a != intValue3) {
                            zVar2 = new d9.z(intValue3, zVar2.f227428b, zVar2.f227429c);
                        }
                        lVar4.f324612g = wVar.d(vVar2, zVar2);
                        obj = obj3;
                        obj2 = obj4;
                        j17 = longValue3;
                    } else {
                        m8.v vVar3 = lVar4.f324612g;
                        d9.z zVar3 = vVar3.f324667a;
                        obj = obj3;
                        obj2 = obj4;
                        j17 = longValue3;
                        lVar4.f324612g = new m8.v(zVar3.f227427a == -1 ? zVar3 : new d9.z(-1, zVar3.f227428b, zVar3.f227429c), vVar3.f324668b, vVar3.f324669c, vVar3.f324670d, vVar3.f324671e, vVar3.f324672f, vVar3.f324673g);
                    }
                    obj3 = obj;
                    obj4 = obj2;
                    longValue3 = j17;
                }
            }
            java.lang.Object obj5 = obj3;
            d9.z zVar4 = new d9.z(intValue3, -1, -1);
            this.f324656s = new m8.m(zVar4, y(zVar4, longValue3));
            m(obj5, 0);
            return;
        }
        if (a17 != i18) {
            m8.m mVar = this.f324656s;
            d9.z zVar5 = mVar.f324630a;
            m8.m mVar2 = new m8.m(zVar5.f227427a == a17 ? zVar5 : new d9.z(a17, zVar5.f227428b, zVar5.f227429c), mVar.f324631b, mVar.f324632c);
            mVar2.f324633d = mVar.f324633d;
            mVar2.f324634e = mVar.f324634e;
            this.f324656s = mVar2;
        }
        if (this.f324656s.f324630a.a()) {
            d9.z g19 = this.f324655r.g(a17, this.f324656s.f324632c);
            if (!g19.a() || g19.f227429c != this.f324656s.f324630a.f227429c) {
                this.f324656s = new m8.m(g19, y(g19, this.f324656s.f324632c), g19.a() ? this.f324656s.f324632c : -9223372036854775807L);
                m(obj3, 0);
                return;
            }
        }
        if (lVar3 == null) {
            m(obj3, 0);
            return;
        }
        while (true) {
            m8.v vVar4 = lVar3.f324612g;
            m8.w wVar2 = this.f324655r;
            wVar2.getClass();
            d9.z zVar6 = vVar4.f324667a;
            if (zVar6.f227427a != a17) {
                zVar6 = new d9.z(a17, zVar6.f227428b, zVar6.f227429c);
            }
            m8.v d17 = wVar2.d(vVar4, zVar6);
            lVar3.f324612g = d17;
            if (d17.f324672f || (lVar2 = lVar3.f324615j) == null) {
                break;
            } else {
                lVar3 = lVar2;
            }
        }
        while (true) {
            lVar = lVar3.f324615j;
            if (lVar == null) {
                break;
            }
            a17 = this.N.b(a17, this.f324654q, this.f324653p, this.D);
            if (a17 == -1 || !lVar.f324607b.equals(this.N.d(a17, this.f324654q, true).f324596b)) {
                break;
            }
            do {
                lVar3 = lVar;
                m8.v vVar5 = lVar3.f324612g;
                m8.w wVar3 = this.f324655r;
                wVar3.getClass();
                d9.z zVar7 = vVar5.f324667a;
                if (zVar7.f227427a != a17) {
                    zVar7 = new d9.z(a17, zVar7.f227428b, zVar7.f227429c);
                }
                m8.v d18 = wVar3.d(vVar5, zVar7);
                lVar3.f324612g = d18;
                if (!d18.f324672f) {
                    lVar = lVar3.f324615j;
                }
            } while (lVar != null);
        }
        m8.l lVar5 = this.L;
        if (lVar5 != null && lVar5.f324608c < lVar.f324608c) {
            this.K = lVar3;
            lVar3.f324615j = null;
            while (lVar != null) {
                lVar.b();
                lVar = lVar.f324615j;
            }
        } else {
            this.f324656s = new m8.m(this.M.f324612g.f324667a, y(this.M.f324612g.f324667a, this.f324656s.f324633d), this.f324656s.f324632c);
        }
        m(obj3, 0);
    }

    public final boolean j(long j17) {
        m8.l lVar;
        return j17 == -9223372036854775807L || this.f324656s.f324633d < j17 || ((lVar = this.M.f324615j) != null && (lVar.f324613h || lVar.f324612g.f324667a.a()));
    }

    public final void k() {
        int i17;
        m8.l lVar = this.K;
        long j17 = this.f324643J;
        long n17 = !lVar.f324613h ? 0L : lVar.f324606a.n();
        boolean z17 = false;
        if (n17 != Long.MIN_VALUE) {
            long a17 = n17 - (j17 - lVar.a());
            m8.c cVar = (m8.c) lVar.f324620o;
            char c17 = a17 > cVar.f324547c ? (char) 0 : a17 < cVar.f324546b ? (char) 2 : (char) 1;
            r9.o oVar = cVar.f324545a;
            synchronized (oVar) {
                i17 = oVar.f393394e * oVar.f393391b;
            }
            boolean z18 = i17 >= cVar.f324550f;
            boolean z19 = cVar.f324551g;
            if (c17 == 2 || (c17 == 1 && z19 && !z18)) {
                z17 = true;
            }
            cVar.f324551g = z17;
        }
        C(z17);
        if (z17) {
            m8.l lVar2 = this.K;
            lVar2.f324606a.h(this.f324643J - lVar2.a());
        }
    }

    public final void l() {
        m8.l lVar = this.K;
        if (lVar == null || lVar.f324613h) {
            return;
        }
        m8.l lVar2 = this.L;
        if (lVar2 == null || lVar2.f324615j == lVar) {
            for (m8.b0 b0Var : this.f324661x) {
                if (!((m8.a) b0Var).f324541m) {
                    return;
                }
            }
            this.K.f324606a.o();
        }
    }

    public final void m(java.lang.Object obj, int i17) {
        this.f324651n.obtainMessage(6, new m8.o(this.N, obj, this.f324656s, i17)).sendToTarget();
    }

    public final void n(d9.a0 a0Var, boolean z17) {
        this.f324651n.sendEmptyMessage(0);
        q(true);
        ((m8.c) this.f324647g).a(false);
        if (z17) {
            this.f324656s = new m8.m(0, -9223372036854775807L);
        } else {
            m8.m mVar = this.f324656s;
            this.f324656s = new m8.m(mVar.f324630a, mVar.f324633d, this.f324656s.f324632c);
        }
        this.f324660w = a0Var;
        if (a0Var != null) {
            a0Var.a(this.f324652o, true, this);
        }
        H(2);
        this.f324649i.sendEmptyMessage(2);
    }

    public final void o() {
        q(true);
        ((m8.c) this.f324647g).a(true);
        H(1);
        synchronized (this) {
            this.f324662y = true;
            notifyAll();
        }
    }

    public final void p() {
        m8.l lVar = this.M;
        if (lVar == null) {
            return;
        }
        boolean z17 = true;
        while (lVar != null && lVar.f324613h) {
            if (lVar.c()) {
                if (z17) {
                    m8.l lVar2 = this.L;
                    m8.l lVar3 = this.M;
                    boolean z18 = lVar2 != lVar3;
                    for (m8.l lVar4 = lVar3.f324615j; lVar4 != null; lVar4 = lVar4.f324615j) {
                        lVar4.b();
                    }
                    m8.l lVar5 = this.M;
                    lVar5.f324615j = null;
                    this.K = lVar5;
                    this.L = lVar5;
                    boolean[] zArr = new boolean[this.f324644d.length];
                    long d17 = lVar5.d(this.f324656s.f324633d, z18, zArr);
                    if (d17 != this.f324656s.f324633d) {
                        this.f324656s.f324633d = d17;
                        r(d17);
                    }
                    boolean[] zArr2 = new boolean[this.f324644d.length];
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        m8.b0[] b0VarArr = this.f324644d;
                        if (i17 >= b0VarArr.length) {
                            break;
                        }
                        m8.b0 b0Var = b0VarArr[i17];
                        m8.a aVar = (m8.a) b0Var;
                        boolean z19 = aVar.f324538g != 0;
                        zArr2[i17] = z19;
                        d9.g0 g0Var = this.M.f324609d[i17];
                        if (g0Var != null) {
                            i18++;
                        }
                        if (z19) {
                            if (g0Var != aVar.f324539h) {
                                if (b0Var == this.f324658u) {
                                    if (g0Var == null) {
                                        t9.y yVar = this.f324648h;
                                        t9.j jVar = this.f324659v;
                                        yVar.getClass();
                                        yVar.b(jVar.e());
                                        yVar.f416563g = jVar.d();
                                    }
                                    this.f324659v = null;
                                    this.f324658u = null;
                                }
                                e(b0Var);
                                aVar.k();
                            } else if (zArr[i17]) {
                                long j17 = this.f324643J;
                                aVar.f324542n = false;
                                aVar.f324541m = false;
                                aVar.n(j17, false);
                            }
                        }
                        i17++;
                    }
                    this.f324651n.obtainMessage(3, lVar.f324616k).sendToTarget();
                    d(zArr2, i18);
                } else {
                    this.K = lVar;
                    for (m8.l lVar6 = lVar.f324615j; lVar6 != null; lVar6 = lVar6.f324615j) {
                        lVar6.b();
                    }
                    m8.l lVar7 = this.K;
                    lVar7.f324615j = null;
                    if (lVar7.f324613h) {
                        long max = java.lang.Math.max(lVar7.f324612g.f324668b, this.f324643J - lVar7.a());
                        m8.l lVar8 = this.K;
                        lVar8.d(max, false, new boolean[lVar8.f324617l.length]);
                    }
                }
                k();
                L();
                this.f324649i.sendEmptyMessage(2);
                return;
            }
            if (lVar == this.L) {
                z17 = false;
            }
            lVar = lVar.f324615j;
        }
    }

    public final void q(boolean z17) {
        this.f324649i.removeMessages(2);
        this.A = false;
        t9.y yVar = this.f324648h;
        if (yVar.f416560d) {
            yVar.b(yVar.e());
            yVar.f416560d = false;
        }
        this.f324659v = null;
        this.f324658u = null;
        this.f324643J = 60000000L;
        for (m8.b0 b0Var : this.f324661x) {
            try {
                e(b0Var);
                ((m8.a) b0Var).k();
            } catch (java.lang.RuntimeException | m8.e unused) {
            }
        }
        this.f324661x = new m8.b0[0];
        m8.l lVar = this.M;
        if (lVar == null) {
            lVar = this.K;
        }
        while (lVar != null) {
            lVar.b();
            lVar = lVar.f324615j;
        }
        this.K = null;
        this.L = null;
        this.M = null;
        C(false);
        if (z17) {
            d9.a0 a0Var = this.f324660w;
            if (a0Var != null) {
                a0Var.e();
                this.f324660w = null;
            }
            this.f324655r.f324676c = null;
            this.N = null;
        }
    }

    public final void r(long j17) {
        m8.l lVar = this.M;
        long a17 = j17 + (lVar == null ? 60000000L : lVar.a());
        this.f324643J = a17;
        this.f324648h.b(a17);
        for (m8.b0 b0Var : this.f324661x) {
            long j18 = this.f324643J;
            m8.a aVar = (m8.a) b0Var;
            aVar.f324542n = false;
            aVar.f324541m = false;
            aVar.n(j18, false);
        }
    }

    public final android.util.Pair s(m8.n nVar) {
        m8.m0 m0Var = nVar.f324636a;
        if (m0Var.j()) {
            m0Var = this.N;
        }
        try {
            android.util.Pair f17 = m0Var.f(this.f324653p, this.f324654q, nVar.f324637b, nVar.f324638c, 0L);
            m8.m0 m0Var2 = this.N;
            if (m0Var2 == m0Var) {
                return f17;
            }
            int intValue = ((java.lang.Integer) f17.first).intValue();
            m8.k0 k0Var = this.f324654q;
            int a17 = m0Var2.a(m0Var.d(intValue, k0Var, true).f324596b);
            if (a17 != -1) {
                return android.util.Pair.create(java.lang.Integer.valueOf(a17), f17.second);
            }
            int t17 = t(((java.lang.Integer) f17.first).intValue(), m0Var, this.N);
            if (t17 == -1) {
                return null;
            }
            return this.N.f(this.f324653p, this.f324654q, this.N.d(t17, k0Var, false).f324597c, -9223372036854775807L, 0L);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new m8.t(this.N, nVar.f324637b, nVar.f324638c);
        }
    }

    public final int t(int i17, m8.m0 m0Var, m8.m0 m0Var2) {
        int e17 = m0Var.e();
        int i18 = -1;
        for (int i19 = 0; i19 < e17 && i18 == -1; i19++) {
            m8.l0 l0Var = this.f324653p;
            int i27 = this.D;
            m8.k0 k0Var = this.f324654q;
            i17 = m0Var.b(i17, k0Var, l0Var, i27);
            if (i17 == -1) {
                break;
            }
            i18 = m0Var2.a(m0Var.d(i17, k0Var, true).f324596b);
        }
        return i18;
    }

    public final void w(long j17, long j18) {
        android.os.Handler handler = this.f324649i;
        handler.removeMessages(2);
        long elapsedRealtime = (j17 + j18) - android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            handler.sendEmptyMessage(2);
        } else {
            handler.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final void x(m8.n nVar) {
        int i17;
        long j17;
        if (this.N == null) {
            this.H++;
            this.I = nVar;
            return;
        }
        android.util.Pair s17 = s(nVar);
        if (s17 == null) {
            m8.m mVar = new m8.m(0, 0L);
            this.f324656s = mVar;
            this.f324651n.obtainMessage(4, 1, 0, mVar).sendToTarget();
            this.f324656s = new m8.m(0, -9223372036854775807L);
            H(4);
            q(false);
            return;
        }
        int i18 = nVar.f324638c == -9223372036854775807L ? 1 : 0;
        int intValue = ((java.lang.Integer) s17.first).intValue();
        long longValue = ((java.lang.Long) s17.second).longValue();
        d9.z g17 = this.f324655r.g(intValue, longValue);
        if (g17.a()) {
            i17 = 1;
            j17 = 0;
        } else {
            i17 = i18;
            j17 = longValue;
        }
        try {
            if (g17.equals(this.f324656s.f324630a) && j17 / 1000 == this.f324656s.f324633d / 1000) {
                return;
            }
            long y17 = y(g17, j17);
            int i19 = i17 | (j17 == y17 ? 0 : 1);
            m8.m mVar2 = new m8.m(g17, y17, longValue);
            this.f324656s = mVar2;
            this.f324651n.obtainMessage(4, i19, 0, mVar2).sendToTarget();
        } finally {
            m8.m mVar3 = new m8.m(g17, j17, longValue);
            this.f324656s = mVar3;
            this.f324651n.obtainMessage(4, i17, 0, mVar3).sendToTarget();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(d9.z r10, long r11) {
        /*
            r9 = this;
            r9.K()
            r0 = 0
            r9.A = r0
            r1 = 2
            r9.H(r1)
            m8.l r2 = r9.M
            r3 = 0
            if (r2 != 0) goto L18
            m8.l r10 = r9.K
            if (r10 == 0) goto L16
            r10.b()
        L16:
            r4 = r3
            goto L58
        L18:
            r4 = r3
        L19:
            if (r2 == 0) goto L58
            if (r4 != 0) goto L52
            m8.v r5 = r2.f324612g
            d9.z r5 = r5.f324667a
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L4d
            boolean r5 = r2.f324613h
            if (r5 == 0) goto L4d
            m8.m0 r5 = r9.N
            m8.v r6 = r2.f324612g
            d9.z r6 = r6.f324667a
            int r6 = r6.f227427a
            m8.k0 r7 = r9.f324654q
            r5.c(r6, r7)
            int r5 = r7.a(r11)
            r6 = -1
            if (r5 == r6) goto L4b
            long[] r6 = r7.f324600f
            r5 = r6[r5]
            m8.v r7 = r2.f324612g
            long r7 = r7.f324669c
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4d
        L4b:
            r5 = 1
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L52
            r4 = r2
            goto L55
        L52:
            r2.b()
        L55:
            m8.l r2 = r2.f324615j
            goto L19
        L58:
            m8.l r10 = r9.M
            if (r10 != r4) goto L60
            m8.l r2 = r9.L
            if (r10 == r2) goto L7a
        L60:
            m8.b0[] r10 = r9.f324661x
            int r2 = r10.length
            r5 = r0
        L64:
            if (r5 >= r2) goto L70
            r6 = r10[r5]
            m8.a r6 = (m8.a) r6
            r6.k()
            int r5 = r5 + 1
            goto L64
        L70:
            m8.b0[] r10 = new m8.b0[r0]
            r9.f324661x = r10
            r9.f324659v = r3
            r9.f324658u = r3
            r9.M = r3
        L7a:
            if (r4 == 0) goto L99
            r4.f324615j = r3
            r9.K = r4
            r9.L = r4
            r9.F(r4)
            m8.l r10 = r9.M
            boolean r0 = r10.f324614i
            if (r0 == 0) goto L92
            d9.x r10 = r10.f324606a
            long r10 = r10.c(r11)
            r11 = r10
        L92:
            r9.r(r11)
            r9.k()
            goto La2
        L99:
            r9.K = r3
            r9.L = r3
            r9.M = r3
            r9.r(r11)
        La2:
            android.os.Handler r10 = r9.f324649i
            r10.sendEmptyMessage(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.p.y(d9.z, long):long");
    }
}

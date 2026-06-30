package d9;

/* loaded from: classes15.dex */
public final class t implements d9.x, q8.g, r9.a0, r9.d0, d9.e0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public d9.l0 E;
    public long F;
    public boolean[] G;
    public boolean[] H;
    public boolean I;
    public long K;
    public int M;
    public boolean N;
    public boolean P;

    /* renamed from: d, reason: collision with root package name */
    public final android.net.Uri f227398d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.k f227399e;

    /* renamed from: f, reason: collision with root package name */
    public final int f227400f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f227401g;

    /* renamed from: h, reason: collision with root package name */
    public final d9.u f227402h;

    /* renamed from: i, reason: collision with root package name */
    public final d9.r f227403i;

    /* renamed from: m, reason: collision with root package name */
    public final r9.b f227404m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f227405n;

    /* renamed from: o, reason: collision with root package name */
    public final long f227406o;

    /* renamed from: q, reason: collision with root package name */
    public final d9.q f227408q;

    /* renamed from: v, reason: collision with root package name */
    public d9.w f227413v;

    /* renamed from: w, reason: collision with root package name */
    public q8.m f227414w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f227417z;

    /* renamed from: p, reason: collision with root package name */
    public final r9.g0 f227407p = new r9.g0("Loader:ExtractorMediaPeriod");

    /* renamed from: r, reason: collision with root package name */
    public final t9.g f227409r = new t9.g();

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f227410s = new d9.m(this);

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f227411t = new d9.n(this);

    /* renamed from: u, reason: collision with root package name */
    public final android.os.Handler f227412u = new android.os.Handler();

    /* renamed from: y, reason: collision with root package name */
    public int[] f227416y = new int[0];

    /* renamed from: x, reason: collision with root package name */
    public d9.f0[] f227415x = new d9.f0[0];
    public long L = -9223372036854775807L;

    /* renamed from: J, reason: collision with root package name */
    public long f227397J = -1;

    public t(android.net.Uri uri, r9.k kVar, q8.e[] eVarArr, int i17, android.os.Handler handler, d9.u uVar, d9.r rVar, r9.b bVar, java.lang.String str, int i18) {
        this.f227398d = uri;
        this.f227399e = kVar;
        this.f227400f = i17;
        this.f227401g = handler;
        this.f227402h = uVar;
        this.f227403i = rVar;
        this.f227404m = bVar;
        this.f227405n = str;
        this.f227406o = i18;
        this.f227408q = new d9.q(eVarArr, this);
    }

    @Override // d9.e0
    public void a(com.google.android.exoplayer2.Format format) {
        this.f227412u.post(this.f227410s);
    }

    @Override // q8.g
    public void b(q8.m mVar) {
        this.f227414w = mVar;
        this.f227412u.post(this.f227410s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r3 = false;
     */
    @Override // d9.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long c(long r8) {
        /*
            r7 = this;
            q8.m r0 = r7.f227414w
            boolean r0 = r0.c()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r8 = 0
        Lb:
            r7.K = r8
            r0 = 0
            r7.C = r0
            boolean r1 = r7.t()
            if (r1 != 0) goto L52
            d9.f0[] r1 = r7.f227415x
            int r1 = r1.length
            r2 = r0
        L1a:
            r3 = 1
            if (r2 >= r1) goto L4f
            d9.f0[] r4 = r7.f227415x
            r4 = r4[r2]
            r4.n()
            boolean r3 = r4.e(r8, r3, r0)
            if (r3 != 0) goto L36
            boolean[] r3 = r7.H
            boolean r3 = r3[r2]
            if (r3 != 0) goto L34
            boolean r3 = r7.I
            if (r3 != 0) goto L36
        L34:
            r3 = r0
            goto L4f
        L36:
            d9.c0 r3 = r4.f227339c
            monitor-enter(r3)
            int r5 = r3.f227304l     // Catch: java.lang.Throwable -> L4c
            if (r5 != 0) goto L41
            monitor-exit(r3)
            r5 = -1
            goto L46
        L41:
            long r5 = r3.a(r5)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
        L46:
            r4.f(r5)
            int r2 = r2 + 1
            goto L1a
        L4c:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        L4f:
            if (r3 == 0) goto L52
            return r8
        L52:
            r7.L = r8
            r7.N = r0
            r9.g0 r1 = r7.f227407p
            boolean r2 = r1.a()
            if (r2 == 0) goto L64
            r9.b0 r1 = r1.f393366b
            r1.b(r0)
            goto L72
        L64:
            d9.f0[] r1 = r7.f227415x
            int r2 = r1.length
            r3 = r0
        L68:
            if (r3 >= r2) goto L72
            r4 = r1[r3]
            r4.m(r0)
            int r3 = r3 + 1
            goto L68
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.t.c(long):long");
    }

    @Override // d9.x
    public long d() {
        if (!this.C) {
            return -9223372036854775807L;
        }
        this.C = false;
        return this.K;
    }

    @Override // r9.a0
    public void e(r9.c0 c0Var, long j17, long j18) {
        long j19;
        d9.p pVar = (d9.p) c0Var;
        if (this.f227397J == -1) {
            this.f227397J = pVar.f227390i;
        }
        this.N = true;
        if (this.F == -9223372036854775807L) {
            long j27 = Long.MIN_VALUE;
            for (d9.f0 f0Var : this.f227415x) {
                d9.c0 c0Var2 = f0Var.f227339c;
                synchronized (c0Var2) {
                    j19 = c0Var2.f227306n;
                }
                j27 = java.lang.Math.max(j27, j19);
            }
            long j28 = j27 == Long.MIN_VALUE ? 0L : com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT + j27;
            this.F = j28;
            ((d9.v) this.f227403i).g(j28, this.f227414w.c());
        }
        this.f227413v.b(this);
    }

    @Override // r9.d0
    public void f() {
        d9.q qVar = this.f227408q;
        q8.e eVar = qVar.f227394c;
        if (eVar != null) {
            eVar.release();
            qVar.f227394c = null;
        }
        for (d9.f0 f0Var : this.f227415x) {
            f0Var.m(false);
        }
    }

    @Override // r9.a0
    public int g(r9.c0 c0Var, long j17, long j18, java.io.IOException iOException) {
        q8.m mVar;
        d9.p pVar = (d9.p) c0Var;
        if (this.f227397J == -1) {
            this.f227397J = pVar.f227390i;
        }
        android.os.Handler handler = this.f227401g;
        if (handler != null && this.f227402h != null) {
            handler.post(new d9.o(this, iOException));
        }
        if (iOException instanceof d9.m0) {
            return 3;
        }
        int i17 = s() > this.M ? 1 : 0;
        if (this.f227397J == -1 && ((mVar = this.f227414w) == null || mVar.g() == -9223372036854775807L)) {
            this.K = 0L;
            this.C = this.A;
            for (d9.f0 f0Var : this.f227415x) {
                f0Var.m(false);
            }
            pVar.f227386e.f360640a = 0L;
            pVar.f227389h = 0L;
            pVar.f227388g = true;
        }
        this.M = s();
        return i17;
    }

    @Override // d9.i0
    public boolean h(long j17) {
        boolean z17 = false;
        if (this.N || (this.A && this.D == 0)) {
            return false;
        }
        t9.g gVar = this.f227409r;
        synchronized (gVar) {
            if (!gVar.f416512a) {
                gVar.f416512a = true;
                gVar.notifyAll();
                z17 = true;
            }
        }
        if (this.f227407p.a()) {
            return z17;
        }
        u();
        return true;
    }

    @Override // d9.x
    public long i(q9.m[] mVarArr, boolean[] zArr, d9.g0[] g0VarArr, boolean[] zArr2, long j17) {
        q9.m mVar;
        t9.a.d(this.A);
        int i17 = this.D;
        for (int i18 = 0; i18 < mVarArr.length; i18++) {
            d9.g0 g0Var = g0VarArr[i18];
            if (g0Var != null && (mVarArr[i18] == null || !zArr[i18])) {
                boolean[] zArr3 = this.G;
                int i19 = ((d9.s) g0Var).f227395a;
                t9.a.d(zArr3[i19]);
                this.D--;
                this.G[i19] = false;
                g0VarArr[i18] = null;
            }
        }
        boolean z17 = !this.B ? j17 == 0 : i17 != 0;
        for (int i27 = 0; i27 < mVarArr.length; i27++) {
            if (g0VarArr[i27] == null && (mVar = mVarArr[i27]) != null) {
                q9.e eVar = (q9.e) mVar;
                int[] iArr = eVar.f360849c;
                t9.a.d(iArr.length == 1);
                t9.a.d(iArr[0] == 0);
                int a17 = this.E.a(eVar.f360847a);
                t9.a.d(!this.G[a17]);
                this.D++;
                this.G[a17] = true;
                g0VarArr[i27] = new d9.s(this, a17);
                zArr2[i27] = true;
                if (!z17) {
                    d9.f0 f0Var = this.f227415x[a17];
                    f0Var.n();
                    if (!f0Var.e(j17, true, true)) {
                        d9.c0 c0Var = f0Var.f227339c;
                        if (c0Var.f227302j + c0Var.f227304l != 0) {
                            z17 = true;
                        }
                    }
                    z17 = false;
                }
            }
        }
        if (this.D == 0) {
            this.C = false;
            r9.g0 g0Var2 = this.f227407p;
            if (g0Var2.a()) {
                for (d9.f0 f0Var2 : this.f227415x) {
                    f0Var2.h();
                }
                g0Var2.f393366b.b(false);
            } else {
                for (d9.f0 f0Var3 : this.f227415x) {
                    f0Var3.m(false);
                }
            }
        } else if (z17) {
            j17 = c(j17);
            for (int i28 = 0; i28 < g0VarArr.length; i28++) {
                if (g0VarArr[i28] != null) {
                    zArr2[i28] = true;
                }
            }
        }
        this.B = true;
        return j17;
    }

    @Override // q8.g
    public void j() {
        this.f227417z = true;
        this.f227412u.post(this.f227410s);
    }

    @Override // d9.x
    public d9.l0 k() {
        return this.E;
    }

    @Override // q8.g
    public q8.o l(int i17, int i18) {
        int length = this.f227415x.length;
        for (int i19 = 0; i19 < length; i19++) {
            if (this.f227416y[i19] == i17) {
                return this.f227415x[i19];
            }
        }
        d9.f0 f0Var = new d9.f0(this.f227404m);
        f0Var.f227348l = this;
        int i27 = length + 1;
        int[] copyOf = java.util.Arrays.copyOf(this.f227416y, i27);
        this.f227416y = copyOf;
        copyOf[length] = i17;
        d9.f0[] f0VarArr = (d9.f0[]) java.util.Arrays.copyOf(this.f227415x, i27);
        this.f227415x = f0VarArr;
        f0VarArr[length] = f0Var;
        return f0Var;
    }

    @Override // d9.i0
    public long m() {
        long j17;
        long j18;
        long j19;
        if (this.N) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.L;
        }
        int i17 = 0;
        if (this.I) {
            int length = this.f227415x.length;
            j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            while (i17 < length) {
                if (this.H[i17]) {
                    d9.c0 c0Var = this.f227415x[i17].f227339c;
                    synchronized (c0Var) {
                        j19 = c0Var.f227306n;
                    }
                    j17 = java.lang.Math.min(j17, j19);
                }
                i17++;
            }
        } else {
            d9.f0[] f0VarArr = this.f227415x;
            int length2 = f0VarArr.length;
            long j27 = Long.MIN_VALUE;
            while (i17 < length2) {
                d9.c0 c0Var2 = f0VarArr[i17].f227339c;
                synchronized (c0Var2) {
                    j18 = c0Var2.f227306n;
                }
                j27 = java.lang.Math.max(j27, j18);
                i17++;
            }
            j17 = j27;
        }
        return j17 == Long.MIN_VALUE ? this.K : j17;
    }

    @Override // d9.i0
    public long n() {
        if (this.D == 0) {
            return Long.MIN_VALUE;
        }
        return m();
    }

    @Override // d9.x
    public void o() {
        this.f227407p.b();
    }

    @Override // d9.x
    public void p(long j17) {
        int length = this.f227415x.length;
        for (int i17 = 0; i17 < length; i17++) {
            this.f227415x[i17].g(j17, false, this.G[i17]);
        }
    }

    @Override // r9.a0
    public void q(r9.c0 c0Var, long j17, long j18, boolean z17) {
        d9.p pVar = (d9.p) c0Var;
        if (z17) {
            return;
        }
        if (this.f227397J == -1) {
            this.f227397J = pVar.f227390i;
        }
        for (d9.f0 f0Var : this.f227415x) {
            f0Var.m(false);
        }
        if (this.D > 0) {
            this.f227413v.b(this);
        }
    }

    @Override // d9.x
    public void r(d9.w wVar, long j17) {
        this.f227413v = wVar;
        t9.g gVar = this.f227409r;
        synchronized (gVar) {
            if (!gVar.f416512a) {
                gVar.f416512a = true;
                gVar.notifyAll();
            }
        }
        u();
    }

    public final int s() {
        int i17 = 0;
        for (d9.f0 f0Var : this.f227415x) {
            d9.c0 c0Var = f0Var.f227339c;
            i17 += c0Var.f227302j + c0Var.f227301i;
        }
        return i17;
    }

    public final boolean t() {
        return this.L != -9223372036854775807L;
    }

    public final void u() {
        q8.m mVar;
        d9.p pVar = new d9.p(this, this.f227398d, this.f227399e, this.f227408q, this.f227409r);
        if (this.A) {
            t9.a.d(t());
            long j17 = this.F;
            if (j17 != -9223372036854775807L && this.L >= j17) {
                this.N = true;
                this.L = -9223372036854775807L;
                return;
            }
            long d17 = this.f227414w.d(this.L);
            long j18 = this.L;
            pVar.f227386e.f360640a = d17;
            pVar.f227389h = j18;
            pVar.f227388g = true;
            this.L = -9223372036854775807L;
        }
        this.M = s();
        int i17 = this.f227400f;
        if (i17 == -1) {
            i17 = (this.A && this.f227397J == -1 && ((mVar = this.f227414w) == null || mVar.g() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f227407p.d(pVar, this, i17);
    }
}

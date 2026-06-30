package o36;

/* loaded from: classes16.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l36.a f342786a;

    /* renamed from: b, reason: collision with root package name */
    public o36.g f342787b;

    /* renamed from: c, reason: collision with root package name */
    public l36.d1 f342788c;

    /* renamed from: d, reason: collision with root package name */
    public final l36.t f342789d;

    /* renamed from: e, reason: collision with root package name */
    public final l36.n f342790e;

    /* renamed from: f, reason: collision with root package name */
    public final l36.f0 f342791f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f342792g;

    /* renamed from: h, reason: collision with root package name */
    public final o36.h f342793h;

    /* renamed from: i, reason: collision with root package name */
    public int f342794i;

    /* renamed from: j, reason: collision with root package name */
    public o36.d f342795j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f342796k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f342797l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f342798m;

    /* renamed from: n, reason: collision with root package name */
    public p36.d f342799n;

    public j(l36.t tVar, l36.a aVar, l36.n nVar, l36.f0 f0Var, java.lang.Object obj) {
        this.f342789d = tVar;
        this.f342786a = aVar;
        this.f342790e = nVar;
        this.f342791f = f0Var;
        ((l36.o0) m36.a.f323382a).getClass();
        this.f342793h = new o36.h(aVar, tVar.f315643e, nVar, f0Var);
        this.f342792g = obj;
    }

    public void a(o36.d dVar, boolean z17) {
        if (this.f342795j != null) {
            throw new java.lang.IllegalStateException();
        }
        this.f342795j = dVar;
        this.f342796k = z17;
        ((java.util.ArrayList) dVar.f342771n).add(new o36.i(this, this.f342792g));
    }

    public synchronized o36.d b() {
        return this.f342795j;
    }

    public final java.net.Socket c(boolean z17, boolean z18, boolean z19) {
        java.net.Socket socket;
        if (z19) {
            this.f342799n = null;
        }
        boolean z27 = true;
        if (z18) {
            this.f342797l = true;
        }
        o36.d dVar = this.f342795j;
        if (dVar == null) {
            return null;
        }
        if (z17) {
            dVar.f342768k = true;
        }
        if (this.f342799n != null) {
            return null;
        }
        if (!this.f342797l && !dVar.f342768k) {
            return null;
        }
        int size = ((java.util.ArrayList) dVar.f342771n).size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.ArrayList arrayList = (java.util.ArrayList) dVar.f342771n;
            if (((java.lang.ref.Reference) arrayList.get(i17)).get() == this) {
                arrayList.remove(i17);
                if (((java.util.ArrayList) this.f342795j.f342771n).isEmpty()) {
                    this.f342795j.f342772o = java.lang.System.nanoTime();
                    m36.a aVar = m36.a.f323382a;
                    o36.d dVar2 = this.f342795j;
                    ((l36.o0) aVar).getClass();
                    l36.t tVar = this.f342789d;
                    tVar.getClass();
                    if (dVar2.f342768k || tVar.f315639a == 0) {
                        ((java.util.ArrayDeque) tVar.f315642d).remove(dVar2);
                    } else {
                        tVar.notifyAll();
                        z27 = false;
                    }
                    if (z27) {
                        socket = this.f342795j.f342762e;
                        this.f342795j = null;
                        return socket;
                    }
                }
                socket = null;
                this.f342795j = null;
                return socket;
            }
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        if ((r0.f342777b < r0.f342776a.size()) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o36.d d(int r25, int r26, int r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o36.j.d(int, int, int, int, boolean):o36.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087 A[LOOP:0: B:1:0x0000->B:39:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o36.d e(int r13, int r14, int r15, int r16, boolean r17, boolean r18) {
        /*
            r12 = this;
        L0:
            o36.d r1 = r12.d(r13, r14, r15, r16, r17)
            r2 = r12
            l36.t r3 = r2.f342789d
            monitor-enter(r3)
            int r0 = r1.f342769l     // Catch: java.lang.Throwable -> L19
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L1c
            r36.z r0 = r1.f342765h     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L14
            r0 = r4
            goto L15
        L14:
            r0 = r5
        L15:
            if (r0 != 0) goto L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r0 = move-exception
            goto L8d
        L1c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            java.net.Socket r0 = r1.f342762e
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L84
            java.net.Socket r0 = r1.f342762e
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L84
            java.net.Socket r0 = r1.f342762e
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L36
            goto L84
        L36:
            r36.z r3 = r1.f342765h
            if (r3 == 0) goto L5a
            long r6 = java.lang.System.nanoTime()
            monitor-enter(r3)
            boolean r0 = r3.f369477m     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L45
            monitor-exit(r3)
            goto L84
        L45:
            long r8 = r3.f369484t     // Catch: java.lang.Throwable -> L57
            long r10 = r3.f369483s     // Catch: java.lang.Throwable -> L57
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L55
            long r8 = r3.f369485u     // Catch: java.lang.Throwable -> L57
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L55
            monitor-exit(r3)
            goto L84
        L55:
            monitor-exit(r3)
            goto L85
        L57:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L5a:
            if (r18 == 0) goto L85
            java.net.Socket r0 = r1.f342762e     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            int r3 = r0.getSoTimeout()     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            java.net.Socket r0 = r1.f342762e     // Catch: java.lang.Throwable -> L7d
            r0.setSoTimeout(r4)     // Catch: java.lang.Throwable -> L7d
            x36.m r0 = r1.f342766i     // Catch: java.lang.Throwable -> L7d
            x36.b0 r0 = (x36.b0) r0     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.o1()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L77
            java.net.Socket r0 = r1.f342762e     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            r0.setSoTimeout(r3)     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            goto L84
        L77:
            java.net.Socket r0 = r1.f342762e     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            r0.setSoTimeout(r3)     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            goto L85
        L7d:
            r0 = move-exception
            java.net.Socket r6 = r1.f342762e     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            r6.setSoTimeout(r3)     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
            throw r0     // Catch: java.io.IOException -> L84 java.net.SocketTimeoutException -> L85
        L84:
            r4 = r5
        L85:
            if (r4 != 0) goto L8c
            r12.f()
            goto L0
        L8c:
            return r1
        L8d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o36.j.e(int, int, int, int, boolean, boolean):o36.d");
    }

    public void f() {
        o36.d dVar;
        java.net.Socket c17;
        synchronized (this.f342789d) {
            dVar = this.f342795j;
            c17 = c(true, false, false);
            if (this.f342795j != null) {
                dVar = null;
            }
        }
        m36.e.d(c17);
        if (dVar != null) {
            this.f342791f.getClass();
        }
    }

    public void g() {
        o36.d dVar;
        java.net.Socket c17;
        synchronized (this.f342789d) {
            dVar = this.f342795j;
            c17 = c(false, true, false);
            if (this.f342795j != null) {
                dVar = null;
            }
        }
        m36.e.d(c17);
        if (dVar != null) {
            m36.a aVar = m36.a.f323382a;
            l36.n nVar = this.f342790e;
            ((l36.o0) aVar).getClass();
            ((l36.u0) nVar).d(null);
            this.f342791f.getClass();
            this.f342791f.getClass();
        }
    }

    public void h(java.io.IOException iOException) {
        o36.d dVar;
        boolean z17;
        java.net.Socket c17;
        synchronized (this.f342789d) {
            try {
                dVar = null;
                if (iOException instanceof r36.n0) {
                    r36.b bVar = ((r36.n0) iOException).f369444d;
                    if (bVar == r36.b.REFUSED_STREAM) {
                        int i17 = this.f342794i + 1;
                        this.f342794i = i17;
                        if (i17 > 1) {
                            this.f342788c = null;
                            z17 = true;
                        }
                        z17 = false;
                    } else {
                        if (bVar != r36.b.CANCEL) {
                            this.f342788c = null;
                            z17 = true;
                        }
                        z17 = false;
                    }
                } else {
                    o36.d dVar2 = this.f342795j;
                    if (dVar2 != null) {
                        if (!(dVar2.f342765h != null) || (iOException instanceof r36.a)) {
                            if (dVar2.f342769l == 0) {
                                l36.d1 d1Var = this.f342788c;
                                if (d1Var != null && iOException != null) {
                                    this.f342793h.a(d1Var, iOException);
                                }
                                this.f342788c = null;
                            }
                            z17 = true;
                        }
                    }
                    z17 = false;
                }
                o36.d dVar3 = this.f342795j;
                c17 = c(z17, false, true);
                if (this.f342795j == null && this.f342796k) {
                    dVar = dVar3;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        m36.e.d(c17);
        if (dVar != null) {
            this.f342791f.getClass();
        }
    }

    public void i(boolean z17, p36.d dVar, long j17, java.io.IOException iOException) {
        o36.d dVar2;
        java.net.Socket c17;
        boolean z18;
        this.f342791f.getClass();
        synchronized (this.f342789d) {
            if (dVar != null) {
                if (dVar == this.f342799n) {
                    if (!z17) {
                        this.f342795j.f342769l++;
                    }
                    dVar2 = this.f342795j;
                    c17 = c(z17, false, true);
                    if (this.f342795j != null) {
                        dVar2 = null;
                    }
                    z18 = this.f342797l;
                }
            }
            throw new java.lang.IllegalStateException("expected " + this.f342799n + " but was " + dVar);
        }
        m36.e.d(c17);
        if (dVar2 != null) {
            this.f342791f.getClass();
        }
        if (iOException != null) {
            m36.a aVar = m36.a.f323382a;
            l36.n nVar = this.f342790e;
            ((l36.o0) aVar).getClass();
            ((l36.u0) nVar).d(iOException);
            this.f342791f.getClass();
            return;
        }
        if (z18) {
            m36.a aVar2 = m36.a.f323382a;
            l36.n nVar2 = this.f342790e;
            ((l36.o0) aVar2).getClass();
            ((l36.u0) nVar2).d(null);
            this.f342791f.getClass();
        }
    }

    public java.lang.String toString() {
        o36.d b17 = b();
        return b17 != null ? b17.toString() : this.f342786a.toString();
    }
}

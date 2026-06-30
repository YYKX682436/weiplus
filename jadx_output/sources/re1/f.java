package re1;

/* loaded from: classes13.dex */
public final class f implements se1.g {

    /* renamed from: b, reason: collision with root package name */
    public int f394313b;

    /* renamed from: c, reason: collision with root package name */
    public long f394314c;

    /* renamed from: d, reason: collision with root package name */
    public long f394315d;

    /* renamed from: e, reason: collision with root package name */
    public final re1.b f394316e;

    /* renamed from: f, reason: collision with root package name */
    public final se1.g f394317f;

    /* renamed from: g, reason: collision with root package name */
    public final se1.g f394318g;

    /* renamed from: h, reason: collision with root package name */
    public final se1.g f394319h;

    /* renamed from: i, reason: collision with root package name */
    public final re1.e f394320i;

    /* renamed from: j, reason: collision with root package name */
    public se1.g f394321j;

    /* renamed from: k, reason: collision with root package name */
    public android.net.Uri f394322k;

    /* renamed from: l, reason: collision with root package name */
    public int f394323l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f394324m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f394325n;

    /* renamed from: o, reason: collision with root package name */
    public long f394326o;

    /* renamed from: p, reason: collision with root package name */
    public long f394327p;

    /* renamed from: q, reason: collision with root package name */
    public int f394328q;

    /* renamed from: r, reason: collision with root package name */
    public re1.i f394329r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f394330s;

    /* renamed from: t, reason: collision with root package name */
    public long f394331t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f394332u;

    /* renamed from: a, reason: collision with root package name */
    public long f394312a = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f394333v = "";

    public f(re1.b bVar, se1.g gVar, se1.g gVar2, se1.f fVar, boolean z17, boolean z18, re1.e eVar) {
        this.f394316e = bVar;
        this.f394317f = gVar2;
        this.f394319h = gVar;
        if (fVar != null) {
            this.f394318g = new se1.i0(gVar, fVar);
        } else {
            this.f394318g = null;
        }
        this.f394320i = eVar;
    }

    @Override // se1.g
    public int a(byte[] bArr, int i17, int i18) {
        android.net.Uri uri;
        try {
            if (!this.f394332u && (this.f394321j instanceof se1.p) && qe1.a.a().f362017b) {
                java.lang.String f17 = f();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("read from cache ");
                se1.p pVar = (se1.p) this.f394321j;
                if (android.text.TextUtils.isEmpty(pVar.f406822c) && (uri = pVar.f406826g) != null) {
                    pVar.f406822c = uri.toString();
                }
                sb6.append(pVar.f406822c);
                sb6.append(", fileSize=");
                sb6.append(this.f394321j.available());
                ve1.g.p(4, f17, sb6.toString(), null);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int a17 = this.f394321j.a(bArr, i17, i18);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            boolean z17 = this.f394332u;
            se1.g gVar = this.f394317f;
            if (!z17) {
                if (this.f394321j != gVar && qe1.a.a().f362029n != null && this.f394328q == 90 && android.webkit.URLUtil.isNetworkUrl(this.f394322k.toString()) && this.f394320i != null) {
                    java.lang.String str = this.f394324m;
                    long j17 = this.f394312a;
                    ve1.g.p(3, "DataSourceBuilder", java.lang.String.format("onHttpUpstreamServerCost, videoUuid:%s, httpDnsCost:%s, httpConnectCost:%s, httpFirstRecvCost:%s", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis2)), null);
                    if (qe1.a.a().f362029n != null) {
                        qe1.a.a().f362029n.getClass();
                    }
                }
                this.f394332u = true;
            }
            if (a17 >= 0) {
                if (this.f394321j == gVar) {
                    this.f394331t += a17;
                } else {
                    this.f394313b += a17;
                    this.f394314c += currentTimeMillis2;
                }
                long j18 = a17;
                this.f394326o += j18;
                long j19 = this.f394327p;
                if (j19 != -1) {
                    this.f394327p = j19 - j18;
                }
            } else {
                i();
                e();
                if (this.f394327p > 0) {
                    j();
                    return a(bArr, i17, i18);
                }
            }
            return a17;
        } catch (java.io.IOException e17) {
            if (this.f394321j instanceof se1.p) {
                ve1.g.p(6, f(), "read cache error " + e17.toString(), null);
            } else {
                ve1.g.p(6, f(), "read error " + e17.toString(), null);
            }
            h(e17);
            throw e17;
        }
    }

    @Override // se1.g
    public long available() {
        se1.g gVar = this.f394321j;
        if (gVar == null) {
            return 0L;
        }
        return gVar.available();
    }

    @Override // se1.g
    public te1.b b() {
        re1.b bVar;
        te1.b bVar2;
        re1.i iVar;
        se1.g gVar = this.f394321j;
        if (gVar == null) {
            return te1.b.f417768c;
        }
        if (gVar != this.f394317f || (bVar = this.f394316e) == null) {
            return gVar.b();
        }
        java.lang.String str = this.f394325n;
        re1.m mVar = (re1.m) bVar;
        synchronized (mVar) {
            java.util.NavigableSet c17 = mVar.c(str);
            bVar2 = (c17 == null || (iVar = (re1.i) c17.first()) == null || iVar.f394338g < 0) ? te1.b.f417768c : iVar.f394339h;
        }
        return bVar2;
    }

    @Override // se1.g
    public long c(se1.i iVar) {
        try {
            this.f394322k = iVar.f406772a;
            this.f394323l = iVar.f406777f;
            this.f394324m = iVar.f406778g;
            this.f394325n = iVar.f406776e;
            this.f394326o = iVar.f406774c;
            this.f394327p = iVar.f406775d;
            this.f394328q = iVar.f406779h;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = j();
            this.f394315d = d();
            this.f394312a = java.lang.System.currentTimeMillis() - currentTimeMillis;
            return j17;
        } catch (java.io.IOException e17) {
            if (this.f394321j instanceof se1.p) {
                ve1.g.p(6, f(), "open cache error " + e17.toString(), null);
            } else {
                ve1.g.p(6, f(), "open error " + e17.toString(), null);
            }
            h(e17);
            if (!this.f394330s) {
                throw e17;
            }
            try {
                e();
            } catch (java.lang.Exception e18) {
                ve1.g.p(5, f(), "open, failed on closeCurrentSource, shouldn't be a problem", e18);
            }
            ve1.g.p(6, f(), "open cache error, try reopen without cache", null);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            long j18 = j();
            this.f394315d = d();
            this.f394312a = java.lang.System.currentTimeMillis() - currentTimeMillis2;
            return j18;
        }
    }

    @Override // se1.g
    public void close() {
        try {
            e();
        } catch (java.io.IOException e17) {
            if (this.f394321j instanceof se1.p) {
                ve1.g.p(6, f(), "close cache error " + e17.toString(), null);
            } else {
                ve1.g.p(6, f(), "close error " + e17.toString(), null);
            }
            h(e17);
            throw e17;
        }
    }

    @Override // se1.g
    public long d() {
        re1.b bVar;
        re1.i iVar;
        se1.g gVar = this.f394321j;
        if (gVar == null) {
            return -1L;
        }
        if (gVar != this.f394317f || (bVar = this.f394316e) == null) {
            return gVar.d();
        }
        java.lang.String str = this.f394325n;
        re1.m mVar = (re1.m) bVar;
        synchronized (mVar) {
            java.util.NavigableSet c17 = mVar.c(str);
            if (c17 != null && (iVar = (re1.i) c17.first()) != null) {
                long j17 = iVar.f394338g;
                if (j17 >= 0) {
                    return j17;
                }
            }
            return -1L;
        }
    }

    public final void e() {
        re1.b bVar = this.f394316e;
        se1.g gVar = this.f394321j;
        if (gVar == null) {
            return;
        }
        boolean z17 = true;
        try {
            gVar.close();
            this.f394321j = null;
            re1.i iVar = this.f394329r;
            if (iVar != null) {
                re1.m mVar = (re1.m) bVar;
                synchronized (mVar) {
                    if (iVar != mVar.f394351d.remove(iVar.f394335d)) {
                        z17 = false;
                    }
                    ve1.a.a(z17);
                    mVar.notifyAll();
                }
                this.f394329r = null;
            }
        } catch (java.lang.Throwable th6) {
            re1.i iVar2 = this.f394329r;
            if (iVar2 != null) {
                re1.m mVar2 = (re1.m) bVar;
                synchronized (mVar2) {
                    if (iVar2 != mVar2.f394351d.remove(iVar2.f394335d)) {
                        z17 = false;
                    }
                    ve1.a.a(z17);
                    mVar2.notifyAll();
                    this.f394329r = null;
                }
            }
            throw th6;
        }
    }

    public java.lang.String f() {
        return this.f394333v + "CacheDataSource";
    }

    public se1.g g() {
        return this.f394319h;
    }

    public final void h(java.io.IOException iOException) {
        ve1.g.p(3, f(), "handleBeforeThrow " + iOException + ", ignoreCacheOnError=true, currentDataSource=" + this.f394321j, null);
        if (this.f394321j == this.f394317f) {
            ve1.g.p(4, f(), "handleBeforeThrow currentDataSource=" + this.f394321j + ", exception=" + iOException, null);
            this.f394330s = true;
        }
    }

    public final void i() {
        long j17;
        re1.e eVar = this.f394320i;
        if (eVar != null) {
            if (this.f394328q == 90) {
                java.lang.String str = this.f394324m;
                int i17 = this.f394313b;
                long j18 = this.f394314c;
                long j19 = this.f394315d;
                long j27 = this.f394331t;
                ((se1.k) eVar).getClass();
                ve1.g.p(3, "DataSourceBuilder", java.lang.String.format("downloadSizeAndDuration, uuid:%s, totalUpstreamBytesRead:%s, totalUpstreamReadCost:%s, totalLength:%s, totalCachedBytesRead:%s", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j27)), null);
                if (qe1.a.a().f362029n != null) {
                    qe1.a.a().f362029n.getClass();
                }
            }
            this.f394313b = 0;
            this.f394314c = 0L;
            if (this.f394321j != this.f394317f || this.f394331t <= 0) {
                return;
            }
            re1.e eVar2 = this.f394320i;
            re1.m mVar = (re1.m) this.f394316e;
            synchronized (mVar) {
                j17 = mVar.f394348a;
            }
            long j28 = this.f394331t;
            ((se1.k) eVar2).getClass();
            ve1.g.p(3, "DataSourceBuilder", java.lang.String.format("onCachedBytesRead, cacheSizeBytes:%s, cachedBytesRead:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j28)), null);
            this.f394331t = 0L;
        }
    }

    public final long j() {
        re1.i d17;
        se1.i iVar;
        try {
            if (this.f394330s) {
                d17 = null;
            } else {
                re1.b bVar = this.f394316e;
                java.lang.String str = this.f394325n;
                long j17 = this.f394326o;
                re1.m mVar = (re1.m) bVar;
                synchronized (mVar) {
                    try {
                        re1.i iVar2 = new re1.i(str, j17, -1L, -1L, te1.b.f417768c, false, -1L, null);
                        synchronized (mVar) {
                            d17 = mVar.d(iVar2);
                            if (!d17.f394340i) {
                                if (mVar.f394351d.containsKey(str)) {
                                    d17 = null;
                                } else {
                                    mVar.f394351d.put(str, d17);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            if (d17 == null) {
                this.f394321j = this.f394319h;
                android.net.Uri uri = this.f394322k;
                long j18 = this.f394326o;
                iVar = new se1.i(uri, j18, j18, this.f394327p, this.f394325n, this.f394323l, this.f394324m, this.f394328q);
            } else if (d17.f394340i) {
                android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, d17.f394341m);
                long j19 = this.f394326o;
                long j27 = j19 - d17.f394336e;
                long j28 = this.f394327p;
                if (j28 == -1) {
                    this.f394327p = d17.f394338g - j19;
                } else if (j28 > d17.f394338g - j19) {
                    ve1.g.p(5, f(), "fix bytesRemaining, max=" + (d17.f394338g - this.f394326o) + " current=" + this.f394327p, null);
                    this.f394327p = d17.f394338g - this.f394326o;
                }
                iVar = new se1.i(b17, this.f394326o, j27, java.lang.Math.min(d17.f394337f - j27, this.f394327p), this.f394325n, this.f394323l, this.f394324m, this.f394328q);
                this.f394321j = this.f394317f;
            } else {
                this.f394329r = d17;
                long j29 = d17.f394337f;
                if (j29 == -1) {
                    j29 = this.f394327p;
                } else {
                    long j37 = this.f394327p;
                    if (j37 != -1) {
                        j29 = java.lang.Math.min(j29, j37);
                    }
                }
                long j38 = j29;
                android.net.Uri uri2 = this.f394322k;
                long j39 = this.f394326o;
                iVar = new se1.i(uri2, j39, j39, j38, this.f394325n, this.f394323l, this.f394324m, this.f394328q);
                se1.g gVar = this.f394318g;
                if (gVar == null) {
                    gVar = this.f394319h;
                }
                this.f394321j = gVar;
            }
            long c17 = this.f394321j.c(iVar);
            se1.g gVar2 = this.f394321j;
            if ((gVar2 instanceof se1.y) && gVar2.d() != -1 && iVar.f406774c >= this.f394321j.d() - 1) {
                ve1.g.p(6, f(), "read position out of bound", null);
            }
            if (this.f394327p == -1 && this.f394321j.d() != -1) {
                this.f394327p = this.f394321j.d() - this.f394326o;
                ve1.g.p(4, f(), "init bytesRemaining " + this.f394327p + ", readPosition=" + this.f394326o + ", totalLength=" + this.f394321j.d(), null);
            }
            this.f394327p = java.lang.Math.max(0L, java.lang.Math.min(this.f394327p, d()));
            this.f394332u = false;
            return c17;
        } catch (java.lang.InterruptedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}

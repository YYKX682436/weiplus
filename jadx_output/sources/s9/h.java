package s9;

/* loaded from: classes7.dex */
public final class h implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final s9.c f404927a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k f404928b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.k f404929c;

    /* renamed from: d, reason: collision with root package name */
    public final r9.k f404930d;

    /* renamed from: e, reason: collision with root package name */
    public final s9.g f404931e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f404932f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f404933g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f404934h;

    /* renamed from: i, reason: collision with root package name */
    public r9.k f404935i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f404936j;

    /* renamed from: k, reason: collision with root package name */
    public android.net.Uri f404937k;

    /* renamed from: l, reason: collision with root package name */
    public int f404938l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f404939m;

    /* renamed from: n, reason: collision with root package name */
    public long f404940n;

    /* renamed from: o, reason: collision with root package name */
    public long f404941o;

    /* renamed from: p, reason: collision with root package name */
    public s9.k f404942p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f404943q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f404944r;

    /* renamed from: s, reason: collision with root package name */
    public long f404945s;

    public h(s9.c cVar, r9.k kVar, r9.k kVar2, r9.i iVar, int i17, s9.g gVar) {
        this.f404927a = cVar;
        this.f404928b = kVar2;
        this.f404932f = (i17 & 1) != 0;
        this.f404933g = (i17 & 2) != 0;
        this.f404934h = (i17 & 4) != 0;
        this.f404930d = kVar;
        if (iVar != null) {
            this.f404929c = new r9.j0(kVar, iVar);
        } else {
            this.f404929c = null;
        }
        this.f404931e = gVar;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        r9.k kVar = this.f404928b;
        if (i18 == 0) {
            return 0;
        }
        if (this.f404941o == 0) {
            return -1;
        }
        try {
            int a17 = this.f404935i.a(bArr, i17, i18);
            if (a17 >= 0) {
                if (this.f404935i == kVar) {
                    this.f404945s += a17;
                }
                long j17 = a17;
                this.f404940n += j17;
                long j18 = this.f404941o;
                if (j18 != -1) {
                    this.f404941o = j18 - j17;
                }
            } else {
                if (this.f404936j) {
                    long j19 = this.f404940n;
                    if (this.f404935i == this.f404929c) {
                        this.f404927a.f(this.f404939m, j19);
                    }
                    this.f404941o = 0L;
                }
                c();
                long j27 = this.f404941o;
                if ((j27 > 0 || j27 == -1) && d(false)) {
                    return a(bArr, i17, i18);
                }
            }
            return a17;
        } catch (java.io.IOException e17) {
            if (this.f404935i == kVar || (e17 instanceof s9.a)) {
                this.f404943q = true;
            }
            throw e17;
        }
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        try {
            android.net.Uri uri = nVar.f393383a;
            long j17 = nVar.f393386d;
            this.f404937k = uri;
            this.f404938l = nVar.f393389g;
            java.lang.String str = nVar.f393388f;
            if (str == null) {
                str = uri.toString();
            }
            this.f404939m = str;
            this.f404940n = j17;
            boolean z17 = this.f404933g;
            long j18 = nVar.f393387e;
            boolean z18 = (z17 && this.f404943q) || (j18 == -1 && this.f404934h);
            this.f404944r = z18;
            if (j18 == -1 && !z18) {
                long b17 = this.f404927a.b(str);
                this.f404941o = b17;
                if (b17 != -1) {
                    long j19 = b17 - j17;
                    this.f404941o = j19;
                    if (j19 <= 0) {
                        throw new r9.l(0);
                    }
                }
                d(true);
                return this.f404941o;
            }
            this.f404941o = j18;
            d(true);
            return this.f404941o;
        } catch (java.io.IOException e17) {
            if (this.f404935i == this.f404928b || (e17 instanceof s9.a)) {
                this.f404943q = true;
            }
            throw e17;
        }
    }

    public final void c() {
        s9.c cVar = this.f404927a;
        r9.k kVar = this.f404935i;
        if (kVar == null) {
            return;
        }
        try {
            kVar.close();
            this.f404935i = null;
            this.f404936j = false;
        } finally {
            s9.k kVar2 = this.f404942p;
            if (kVar2 != null) {
                cVar.c(kVar2);
                this.f404942p = null;
            }
        }
    }

    @Override // r9.k
    public void close() {
        this.f404937k = null;
        if (this.f404931e != null && this.f404945s > 0) {
            this.f404927a.h();
            this.f404945s = 0L;
        }
        try {
            c();
        } catch (java.io.IOException e17) {
            if (this.f404935i == this.f404928b || (e17 instanceof s9.a)) {
                this.f404943q = true;
            }
            throw e17;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(1:3)(2:65|(2:68|69)(1:67))|4|(1:6)(2:45|(3:47|(1:49)(1:51)|50)(14:52|(1:54)(1:64)|(1:56)(2:61|(1:63))|57|(1:59)(1:60)|8|(1:10)(1:44)|11|12|13|14|15|(2:19|(1:21))|22))|7|8|(0)(0)|11|12|13|14|15|(3:17|19|(0))|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        if (r25 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if ((r6 instanceof r9.l) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        if (r2 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
    
        r9 = 0;
        r23 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        r6 = r6.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r25) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.h.d(boolean):boolean");
    }

    @Override // r9.k
    public android.net.Uri getUri() {
        r9.k kVar = this.f404935i;
        return kVar == this.f404930d ? kVar.getUri() : this.f404937k;
    }
}

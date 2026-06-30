package se1;

/* loaded from: classes13.dex */
public class n implements se1.y {

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.regex.Pattern f406797v = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: w, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f406798w = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f406799a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f406800b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406801c;

    /* renamed from: d, reason: collision with root package name */
    public final int f406802d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f406803e;

    /* renamed from: f, reason: collision with root package name */
    public final ve1.h f406804f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f406805g;

    /* renamed from: h, reason: collision with root package name */
    public final se1.j0 f406806h;

    /* renamed from: i, reason: collision with root package name */
    public final ve1.d f406807i;

    /* renamed from: j, reason: collision with root package name */
    public se1.i f406808j;

    /* renamed from: k, reason: collision with root package name */
    public java.net.HttpURLConnection f406809k;

    /* renamed from: l, reason: collision with root package name */
    public java.io.InputStream f406810l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f406811m;

    /* renamed from: n, reason: collision with root package name */
    public long f406812n;

    /* renamed from: o, reason: collision with root package name */
    public long f406813o;

    /* renamed from: p, reason: collision with root package name */
    public long f406814p;

    /* renamed from: q, reason: collision with root package name */
    public long f406815q;

    /* renamed from: r, reason: collision with root package name */
    public long f406816r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f406817s;

    /* renamed from: t, reason: collision with root package name */
    public long f406818t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f406819u;

    public n(java.lang.String str, ve1.h hVar, ve1.d dVar) {
        this(str, hVar, null, 30000, 12000, false, dVar);
    }

    @Override // se1.g
    public int a(byte[] bArr, int i17, int i18) {
        try {
            m();
            return l(bArr, i17, i18);
        } catch (java.io.IOException e17) {
            throw new se1.q(e17, this.f406808j);
        }
    }

    @Override // se1.g
    public long available() {
        return this.f406816r;
    }

    @Override // se1.g
    public te1.b b() {
        return te1.b.a(this.f406817s);
    }

    @Override // se1.g
    public long c(se1.i iVar) {
        return k(iVar, null);
    }

    @Override // se1.g
    public void close() {
        se1.j0 j0Var = this.f406806h;
        try {
            if (this.f406810l != null) {
                java.net.HttpURLConnection httpURLConnection = this.f406809k;
                long j17 = this.f406813o;
                if (j17 != -1) {
                    j17 -= this.f406815q;
                }
                ve1.g.q(httpURLConnection, j17);
                try {
                    this.f406810l.close();
                    this.f406810l = null;
                } catch (java.io.IOException e17) {
                    throw new se1.q(e17, this.f406808j);
                }
            }
        } finally {
            if (this.f406811m) {
                this.f406811m = false;
                if (j0Var != null) {
                    ((se1.j) j0Var).b();
                }
            }
            e();
        }
    }

    @Override // se1.g
    public long d() {
        return this.f406818t;
    }

    public final void e() {
        java.net.HttpURLConnection httpURLConnection = this.f406809k;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f406809k = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0028, code lost:
    
        if (java.net.NetworkInterface.getByInetAddress(r1) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection f(java.net.URL r7, long r8, long r10, boolean r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.n.f(java.net.URL, long, long, boolean):java.net.HttpURLConnection");
    }

    public ve1.h g() {
        return this.f406804f;
    }

    public se1.i h() {
        return this.f406808j;
    }

    public java.lang.String i() {
        return this.f406819u + this.f406799a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection j(se1.i r22) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.n.j(se1.i):java.net.HttpURLConnection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0132, code lost:
    
        if (r5 != 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0202 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long k(se1.i r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.n.k(se1.i, java.lang.String):long");
    }

    public final int l(byte[] bArr, int i17, int i18) {
        long j17 = this.f406813o;
        if (j17 != -1) {
            i18 = (int) java.lang.Math.min(i18, j17 - this.f406815q);
        }
        if (i18 == 0) {
            return -1;
        }
        int read = this.f406810l.read(bArr, i17, i18);
        if (read == -1) {
            long j18 = this.f406813o;
            if (j18 == -1 || j18 == this.f406815q) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        this.f406815q += read;
        se1.j0 j0Var = this.f406806h;
        if (j0Var != null) {
            ((se1.j) j0Var).a(read);
        }
        return read;
    }

    public final void m() {
        if (this.f406814p == this.f406812n) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = f406798w;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        i();
        while (true) {
            long j17 = this.f406814p;
            long j18 = this.f406812n;
            if (j17 == j18) {
                atomicReference.set(bArr);
                return;
            }
            int min = (int) java.lang.Math.min(j18 - j17, bArr.length);
            i();
            int read = this.f406810l.read(bArr, 0, min);
            i();
            if (java.lang.Thread.interrupted()) {
                throw new se1.s("skipInternal interrupted", this.f406808j);
            }
            if (read == -1) {
                throw new java.io.EOFException();
            }
            this.f406814p += read;
            se1.j0 j0Var = this.f406806h;
            if (j0Var != null) {
                ((se1.j) j0Var).a(read);
            }
        }
    }

    public n(java.lang.String str, ve1.h hVar, se1.j0 j0Var, int i17, int i18, boolean z17, ve1.d dVar) {
        this.f406799a = "DefaultHttpDataSource";
        this.f406816r = -1L;
        this.f406818t = -1L;
        this.f406819u = "";
        if (!android.text.TextUtils.isEmpty(str)) {
            this.f406803e = str;
            this.f406804f = hVar;
            this.f406806h = j0Var;
            this.f406805g = new java.util.HashMap();
            this.f406801c = i17;
            this.f406802d = i18;
            this.f406800b = z17;
            this.f406807i = dVar;
            return;
        }
        throw new java.lang.IllegalArgumentException();
    }
}

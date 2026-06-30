package r9;

/* loaded from: classes7.dex */
public class s implements r9.k {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.regex.Pattern f393416p = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f393417q = new java.util.concurrent.atomic.AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f393418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f393419b;

    /* renamed from: c, reason: collision with root package name */
    public final int f393420c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f393421d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.z f393422e;

    /* renamed from: f, reason: collision with root package name */
    public final r9.z f393423f;

    /* renamed from: g, reason: collision with root package name */
    public final r9.k0 f393424g;

    /* renamed from: h, reason: collision with root package name */
    public r9.n f393425h;

    /* renamed from: i, reason: collision with root package name */
    public java.net.HttpURLConnection f393426i;

    /* renamed from: j, reason: collision with root package name */
    public java.io.InputStream f393427j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f393428k;

    /* renamed from: l, reason: collision with root package name */
    public long f393429l;

    /* renamed from: m, reason: collision with root package name */
    public long f393430m;

    /* renamed from: n, reason: collision with root package name */
    public long f393431n;

    /* renamed from: o, reason: collision with root package name */
    public long f393432o;

    public s(java.lang.String str, t9.r rVar, r9.k0 k0Var, int i17, int i18, boolean z17, r9.z zVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f393421d = str;
        this.f393424g = k0Var;
        this.f393423f = new r9.z();
        this.f393419b = i17;
        this.f393420c = i18;
        this.f393418a = z17;
        this.f393422e = zVar;
    }

    public static void f(java.net.HttpURLConnection httpURLConnection, long j17) {
        int i17 = t9.d0.f416498a;
        if (i17 == 19 || i17 == 20) {
            try {
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                if (j17 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j17 <= 2048) {
                    return;
                }
                java.lang.String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    java.lang.reflect.Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new java.lang.Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new java.lang.Object[0]);
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        try {
            g();
            if (i18 == 0) {
                return 0;
            }
            long j17 = this.f393430m;
            if (j17 != -1) {
                long j18 = j17 - this.f393432o;
                if (j18 != 0) {
                    i18 = (int) java.lang.Math.min(i18, j18);
                }
                return -1;
            }
            int read = this.f393427j.read(bArr, i17, i18);
            if (read == -1) {
                if (this.f393430m == -1) {
                    return -1;
                }
                throw new java.io.EOFException();
            }
            this.f393432o += read;
            r9.k0 k0Var = this.f393424g;
            if (k0Var == null) {
                return read;
            }
            k0Var.a(this, read);
            return read;
        } catch (java.io.IOException e17) {
            throw new r9.x(e17, this.f393425h, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r5 != 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    @Override // r9.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long b(r9.n r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.s.b(r9.n):long");
    }

    public final void c() {
        java.net.HttpURLConnection httpURLConnection = this.f393426i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception unused) {
            }
            this.f393426i = null;
        }
    }

    @Override // r9.k
    public void close() {
        r9.k0 k0Var = this.f393424g;
        try {
            if (this.f393427j != null) {
                java.net.HttpURLConnection httpURLConnection = this.f393426i;
                long j17 = this.f393430m;
                if (j17 != -1) {
                    j17 -= this.f393432o;
                }
                f(httpURLConnection, j17);
                try {
                    this.f393427j.close();
                } catch (java.io.IOException e17) {
                    throw new r9.x(e17, this.f393425h, 3);
                }
            }
        } finally {
            this.f393427j = null;
            c();
            if (this.f393428k) {
                this.f393428k = false;
                if (k0Var != null) {
                    k0Var.b(this);
                }
            }
        }
    }

    public final java.net.HttpURLConnection d(java.net.URL url, byte[] bArr, long j17, long j18, boolean z17, boolean z18) {
        java.util.Map map;
        java.util.Map map2;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f393419b);
        httpURLConnection.setReadTimeout(this.f393420c);
        r9.z zVar = this.f393422e;
        if (zVar != null) {
            synchronized (zVar) {
                if (zVar.f393441b == null) {
                    zVar.f393441b = java.util.Collections.unmodifiableMap(new java.util.HashMap(zVar.f393440a));
                }
                map2 = zVar.f393441b;
            }
            for (java.util.Map.Entry entry : map2.entrySet()) {
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        r9.z zVar2 = this.f393423f;
        synchronized (zVar2) {
            if (zVar2.f393441b == null) {
                zVar2.f393441b = java.util.Collections.unmodifiableMap(new java.util.HashMap(zVar2.f393440a));
            }
            map = zVar2.f393441b;
        }
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            httpURLConnection.setRequestProperty((java.lang.String) entry2.getKey(), (java.lang.String) entry2.getValue());
        }
        if (j17 != 0 || j18 != -1) {
            java.lang.String str = "bytes=" + j17 + "-";
            if (j18 != -1) {
                str = str + ((j17 + j18) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f393421d);
        if (!z17) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z18);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final java.net.HttpURLConnection e(r9.n nVar) {
        java.net.HttpURLConnection d17;
        java.net.URL url = new java.net.URL(nVar.f393383a.toString());
        byte[] bArr = nVar.f393384b;
        long j17 = nVar.f393386d;
        long j18 = nVar.f393387e;
        int i17 = 0;
        boolean z17 = (nVar.f393389g & 1) == 1;
        if (!this.f393418a) {
            return d(url, bArr, j17, j18, z17, true);
        }
        while (true) {
            int i18 = i17 + 1;
            if (i17 > 20) {
                throw new java.net.NoRouteToHostException("Too many redirects: " + i18);
            }
            d17 = d(url, bArr, j17, j18, z17, false);
            int responseCode = d17.getResponseCode();
            if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                java.lang.String headerField = d17.getHeaderField("Location");
                d17.disconnect();
                if (headerField == null) {
                    throw new java.net.ProtocolException("Null location redirect");
                }
                java.net.URL url2 = new java.net.URL(url, headerField);
                java.lang.String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new java.net.ProtocolException("Unsupported protocol redirect: " + protocol);
                }
                bArr = null;
                i17 = i18;
                url = url2;
            }
        }
        return d17;
    }

    public final void g() {
        if (this.f393431n == this.f393429l) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = f393417q;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j17 = this.f393431n;
            long j18 = this.f393429l;
            if (j17 == j18) {
                atomicReference.set(bArr);
                return;
            }
            int read = this.f393427j.read(bArr, 0, (int) java.lang.Math.min(j18 - j17, bArr.length));
            if (java.lang.Thread.interrupted()) {
                throw new java.io.InterruptedIOException();
            }
            if (read == -1) {
                throw new java.io.EOFException();
            }
            this.f393431n += read;
            r9.k0 k0Var = this.f393424g;
            if (k0Var != null) {
                k0Var.a(this, read);
            }
        }
    }

    @Override // r9.k
    public android.net.Uri getUri() {
        java.net.HttpURLConnection httpURLConnection = this.f393426i;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }
}

package r9;

/* loaded from: classes7.dex */
public final class q implements r9.k {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f393405a;

    /* renamed from: b, reason: collision with root package name */
    public final r9.k0 f393406b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.k f393407c;

    /* renamed from: d, reason: collision with root package name */
    public r9.k f393408d;

    /* renamed from: e, reason: collision with root package name */
    public r9.k f393409e;

    /* renamed from: f, reason: collision with root package name */
    public r9.k f393410f;

    /* renamed from: g, reason: collision with root package name */
    public r9.k f393411g;

    /* renamed from: h, reason: collision with root package name */
    public r9.k f393412h;

    public q(android.content.Context context, r9.k0 k0Var, r9.k kVar) {
        this.f393405a = context.getApplicationContext();
        this.f393406b = k0Var;
        kVar.getClass();
        this.f393407c = kVar;
    }

    @Override // r9.k
    public int a(byte[] bArr, int i17, int i18) {
        return this.f393412h.a(bArr, i17, i18);
    }

    @Override // r9.k
    public long b(r9.n nVar) {
        boolean z17 = true;
        t9.a.d(this.f393412h == null);
        java.lang.String scheme = nVar.f393383a.getScheme();
        int i17 = t9.d0.f416498a;
        android.net.Uri uri = nVar.f393383a;
        java.lang.String scheme2 = uri.getScheme();
        if (!android.text.TextUtils.isEmpty(scheme2) && !scheme2.equals("file")) {
            z17 = false;
        }
        android.content.Context context = this.f393405a;
        r9.k0 k0Var = this.f393406b;
        if (z17) {
            if (uri.getPath().startsWith("/android_asset/")) {
                if (this.f393409e == null) {
                    this.f393409e = new r9.d(context, k0Var);
                }
                this.f393412h = this.f393409e;
            } else {
                if (this.f393408d == null) {
                    this.f393408d = new r9.u(k0Var);
                }
                this.f393412h = this.f393408d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f393409e == null) {
                this.f393409e = new r9.d(context, k0Var);
            }
            this.f393412h = this.f393409e;
        } else if ("content".equals(scheme)) {
            if (this.f393410f == null) {
                this.f393410f = new r9.g(context, k0Var);
            }
            this.f393412h = this.f393410f;
        } else {
            boolean equals = "rtmp".equals(scheme);
            r9.k kVar = this.f393407c;
            if (equals) {
                if (this.f393411g == null) {
                    try {
                        this.f393411g = (r9.k) java.lang.Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                    }
                    if (this.f393411g == null) {
                        this.f393411g = kVar;
                    }
                }
                this.f393412h = this.f393411g;
            } else {
                this.f393412h = kVar;
            }
        }
        return this.f393412h.b(nVar);
    }

    @Override // r9.k
    public void close() {
        r9.k kVar = this.f393412h;
        if (kVar != null) {
            try {
                kVar.close();
            } finally {
                this.f393412h = null;
            }
        }
    }

    @Override // r9.k
    public android.net.Uri getUri() {
        r9.k kVar = this.f393412h;
        if (kVar == null) {
            return null;
        }
        return kVar.getUri();
    }
}

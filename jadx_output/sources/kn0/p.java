package kn0;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f309581a;

    /* renamed from: b, reason: collision with root package name */
    public kn0.l f309582b = kn0.l.f309569d;

    /* renamed from: c, reason: collision with root package name */
    public kn0.j f309583c = kn0.j.f309562d;

    /* renamed from: d, reason: collision with root package name */
    public kn0.m f309584d;

    /* renamed from: e, reason: collision with root package name */
    public long f309585e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f309586f;

    /* renamed from: g, reason: collision with root package name */
    public kn0.k f309587g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f309588h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f309589i;

    /* renamed from: j, reason: collision with root package name */
    public int f309590j;

    /* renamed from: k, reason: collision with root package name */
    public int f309591k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f309592l;

    public p() {
        kn0.o[] oVarArr = kn0.o.f309580d;
        kn0.n[] nVarArr = kn0.n.f309579d;
        this.f309584d = kn0.m.f309573d;
        this.f309585e = -1L;
        this.f309586f = "";
        this.f309587g = kn0.k.f309566d;
        new java.util.ArrayList();
        this.f309590j = 0;
        this.f309591k = -1;
        this.f309592l = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LIVE_DEBUG_VIEW_INT_SYNC, 0) == 1;
    }

    public final void a() {
        this.f309584d = kn0.m.f309573d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveStatus", "liveStatusModeChange changeToNormalMode");
    }

    public final java.lang.String b() {
        return this.f309586f;
    }

    public final int c() {
        return this.f309590j;
    }

    public final int d() {
        return this.f309591k;
    }

    public final boolean e() {
        return this.f309587g == kn0.k.f309567e;
    }

    public final boolean f() {
        return this.f309584d == kn0.m.f309574e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        if (r6.f309582b == kn0.l.f309570e) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r6.f309582b == kn0.l.f309570e) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Long r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 != 0) goto Le
            kn0.l r7 = r6.f309582b
            kn0.l r2 = kn0.l.f309570e
            if (r7 != r2) goto Lb
            goto Lc
        Lb:
            r0 = r1
        Lc:
            r1 = r0
            goto L1f
        Le:
            long r2 = r6.f309585e
            long r4 = r7.longValue()
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 != 0) goto L1f
            kn0.l r7 = r6.f309582b
            kn0.l r2 = kn0.l.f309570e
            if (r7 != r2) goto Lb
            goto Lc
        L1f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kn0.p.g(java.lang.Long):boolean");
    }

    public final boolean h() {
        return this.f309582b == kn0.l.f309570e;
    }

    public final boolean i() {
        return this.f309584d == kn0.m.f309573d;
    }

    public final boolean j() {
        return this.f309589i;
    }

    public final boolean k() {
        return this.f309584d == kn0.m.f309575f;
    }

    public final void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveStatus", "switchAudioMode,pause:" + this.f309588h);
        this.f309588h = false;
        this.f309587g = kn0.k.f309567e;
    }

    public final void m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveStatus", "switchVideoMode,pause:" + this.f309588h);
        this.f309588h = false;
        this.f309587g = kn0.k.f309566d;
    }
}

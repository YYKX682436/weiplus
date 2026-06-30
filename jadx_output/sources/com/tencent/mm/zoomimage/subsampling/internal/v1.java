package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final zq5.k f215123a;

    /* renamed from: b, reason: collision with root package name */
    public final yq5.k f215124b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.zoomimage.subsampling.internal.v0 f215125c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.zoomimage.subsampling.internal.w0 f215126d;

    /* renamed from: e, reason: collision with root package name */
    public final yq5.c f215127e;

    /* renamed from: f, reason: collision with root package name */
    public final long f215128f;

    /* renamed from: g, reason: collision with root package name */
    public final long f215129g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f215130h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f215131i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.l f215132j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f215133k;

    /* renamed from: l, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f215134l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Float f215135m;

    /* renamed from: n, reason: collision with root package name */
    public int f215136n;

    /* renamed from: o, reason: collision with root package name */
    public zq5.e f215137o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f215138p;

    /* renamed from: q, reason: collision with root package name */
    public int f215139q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f215140r;

    /* renamed from: s, reason: collision with root package name */
    public yq5.n f215141s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f215142t;

    /* renamed from: u, reason: collision with root package name */
    public int f215143u;

    /* renamed from: v, reason: collision with root package name */
    public zq5.e f215144v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f215145w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f215146x;

    public v1(zq5.k logger, yq5.k subsamplingImage, com.tencent.mm.zoomimage.subsampling.internal.v0 tileDecoder, com.tencent.mm.zoomimage.subsampling.internal.x0 x0Var, com.tencent.mm.zoomimage.subsampling.internal.w0 tileImageCacheHelper, yq5.c imageInfo, long j17, long j18, yz5.l onTileChanged, yz5.l onSampleSizeChanged, yz5.l onImageLoadRectChanged, kotlin.jvm.internal.i iVar) {
        long a17;
        long j19 = j18;
        kotlin.jvm.internal.o.g(logger, "logger");
        kotlin.jvm.internal.o.g(subsamplingImage, "subsamplingImage");
        kotlin.jvm.internal.o.g(tileDecoder, "tileDecoder");
        kotlin.jvm.internal.o.g(tileImageCacheHelper, "tileImageCacheHelper");
        kotlin.jvm.internal.o.g(imageInfo, "imageInfo");
        kotlin.jvm.internal.o.g(onTileChanged, "onTileChanged");
        kotlin.jvm.internal.o.g(onSampleSizeChanged, "onSampleSizeChanged");
        kotlin.jvm.internal.o.g(onImageLoadRectChanged, "onImageLoadRectChanged");
        this.f215123a = logger;
        this.f215124b = subsamplingImage;
        this.f215125c = tileDecoder;
        this.f215126d = tileImageCacheHelper;
        this.f215127e = imageInfo;
        this.f215128f = j17;
        this.f215129g = j19;
        this.f215130h = onTileChanged;
        this.f215131i = onSampleSizeChanged;
        this.f215132j = onImageLoadRectChanged;
        this.f215133k = kotlinx.coroutines.q1.f310570c.J(2);
        this.f215134l = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.f215139q = 39;
        this.f215141s = yq5.n.f464614b;
        this.f215144v = zq5.e.f475060e;
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f215145w = p0Var;
        this.f215146x = p0Var;
        long j27 = imageInfo.f464591a;
        int a18 = com.tencent.mm.zoomimage.subsampling.internal.x1.a(j27, j17, 1.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char c17 = ' ';
        int i17 = (int) (j27 >> 32);
        if (i17 > zq5.g.b(j27)) {
            int b17 = a06.d.b((zq5.g.b(j27) / i17) * 50);
            a17 = zq5.d.a(50, b17 < 1 ? 1 : b17);
        } else {
            int b18 = a06.d.b((i17 / zq5.g.b(j27)) * 50);
            a17 = zq5.d.a(b18 < 1 ? 1 : b18, 50);
        }
        int i18 = 1;
        while (true) {
            int i19 = zq5.g.f475066c;
            float f17 = i17;
            float f18 = i18;
            long j28 = j27;
            int ceil = (int) java.lang.Math.ceil((f17 / f18) / ((int) (j19 >> c17)));
            int ceil2 = (int) java.lang.Math.ceil((zq5.g.b(j28) / f18) / zq5.g.b(j18));
            long a19 = zq5.d.a(ceil < 1 ? 1 : ceil, ceil2 < 1 ? 1 : ceil2);
            int i27 = (int) (a19 >> c17);
            int i28 = (int) (a17 >> c17);
            i27 = i27 > i28 ? i28 : i27;
            int a27 = zq5.c.a(a19);
            int a28 = zq5.c.a(a17);
            long a29 = zq5.d.a(i27, a27 > a28 ? a28 : a27);
            int i29 = (int) (a29 >> c17);
            int f19 = e06.p.f((int) java.lang.Math.ceil(f17 / i29), 1, i17);
            int f27 = e06.p.f((int) java.lang.Math.ceil(zq5.g.b(j28) / zq5.c.a(a29)), 1, zq5.g.b(j28));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(zq5.c.a(a29) * i29);
            int a37 = zq5.c.a(a29);
            for (int i37 = 0; i37 < a37; i37++) {
                int i38 = 0;
                while (i38 < i29) {
                    long a38 = zq5.d.a(i38, i37);
                    long j29 = a17;
                    int i39 = i38 * f19;
                    int i47 = a37;
                    int i48 = i37 * f27;
                    i38++;
                    int i49 = i38 * f19;
                    i49 = i49 > i17 ? i17 : i49;
                    int i57 = i17;
                    int i58 = (i37 + 1) * f27;
                    int i59 = f27;
                    int b19 = zq5.g.b(j28);
                    if (i58 > b19) {
                        i58 = b19;
                    }
                    arrayList2.add(new yq5.m(a38, new zq5.e(i39, i48, i49, i58), i18, null));
                    a37 = i47;
                    i17 = i57;
                    a17 = j29;
                    f27 = i59;
                }
            }
            int i66 = i17;
            long j37 = a17;
            arrayList.add(new yq5.i(i18, arrayList2));
            i18 *= 2;
            if (i29 * zq5.c.a(a29) <= 1) {
                break;
            }
            j19 = j18;
            i17 = i66;
            a17 = j37;
            c17 = ' ';
            j27 = j28;
        }
        java.util.List F0 = kz5.n0.F0(arrayList, com.tencent.mm.zoomimage.subsampling.internal.w1.f215151d);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : F0) {
            if (((yq5.i) obj).f464597a <= a18) {
                arrayList3.add(obj);
            }
        }
        this.f215142t = arrayList3;
        this.f215123a.d(new com.tencent.mm.zoomimage.subsampling.internal.y0(this, a18));
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f215123a.d(new com.tencent.mm.zoomimage.subsampling.internal.a1((yq5.i) it.next(), this));
        }
    }

    public final void a(java.lang.String caller) {
        kotlin.jvm.internal.o.g(caller, "caller");
        kotlinx.coroutines.r2 r2Var = this.f215138p;
        zq5.k kVar = this.f215123a;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            kVar.a(new com.tencent.mm.zoomimage.subsampling.internal.b1(caller, this));
            ((kotlinx.coroutines.c3) r2Var).b(kotlinx.coroutines.e2.a("clean:".concat(caller), null));
            this.f215138p = null;
        }
        if (this.f215143u != 0) {
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            java.util.Iterator it = ((java.util.ArrayList) this.f215142t).iterator();
            while (it.hasNext()) {
                f0Var.f310116d += c(((yq5.i) it.next()).f464598b, true);
            }
            kVar.a(new com.tencent.mm.zoomimage.subsampling.internal.c1(caller, f0Var, this));
            if (f0Var.f310116d > 0) {
                d("clean:".concat(caller));
            }
        }
    }

    public final boolean b(yq5.m mVar, boolean z17) {
        if (mVar.f464612g == 0) {
            return false;
        }
        mVar.f464612g = 0;
        kotlinx.coroutines.r2 r2Var = mVar.f464609d;
        if (r2Var != null && r2Var.a()) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            mVar.f464609d = null;
        }
        if (mVar.f464610e != null) {
            this.f215123a.d(new com.tencent.mm.zoomimage.subsampling.internal.d1(mVar, this));
            mVar.a();
        }
        if (!z17) {
            d("freeTile");
        }
        return true;
    }

    public final int c(java.util.List list, boolean z17) {
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (b((yq5.m) it.next(), z17)) {
                i17++;
            }
        }
        if (!z17 && i17 > 0) {
            d("freeTiles");
        }
        return i17;
    }

    public final void d(java.lang.String str) {
        kotlinx.coroutines.r2 r2Var = this.f215138p;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        zq5.k kVar = this.f215123a;
        if (z17) {
            kVar.d(new com.tencent.mm.zoomimage.subsampling.internal.q1(str, this));
        } else {
            kVar.d(new com.tencent.mm.zoomimage.subsampling.internal.r1(str, this));
            this.f215138p = kotlinx.coroutines.l.d(this.f215134l, null, null, new com.tencent.mm.zoomimage.subsampling.internal.u1(this, str, null), 3, null);
        }
    }
}

package g9;

/* loaded from: classes15.dex */
public final class j implements d9.x, g9.n, h9.j {

    /* renamed from: d, reason: collision with root package name */
    public final h9.n f269602d;

    /* renamed from: e, reason: collision with root package name */
    public final g9.g f269603e;

    /* renamed from: f, reason: collision with root package name */
    public final int f269604f;

    /* renamed from: g, reason: collision with root package name */
    public final d9.g f269605g;

    /* renamed from: h, reason: collision with root package name */
    public final r9.b f269606h;

    /* renamed from: o, reason: collision with root package name */
    public d9.w f269610o;

    /* renamed from: p, reason: collision with root package name */
    public int f269611p;

    /* renamed from: q, reason: collision with root package name */
    public d9.l0 f269612q;

    /* renamed from: t, reason: collision with root package name */
    public d9.l f269615t;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.IdentityHashMap f269607i = new java.util.IdentityHashMap();

    /* renamed from: m, reason: collision with root package name */
    public final g9.p f269608m = new g9.p();

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f269609n = new android.os.Handler();

    /* renamed from: r, reason: collision with root package name */
    public g9.o[] f269613r = new g9.o[0];

    /* renamed from: s, reason: collision with root package name */
    public g9.o[] f269614s = new g9.o[0];

    public j(h9.n nVar, g9.g gVar, int i17, d9.g gVar2, r9.b bVar) {
        this.f269602d = nVar;
        this.f269603e = gVar;
        this.f269604f = i17;
        this.f269605g = gVar2;
        this.f269606h = bVar;
    }

    public static boolean f(h9.a aVar, java.lang.String str) {
        java.lang.String str2 = aVar.f279591b.f44077f;
        if (android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        for (java.lang.String str3 : str2.split("(\\s*,\\s*)|(\\s*$)")) {
            if (str3.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // d9.h0
    public void b(d9.i0 i0Var) {
        if (this.f269612q == null) {
            return;
        }
        this.f269610o.b(this);
    }

    @Override // d9.x
    public long c(long j17) {
        g9.o[] oVarArr = this.f269614s;
        if (oVarArr.length > 0) {
            boolean x17 = oVarArr[0].x(j17, false);
            int i17 = 1;
            while (true) {
                g9.o[] oVarArr2 = this.f269614s;
                if (i17 >= oVarArr2.length) {
                    break;
                }
                oVarArr2[i17].x(j17, x17);
                i17++;
            }
            if (x17) {
                this.f269608m.f269646a.clear();
            }
        }
        return j17;
    }

    @Override // d9.x
    public long d() {
        return -9223372036854775807L;
    }

    public final g9.o e(int i17, h9.a[] aVarArr, com.google.android.exoplayer2.Format format, java.util.List list, long j17) {
        return new g9.o(i17, this, new g9.f(this.f269602d, aVarArr, this.f269603e, this.f269608m, list), this.f269606h, j17, format, this.f269604f, this.f269605g);
    }

    @Override // d9.i0
    public boolean h(long j17) {
        return this.f269615t.h(j17);
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d1  */
    @Override // d9.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i(q9.m[] r29, boolean[] r30, d9.g0[] r31, boolean[] r32, long r33) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.j.i(q9.m[], boolean[], d9.g0[], boolean[], long):long");
    }

    @Override // d9.x
    public d9.l0 k() {
        return this.f269612q;
    }

    @Override // d9.i0
    public long m() {
        return this.f269615t.m();
    }

    @Override // d9.i0
    public long n() {
        return this.f269615t.n();
    }

    @Override // d9.x
    public void o() {
        for (g9.o oVar : this.f269613r) {
            oVar.f269632m.b();
            g9.f fVar = oVar.f269628f;
            java.io.IOException iOException = fVar.f269577j;
            if (iOException != null) {
                throw iOException;
            }
            h9.a aVar = fVar.f269578k;
            if (aVar != null) {
                h9.i iVar = (h9.i) fVar.f269572e.f279661g.get(aVar);
                iVar.f279648e.b();
                java.io.IOException iOException2 = iVar.f279656p;
                if (iOException2 != null) {
                    throw iOException2;
                }
            }
        }
    }

    @Override // d9.x
    public void p(long j17) {
        for (g9.o oVar : this.f269614s) {
            int length = oVar.f269638s.length;
            for (int i17 = 0; i17 < length; i17++) {
                oVar.f269638s[i17].g(j17, false, oVar.C[i17]);
            }
        }
    }

    @Override // d9.x
    public void r(d9.w wVar, long j17) {
        this.f269610o = wVar;
        h9.n nVar = this.f269602d;
        ((java.util.ArrayList) nVar.f279664m).add(this);
        h9.b bVar = nVar.f279667p;
        java.util.ArrayList arrayList = new java.util.ArrayList(bVar.f279592c);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            h9.a aVar = (h9.a) arrayList.get(i17);
            if (aVar.f279591b.f44085q > 0 || f(aVar, "avc")) {
                arrayList2.add(aVar);
            } else if (f(aVar, "mp4a")) {
                arrayList3.add(aVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        java.util.List list = bVar.f279593d;
        int size = list.size() + 1;
        java.util.List list2 = bVar.f279594e;
        int size2 = size + list2.size();
        this.f269613r = new g9.o[size2];
        this.f269611p = size2;
        t9.a.a(!arrayList.isEmpty());
        h9.a[] aVarArr = new h9.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        g9.o e17 = e(0, aVarArr, bVar.f279595f, bVar.f279596g, j17);
        this.f269613r[0] = e17;
        e17.f269628f.f269575h = true;
        if (!e17.f269641v) {
            e17.h(e17.E);
        }
        int i18 = 0;
        int i19 = 1;
        while (i18 < list.size()) {
            g9.o e18 = e(1, new h9.a[]{(h9.a) list.get(i18)}, null, java.util.Collections.emptyList(), j17);
            int i27 = i19 + 1;
            this.f269613r[i19] = e18;
            if (!e18.f269641v) {
                e18.h(e18.E);
            }
            i18++;
            i19 = i27;
        }
        int i28 = 0;
        while (i28 < list2.size()) {
            h9.a aVar2 = (h9.a) list2.get(i28);
            g9.o e19 = e(3, new h9.a[]{aVar2}, null, java.util.Collections.emptyList(), j17);
            e19.l(0, -1).c(aVar2.f279591b);
            e19.f269640u = true;
            e19.v();
            this.f269613r[i19] = e19;
            i28++;
            i19++;
        }
        this.f269614s = this.f269613r;
    }
}

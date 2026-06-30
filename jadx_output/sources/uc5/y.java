package uc5;

/* loaded from: classes10.dex */
public final class y extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f426552d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f426553e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f426554f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f426555g;

    /* renamed from: h, reason: collision with root package name */
    public long f426556h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f426557i;

    /* renamed from: m, reason: collision with root package name */
    public long f426558m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f426559n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f426560o;

    /* renamed from: p, reason: collision with root package name */
    public volatile java.util.Map f426561p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f426562q;

    public y(java.lang.String talker, java.util.List typeCollection) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(typeCollection, "typeCollection");
        this.f426552d = talker;
        this.f426553e = typeCollection;
        this.f426554f = jz5.h.b(uc5.v.f426549d);
        this.f426555g = jz5.h.b(new uc5.w(this));
        this.f426556h = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f426558m = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f426562q = jz5.h.b(new uc5.x(this));
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        dVar.f463151e = true;
        u26.k0 k0Var = new u26.k0();
        if (f(request, dVar)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryDataSource", "DataSource getData, dataList add size = " + dVar.f463149c.size());
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryDataSource", "DataSource getData, fillDataResponse failed");
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    public final void d(java.util.List msgInfoList) {
        kotlin.jvm.internal.o.g(msgInfoList, "msgInfoList");
        java.util.Map map = this.f426561p;
        if (map != null) {
            java.util.Map t17 = kz5.c1.t(map);
            java.util.Iterator it = msgInfoList.iterator();
            boolean z17 = false;
            while (it.hasNext()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                if (kotlin.jvm.internal.o.b(f9Var.Q0(), this.f426552d)) {
                    java.lang.String str = uc5.q0.a(uc5.q0.f426543a, f9Var.T1(), 0L, 2, null).f426540a;
                    java.lang.Integer num = (java.lang.Integer) ((java.util.LinkedHashMap) t17).get(str);
                    if (num != null) {
                        int intValue = num.intValue() - 1;
                        if (intValue <= 0) {
                            t17.remove(str);
                        } else {
                            t17.put(str, java.lang.Integer.valueOf(intValue));
                        }
                        z17 = true;
                    }
                }
            }
            if (z17) {
                this.f426561p = t17;
            }
        }
    }

    public final p75.m e(java.lang.String str, int i17, int i18) {
        p75.o0 o0Var = new p75.o0(str, i17, i18);
        if (i18 == 0) {
            return o0Var;
        }
        p75.y yVar = (p75.y) new p75.t0(str, java.lang.String.valueOf(i18)).d(new p75.c1(str, java.lang.String.valueOf(0 - i18)));
        yVar.f(o0Var);
        return yVar;
    }

    public final boolean f(ym3.c cVar, ym3.d dVar) {
        android.database.Cursor cursor;
        if (this.f426559n) {
            dVar.f463148b = false;
            return true;
        }
        p75.m r0Var = new p75.r0("talker", this.f426552d);
        long j17 = this.f426558m;
        if (j17 != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            r0Var = r0Var.c(new p75.c1("createTime", java.lang.String.valueOf(j17)));
        }
        java.util.Set set = (java.util.Set) ((jz5.n) this.f426562q).getValue();
        if (set != null) {
            p75.m e17 = e("type", 65535, ((java.lang.Number) kz5.n0.W(set)).intValue());
            java.util.Iterator it = kz5.n0.R(set, 1).iterator();
            while (it.hasNext()) {
                e17 = e17.d(e("type", 65535, ((java.lang.Number) it.next()).intValue()));
            }
            r0Var = r0Var.c(e17);
        }
        java.lang.Object value = ((jz5.n) this.f426555g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        p75.i0 i17 = new p75.n0((java.lang.String) value).i();
        i17.f352656c = "MicroMsg.MsgHistoryGalleryDataSource";
        i17.f352657d = r0Var;
        i17.e(new p75.g("createTime", false));
        i17.c(1000, 0);
        p75.l0 a17 = i17.a();
        l75.k0 Q4 = ((jm0.l) ((jz5.n) this.f426554f).getValue()).Q4();
        if (Q4 != null) {
            cursor = Q4.f(a17.f352636a, a17.f352637b, 2);
        } else {
            cursor = null;
        }
        if (cursor == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHistoryGalleryDataSource", "DataSource fillDataResponse, cursor is null");
            return false;
        }
        try {
            h(g(cursor, cVar.f463145c, dVar), dVar);
            vz5.b.a(cursor, null);
            return true;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115 A[LOOP:0: B:2:0x0009->B:30:0x0115, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a A[EDGE_INSN: B:31:0x011a->B:32:0x011a BREAK  A[LOOP:0: B:2:0x0009->B:30:0x0115], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final uc5.s g(android.database.Cursor r24, int r25, ym3.d r26) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uc5.y.g(android.database.Cursor, int, ym3.d):uc5.s");
    }

    public final void h(uc5.s sVar, ym3.d dVar) {
        int i17 = sVar.f426544a;
        boolean z17 = sVar.f426546c;
        if (i17 == 0 && !z17) {
            this.f426559n = true;
            dVar.f463148b = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryDataSource", "DataSource fillDataResponse, reachTop");
            return;
        }
        long j17 = sVar.f426545b;
        this.f426558m = j17;
        this.f426559n = !z17;
        dVar.f463148b = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryDataSource", "DataSource fillDataResponse, continueFlag = " + dVar.f463148b + ", lastScannedTime = " + j17);
    }

    @Override // ym3.f
    public void onCreate() {
        this.f426556h = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f426557i = null;
        this.f426558m = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f426559n = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryDataSource", "DataSource onCreate");
    }
}

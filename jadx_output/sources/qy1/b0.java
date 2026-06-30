package qy1;

/* loaded from: classes13.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f367702a;

    /* renamed from: b, reason: collision with root package name */
    public final qy1.n f367703b;

    /* renamed from: c, reason: collision with root package name */
    public final py1.b f367704c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f367705d;

    /* renamed from: e, reason: collision with root package name */
    public int f367706e;

    /* renamed from: f, reason: collision with root package name */
    public int f367707f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f367708g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f367709h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f367710i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f367711j;

    /* renamed from: k, reason: collision with root package name */
    public final u26.w f367712k;

    /* renamed from: l, reason: collision with root package name */
    public final qy1.m f367713l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f367714m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f367715n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f367716o;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        if (r8 == null) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(int r8, qy1.n r9, py1.b r10) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.b0.<init>(int, qy1.n, py1.b):void");
    }

    public static final java.lang.Object a(qy1.b0 b0Var, com.tencent.mm.modelbase.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        ny1.k kVar;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.lang.Long l17;
        b0Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        qy1.o oVar = new qy1.o(rVar);
        ny1.j jVar = m1Var instanceof ny1.j ? (ny1.j) m1Var : null;
        if (jVar != null && (kVar = jVar.f341410f) != null && (concurrentLinkedQueue = kVar.f341417d) != null && (l17 = (java.lang.Long) kz5.n0.Y(concurrentLinkedQueue)) != null) {
            qy1.n nVar = b0Var.f367703b;
            long longValue = l17.longValue();
            oy1.c0 c0Var = (oy1.c0) nVar;
            c0Var.getClass();
            synchronized (c0Var.f349858m) {
                if (!c0Var.f349858m.containsKey(java.lang.Long.valueOf(longValue))) {
                    c0Var.f349858m.put(java.lang.Long.valueOf(longValue), oVar);
                }
            }
        }
        if (!gm0.j1.d().h(m1Var, 0)) {
            oy1.c0 c0Var2 = (oy1.c0) b0Var.f367703b;
            c0Var2.getClass();
            c0Var2.n(m1Var, false, 1003);
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiStorageHelper", "doScene err!");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public final r45.uc4 b(java.lang.String mmkvkey, java.lang.String str) {
        r45.uc4 uc4Var;
        kotlin.jvm.internal.o.g(mmkvkey, "mmkvkey");
        synchronized (this.f367710i) {
            jz5.l i17 = qy1.g.f367725a.i(mmkvkey, this.f367702a, str, oy1.m.f349885a.b() == 0);
            uc4Var = null;
            if (i17 != null) {
                r45.uc4 uc4Var2 = (r45.uc4) i17.f302833d;
                int intValue = ((java.lang.Number) i17.f302834e).intValue();
                if (uc4Var2 != null && !kotlin.jvm.internal.o.b(uc4Var2.f387219f, "history")) {
                    this.f367704c.b(java.lang.Long.valueOf(uc4Var2.f387221h), py1.c.f359048h, null);
                }
                this.f367705d.addAndGet(-intValue);
                uc4Var = uc4Var2;
            }
        }
        return uc4Var;
    }

    public final ny1.k c(java.lang.String reportKey) {
        kotlin.jvm.internal.o.g(reportKey, "reportKey");
        return (ny1.k) d().get(reportKey);
    }

    public final java.util.Map d() {
        return (java.util.Map) ((jz5.n) this.f367708g).getValue();
    }

    public final java.util.List e() {
        return (java.util.List) ((jz5.n) this.f367709h).getValue();
    }

    public final boolean f(java.lang.String mmkvkey, r45.uc4 dataInfo) {
        kotlin.jvm.internal.o.g(mmkvkey, "mmkvkey");
        kotlin.jvm.internal.o.g(dataInfo, "dataInfo");
        synchronized (this.f367710i) {
            if (this.f367705d.get() >= 200) {
                g(dataInfo);
                return false;
            }
            if (!h(mmkvkey, dataInfo)) {
                return false;
            }
            this.f367705d.incrementAndGet();
            if (!kotlin.jvm.internal.o.b(mmkvkey, "SDKCgiReportHistoryMap")) {
                this.f367704c.b(java.lang.Long.valueOf(dataInfo.f387221h), py1.c.f359044d, new jz5.l(dataInfo, java.lang.Integer.valueOf((int) qy1.g.f367725a.h(mmkvkey, this.f367702a))));
            }
            return true;
        }
    }

    public final boolean g(r45.uc4 dataInfo) {
        kotlin.jvm.internal.o.g(dataInfo, "dataInfo");
        dataInfo.f387219f = "db";
        qy1.c cVar = qy1.c.f367717a;
        if (qy1.c.f367720d == null) {
            cVar.c();
        }
        qy1.d dVar = qy1.c.f367720d;
        boolean z17 = false;
        if (dVar != null) {
            long j17 = dataInfo.f387221h;
            qy1.e eVar = new qy1.e();
            eVar.field_itemInfo = dataInfo.toByteArray();
            eVar.field_localItemReportId = j17;
            eVar.field_businessId = this.f367702a;
            eVar.field_reportTime = dataInfo.f387220g;
            eVar.field_delayTime = dataInfo.f387225o;
            l75.k0 k0Var = dVar.f367723d;
            long b17 = k0Var.b();
            try {
                try {
                    long l17 = k0Var.l("CgiReportLocalItemDataCache", "localItemReportId", eVar.convertTo());
                    com.tencent.mars.xlog.Log.i("MicroMsg.CgiLocalDataStorage", "new item insert rowId = " + l17 + ", localId = " + j17 + ", info = " + eVar);
                    if (l17 > -1) {
                        z17 = true;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CgiLocalDataStorage", "addNewItem err,  err info = " + e17);
                }
            } finally {
                k0Var.w(java.lang.Long.valueOf(b17));
            }
        }
        if (z17) {
            this.f367706e++;
            this.f367704c.b(java.lang.Long.valueOf(dataInfo.f387221h), py1.c.f359045e, new jz5.l(dataInfo, java.lang.Integer.valueOf(this.f367706e)));
        }
        return z17;
    }

    public final boolean h(java.lang.String mmkvKey, r45.uc4 uc4Var) {
        r45.nq5 nq5Var;
        qy1.g gVar = qy1.g.f367725a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f367702a);
        java.lang.String q17 = b52.b.q(uc4Var.f387221h);
        kotlin.jvm.internal.o.f(q17, "long2UnsignedString(...)");
        kotlin.jvm.internal.o.g(mmkvKey, "mmkvKey");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            com.tencent.mm.sdk.platformtools.o4 g17 = gVar.g(mmkvKey, valueOf);
            if (g17 == null) {
                return false;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mmkvKey : ");
            sb6.append(mmkvKey);
            sb6.append(" writeKey : ");
            sb6.append(q17);
            sb6.append("  writeToMMkv data : ");
            r45.pq5 pq5Var = uc4Var.f387218e;
            sb6.append((pq5Var == null || (nq5Var = pq5Var.f383313d) == null) ? null : nq5Var.f381603e);
            sb6.append('_');
            r45.pq5 pq5Var2 = uc4Var.f387218e;
            sb6.append(pq5Var2 != null ? pq5Var2.f383314e : null);
            sb6.append(" cost : ");
            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMKvUtils", sb6.toString());
            return g17.H(q17, uc4Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMKvUtils", " mmkvKey : " + mmkvKey + " writeKey : " + q17 + "  writeToMMkv err! " + e17.getMessage());
            return false;
        }
    }
}

package sz3;

/* loaded from: classes15.dex */
public final class m implements xz3.a {

    /* renamed from: a, reason: collision with root package name */
    public final xz3.a f414065a;

    /* renamed from: b, reason: collision with root package name */
    public final int f414066b;

    /* renamed from: c, reason: collision with root package name */
    public final int f414067c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f414068d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f414069e;

    /* renamed from: f, reason: collision with root package name */
    public long f414070f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f414071g;

    static {
        new sz3.b(null);
    }

    public m(xz3.a getProductCallback) {
        kotlin.jvm.internal.o.g(getProductCallback, "getProductCallback");
        this.f414065a = getProductCallback;
        this.f414066b = 2;
        this.f414067c = 1000;
        this.f414068d = new java.util.ArrayList();
        this.f414069e = new java.util.ArrayList();
        this.f414070f = -1L;
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.scanner.model.d1.f158851i;
        int i17 = o4Var != null ? o4Var.getInt("scan_config_request_time_interval", 1000) : 1000;
        this.f414067c = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "runTaskMinDurationInMs " + i17);
    }

    public static final void l(sz3.m mVar) {
        if (mVar.f414069e.size() >= mVar.f414066b) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AiScanImageGetProductManager", "doNextTask running queue full and skip");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = mVar.f414070f;
        if (j17 < 0 || currentTimeMillis - j17 >= mVar.f414067c) {
            m(mVar);
            return;
        }
        if (true ^ mVar.f414068d.isEmpty()) {
            long j18 = (mVar.f414070f + mVar.f414067c) - currentTimeMillis;
            mVar.f414068d.size();
            sz3.d dVar = new sz3.d(mVar);
            if (j18 > 0) {
                ((ku5.t0) ku5.t0.f312615d).l(dVar, j18, "AiScanImageGetProductManager");
            } else {
                ((ku5.t0) ku5.t0.f312615d).h(dVar, "AiScanImageGetProductManager");
            }
        }
    }

    public static final void m(sz3.m mVar) {
        xz3.f fVar = (xz3.f) kz5.h0.E(mVar.f414068d);
        if (fVar != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.hashCode());
            sz3.p pVar = fVar.f458215d;
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "doRunNextTask task: %s, trackId: %s, session: %s", valueOf, java.lang.Integer.valueOf(pVar.f413945b.f413959a.getId()), java.lang.Long.valueOf(pVar.f413946c));
            mVar.f414069e.add(fVar);
            mVar.f414070f = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductTask", "run getProductTask");
            xz3.p pVar2 = new xz3.p(pVar.f413946c, pVar, fVar.f458219h);
            xz3.m mVar2 = pVar2.f458247g;
            mVar2.b(pVar2);
            pVar2.f458249d = false;
            gm0.j1.d().a(5105, pVar2);
            long j17 = pVar2.f458245e;
            sz3.p pVar3 = pVar2.f458246f;
            int i17 = pVar3.f413947d;
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(pVar3.f413944a);
            java.lang.Integer valueOf5 = java.lang.Integer.valueOf(pVar3.f413948e);
            byte[] bArr = pVar3.f414086h;
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageUploadTask", "doUploadImage session: %d, source: %d, scanImageType: %s, mode: %s, imageData: %s, %s", valueOf2, valueOf3, valueOf4, valueOf5, java.lang.Integer.valueOf(bArr.length), pVar3.f414086h);
            sz3.a1 a1Var = pVar3.f413945b;
            if (i17 == 3 || i17 == 4) {
                int i18 = pVar3.f413948e;
                int i19 = pVar3.f414087i;
                int i27 = pVar3.f414088j;
                com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageUploadTask", "uploadImage imageData: %d", java.lang.Integer.valueOf(bArr.length));
                int i28 = pVar3.f413944a;
                com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = a1Var.f413959a;
                sz3.z0 z0Var = pVar3.f413950g;
                com.tencent.mm.plugin.scanner.model.x xVar = new com.tencent.mm.plugin.scanner.model.x(bArr, i19, i27, i18, i28, j17, scanProductInfo, null, null, null, z0Var != null ? z0Var.f414181c : null);
                pVar3.f413949f = xVar;
                gm0.j1.d().g(xVar);
                mVar2.e(pVar3);
            } else {
                pVar2.b(i17, 3, -1, "source invalid: " + i17, kz5.c0.d(java.lang.Integer.valueOf(a1Var.f413959a.getId())));
            }
            fVar.f458218g = pVar2;
        }
    }

    @Override // xz3.g
    public void a(sz3.x0 result, int i17, long j17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        ((ku5.t0) ku5.t0.f312615d).B(new sz3.f(this, result, i17, j17, i18, str));
    }

    @Override // xz3.k
    public void b(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (this.f414071g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "onTaskStart isCancelled and ignore");
        } else {
            this.f414065a.b(task);
        }
    }

    @Override // xz3.m
    public void c(sz3.x0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        ((ku5.t0) ku5.t0.f312615d).B(new sz3.k(this, result));
    }

    @Override // xz3.m
    public void d(sz3.x0 result, int i17, long j17, int i18, int i19, java.lang.String str) {
        kotlin.jvm.internal.o.g(result, "result");
        ((ku5.t0) ku5.t0.f312615d).B(new sz3.j(this, result, i17, j17, i18, i19, str));
    }

    @Override // xz3.m
    public void e(sz3.p request) {
        kotlin.jvm.internal.o.g(request, "request");
        if (this.f414071g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "onUploadStart isCancelled and ignore");
        } else {
            this.f414065a.e(request);
        }
    }

    @Override // xz3.a
    public void f(sz3.c1 c1Var, sz3.x0 result, yz5.l addResultCallback) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(addResultCallback, "addResultCallback");
        ((ku5.t0) ku5.t0.f312615d).B(new sz3.e(this, c1Var, result, addResultCallback));
    }

    @Override // xz3.k
    public void g(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        this.f414065a.g(task);
    }

    @Override // xz3.g
    public void h(sz3.x0 result) {
        kotlin.jvm.internal.o.g(result, "result");
        ((ku5.t0) ku5.t0.f312615d).B(new sz3.g(this, result));
    }

    @Override // xz3.g
    public void i(sz3.n request) {
        kotlin.jvm.internal.o.g(request, "request");
        if (this.f414071g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "onRetrievalStart isCancelled and ignore");
        } else {
            this.f414065a.i(request);
        }
    }

    @Override // xz3.k
    public void j(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        ((ku5.t0) ku5.t0.f312615d).B(new sz3.h(this, task));
        ((ku5.t0) ku5.t0.f312615d).h(new sz3.i(this, task), "AiScanImageGetProductManager");
    }

    @Override // xz3.k
    public void k(xz3.l task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (this.f414071g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageGetProductManager", "onTaskAdd isCancelled and ignore");
        } else {
            this.f414065a.k(task);
        }
    }

    public final void n(sz3.p request) {
        kotlin.jvm.internal.o.g(request, "request");
        ((ku5.t0) ku5.t0.f312615d).h(new sz3.l(request, this), "AiScanImageGetProductManager");
    }
}

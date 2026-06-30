package xz3;

/* loaded from: classes15.dex */
public final class f implements xz3.l {

    /* renamed from: d, reason: collision with root package name */
    public final sz3.p f458215d;

    /* renamed from: e, reason: collision with root package name */
    public final xz3.a f458216e;

    /* renamed from: f, reason: collision with root package name */
    public xz3.j f458217f;

    /* renamed from: g, reason: collision with root package name */
    public xz3.p f458218g;

    /* renamed from: h, reason: collision with root package name */
    public final xz3.e f458219h;

    /* renamed from: i, reason: collision with root package name */
    public final xz3.b f458220i;

    public f(sz3.p request, xz3.a getProductCallback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(getProductCallback, "getProductCallback");
        this.f458215d = request;
        this.f458216e = getProductCallback;
        this.f458219h = new xz3.e(this);
        this.f458220i = new xz3.b(this);
    }

    public static final void a(xz3.f fVar, sz3.x0 x0Var) {
        sz3.p pVar = fVar.f458215d;
        long j17 = pVar.f413946c;
        sz3.n nVar = new sz3.n(pVar.f413945b, x0Var);
        nVar.f413946c = pVar.f413946c;
        nVar.f413947d = pVar.f413947d;
        nVar.f413948e = pVar.f413948e;
        xz3.j jVar = new xz3.j(j17, nVar, fVar.f458220i);
        xz3.g gVar = jVar.f458230g;
        gVar.b(jVar);
        jVar.f458249d = false;
        gm0.j1.d().a(5057, jVar);
        sz3.n nVar2 = jVar.f458229f;
        int i17 = nVar2.f413947d;
        java.lang.Long valueOf = java.lang.Long.valueOf(jVar.f458228e);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        sz3.x0 x0Var2 = nVar2.f414075h;
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageRetrievalTask", "doRetrieval session: %d, source: %d, reqKey size: %s", valueOf, valueOf2, java.lang.Integer.valueOf(x0Var2.f414151e.size()));
        if (i17 == 3 || i17 == 4) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = x0Var2.f414151e.iterator();
            while (it.hasNext()) {
                sz3.w0 w0Var = (sz3.w0) it.next();
                w0Var.f414137h = 6;
                jVar.f458233m.add(java.lang.Integer.valueOf(w0Var.f414138i));
                arrayList.add(w0Var.f414139j);
            }
            com.tencent.mm.plugin.scanner.model.z zVar = new com.tencent.mm.plugin.scanner.model.z(arrayList, false, null, 4, null);
            nVar2.f413949f = zVar;
            gm0.j1.d().g(zVar);
            gVar.i(nVar2);
        } else {
            jVar.a(i17, -1, "invalid source: " + i17);
        }
        fVar.f458217f = jVar;
    }

    public void b() {
        xz3.p pVar = this.f458218g;
        if (pVar != null) {
            boolean z17 = pVar.f458249d;
            pVar.f458248h = true;
            if (!z17) {
                pVar.f458247g.g(pVar);
            }
            gm0.j1.d().q(5105, pVar);
            gm0.j1.d().d(pVar.f458246f.f413949f);
        }
        xz3.j jVar = this.f458217f;
        if (jVar != null) {
            boolean z18 = jVar.f458249d;
            jVar.f458232i = true;
            if (!z18) {
                jVar.f458230g.g(jVar);
            }
            gm0.j1.d().q(5057, jVar);
            gm0.j1.d().d(jVar.f458229f.f413949f);
        }
        if (this.f458218g == null && this.f458217f == null) {
            this.f458216e.g(this);
        }
    }
}

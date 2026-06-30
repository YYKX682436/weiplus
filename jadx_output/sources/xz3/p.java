package xz3;

/* loaded from: classes15.dex */
public final class p extends xz3.q implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final long f458245e;

    /* renamed from: f, reason: collision with root package name */
    public final sz3.p f458246f;

    /* renamed from: g, reason: collision with root package name */
    public final xz3.m f458247g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f458248h;

    public p(long j17, sz3.p request, xz3.m callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f458245e = j17;
        this.f458246f = request;
        this.f458247g = callback;
    }

    public void a(sz3.p request, sz3.w0 productItem) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(productItem, "productItem");
        productItem.f414131b = request.f413947d;
        productItem.f414132c = request.f413946c;
        productItem.f414133d = request.f413944a;
        productItem.f414134e = request.f413945b;
    }

    public final void b(int i17, int i18, int i19, java.lang.String str, java.util.List list) {
        ((ku5.t0) ku5.t0.f312615d).B(new xz3.n(i17, this, list, i18, i19, str));
        this.f458247g.j(this);
        if (i19 == 10003) {
            com.tencent.mm.plugin.scanner.model.d1 d1Var = com.tencent.mm.plugin.scanner.model.d1.f158843a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanFastFocusEngineManager", "disableDetectingByServerAsNoModel");
            com.tencent.mm.plugin.scanner.model.d1.f158849g = true;
            com.tencent.mm.plugin.scanner.model.d1 d1Var2 = com.tencent.mm.plugin.scanner.model.d1.f158843a;
            com.tencent.mm.plugin.scanner.model.d1.f158850h = true;
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.ArrayList arrayList;
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.hashCode()) : null;
        com.tencent.mm.modelbase.m1 m1Var2 = this.f458246f.f413949f;
        if (kotlin.jvm.internal.o.b(valueOf, m1Var2 != null ? java.lang.Integer.valueOf(m1Var2.hashCode()) : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadImage onSceneEnd errType: ");
            sb6.append(i17);
            sb6.append(", errCode: ");
            sb6.append(i18);
            sb6.append(", errMsg: ");
            sb6.append(str);
            sb6.append(", type: ");
            sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageUploadTask", sb6.toString());
            gm0.j1.d().q(5105, this);
            if (m1Var != null && m1Var.getType() == 5105) {
                this.f458249d = true;
                com.tencent.mm.plugin.scanner.model.x xVar = m1Var instanceof com.tencent.mm.plugin.scanner.model.x ? (com.tencent.mm.plugin.scanner.model.x) m1Var : null;
                if (xVar == null || (arrayList = xVar.f159093f) == null) {
                    arrayList = new java.util.ArrayList();
                }
                java.util.ArrayList arrayList2 = arrayList;
                if (i17 != 0 || i18 != 0) {
                    b(this.f458246f.f413947d, i17, i18, str, arrayList2);
                    return;
                }
                kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneAiScanImageV2");
                com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.plugin.scanner.model.x) m1Var).f159092e.f70711b.f70700a;
                r45.fv5 fv5Var = fVar != null ? (r45.fv5) fVar : null;
                if (fv5Var != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new xz3.o(this.f458246f.f413947d, this, fv5Var, arrayList2, str));
                    this.f458247g.j(this);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AiScanImageUploadTask", "AiScanImage onSceneEnd success resp null");
                    b(this.f458246f.f413947d, i17, i18, str, arrayList2);
                }
            }
        }
    }
}

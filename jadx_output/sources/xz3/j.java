package xz3;

/* loaded from: classes15.dex */
public final class j extends xz3.q implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final long f458228e;

    /* renamed from: f, reason: collision with root package name */
    public final sz3.n f458229f;

    /* renamed from: g, reason: collision with root package name */
    public final xz3.g f458230g;

    /* renamed from: h, reason: collision with root package name */
    public final int f458231h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f458232i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f458233m;

    public j(long j17, sz3.n request, xz3.g callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f458228e = j17;
        this.f458229f = request;
        this.f458230g = callback;
        this.f458233m = new java.util.ArrayList();
        this.f458231h = request.f413947d;
    }

    public final void a(int i17, int i18, java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).B(new xz3.h(i17, this, i18, str));
        this.f458230g.j(this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.hashCode()) : null;
        com.tencent.mm.modelbase.m1 m1Var2 = this.f458229f.f413949f;
        if (kotlin.jvm.internal.o.b(valueOf, m1Var2 != null ? java.lang.Integer.valueOf(m1Var2.hashCode()) : null)) {
            this.f458249d = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("retrieval onSceneEnd errType: ");
            sb6.append(i17);
            sb6.append(", errCode: ");
            sb6.append(i18);
            sb6.append(", errMsg: ");
            sb6.append(str);
            sb6.append(", type: ");
            sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageRetrievalTask", sb6.toString());
            gm0.j1.d().q(5057, this);
            if (m1Var != null && m1Var.getType() == 5057) {
                if (i17 != 0 || i18 != 0) {
                    a(this.f458231h, i18, str);
                    return;
                }
                kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneBizAiScanImageRetrievalV2");
                com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.plugin.scanner.model.z) m1Var).f159108e.f70711b.f70700a;
                r45.cv5 cv5Var = fVar != null ? (r45.cv5) fVar : null;
                if (cv5Var != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new xz3.i(this, cv5Var, this.f458231h));
                    this.f458230g.j(this);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AiScanImageRetrievalTask", "AiScanImage onSceneEnd success resp null");
                    a(this.f458231h, i18, str);
                }
            }
        }
    }
}

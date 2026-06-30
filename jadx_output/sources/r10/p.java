package r10;

/* loaded from: classes9.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pq.a f368587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f368588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y02.h0 f368589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368590g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f368591h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pq.a aVar, yz5.q qVar, y02.h0 h0Var, java.lang.String str, yz5.l lVar) {
        super(1);
        this.f368587d = aVar;
        this.f368588e = qVar;
        this.f368589f = h0Var;
        this.f368590g = str;
        this.f368591h = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult result = (com.tencent.mm.feature.ecs.open.EcsOpenAsyncInfo$EcsOpenAsyncInfoResult) obj;
        kotlin.jvm.internal.o.g(result, "result");
        boolean z17 = result.f65851d;
        pq.a aVar = this.f368587d;
        if (z17) {
            try {
                org.json.JSONObject d17 = aVar.d();
                if (d17 == null) {
                    d17 = new org.json.JSONObject();
                }
                d17.put("isTeenMode", result.f65852e ? 1 : 0);
                aVar.b(d17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("ECS_O.service", e17, "hy: merge extraData error", new java.lang.Object[0]);
            }
        }
        this.f368588e.invoke(this.f368589f, aVar, new r10.o(this.f368590g, this.f368591h));
        return jz5.f0.f302826a;
    }
}

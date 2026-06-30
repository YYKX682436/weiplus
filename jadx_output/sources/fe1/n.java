package fe1;

/* loaded from: classes15.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f261484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f261486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fe1.o f261487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f261488h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar, fe1.o oVar, int i17) {
        super(1);
        this.f261484d = j17;
        this.f261485e = str;
        this.f261486f = lVar;
        this.f261487g = oVar;
        this.f261488h = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        he1.k result = (he1.k) obj;
        kotlin.jvm.internal.o.g(result, "result");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ie1.b bVar = ie1.b.f290978a;
        boolean z17 = result instanceof he1.j;
        long j17 = this.f261484d;
        boolean z18 = result instanceof he1.i;
        int i17 = z18 ? ((he1.i) result).f280882a : 0;
        java.lang.String str = z18 ? ((he1.i) result).f280883b : "";
        java.lang.String issuerID = this.f261485e;
        kotlin.jvm.internal.o.f(issuerID, "$issuerID");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f261486f;
        java.lang.String appId = lVar.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        bVar.a(fe1.o.NAME, z17, j17, currentTimeMillis, i17, str, issuerID, appId);
        this.f261487g.D(lVar, this.f261488h, result, new fe1.m(issuerID));
        return jz5.f0.f302826a;
    }
}

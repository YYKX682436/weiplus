package fe1;

/* loaded from: classes15.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f261462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f261464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fe1.d f261465g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f261466h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.l lVar, fe1.d dVar, int i17) {
        super(1);
        this.f261462d = j17;
        this.f261463e = str;
        this.f261464f = lVar;
        this.f261465g = dVar;
        this.f261466h = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        he1.k result = (he1.k) obj;
        kotlin.jvm.internal.o.g(result, "result");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ie1.b bVar = ie1.b.f290978a;
        boolean z17 = result instanceof he1.j;
        long j17 = this.f261462d;
        boolean z18 = result instanceof he1.i;
        int i17 = z18 ? ((he1.i) result).f280882a : 0;
        java.lang.String str = z18 ? ((he1.i) result).f280883b : "";
        java.lang.String issuerID = this.f261463e;
        kotlin.jvm.internal.o.f(issuerID, "$issuerID");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f261464f;
        java.lang.String appId = lVar.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        bVar.a(fe1.d.NAME, z17, j17, currentTimeMillis, i17, str, issuerID, appId);
        this.f261465g.D(lVar, this.f261466h, result, fe1.b.f261461d);
        return jz5.f0.f302826a;
    }
}

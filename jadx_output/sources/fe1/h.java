package fe1;

/* loaded from: classes15.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f261473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f261474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fe1.i f261475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f261476g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j17, com.tencent.mm.plugin.appbrand.jsapi.l lVar, fe1.i iVar, int i17) {
        super(1);
        this.f261473d = j17;
        this.f261474e = lVar;
        this.f261475f = iVar;
        this.f261476g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        he1.k result = (he1.k) obj;
        kotlin.jvm.internal.o.g(result, "result");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ie1.b bVar = ie1.b.f290978a;
        boolean z17 = result instanceof he1.j;
        long j17 = this.f261473d;
        boolean z18 = result instanceof he1.i;
        int i17 = z18 ? ((he1.i) result).f280882a : 0;
        java.lang.String str = z18 ? ((he1.i) result).f280883b : "";
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f261474e;
        java.lang.String appId = lVar.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        bVar.a(fe1.i.NAME, z17, j17, currentTimeMillis, i17, str, "", appId);
        this.f261475f.D(lVar, this.f261476g, result, fe1.g.f261472d);
        return jz5.f0.f302826a;
    }
}

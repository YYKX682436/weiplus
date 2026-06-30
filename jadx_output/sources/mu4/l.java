package mu4;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mu4.j f331431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f331432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mu4.j jVar, int i17) {
        super(0);
        this.f331431d = jVar;
        this.f331432e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ku4.i iVar = ku4.i.f312514a;
        mu4.j jVar = this.f331431d;
        java.lang.String appId = jVar.f331429e;
        kotlin.jvm.internal.o.g(appId, "appId");
        int i17 = 0;
        com.tencent.mm.plugin.appbrand.appcache.n9 a17 = iVar.a(appId, 0);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasPackageDownManager", "getWxaPkgVersion pkgInfo is null");
        } else {
            i17 = a17.field_version;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20781, jVar.f331429e, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f331432e), 3, "");
        return jz5.f0.f302826a;
    }
}

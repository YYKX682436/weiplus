package fh1;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262602g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f262603h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(fh1.z zVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo) {
        super(0);
        this.f262599d = zVar;
        this.f262600e = str;
        this.f262601f = str2;
        this.f262602g = str3;
        this.f262603h = wxaPkgWrappingInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fh1.z zVar = this.f262599d;
        fh1.x0 a17 = zVar.a();
        com.tencent.mars.xlog.Log.i(zVar.f262631e, "onMiniProgramPackageReady appId:" + this.f262600e + ", envVersion:" + this.f262601f + ", appPath:" + this.f262602g + ", bizIsDestroyed:" + a17.G.get());
        kotlinx.coroutines.y0 y0Var = zVar.f262633g;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new fh1.s(zVar, this.f262600e, this.f262603h, a17, this.f262601f, this.f262602g, null), 2, null);
        return jz5.f0.f302826a;
    }
}

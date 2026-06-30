package ph1;

/* loaded from: classes7.dex */
public class z implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f354367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo f354368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph1.d f354369c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f354370d;

    public z(ph1.g0 g0Var, boolean z17, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo, ph1.d dVar) {
        this.f354370d = g0Var;
        this.f354367a = z17;
        this.f354368b = modulePkgInfo;
        this.f354369c = dVar;
    }

    @Override // ph1.d
    public void a(ph1.g gVar) {
        if (ph1.g.OK == gVar && this.f354367a) {
            com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = this.f354368b;
            boolean z17 = modulePkgInfo.independent;
            ph1.g0 g0Var = this.f354370d;
            if (!z17) {
                g0Var.l(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, "options.injectModuleJS");
            }
            g0Var.l(modulePkgInfo.name, "options.injectModuleJS");
        }
        ph1.d dVar = this.f354369c;
        if (dVar != null) {
            dVar.a(gVar);
        }
    }
}

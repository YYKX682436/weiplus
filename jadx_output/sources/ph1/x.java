package ph1;

/* loaded from: classes7.dex */
public class x implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph1.d f354357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f354358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph1.e0 f354359c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f354360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f354361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f354362f;

    public x(ph1.g0 g0Var, ph1.d dVar, com.tencent.mm.pointers.PBool pBool, ph1.e0 e0Var, ik1.b0 b0Var, ik1.b0 b0Var2) {
        this.f354362f = g0Var;
        this.f354357a = dVar;
        this.f354358b = pBool;
        this.f354359c = e0Var;
        this.f354360d = b0Var;
        this.f354361e = b0Var2;
    }

    @Override // ph1.d
    public void a(ph1.g gVar) {
        ph1.e0 e0Var;
        this.f354358b.value = true;
        if (ph1.g.OK == gVar && (e0Var = this.f354359c) != null && e0Var.f354318c) {
            if (!((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) this.f354360d.f291824a).independent) {
                this.f354362f.l(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, "options.injectModuleJS");
            }
            this.f354362f.l(((com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) this.f354360d.f291824a).name, "options.injectModuleJS");
        }
        this.f354362f.f354329f.m(new ph1.w(this));
        ph1.d dVar = this.f354357a;
        if (dVar != null) {
            dVar.a(gVar);
        }
    }

    @Override // ph1.d
    public void b(java.util.List list) {
        ph1.d dVar = this.f354357a;
        if (dVar != null) {
            dVar.b(list);
        }
    }
}

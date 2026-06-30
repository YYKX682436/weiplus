package si1;

/* loaded from: classes7.dex */
public class b1 implements si1.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f408231a;

    public b1(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        java.util.Objects.requireNonNull(appBrandRuntime);
        this.f408231a = appBrandRuntime;
    }

    @Override // si1.c1
    public ti1.b a() {
        return (ti1.b) this.f408231a.p0(ti1.b.class, false);
    }

    @Override // si1.c1
    public com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader b() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = (com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) this.f408231a.K1(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class);
        java.util.Objects.requireNonNull(iCommLibReader);
        return iCommLibReader;
    }

    @Override // si1.c1
    public u81.b c() {
        return this.f408231a.N.b();
    }

    @Override // si1.c1
    public void d(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f408231a;
        if (appBrandRuntime.C0() != null) {
            appBrandRuntime.C0().g(str, jSONObject.toString());
        }
    }

    @Override // si1.c1
    public com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle e() {
        return (com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle) this.f408231a.p0(com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle.class, false);
    }

    @Override // si1.c1
    public si1.n f() {
        return (si1.n) this.f408231a.p0(si1.n.class, false);
    }

    @Override // si1.c1
    public boolean g() {
        u81.f0 f0Var = this.f408231a.N.f425432a;
        int ordinal = f0Var.t().ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            return false;
        }
        return ((java.lang.Boolean) new u81.p(f0Var, 1000L, java.lang.Boolean.FALSE).a(new com.tencent.mm.sdk.platformtools.n3(f0Var.f304847e.getLooper()))).booleanValue();
    }
}

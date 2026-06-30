package fj1;

/* loaded from: classes7.dex */
public final class z implements si1.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fj1.b0 f263157a;

    public z(fj1.b0 b0Var) {
        this.f263157a = b0Var;
    }

    @Override // si1.c1
    public ti1.b a() {
        return null;
    }

    @Override // si1.c1
    public com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader b() {
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader b17 = com.tencent.mm.plugin.appbrand.appcache.e8.b();
        kotlin.jvm.internal.o.f(b17, "getReader(...)");
        return b17;
    }

    @Override // si1.c1
    public u81.b c() {
        return this.f263157a.f263105a.d().getAppState();
    }

    @Override // si1.c1
    public void d(java.lang.String str, org.json.JSONObject jSONObject) {
    }

    @Override // si1.c1
    public com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle e() {
        com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle = this.f263157a.f263105a.e().A.f47301d;
        kotlin.jvm.internal.o.f(appRuntimeApiPermissionBundle, "permissionBundle(...)");
        return appRuntimeApiPermissionBundle;
    }

    @Override // si1.c1
    public si1.n f() {
        return null;
    }

    @Override // si1.c1
    public boolean g() {
        return false;
    }
}

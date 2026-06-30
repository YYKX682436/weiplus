package uj;

/* loaded from: classes7.dex */
public final class i implements jc3.x {

    /* renamed from: d, reason: collision with root package name */
    public final uj.g f428156d = new uj.g();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.n9 f428157e;

    /* renamed from: f, reason: collision with root package name */
    public final uj.q f428158f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f428159g;

    public i() {
        uj.k kVar = uj.k.f428161a;
        this.f428157e = kVar.b();
        java.lang.String u17 = kVar.a().u("AppID", "");
        java.lang.String u18 = kVar.a().u("ModuleName", "");
        int o17 = kVar.a().o("VersionType", 0);
        kotlin.jvm.internal.o.d(u17);
        kotlin.jvm.internal.o.d(u18);
        this.f428158f = new uj.q(u17, o17, u18);
        this.f428159g = jz5.h.b(new uj.h(this));
    }

    @Override // jc3.x
    public java.lang.String a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // jc3.x
    public com.tencent.mm.plugin.appbrand.appstorage.u1 b() {
        return this.f428156d;
    }

    @Override // jc3.x
    public java.lang.String d() {
        jz5.g gVar = this.f428159g;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mars.xlog.Log.i("MagicPlayablePkgManagement", "providePackageMD5 md5:".concat((java.lang.String) value));
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        return (java.lang.String) value2;
    }

    @Override // jc3.x
    public void f(yz5.l cb6) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(cb6, "cb");
        uj.q qVar = this.f428158f;
        java.lang.String str = "game.js";
        if (qVar.f428178c.length() > 0) {
            str = qVar.f428178c + "game.js";
        }
        com.tencent.mars.xlog.Log.i("MagicPlayablePkgManagement", "provideEncryptedPath:" + str);
        com.tencent.mm.plugin.appbrand.appcache.u3 b17 = this.f428156d.b();
        if (b17 != null) {
            java.lang.String b18 = ((com.tencent.mm.plugin.appbrand.appcache.y8) b17).b();
            kotlin.jvm.internal.o.f(b18, "getPkgPath(...)");
            cb6.invoke(kz5.b0.c(new lc3.k0(b18, str)));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MagicPlayablePkgManagement", "provideEncryptedPath: pkg not found");
            cb6.invoke(kz5.p0.f313996d);
        }
    }

    @Override // jc3.x
    public java.lang.String g() {
        com.tencent.mm.plugin.appbrand.appcache.n9 n9Var = this.f428157e;
        java.lang.String str = n9Var != null ? n9Var.field_appId : null;
        if (str == null) {
            str = "MagicPlayableService";
        }
        com.tencent.mars.xlog.Log.i("MagicPlayablePkgManagement", "provideAppId appId:".concat(str));
        return str;
    }
}

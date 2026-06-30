package lc3;

/* loaded from: classes7.dex */
public final class g implements lc3.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.u3 f317895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc3.o f317896b;

    public g(lc3.o oVar, com.tencent.mm.plugin.appbrand.appcache.u3 pkg) {
        kotlin.jvm.internal.o.g(pkg, "pkg");
        this.f317896b = oVar;
        this.f317895a = pkg;
    }

    @Override // lc3.f
    public int a() {
        lc3.a k17;
        long j17;
        if (!(this.f317895a instanceof com.tencent.mm.plugin.appbrand.appcache.r)) {
            return Integer.MAX_VALUE;
        }
        lc3.o oVar = this.f317896b;
        if (oVar.j()) {
            lc3.a k18 = oVar.k();
            if (k18 == null) {
                return 0;
            }
            j17 = k18.f317881d;
        } else {
            if (!oVar.i() || (k17 = oVar.k()) == null) {
                return 0;
            }
            j17 = k17.f317879b;
        }
        return (int) j17;
    }

    @Override // lc3.f
    public com.tencent.mm.plugin.appbrand.appstorage.u1 b() {
        lc3.n0 m0Var;
        com.tencent.mm.plugin.appbrand.appcache.u3 u3Var = this.f317895a;
        if (u3Var instanceof com.tencent.mm.plugin.appbrand.appcache.r) {
            m0Var = new lc3.l0(new lc3.i0(u3Var));
        } else {
            java.lang.String b17 = u3Var.b();
            kotlin.jvm.internal.o.f(b17, "getPkgPath(...)");
            m0Var = new lc3.m0(b17);
        }
        return lc3.o.h(this.f317896b, m0Var);
    }

    @Override // lc3.f
    public lc3.g0 c(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.appbrand.appcache.u3 u3Var = this.f317895a;
        kotlin.jvm.internal.o.g(u3Var, "<this>");
        if (u3Var instanceof com.tencent.mm.plugin.appbrand.appcache.r) {
            return new lc3.j0(com.tencent.mm.plugin.appbrand.appcache.v3.a(u3Var, path));
        }
        java.lang.String b17 = u3Var.b();
        kotlin.jvm.internal.o.f(b17, "getPkgPath(...)");
        return new lc3.k0(b17, path);
    }

    @Override // lc3.f
    public java.lang.String d() {
        java.lang.String concat;
        java.util.Map map = com.tencent.mm.plugin.appbrand.appcache.v3.f76005a;
        com.tencent.mm.plugin.appbrand.appcache.u3 u3Var = this.f317895a;
        kotlin.jvm.internal.o.g(u3Var, "<this>");
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(u3Var.b());
        if (p17 != null && (concat = "MD5_".concat(p17)) != null) {
            return concat;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("REV_");
        byte[] bytes = (com.tencent.mm.sdk.platformtools.z.f193109e + u3Var.b()).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        return sb6.toString();
    }
}

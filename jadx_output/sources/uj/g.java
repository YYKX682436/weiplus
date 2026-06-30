package uj;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.appbrand.appstorage.y0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appcache.u3 f428154d;

    public final com.tencent.mm.plugin.appbrand.appcache.u3 b() {
        com.tencent.mm.plugin.appbrand.appcache.n9 b17 = uj.k.f428161a.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i("MagicPlayablePackageManager", "record null");
            return null;
        }
        java.lang.String str = b17.field_pkgPath;
        com.tencent.mars.xlog.Log.i("MagicPlayablePackageManager", "pkgPath:" + str);
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(str);
        y8Var.a();
        this.f428154d = y8Var;
        return y8Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String url, ik1.b0 pByteBuffer) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(pByteBuffer, "pByteBuffer");
        com.tencent.mm.plugin.appbrand.appcache.u3 u3Var = this.f428154d;
        return u3Var != null ? com.tencent.mm.plugin.appbrand.appcache.v3.c(u3Var, url, pByteBuffer) : com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String url, long j17, long j18, ik1.b0 pByteBuffer) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(pByteBuffer, "pByteBuffer");
        com.tencent.mm.plugin.appbrand.appcache.u3 u3Var = this.f428154d;
        return u3Var != null ? com.tencent.mm.plugin.appbrand.appcache.v3.b(u3Var, url, j17, j18, pByteBuffer) : com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
    }
}

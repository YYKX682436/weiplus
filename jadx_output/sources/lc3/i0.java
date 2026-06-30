package lc3;

/* loaded from: classes7.dex */
public final class i0 extends com.tencent.mm.plugin.appbrand.appstorage.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.u3 f317901d;

    public i0(com.tencent.mm.plugin.appbrand.appcache.u3 pkg) {
        kotlin.jvm.internal.o.g(pkg, "pkg");
        this.f317901d = pkg;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public boolean accept(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.util.Map map = com.tencent.mm.plugin.appbrand.appcache.v3.f76005a;
        com.tencent.mm.plugin.appbrand.appcache.u3 u3Var = this.f317901d;
        kotlin.jvm.internal.o.g(u3Var, "<this>");
        com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info openReadPartialInfo = u3Var.openReadPartialInfo(str);
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var = com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
        return (openReadPartialInfo != null ? j1Var : com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS) == j1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 access(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBAssetPkgFileSystem", "access");
        java.util.Map map = com.tencent.mm.plugin.appbrand.appcache.v3.f76005a;
        com.tencent.mm.plugin.appbrand.appcache.u3 u3Var = this.f317901d;
        kotlin.jvm.internal.o.g(u3Var, "<this>");
        return u3Var.openReadPartialInfo(url) != null ? com.tencent.mm.plugin.appbrand.appstorage.j1.OK : com.tencent.mm.plugin.appbrand.appstorage.j1.RET_NOT_EXISTS;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String url, ik1.b0 pByteBuffer) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(pByteBuffer, "pByteBuffer");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBAssetPkgFileSystem", "read File,url:".concat(url));
        return com.tencent.mm.plugin.appbrand.appcache.v3.c(this.f317901d, url, pByteBuffer);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1
    public java.io.InputStream readStream(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBAssetPkgFileSystem", "read readStream,url:".concat(url));
        return this.f317901d.c(url);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String url, long j17, long j18, ik1.b0 pByteBuffer) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(pByteBuffer, "pByteBuffer");
        com.tencent.mars.xlog.Log.i("MicroMsg.MBAssetPkgFileSystem", "read File,url:" + url + ",position:" + j17 + ",length:" + j18);
        return com.tencent.mm.plugin.appbrand.appcache.v3.b(this.f317901d, url, j17, j18, pByteBuffer);
    }
}

package xd;

/* loaded from: classes7.dex */
public class a extends xd.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.u1 f453606a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f453607b;

    public a(xd.e eVar) {
        super(eVar);
        wd.e eVar2 = (wd.e) eVar;
        this.f453607b = eVar2.f444683a.get() != null ? ((com.tencent.mm.plugin.appbrand.AppBrandRuntime) eVar2.f444683a.get()).f74803n : "";
        java.lang.ref.WeakReference weakReference = eVar2.f444683a;
        this.f453606a = weakReference.get() != null ? ((com.tencent.mm.plugin.appbrand.AppBrandRuntime) weakReference.get()).getFileSystem() : null;
    }

    @Override // h8.c
    public java.lang.String a() {
        return "appbrand_file";
    }

    @Override // h8.c
    public boolean accept(java.lang.Object obj) {
        return true;
    }

    @Override // h8.c
    public h8.b b(java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        h8.b bVar = new h8.b();
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = this.f453606a;
        if (u1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandFileSystemImageStreamFetcher", "fetch %s, appId[%s] fs NULL", str, this.f453607b);
            bVar.f279512b = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a17);
            return bVar;
        }
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appstorage.j1 readFile = u1Var.readFile(str, b0Var);
        if (readFile != com.tencent.mm.plugin.appbrand.appstorage.j1.OK || b0Var.f291824a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandFileSystemImageStreamFetcher", "fetch %s, ret %s, appId[%s]", str, readFile.name(), this.f453607b);
            bVar.f279512b = java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490629a16), readFile.name());
        } else {
            bVar.f279511a = new nf.a((java.nio.ByteBuffer) b0Var.f291824a);
        }
        return bVar;
    }
}

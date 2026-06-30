package xf1;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final xf1.k f454242a = new xf1.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f454243b = jz5.h.b(xf1.j.f454241d);

    public final com.tencent.mm.vfs.r6 a(com.tencent.mm.plugin.appbrand.jsapi.l component, java.lang.String zipPath) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(zipPath, "zipPath");
        boolean z17 = true;
        if (!r26.i0.y(zipPath, "wxfile://", true) && !r26.i0.y(zipPath, "http", true)) {
            zipPath = component.getAppId() + '_' + zipPath;
        }
        byte[] bytes = zipPath.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        if (g17 != null && g17.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            return new com.tencent.mm.vfs.r6((com.tencent.mm.vfs.r6) ((jz5.n) f454243b).getValue(), g17);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandUnzipLogic", "getUnzipDir, unzipPathName is empty");
        return null;
    }

    public final com.tencent.mm.vfs.r6 b(java.util.zip.ZipInputStream zipInputStream, com.tencent.mm.vfs.r6 unzipDir) {
        kotlin.jvm.internal.o.g(zipInputStream, "zipInputStream");
        kotlin.jvm.internal.o.g(unzipDir, "unzipDir");
        int j17 = com.tencent.mm.plugin.appbrand.appstorage.l1.j(zipInputStream, unzipDir.o());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandUnzipLogic", "unzip, unzipRet: " + j17);
        if (j17 != 0) {
            return null;
        }
        if (xf1.h.f454236a.b(unzipDir)) {
            return unzipDir;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandUnzipLogic", "unzip, record fail");
        return null;
    }
}

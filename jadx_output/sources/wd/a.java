package wd;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final wd.a f444670a = new wd.a();

    public byte[] a(java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo;
        java.lang.String a17;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MBFontManagerRegistry", "read data with empty path");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MBFontManagerRegistry", "readDataFromURLSync at path[%s]", str);
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("MBFontManagerRegistry", "service released");
            return null;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = e9Var.t3();
        if (t37 == null) {
            com.tencent.mars.xlog.Log.w("MBFontManagerRegistry", "no runtime provided");
            return null;
        }
        try {
            if (str.startsWith("wxfile://")) {
                com.tencent.mm.vfs.r6 absoluteFile = t37.getFileSystem().getAbsoluteFile(str);
                if (absoluteFile != null) {
                    a17 = absoluteFile.o();
                } else {
                    com.tencent.mars.xlog.Log.e("MBFontManagerRegistry", "read [%s] from filesystem failed, no file", str);
                    a17 = null;
                }
            } else {
                if (!com.tencent.mm.plugin.appbrand.appcache.la.n(str) && (openReadPartialInfo = com.tencent.mm.plugin.appbrand.appcache.la.o(t37, false).openReadPartialInfo(str)) != null) {
                    a17 = com.tencent.mm.plugin.appbrand.appcache.y5.a(openReadPartialInfo.f76043d, openReadPartialInfo.f76045f);
                }
                a17 = null;
            }
            if (a17 == null) {
                com.tencent.mars.xlog.Log.e("MBFontManagerRegistry", "read file failed");
                return null;
            }
            byte[] c17 = s46.d.c(com.tencent.mm.vfs.w6.E(a17));
            com.tencent.mars.xlog.Log.i("MBFontManagerRegistry", "readFile success, size = %d", java.lang.Integer.valueOf(c17.length));
            return c17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MBFontManagerRegistry", e17, "readDataFromURLSync failed", new java.lang.Object[0]);
            return null;
        }
    }
}

package com.tencent.xweb;

/* loaded from: classes12.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.xweb.a0 f220211a;

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        com.tencent.xweb.a0 a0Var = f220211a;
        if (a0Var != null) {
            ((com.tencent.mm.xwebutil.d0) a0Var).getClass();
            java.lang.String g17 = fp.d0.g(str);
            if (g17 != null) {
                by5.c4.f("LibraryLoader", "findLibrary, use custom library loader, path:" + g17);
                return g17;
            }
        }
        if (context != null) {
            java.lang.String str2 = context.getApplicationInfo().nativeLibraryDir;
            java.io.File file = new java.io.File(str2, com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH + str + ".so");
            if (!file.isDirectory() && file.canRead()) {
                java.lang.String absolutePath = file.getAbsolutePath();
                by5.c4.f("LibraryLoader", "findLibrary, use system library loader, path:" + absolutePath);
                return absolutePath;
            }
            by5.c4.g("LibraryLoader", "findLibrary, nativeLibraryDir:" + str2);
        } else {
            by5.c4.g("LibraryLoader", "findLibrary, invalid context");
        }
        by5.c4.f("LibraryLoader", "findLibrary, can not find library:" + str);
        return null;
    }
}

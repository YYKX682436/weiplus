package so1;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final so1.h f410239a = new so1.h();

    public final ro1.f a(com.tencent.mm.vfs.r6 srcFile, com.tencent.mm.vfs.r6 destFile, ro1.d dVar) {
        kotlin.jvm.internal.o.g(srcFile, "srcFile");
        kotlin.jvm.internal.o.g(destFile, "destFile");
        java.lang.Exception e17 = null;
        for (int i17 = 1; i17 < 4; i17++) {
            try {
                java.io.InputStream C = com.tencent.mm.vfs.w6.C(srcFile);
                kotlin.jvm.internal.o.f(C, "openRead(...)");
                java.lang.Exception e18 = null;
                for (int i18 = 1; i18 < 4; i18++) {
                    try {
                        java.io.OutputStream H = com.tencent.mm.vfs.w6.H(destFile);
                        kotlin.jvm.internal.o.f(H, "openWrite(...)");
                        try {
                            ro1.a.f397974a.a(C, H, dVar, 131072);
                            vz5.b.a(H, null);
                            vz5.b.a(C, null);
                            return ro1.f.f397979e;
                        } finally {
                        }
                    } catch (java.lang.Exception e19) {
                        e18 = e19;
                        try {
                            com.tencent.mars.xlog.Log.e("DirectUtils", "openWrite(" + destFile + ") failed, tryCount=" + i18 + '.');
                        } catch (java.lang.Throwable th6) {
                            try {
                                throw th6;
                            } catch (java.lang.Throwable th7) {
                                vz5.b.a(C, th6);
                                throw th7;
                            }
                        }
                    }
                }
                kotlin.jvm.internal.o.d(e18);
                throw e18;
            } catch (java.lang.Exception e27) {
                e17 = e27;
                try {
                    com.tencent.mars.xlog.Log.e("DirectUtils", "openRead(" + srcFile + ") failed, tryCount=" + i17 + '.');
                } catch (java.io.FileNotFoundException e28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("DirectUtils", e28, "Fail to copy. srcFile=" + srcFile + ", destFile=" + destFile, new java.lang.Object[0]);
                    return ro1.f.f397981g;
                } catch (java.lang.Exception e29) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("DirectUtils", e29, "Fail to copy. srcFile=" + srcFile + ", destFile=" + destFile, new java.lang.Object[0]);
                    return ro1.f.f397980f;
                }
            }
        }
        kotlin.jvm.internal.o.d(e17);
        throw e17;
    }
}

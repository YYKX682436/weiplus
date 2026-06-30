package up;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f429760a = jz5.h.b(up.e.f429758d);

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.lang.String f429761b;

    static {
        jz5.h.b(up.f.f429759d);
    }

    public static final void a(android.app.Application application, java.lang.String revision) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(application, "application");
        kotlin.jvm.internal.o.g(revision, "revision");
        if (!com.tencent.mm.sdk.platformtools.z.f193123s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CsoStartup", "skip initialize because cso is not enabled");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.r()) {
            com.tencent.cso.CsoLoader csoLoader = com.tencent.cso.CsoLoader.f45934a;
            com.tencent.cso.CsoLoader.f45940g = up.c.f429756d;
            com.tencent.cso.CsoLoader.f45942i = up.d.f429757d;
            return;
        }
        long logEnginePointer = com.tencent.mm.cso.log.CsoLog.getLogEnginePointer();
        com.tencent.cso.CsoLoader csoLoader2 = com.tencent.cso.CsoLoader.f45934a;
        sc.f fVar = new sc.f(logEnginePointer);
        if (com.tencent.cso.CsoLoader.f45935b) {
            fVar.invoke();
        } else {
            synchronized (com.tencent.cso.CsoLoader.f45936c) {
                if (com.tencent.cso.CsoLoader.f45935b) {
                    fVar.invoke();
                } else {
                    com.tencent.cso.CsoLoader.f45938e = fVar;
                }
            }
        }
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
        java.lang.String str2 = lp0.a.f320248b;
        kotlin.jvm.internal.o.f(str2, "baseRevision(...)");
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = str2.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        java.lang.String sourceDir = application.getApplicationInfo().sourceDir;
        kotlin.jvm.internal.o.f(sourceDir, "sourceDir");
        byte[] bytes2 = sourceDir.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
        messageDigest.update(bytes2);
        java.lang.String encodeToString = android.util.Base64.encodeToString(messageDigest.digest(), 11);
        kotlin.jvm.internal.o.f(encodeToString, "run(...)");
        if (32 < encodeToString.length()) {
            encodeToString = encodeToString.substring(0, 32);
            kotlin.jvm.internal.o.f(encodeToString, "substring(...)");
        }
        java.lang.String str3 = encodeToString;
        if (kotlin.jvm.internal.o.b(revision, lp0.a.f320248b)) {
            str = null;
        } else if (32 < revision.length()) {
            str = revision.substring(0, 32);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        } else {
            str = revision;
        }
        java.lang.String str4 = str;
        f429761b = str3.concat(revision);
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        java.util.List i17 = kz5.c0.i(application.getApplicationInfo().sourceDir, application.getApplicationInfo().nativeLibraryDir);
        if (com.tencent.cso.CsoLoader.f45935b) {
            return;
        }
        synchronized (com.tencent.cso.CsoLoader.f45936c) {
            if (com.tencent.cso.CsoLoader.f45935b) {
                return;
            }
            java.lang.String str5 = application.getApplicationInfo().sourceDir;
            java.io.File dataDir = application.getDataDir();
            kotlin.jvm.internal.o.d(dataDir);
            java.lang.String absolutePath = vz5.q.f(dataDir, "cso").getAbsolutePath();
            jz5.l a17 = sc.h.a(application);
            java.lang.String[] strArr = (java.lang.String[]) a17.f302833d;
            java.lang.String[] strArr2 = (java.lang.String[]) a17.f302834e;
            boolean z17 = (application.getApplicationInfo().flags & 268435456) != 0;
            kotlin.jvm.internal.o.d(str5);
            kotlin.jvm.internal.o.d(absolutePath);
            com.tencent.cso.CsoLoader.f45937d = new sc.d(str5, absolutePath, str3, str4, (java.lang.String[]) i17.toArray(new java.lang.String[0]), n17, strArr, strArr2, z17);
        }
    }
}

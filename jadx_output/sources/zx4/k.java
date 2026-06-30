package zx4;

/* loaded from: classes7.dex */
public final class k extends android.os.FileObserver {

    /* renamed from: e, reason: collision with root package name */
    public static final zx4.j f477155e = new zx4.j(null);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f477156a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f477157b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f477158c;

    /* renamed from: d, reason: collision with root package name */
    public final zx4.e f477159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String dirPath, zx4.e listener) {
        super(dirPath, 200);
        kotlin.jvm.internal.o.g(dirPath, "dirPath");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f477158c = dirPath;
        this.f477159d = listener;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        if (str == null) {
            return;
        }
        java.lang.String path = this.f477158c + str;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebView.ScreenshotFileObserver", "onEvent, event: " + i17 + ", takenPath: " + path);
        zx4.e eVar = this.f477159d;
        if (i17 == 8) {
            if (kotlin.jvm.internal.o.b(this.f477156a, path)) {
                return;
            }
            ((zx4.s) eVar).getClass();
            kotlin.jvm.internal.o.g(path, "path");
            com.tencent.mars.xlog.Log.i("WebviewScreenShotHelper", "onScreenshotTaken, path: ".concat(path));
            this.f477156a = path;
            return;
        }
        if (i17 == 64) {
            if (kotlin.jvm.internal.o.b(this.f477156a, path)) {
                this.f477157b = true;
                return;
            }
            return;
        }
        if (i17 == 128 && this.f477157b) {
            this.f477157b = false;
            java.lang.String str2 = this.f477156a;
            if (str2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebView.ScreenshotFileObserver", "onEvent, fromPath is null");
                return;
            }
            ((zx4.s) eVar).getClass();
            kotlin.jvm.internal.o.g(path, "toPath");
            com.tencent.mars.xlog.Log.i("WebviewScreenShotHelper", "onScreenshotMove, fromPath: " + str2 + ", toPath: " + path);
            qk.r6 r6Var = (qk.r6) i95.n0.c(qk.r6.class);
            if (!(r6Var != null && ((qv.s) r6Var).Ai())) {
                com.tencent.mars.xlog.Log.i("WebviewScreenShotHelper", "onScreenshotMove, switch closed.");
                return;
            }
            com.tencent.mm.storage.r1 mj6 = r01.q3.mj();
            mj6.getClass();
            l75.k0 db6 = mj6.f195263d;
            kotlin.jvm.internal.o.g(db6, "db");
            com.tencent.mm.plugin.appbrand.utils.k4 k4Var = new com.tencent.mm.plugin.appbrand.utils.k4(db6, db6.b(), null);
            try {
                com.tencent.mm.storage.p1 y07 = mj6.y0(str2);
                if (y07 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizScreenshotInfoStorage", "updateOnScreenshotMove, query for " + str2 + " fail");
                } else if (mj6.delete(y07, new java.lang.String[0])) {
                    y07.field_screenshotPath = path;
                    y07.field_screenshotTime = com.tencent.mm.sdk.platformtools.t8.i1();
                    boolean insert = mj6.insert(y07);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateOnScreenshotMove, insert for ");
                    sb6.append(path);
                    sb6.append(' ');
                    sb6.append(insert ? ya.b.SUCCESS : "fail");
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizScreenshotInfoStorage", sb6.toString());
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizScreenshotInfoStorage", "updateOnScreenshotMove, delete for " + str2 + " fail");
                }
                wz5.a.a(k4Var, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    wz5.a.a(k4Var, th6);
                    throw th7;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.io.File file, zx4.e listener) {
        super(file, 200);
        kotlin.jvm.internal.o.g(file, "file");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f477158c = file.getAbsolutePath() + java.io.File.separator;
        this.f477159d = listener;
    }
}

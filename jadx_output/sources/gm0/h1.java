package gm0;

/* loaded from: classes7.dex */
public class h1 implements gm0.i1 {

    /* renamed from: b, reason: collision with root package name */
    public static final gm0.h1 f273198b = new gm0.h1();

    /* renamed from: a, reason: collision with root package name */
    public gm0.e1 f273199a;

    public final void a(java.io.File file) {
        java.io.File[] listFiles;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FindOutDataDisappeared", "List %s directory:", file.getAbsolutePath());
            for (java.io.File file2 : listFiles) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FindOutDataDisappeared", " -> %s | Size: %s | Modified: %s", file2.getAbsolutePath(), java.lang.Long.valueOf(file2.length()), java.lang.Long.valueOf(file2.lastModified()));
            }
        }
    }

    public final void b(int i17, int i18, int i19) {
        if ((i17 & i18) != 0) {
            jx3.f.INSTANCE.d(21019, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i19), 200, "");
        }
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FindOutDataDisappeared", "identity is %s?", str);
        } else {
            try {
                java.io.File file = new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir(), "identity_records");
                file.mkdirs();
                java.io.File file2 = new java.io.File(file, str);
                if (!file2.exists()) {
                    file2.createNewFile();
                    com.tencent.mars.xlog.Log.w("MicroMsg.FindOutDataDisappeared", "identity is %s?", str);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FindOutDataDisappeared", th6, "", new java.lang.Object[0]);
            }
        }
        ((ku5.t0) ku5.t0.f312615d).k(new gm0.f1(this, str2), 5000L);
    }
}

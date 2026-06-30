package gm0;

/* loaded from: classes7.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gm0.h1 f273186e;

    public f1(gm0.h1 h1Var, java.lang.String str) {
        this.f273186e = h1Var;
        this.f273185d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f273185d;
        try {
            this.f273186e.getClass();
            java.io.File file = new java.io.File(com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalFilesDir(null), "external_used_mark");
            if (!file.exists()) {
                file.createNewFile();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FindOutDataDisappeared", "Update private usage '%s'", str);
            com.tencent.mm.vfs.w6.R(file.getAbsolutePath(), str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FindOutDataDisappeared", th6, "", new java.lang.Object[0]);
        }
    }
}

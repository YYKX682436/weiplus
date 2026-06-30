package p65;

/* loaded from: classes12.dex */
public class r implements vx5.m0 {
    public r(p65.s sVar) {
    }

    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.IsolatedStartupRoutine", "setupChildProcessCrashDumpFiles, crashDumpFileSuffix:" + str2);
        try {
            com.tencent.mm.app.s4.b(com.tencent.mm.sdk.platformtools.x2.f193071a, android.os.ParcelFileDescriptor.open(new java.io.File(com.tencent.mm.app.t4.c(com.tencent.mm.sdk.platformtools.x2.f193071a, str, str2)), 939524096), android.os.ParcelFileDescriptor.open(new java.io.File(com.tencent.mm.app.t4.d(com.tencent.mm.sdk.platformtools.x2.f193071a, str, str2)), 939524096));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.XWeb.IsolatedStartupRoutine", "setupChildProcessCrashDumpFiles, error:" + e17);
        }
    }
}

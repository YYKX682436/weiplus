package oq5;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oq5.f f347404d;

    public d(oq5.f fVar) {
        this.f347404d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        com.tencent.mm.vfs.r6[] G;
        boolean z17 = true;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_logcat, 1);
        oq5.f fVar = this.f347404d;
        if (Ni != 1) {
            fVar.f347408b = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.LogcatCatcher", "no need to work");
            return;
        }
        fVar.f347408b = true;
        if (!fVar.f347407a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LogcatCatcher", "checker not safe!");
            return;
        }
        fVar.getClass();
        try {
            android.os.StatFs statFs = new android.os.StatFs(lp0.b.e0());
            j17 = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (java.lang.Exception unused) {
            j17 = 0;
        }
        if (j17 <= 0) {
            j17 = 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gree space:");
        sb6.append(j17);
        sb6.append(" |6442450944|");
        sb6.append(j17 >= 6442450944L);
        com.tencent.mars.xlog.Log.i("MicroMsg.LogcatCatcher", sb6.toString());
        if (!(j17 >= 6442450944L)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LogcatCatcher", "no space!");
            fVar.f347407a = false;
            return;
        }
        java.lang.String a17 = oq5.f.a(fVar);
        if (a17.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LogcatCatcher", "errorCheck nameprefix empty!");
            return;
        }
        java.lang.String str = a17 + "_" + new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date()) + ".xlog";
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.xlog.app.XLogSetup.logPath);
        if (r6Var.y() && (G = r6Var.G()) != null) {
            for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                if (r6Var2.getName().contains(str)) {
                    long C = r6Var2.C();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LogcatCatcher", "checker find target file:%s, size:%s", str, java.lang.String.valueOf(C));
                    if (C > 524288000) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.LogcatCatcher", "maybe error! stop!");
                        z17 = false;
                    }
                }
            }
        }
        fVar.f347412f.removeCallbacks(fVar.f347410d);
        if (z17) {
            fVar.f347412f.postDelayed(fVar.f347410d, 60000L);
        } else {
            fVar.f347407a = false;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1504L, 2L, 1L);
        }
    }
}

package ga3;

/* loaded from: classes.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269838d;

    public a(java.lang.String str) {
        this.f269838d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordCacheClean", "clean audio record file");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.lite.logic.y2.f(this.f269838d, "bundle", null), "LiteAppAudioRecorder");
        if (!r6Var.m() || !r6Var.y()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordCacheClean", "AudioRecord is not exist or not Directory");
            return;
        }
        java.lang.String[] D = r6Var.D();
        if (D == null || D.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordCacheClean", "none files exist");
            return;
        }
        for (java.lang.String str : D) {
            java.util.Iterator it = ((java.util.ArrayList) ga3.b.f269842d).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.contains((java.lang.String) it.next())) {
                        z17 = true;
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordCacheClean", "file is the block file, don't delete");
            } else {
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var + "/" + str);
                if (!r6Var2.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordCacheClean", "file not exist");
                } else if (r6Var2.y()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordCacheClean", "file is directory, don't delete");
                } else if (java.lang.System.currentTimeMillis() - r6Var2.B() > ga3.b.f269839a.longValue()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordCacheClean", "Clean 1 day file in record file name=%s, path:%s", r6Var2.getName(), r6Var2.o());
                    r6Var2.l();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordCacheClean", "not delete the file, file is in valid time for 1 day");
                }
            }
        }
    }
}

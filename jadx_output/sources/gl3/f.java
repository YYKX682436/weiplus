package gl3;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f272827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl3.g f272828e;

    public f(gl3.g gVar, long j17) {
        this.f272828e = gVar;
        this.f272827d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        if (gl3.e.d()) {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            com.tencent.mm.plugin.music.model.cache.ipc.n.g(this.f272827d);
        }
        gl3.g gVar = this.f272828e;
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheCleanController", "clean music piece file");
        java.lang.String a17 = gl3.e.a();
        java.lang.String concat = a17.endsWith("/") ? a17.concat("music") : a17.concat("/music");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(concat);
        if (!r6Var.m() || !r6Var.y()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheCleanController", "musicFolder is not exist or not Directory");
            return;
        }
        java.lang.String[] D = r6Var.D();
        if (D == null || D.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheCleanController", "none files exist");
            return;
        }
        for (java.lang.String str : D) {
            java.util.Iterator it = ((java.util.ArrayList) gVar.f272830e).iterator();
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
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheCleanController", "file is the block file, don't delete");
            } else {
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(concat + "/" + str);
                if (!r6Var2.m()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheCleanController", "file not exist");
                } else if (r6Var2.y()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheCleanController", "file is directory, don't delete");
                } else if (java.lang.System.currentTimeMillis() - r6Var2.B() > gl3.b.f272818a.longValue()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.PieceCacheCleanController", "Clean 7 days file in music file name=%s, path:%s", r6Var2.getName(), r6Var2.o());
                    r6Var2.l();
                    if (str.startsWith("piece")) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.Music.PieceCacheCleanController", "file is piece prefix, delete the piece info in db");
                        if (gl3.e.d()) {
                            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
                            com.tencent.mm.plugin.music.model.cache.ipc.n.a(str);
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceCacheCleanController", "not delete the file, file is in valid time for 7 day");
                }
            }
        }
    }
}

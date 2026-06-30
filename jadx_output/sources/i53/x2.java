package i53;

/* loaded from: classes8.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.d3 f288784d;

    public x2(i53.d3 d3Var) {
        this.f288784d = d3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.d3 d3Var = this.f288784d;
        if (d3Var.f288556j) {
            return;
        }
        int i17 = d3Var.f288554h + 1;
        d3Var.f288554h = i17;
        if (i17 <= i53.d3.f288546p) {
            ((java.util.HashSet) d3Var.f288551e).clear();
            d3Var.f288551e.addAll(d3Var.f288553g);
            ((java.util.HashSet) d3Var.f288553g).clear();
            d3Var.e();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "retry count bigger than 5");
        java.util.HashSet hashSet = (java.util.HashSet) d3Var.f288553g;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            i53.w wi6 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi();
            wi6.getClass();
            java.lang.String format = java.lang.String.format("update %s set %s=%d where %s=\"%s\"", "GameHaowanMedia", "uploadState", 1, dm.i4.COL_LOCALID, str);
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateUploadSuccess, sql: " + format);
            wi6.execSQL("GameHaowanMedia", format);
        }
        hashSet.clear();
        i53.c3 c3Var = d3Var.f288550d;
        if (c3Var != null) {
            ((i53.y) c3Var).a(false);
        }
    }
}

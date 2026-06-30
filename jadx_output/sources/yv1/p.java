package yv1;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv1.q f466132d;

    public p(yv1.q qVar) {
        this.f466132d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageCleanTotalSizeCalcMode()) == 1 ? "FastList" : "MigrationFileIndex";
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        yv1.q qVar = this.f466132d;
        qVar.getClass();
        java.lang.String concat = "#runLoadingTask: from=".concat(str);
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanExService", concat, null);
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        if (kotlin.jvm.internal.o.b(str, "MigrationFileIndex")) {
            kotlinx.coroutines.l.f(null, new yv1.o(g0Var, null), 1, null);
        } else {
            if (!kotlin.jvm.internal.o.b(str, "FastList")) {
                throw new java.lang.IllegalArgumentException("Unknown dataSource: ".concat(str));
            }
            ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
            java.util.List list = jm.p.f300245a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((kz5.h) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((bm5.v) next) != bm5.v.f22750p) {
                    arrayList.add(next);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(bm5.c0.f22550a.h((bm5.v) it6.next(), false));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanExService", "#runLoadingTask: listing c2cChatDirList=" + arrayList2.size(), null);
            if (!arrayList2.isEmpty()) {
                g0Var.f310121d = com.tencent.mm.vfs.FastList.e(kz5.n0.V0(arrayList2));
            }
        }
        long j17 = g0Var.f310121d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanExService", "#runLoadingTask: " + j17 + ", from=" + str + ", durationMs=" + (java.lang.System.currentTimeMillis() - currentTimeMillis), null);
        if (java.lang.Thread.currentThread().isInterrupted()) {
            return;
        }
        qVar.wi(str, j17);
    }
}

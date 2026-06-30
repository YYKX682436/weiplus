package yv1;

/* loaded from: classes12.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f466176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f466177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f466178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yv1.n0 f466179g;

    public v0(java.util.List list, com.tencent.wcdb.support.CancellationSignal cancellationSignal, long j17, yv1.n0 n0Var) {
        this.f466176d = list;
        this.f466177e = cancellationSignal;
        this.f466178f = j17;
        this.f466179g = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Delete FTS, talker count: ");
        java.util.List<java.lang.String> list = this.f466176d;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", sb6.toString());
        try {
            c01.j8 j8Var = (c01.j8) i95.n0.c(c01.j8.class);
            com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f466177e;
            long j17 = this.f466178f;
            yv1.n0 n0Var = this.f466179g;
            for (java.lang.String str : list) {
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
                ((com.tencent.mm.plugin.fts.logic.r3) j8Var).Ai(str, j17);
                int[] iArr = n0Var.f466118i;
                iArr[3] = iArr[3] + 1;
                n0Var.a();
            }
        } catch (com.tencent.wcdb.support.OperationCanceledException unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Done delete FTS.");
    }
}

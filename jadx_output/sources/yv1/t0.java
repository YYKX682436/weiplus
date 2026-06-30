package yv1;

/* loaded from: classes12.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f466160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f466161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yv1.n0 f466162f;

    public t0(java.util.List list, com.tencent.wcdb.support.CancellationSignal cancellationSignal, yv1.n0 n0Var) {
        this.f466160d = list;
        this.f466161e = cancellationSignal;
        this.f466162f = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Delete image query, talker count: ");
        java.util.List<java.lang.String> list = this.f466160d;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", sb6.toString());
        try {
            qk.x7 x7Var = (qk.x7) i95.n0.c(qk.x7.class);
            com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f466161e;
            yv1.n0 n0Var = this.f466162f;
            for (java.lang.String str : list) {
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
                ((c61.ec) x7Var).Ai(str);
                int[] iArr = n0Var.f466118i;
                iArr[2] = iArr[2] + 1;
                n0Var.a();
            }
        } catch (com.tencent.wcdb.support.OperationCanceledException unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Done delete image query");
    }
}

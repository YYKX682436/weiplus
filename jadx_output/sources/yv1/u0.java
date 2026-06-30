package yv1;

/* loaded from: classes12.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f466167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.n0 f466168e;

    public u0(java.util.List list, yv1.n0 n0Var) {
        this.f466167d = list;
        this.f466168e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Delete ALL FTS, talker count:  ");
        java.util.List list = this.f466167d;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", sb6.toString());
        ((com.tencent.mm.plugin.fts.logic.r3) ((c01.j8) i95.n0.c(c01.j8.class))).wi();
        int size = list.size();
        yv1.n0 n0Var = this.f466168e;
        int[] iArr = n0Var.f466118i;
        iArr[3] = iArr[3] + size;
        n0Var.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Done delete FTS.");
    }
}

package cx;

/* loaded from: classes7.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent f224401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f224402e;

    public f1(com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent, cx.j1 j1Var) {
        this.f224401d = beforeAggressiveCleanCacheEvent;
        this.f224402e = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String pj6;
        com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent = this.f224401d;
        boolean z17 = (beforeAggressiveCleanCacheEvent.f53999g.f7589a & 1) != 0;
        boolean z18 = com.tencent.mm.storage.c2.f193805c;
        cx.j1 j1Var = this.f224402e;
        pj6 = j1Var.pj();
        com.tencent.mars.xlog.Log.i(pj6, "hy: received clean event, flag is " + beforeAggressiveCleanCacheEvent.f53999g.f7589a + ", is system " + z17 + ", is biz attached to engine " + z18);
        if (!z17 || z18) {
            return;
        }
        j1Var.K6(4);
    }
}

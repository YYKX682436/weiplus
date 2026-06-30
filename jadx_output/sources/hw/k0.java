package hw;

/* loaded from: classes7.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent f285395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f285396e;

    public k0(com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent, hw.o0 o0Var) {
        this.f285395d = beforeAggressiveCleanCacheEvent;
        this.f285396e = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String ij6;
        com.tencent.mm.autogen.events.BeforeAggressiveCleanCacheEvent beforeAggressiveCleanCacheEvent = this.f285395d;
        boolean z17 = (beforeAggressiveCleanCacheEvent.f53999g.f7589a & 1) != 0;
        boolean z18 = com.tencent.mm.storage.c2.f193805c;
        hw.o0 o0Var = this.f285396e;
        ij6 = o0Var.ij();
        com.tencent.mars.xlog.Log.i(ij6, "hy: received clean event, flag is " + beforeAggressiveCleanCacheEvent.f53999g.f7589a + ", is system " + z17 + ", is biz attached to engine " + z18);
        if (!z17 || z18) {
            return;
        }
        o0Var.K6(4);
    }
}

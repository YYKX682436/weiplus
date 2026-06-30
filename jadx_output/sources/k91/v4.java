package k91;

/* loaded from: classes7.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f305795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f305796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km5.b f305797f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k91.y4 f305798g;

    public v4(k91.y4 y4Var, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, km5.b bVar) {
        this.f305798g = y4Var;
        this.f305795d = atomicInteger;
        this.f305796e = concurrentLinkedQueue;
        this.f305797f = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f305795d.getAndDecrement() == 1) {
            k91.y4 y4Var = this.f305798g;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(y4Var.f305836b.size());
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f305796e;
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAttrSyncHelper", "batchSync callback list_size:%d, updated_size:%d, scene:%d", valueOf, java.lang.Integer.valueOf(concurrentLinkedQueue.size()), java.lang.Integer.valueOf(y4Var.f305837c.f305609d));
            this.f305797f.c(new java.util.LinkedList(concurrentLinkedQueue));
            k91.e5 e5Var = y4Var.f305838d;
            if (e5Var != null) {
                e5Var.a();
            }
        }
    }
}

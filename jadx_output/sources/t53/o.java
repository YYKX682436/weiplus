package t53;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f415814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f415815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f415816f;

    public o(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.LinkedList linkedList, yz5.l lVar) {
        this.f415814d = atomicInteger;
        this.f415815e = linkedList;
        this.f415816f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f415814d.incrementAndGet() == 2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSessionIdAndContact success: ");
            java.util.LinkedList linkedList = this.f415815e;
            sb6.append((java.lang.String) linkedList.get(0));
            com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", sb6.toString());
            this.f415816f.invoke(linkedList.get(0));
        }
    }
}

package mn2;

/* loaded from: classes2.dex */
public final class m3 implements fp0.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f330054a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f330055b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f330056c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f330057d;

    /* renamed from: e, reason: collision with root package name */
    public int f330058e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f330059f;

    public m3(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f330054a = name;
        this.f330055b = new java.util.concurrent.ConcurrentLinkedDeque();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f330057d = atomicInteger;
        this.f330058e = atomicInteger.get();
        this.f330059f = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
    }

    @Override // fp0.b
    public int a() {
        return this.f330058e;
    }

    @Override // fp0.b
    public void b(fp0.r task) {
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.xlog.Log.i("FinderSingleTaskExecutor", "[postTask] name=" + this.f330054a + " isRunningTask=" + this.f330056c + " task=" + task);
        task.f265279h = this.f330058e;
        this.f330055b.add(task);
        c();
    }

    public final synchronized void c() {
        com.tencent.mars.xlog.Log.i("FinderSingleTaskExecutor", "[checkNextTask] name=" + this.f330054a + " isRunningTask=" + this.f330056c + " waitSize=" + this.f330055b.size());
        if (this.f330056c) {
            return;
        }
        kotlinx.coroutines.l.d(this.f330059f, null, null, new mn2.l3(this, null), 3, null);
    }

    @Override // fp0.b
    public void reset() {
        this.f330058e = this.f330057d.incrementAndGet();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reset] name=");
        java.lang.String str = this.f330054a;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FinderSingleTaskExecutor", sb6.toString());
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f330055b;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            ((fp0.r) it.next()).e();
        }
        concurrentLinkedDeque.clear();
        kotlinx.coroutines.z0.d(this.f330059f, "reset: name=" + str, null, 2, null);
        this.f330056c = false;
    }
}

package fp0;

/* loaded from: classes10.dex */
public final class t implements fp0.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f265281a;

    /* renamed from: b, reason: collision with root package name */
    public final fp0.o f265282b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f265283c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f265284d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f265285e;

    /* renamed from: f, reason: collision with root package name */
    public int f265286f;

    /* renamed from: g, reason: collision with root package name */
    public final fp0.s f265287g;

    public t(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f265281a = name;
        this.f265282b = new fp0.o(new gp0.g(new gp0.b(1, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "SingleTaskExecutor"));
        this.f265283c = new java.util.concurrent.ConcurrentLinkedDeque();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f265285e = atomicInteger;
        this.f265286f = atomicInteger.get();
        this.f265287g = new fp0.s(this);
    }

    @Override // fp0.b
    public int a() {
        return this.f265286f;
    }

    @Override // fp0.b
    public void b(fp0.r task) {
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.xlog.Log.i("Loader.SingleTaskExecutor", "[postTask] name=" + this.f265281a + " isRunningTask=" + this.f265284d + " task=" + task);
        task.f265279h = this.f265286f;
        this.f265283c.add(task);
        c();
    }

    public final synchronized void c() {
        fp0.r rVar;
        com.tencent.mars.xlog.Log.i("Loader.SingleTaskExecutor", "[checkNextTask] name=" + this.f265281a + " isRunningTask=" + this.f265284d + " waitSize=" + this.f265283c.size());
        if (!this.f265284d && (rVar = (fp0.r) this.f265283c.poll()) != null) {
            this.f265282b.a(rVar);
            this.f265284d = true;
        }
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("Loader.SingleTaskExecutor", "[clean] name=" + this.f265281a);
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f265283c;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            ((fp0.r) it.next()).e();
        }
        concurrentLinkedDeque.clear();
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("Loader.SingleTaskExecutor", "[start] name=" + this.f265281a);
        this.f265282b.g(this.f265287g);
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("Loader.SingleTaskExecutor", "[stop] name=" + this.f265281a);
        fp0.o oVar = this.f265282b;
        oVar.getClass();
        fp0.s callback = this.f265287g;
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.X(new fp0.n(oVar, callback));
        pm0.v.X(new fp0.i(oVar));
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f265283c;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            ((fp0.r) it.next()).e();
        }
        concurrentLinkedDeque.clear();
        this.f265284d = false;
    }

    @Override // fp0.b
    public void reset() {
        this.f265286f = this.f265285e.incrementAndGet();
        com.tencent.mars.xlog.Log.i("Loader.SingleTaskExecutor", "[reset] name=" + this.f265281a);
        fp0.o oVar = this.f265282b;
        oVar.getClass();
        pm0.v.X(new fp0.i(oVar));
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f265283c;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            ((fp0.r) it.next()).e();
        }
        concurrentLinkedDeque.clear();
        this.f265284d = false;
    }
}

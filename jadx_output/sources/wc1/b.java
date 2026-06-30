package wc1;

/* loaded from: classes7.dex */
public final class b implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f444462d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f444463e = new java.util.concurrent.atomic.AtomicBoolean(true);

    public final void a() {
        java.util.LinkedList linkedList;
        if (this.f444463e.getAndSet(false)) {
            synchronized (this.f444462d) {
                linkedList = new java.util.LinkedList(this.f444462d);
                this.f444462d.clear();
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        kotlin.jvm.internal.o.g(command, "command");
        if (!this.f444463e.get()) {
            command.run();
            return;
        }
        synchronized (this.f444462d) {
            this.f444462d.offer(command);
        }
    }
}

package k5;

/* loaded from: classes13.dex */
public class l implements java.util.concurrent.Executor {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.Executor f304137e;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.lang.Runnable f304139g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayDeque f304136d = new java.util.ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f304138f = new java.lang.Object();

    public l(java.util.concurrent.Executor executor) {
        this.f304137e = executor;
    }

    public void a() {
        synchronized (this.f304138f) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.f304136d.poll();
            this.f304139g = runnable;
            if (runnable != null) {
                this.f304137e.execute(this.f304139g);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        synchronized (this.f304138f) {
            this.f304136d.add(new k5.k(this, runnable));
            if (this.f304139g == null) {
                a();
            }
        }
    }
}

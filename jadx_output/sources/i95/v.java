package i95;

/* loaded from: classes12.dex */
public class v extends java.util.concurrent.RecursiveAction {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f289853d;

    /* renamed from: e, reason: collision with root package name */
    public final i95.y f289854e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ForkJoinPool f289855f;

    /* renamed from: g, reason: collision with root package name */
    public final i95.w f289856g;

    /* renamed from: h, reason: collision with root package name */
    public final i95.r f289857h;

    /* renamed from: i, reason: collision with root package name */
    public final i95.r f289858i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f289859m;

    /* renamed from: n, reason: collision with root package name */
    public volatile i95.u f289860n = null;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f289861o = new i95.t(this);

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i95.w f289862p;

    public v(i95.w wVar, android.content.Context context, i95.y yVar, java.util.concurrent.ForkJoinPool forkJoinPool, i95.w wVar2, i95.r rVar, i95.r rVar2, boolean z17) {
        this.f289862p = wVar;
        this.f289853d = context;
        this.f289854e = yVar;
        this.f289855f = forkJoinPool;
        this.f289856g = wVar2;
        this.f289857h = rVar;
        this.f289858i = rVar2;
        this.f289859m = z17;
    }

    public final void a() {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        java.util.concurrent.locks.ReentrantLock reentrantLock2;
        i95.v vVar;
        i95.v vVar2;
        i95.w wVar = this.f289862p;
        try {
            reentrantLock2 = wVar.mStatusLock;
            reentrantLock2.lock();
            vVar = wVar.mTransitTask;
            if (vVar != null) {
                vVar2 = wVar.mTransitTask;
                if (vVar2.f289858i == this.f289857h) {
                    wVar.oi();
                }
                wVar.mTransitTask = null;
            }
        } finally {
            reentrantLock = wVar.mStatusLock;
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.RecursiveAction
    public void compute() {
        boolean z17 = true;
        if (this.f289860n == null) {
            synchronized (this) {
                if (this.f289860n == null) {
                    this.f289860n = new i95.u(this, null);
                    z17 = false;
                }
            }
        }
        if (z17) {
            this.f289860n.join();
        } else {
            this.f289860n.invoke();
        }
    }
}

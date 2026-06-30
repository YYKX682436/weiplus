package vu5;

/* loaded from: classes12.dex */
public class e extends java.util.concurrent.ThreadPoolExecutor implements vu5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f440348d;

    /* renamed from: e, reason: collision with root package name */
    public final int f440349e;

    /* renamed from: f, reason: collision with root package name */
    public int f440350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vu5.f f440351g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vu5.f fVar, int i17, int i18) {
        super(i17, i18, 10L, java.util.concurrent.TimeUnit.MINUTES, new java.util.concurrent.LinkedBlockingQueue(), new vu5.c(fVar), new vu5.d(fVar));
        this.f440351g = fVar;
        this.f440350f = 1;
        this.f440348d = i17;
        this.f440349e = i18;
    }

    @Override // vu5.a
    public void a(wu5.l lVar) {
        long delay = lVar.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            execute(lVar);
        } else {
            android.os.Handler handler = this.f440351g.f440353f;
            handler.sendMessageAtTime(handler.obtainMessage(0, lVar), android.os.SystemClock.uptimeMillis() + delay);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th6) {
        super.afterExecute(runnable, th6);
        if (getQueue().isEmpty()) {
            int corePoolSize = getCorePoolSize();
            int i17 = this.f440348d;
            if (corePoolSize > i17) {
                setCorePoolSize(i17);
                this.f440350f = 1;
                ku5.o.f312599c.w("ColdPool", "reset to corePoolSize(%s)", java.lang.Integer.valueOf(i17));
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        int i17;
        int corePoolSize = getCorePoolSize();
        if (getQueue().size() >= this.f440350f * 10 && (i17 = corePoolSize + 1) <= this.f440349e) {
            setCorePoolSize(i17);
            ku5.o.f312599c.w("ColdPool", "increment to expand cold pool; queue size=%s currentCoreSize=%s bufferSizeFactor=%s", java.lang.Integer.valueOf(getQueue().size()), java.lang.Integer.valueOf(corePoolSize), java.lang.Integer.valueOf(this.f440350f));
            this.f440350f++;
        }
        super.execute(runnable);
    }
}

package ve1;

/* loaded from: classes12.dex */
public class n extends java.util.concurrent.ThreadPoolExecutor {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f436088d;

    public n(java.lang.String str) {
        super(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue());
        this.f436088d = "";
        this.f436088d = str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(java.lang.Runnable runnable, java.lang.Throwable th6) {
        super.afterExecute(runnable, th6);
        if (th6 == null && (runnable instanceof java.util.concurrent.Future)) {
            try {
                java.util.concurrent.Future future = (java.util.concurrent.Future) runnable;
                if (future.isDone() && !future.isCancelled()) {
                    ve1.g.p(3, "ThreadUtils", "before future.get()", null);
                    future.get();
                    ve1.g.p(3, "ThreadUtils", "after future.get()", null);
                }
            } catch (java.lang.InterruptedException unused) {
                ve1.g.p(5, "ThreadUtils", "InterruptedException", null);
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.CancellationException e17) {
                th6 = e17;
                ve1.g.p(5, "ThreadUtils", "CancellationException", null);
            } catch (java.util.concurrent.ExecutionException e18) {
                ve1.g.p(5, "ThreadUtils", "ExecutionException", null);
                th6 = e18.getCause();
            }
        }
        if (th6 != null) {
            ve1.g.p(6, "ThreadUtils", this.f436088d + " error occurred during processing request:" + ve1.g.h(th6, false), null);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(java.lang.Thread thread, java.lang.Runnable runnable) {
        super.beforeExecute(thread, runnable);
        ve1.g.p(4, "ThreadUtils", "beforeExecute: thread=" + thread.toString() + " thread.state=" + thread.getState() + " runnable=" + runnable.toString(), null);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return super.newTaskFor(runnable, obj);
    }

    public n(int i17, int i18, long j17, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.BlockingQueue blockingQueue) {
        super(i17, i18, j17, timeUnit, blockingQueue);
        this.f436088d = "";
    }
}

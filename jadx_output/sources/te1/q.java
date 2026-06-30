package te1;

/* loaded from: classes13.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f417804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te1.r f417805e;

    public q(te1.r rVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f417805e = rVar;
        this.f417804d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f417804d.countDown();
        te1.r rVar = this.f417805e;
        java.util.concurrent.ExecutorService executorService = rVar.f417813f;
        ve1.g.p(3, "VideoProxy", "proxy server wait for request", null);
        while (!java.lang.Thread.currentThread().isInterrupted()) {
            try {
                try {
                    try {
                        java.net.Socket accept = rVar.f417812e.accept();
                        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                        te1.p pVar = new te1.p(rVar, accept, countDownLatch);
                        java.util.concurrent.Future<?> submit = ((java.util.concurrent.AbstractExecutorService) executorService).submit(pVar);
                        ve1.n nVar = (ve1.n) executorService;
                        ((java.util.concurrent.ThreadPoolExecutor) executorService).setCorePoolSize(nVar.getActiveCount() + nVar.getQueue().size() + 2);
                        pVar.f417801e = submit;
                        countDownLatch.countDown();
                    } catch (java.net.SocketException e17) {
                        if (rVar.f417812e.isClosed()) {
                            ve1.g.p(3, "VideoProxy", "proxy server is closed", null);
                        } else {
                            ve1.g.p(6, "VideoProxy", "proxy server is quit, reason SOCKET:" + ve1.g.h(e17, false), null);
                        }
                    }
                } catch (java.io.IOException e18) {
                    ve1.g.p(6, "VideoProxy", "proxy server is quit, reason IO:" + ve1.g.h(e18, false), null);
                } catch (java.lang.OutOfMemoryError e19) {
                    ve1.g.p(6, "VideoProxy", "proxy server is quit, reason OOM:" + ve1.g.h(e19, false), null);
                }
            } finally {
                ve1.g.p(3, "VideoProxy", "shutdown thread pool", null);
                ((java.util.concurrent.ThreadPoolExecutor) executorService).shutdownNow();
                ve1.g.p(3, "VideoProxy", "proxy server stopped", null);
            }
        }
    }
}

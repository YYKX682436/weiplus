package kj;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f308274d;

    public w(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f308274d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.matrix.trace.tracer.SignalAnrTracer.f53019v = java.lang.System.currentTimeMillis();
        oj.j.c("SignalAnrTracer", "onANRDumped", new java.lang.Object[0]);
        java.lang.String a17 = lj.f.a();
        com.tencent.matrix.trace.tracer.SignalAnrTracer.f53016s = a17;
        oj.j.c("SignalAnrTracer", "onANRDumped, stackTrace = %s, duration = %d", a17, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.tencent.matrix.trace.tracer.SignalAnrTracer.f53019v));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/self/cgroup")));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb6.append(readLine);
                    sb6.append("\n");
                } finally {
                }
            }
            bufferedReader.close();
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.matrix.trace.tracer.SignalAnrTracer.f53015r = sb6.toString();
        oj.j.c("SignalAnrTracer", "onANRDumped, read cgroup duration = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.tencent.matrix.trace.tracer.SignalAnrTracer.f53019v));
        com.tencent.matrix.trace.tracer.SignalAnrTracer.f53006f = lj.a.h();
        oj.j.c("SignalAnrTracer", "onANRDumped, isInterestingToUser duration = %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - com.tencent.matrix.trace.tracer.SignalAnrTracer.f53019v));
        com.tencent.matrix.trace.tracer.SignalAnrTracer.i(true);
        this.f308274d.countDown();
    }
}

package it0;

/* loaded from: classes13.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final it0.f f294494d = new it0.f();

    @Override // java.lang.Runnable
    public final void run() {
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.util.concurrent.FutureTask futureTask = it0.g.f294495a;
        if (futureTask == null) {
            kotlin.jvm.internal.o.o("futureTask");
            throw null;
        }
        ((ku5.t0) u0Var).g(futureTask);
        try {
            java.util.concurrent.FutureTask futureTask2 = it0.g.f294495a;
            if (futureTask2 != null) {
                futureTask2.get(10L, java.util.concurrent.TimeUnit.SECONDS);
            } else {
                kotlin.jvm.internal.o.o("futureTask");
                throw null;
            }
        } catch (java.util.concurrent.TimeoutException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraReportHelper", "futureTask TimeoutException cancel");
            java.util.concurrent.FutureTask futureTask3 = it0.g.f294495a;
            if (futureTask3 == null) {
                kotlin.jvm.internal.o.o("futureTask");
                throw null;
            }
            if (futureTask3.isCancelled()) {
                return;
            }
            java.util.concurrent.FutureTask futureTask4 = it0.g.f294495a;
            if (futureTask4 == null) {
                kotlin.jvm.internal.o.o("futureTask");
                throw null;
            }
            if (futureTask4.isDone()) {
                return;
            }
            java.util.concurrent.FutureTask futureTask5 = it0.g.f294495a;
            if (futureTask5 != null) {
                futureTask5.cancel(true);
            } else {
                kotlin.jvm.internal.o.o("futureTask");
                throw null;
            }
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraReportHelper", "futureTask Exception");
        }
    }
}

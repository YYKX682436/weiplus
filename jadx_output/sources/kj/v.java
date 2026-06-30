package kj;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f308273d;

    public v(boolean z17) {
        this.f308273d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f308273d;
        boolean z18 = com.tencent.matrix.trace.tracer.SignalAnrTracer.f53006f;
        int i17 = 0;
        while (i17 < 40) {
            i17++;
            try {
                if (com.tencent.matrix.trace.tracer.SignalAnrTracer.h()) {
                    com.tencent.matrix.trace.tracer.SignalAnrTracer.k(true, z17);
                    return;
                }
                java.lang.Thread.sleep(500L);
            } catch (java.lang.Throwable th6) {
                oj.j.b("SignalAnrTracer", "checkErrorStateCycle error, e : " + th6.getMessage(), new java.lang.Object[0]);
                return;
            }
        }
    }
}

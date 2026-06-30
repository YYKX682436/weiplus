package q81;

/* loaded from: classes7.dex */
public final class e0 extends com.tencent.mm.plugin.appbrand.utils.c implements q81.z {

    /* renamed from: g, reason: collision with root package name */
    public static final q81.e0 f360704g = new q81.e0();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentSkipListSet f360705h = new java.util.concurrent.ConcurrentSkipListSet();

    public e0() {
        super(1);
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", "onQueueDrained");
        f360705h.clear();
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c
    public void e(com.tencent.mm.plugin.appbrand.utils.a task, yz5.a onEnd) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(onEnd, "onEnd");
        if (task instanceof q81.a0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", "runTask CheckCmdAndSubmitTask");
            ((q81.a0) task).f360691d = onEnd;
            ((ku5.t0) ku5.t0.f312615d).q((java.lang.Runnable) task);
            return;
        }
        if (task instanceof q81.d0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runTask RunCmdTask(");
            q81.d0 d0Var = (q81.d0) task;
            sb6.append(d0Var.f360701d);
            sb6.append(')');
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", sb6.toString());
            d0Var.f360703f = onEnd;
            ((ku5.t0) ku5.t0.f312615d).q((java.lang.Runnable) task);
        }
    }

    @Override // q81.z
    public void h() {
        this.f90394e.clear();
        f360705h.clear();
        q81.x._INSTANCE.h();
    }

    @Override // q81.z
    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", "triggerRetry stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        a(new q81.a0());
    }

    @Override // q81.z
    public boolean k(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return f360705h.contains(str);
    }
}

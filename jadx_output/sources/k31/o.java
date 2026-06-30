package k31;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final k31.o f303850a = new k31.o();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f303851b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f303852c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f303853d = new java.util.HashMap();

    public final void a(l31.b task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (task.f315314b) {
            ((ku5.t0) ku5.t0.f312615d).h(new k31.k(task), "manager_thread");
        }
        ((ku5.t0) ku5.t0.f312615d).h(new k31.l(task), "manager_thread");
    }

    public final void b(k31.a storageManager, l31.b task) {
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeMsgStorageTaskManager", "runTask storageManager: %s, task className: %s, async: %b", java.lang.Integer.valueOf(storageManager.hashCode()), task.getClass().getSimpleName(), java.lang.Boolean.valueOf(task.f315314b));
        if (task.f315314b) {
            ((ku5.t0) ku5.t0.f312615d).h(new k31.n(storageManager, task), "manager_thread");
        } else {
            task.run();
            ((ku5.t0) ku5.t0.f312615d).h(new k31.i(task), "manager_thread");
        }
    }
}

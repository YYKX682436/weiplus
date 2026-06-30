package ho1;

/* loaded from: classes5.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f282857d;

    public y0(boolean z17) {
        this.f282857d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        boolean z17 = this.f282857d;
        java.util.Set taskStateChangeListeners = com.tencent.mm.plugin.backup.roambackup.r0.f92687d;
        kotlin.jvm.internal.o.f(taskStateChangeListeners, "taskStateChangeListeners");
        synchronized (taskStateChangeListeners) {
            java.util.Iterator it = taskStateChangeListeners.iterator();
            while (it.hasNext()) {
                ((ho1.q1) ((io1.d) it.next())).b(z17, com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_COMPLETED, qo1.i0.f365502f);
            }
        }
    }
}

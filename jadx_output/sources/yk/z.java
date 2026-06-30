package yk;

/* loaded from: classes12.dex */
public final class z implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.plugin.worker.MsgRefactorReportWorker f462763d;

    public z(com.tencent.mm.app.plugin.worker.MsgRefactorReportWorker msgRefactorReportWorker) {
        this.f462763d = msgRefactorReportWorker;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRefactorReportWorker", "doWork() called idle");
        ((ku5.t0) ku5.t0.f312615d).g(new yk.y(this.f462763d));
        return false;
    }
}

package yk;

/* loaded from: classes12.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f462760d;

    public w(android.content.Context context) {
        this.f462760d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            yk.x.a(yk.x.f462761a, this.f462760d);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgRefactorReportService", th6, "initScheduleReport err", new java.lang.Object[0]);
        }
    }
}

package qe5;

/* loaded from: classes12.dex */
public final class j2 implements i40.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qe5.m2 f362131a;

    public j2(qe5.m2 m2Var) {
        this.f362131a = m2Var;
    }

    @Override // i40.b
    public void a(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDownloadUIC", "pauseDownloadCallback onDownloadFailed, errorType: " + i17 + ", errorCode: " + i18 + ", errMsg: " + errMsg);
        qe5.m2 m2Var = this.f362131a;
        kd5.e U6 = m2Var.U6();
        if (U6 != null) {
            U6.H = false;
        }
        j75.f Q6 = m2Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(4, 0));
        }
    }

    @Override // i40.b
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDownloadUIC", "pauseDownloadCallback onDownloadPaused");
        qe5.m2 m2Var = this.f362131a;
        kd5.e U6 = m2Var.U6();
        if (U6 != null) {
            U6.H = false;
        }
        j75.f Q6 = m2Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(3, 0));
        }
    }
}

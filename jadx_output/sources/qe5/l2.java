package qe5;

/* loaded from: classes12.dex */
public final class l2 implements i40.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qe5.m2 f362142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f362143b;

    public l2(qe5.m2 m2Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f362142a = m2Var;
        this.f362143b = appCompatActivity;
    }

    @Override // i40.a
    public void a(long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDownloadUIC", "progressDownloadCallBack onDownloadProgress, offset: " + j17 + ", totalLen: " + j18);
        qe5.m2 m2Var = this.f362142a;
        kd5.e U6 = m2Var.U6();
        if (U6 != null) {
            U6.f306888s = (int) ((j17 / java.lang.Math.max(1.0d, j18)) * 100);
        }
        j75.f Q6 = m2Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(2, 0));
        }
    }

    @Override // i40.a
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDownloadUIC", "progressDownloadCallBack onDownloadSucceed");
        qe5.m2 m2Var = this.f362142a;
        kd5.e U6 = m2Var.U6();
        if (U6 != null) {
            U6.G = true;
        }
        j75.f Q6 = m2Var.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(6, 0));
        }
        kd5.e U62 = m2Var.U6();
        if (U62 != null) {
            U62.K = true;
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = m2Var.P6();
        if (!(P6 != null && P6.isFinishing())) {
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = m2Var.P6();
            if (!(P62 != null && P62.isDestroyed())) {
                pm0.v.X(new qe5.k2(this.f362143b, m2Var));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDownloadUIC", "activity is finishing or destroyed");
    }

    @Override // i40.a
    public void d(int i17, int i18, java.lang.String errMsg, boolean z17) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDownloadUIC", "progressDownloadCallBack onDownloadFailed, errorType: " + i17 + ", errorCode: " + i18 + ", errMsg: " + errMsg + ", isCdnOutOfTime: " + z17);
        int i19 = z17 ? 5 : 4;
        j75.f Q6 = this.f362142a.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(i19, 0));
        }
    }

    @Override // i40.a
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDownloadUIC", "progressDownloadCallBack onDownloadCanceled");
        j75.f Q6 = this.f362142a.Q6();
        if (Q6 != null) {
            Q6.B3(new kd5.u(3, 0));
        }
    }
}

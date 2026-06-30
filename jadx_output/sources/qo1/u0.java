package qo1;

/* loaded from: classes5.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.v0 f365552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f365553e;

    public u0(qo1.v0 v0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f365552d = v0Var;
        this.f365553e = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do stop now, pkgId=");
        qo1.v0 v0Var = this.f365552d;
        sb6.append(v0Var.f365483i);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupTask", sb6.toString());
        v0Var.f365493s = false;
        com.tencent.wechat.aff.affroam.a2 a2Var = v0Var.f365479e;
        java.util.concurrent.CountDownLatch countDownLatch = this.f365553e;
        if (a2Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupTask", "stop roam task now, pkgId=" + v0Var.f365483i);
            a2Var.g(new qo1.t0(countDownLatch));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            countDownLatch.countDown();
        }
    }
}

package hq1;

/* loaded from: classes13.dex */
public class w extends hq1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hq1.a0 f283201a;

    public w(hq1.a0 a0Var) {
        this.f283201a = a0Var;
    }

    @Override // hq1.f0
    public void a(long j17, boolean z17, long j18) {
        a42.i.f(j17);
        hq1.v vVar = new hq1.v(this, j17, z17, j18);
        hq1.a0 a0Var = this.f283201a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = a0Var.f283084d;
        reentrantLock.lock();
        vVar.run();
        reentrantLock.unlock();
        a0Var.f283089i.size();
    }

    @Override // hq1.f0
    public void b(long j17, boolean z17) {
        a42.i.f(j17);
        hq1.z zVar = this.f283201a.f283082b;
        if (zVar != null) {
            u32.l1 l1Var = (u32.l1) zVar;
            l1Var.getClass();
            u32.v1 v1Var = new u32.v1(null);
            v1Var.f424386a = j17;
            if (z17) {
                v1Var.f424387b = 0;
                v1Var.f424388c = 0;
            } else {
                v1Var.f424387b = -1;
                v1Var.f424388c = -1;
            }
            v1Var.f424389d = "";
            com.tencent.mm.sdk.platformtools.n3 n3Var = l1Var.f424323a.f424267p;
            if (n3Var.sendMessage(n3Var.obtainMessage(11, v1Var))) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", 11);
        }
    }
}

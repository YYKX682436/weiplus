package di3;

/* loaded from: classes10.dex */
public class a0 implements di3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f232649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232650b;

    public a0(di3.b0 b0Var, t21.v2 v2Var, java.lang.String str) {
        this.f232649a = v2Var;
        this.f232650b = str;
    }

    @Override // di3.i
    public boolean a() {
        long j17 = this.f232649a.f415016n;
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = ai3.a.f5104a;
        synchronized (ai3.a.class) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxingFinish: %s", java.lang.Long.valueOf(j17));
                ai3.a.f5104a.remove(java.lang.Long.valueOf(j17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxingFinish error: %s", e17.getMessage());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoMsgSendCallback", "iUpdateVideoFile2 %s", this.f232650b);
        int t17 = t21.w2.t(this.f232650b);
        t21.v2 v2Var = this.f232649a;
        v2Var.f415008f = t17;
        v2Var.U = 32;
        t21.o2.Ui().C(this.f232649a);
        return true;
    }
}

package oh1;

/* loaded from: classes4.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh1.j2 f345217d;

    public f2(oh1.j2 j2Var) {
        this.f345217d = j2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        oh1.j2 j2Var = this.f345217d;
        synchronized (j2Var) {
            if (j2Var.f345242e.get()) {
                return;
            }
            if (((java.util.concurrent.ConcurrentHashMap) j2Var.f345241d).size() <= 0) {
                return;
            }
            java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) j2Var.f345241d).values().iterator();
            boolean z17 = false;
            long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                oh1.e2 e2Var = (oh1.e2) it.next();
                if (e2Var.b()) {
                    j17 = 0;
                    z17 = true;
                    break;
                } else {
                    int i17 = e2Var.f345206c;
                    if (i17 >= 0) {
                        j17 = java.lang.Math.min(i17, j17);
                        z17 = true;
                    }
                }
            }
            if (z17) {
                int addAndGet = j2Var.f345243f.addAndGet(1);
                android.util.Log.getStackTraceString(new java.lang.Throwable());
                ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
                t0Var.getClass();
                t0Var.w(new oh1.g2(j2Var, addAndGet), j17 * 1000, "MicroMsg.WxaUpdateableMsgService");
            }
        }
    }
}

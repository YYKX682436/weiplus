package t21;

/* loaded from: classes12.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v0 f414699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.c2 f414700e;

    public a2(t21.c2 c2Var, t21.v0 v0Var) {
        this.f414700e = c2Var;
        this.f414699d = v0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = this.f414699d.f414978b;
        synchronized (this.f414700e.f414720a) {
            java.util.Iterator it = this.f414700e.f414720a.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                if (f9Var != null && f9Var.getMsgId() == j17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", java.lang.Integer.valueOf(this.f414700e.hashCode()), java.lang.Long.valueOf(j17));
                    it.remove();
                }
            }
        }
        this.f414700e.e(true);
        t21.c2 c2Var = this.f414700e;
        t21.v0 v0Var = c2Var.f414728i;
        if (v0Var != null) {
            v0Var.f414994r = null;
        }
        c2Var.f414728i = null;
        t21.c2.b(c2Var, 111, 1);
        t21.c2 c2Var2 = this.f414700e;
        c2Var2.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new t21.z1(c2Var2));
    }
}

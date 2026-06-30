package t21;

/* loaded from: classes12.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.p3 f414844d;

    public n3(t21.p3 p3Var) {
        this.f414844d = p3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        t21.p3 p3Var = this.f414844d;
        long j17 = currentTimeMillis - p3Var.f414877t;
        boolean z17 = p3Var.f414875r;
        boolean z18 = p3Var.f414874q;
        boolean z19 = p3Var.f414873p;
        if (z17) {
            if (j17 < 3600000) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoService", "ERR: Try Run service runningFlag:" + p3Var.f414875r + " timeWait:" + j17 + ">=MAX_TIME_WAIT sending:" + p3Var.f414874q + " recving:" + p3Var.f414873p);
            if (((java.util.HashMap) p3Var.f414872o).size() != 0 && p3Var.f414874q && j17 < 3600000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoService", "already sending, do not reset service");
                return;
            }
        }
        p3Var.f414876s = 3;
        p3Var.f414875r = true;
        p3Var.f414874q = false;
        p3Var.f414873p = false;
        p3Var.f414879v = null;
        p3Var.f414878u = null;
        p3Var.f414880w.b();
        p3Var.f414866f.c(10L, 10L);
    }

    public java.lang.String toString() {
        return super.toString() + "|run";
    }
}

package yn1;

/* loaded from: classes11.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463805d;

    public q3(yn1.a4 a4Var) {
        this.f463805d = a4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yn1.a4 a4Var = this.f463805d;
        synchronized (a4Var) {
            if (a4Var.f463608c) {
                a4Var.f463608c = false;
                com.tencent.mars.xlog.Log.i(a4Var.f463606a, "endRecover");
                co1.g.f43768a.d();
            }
        }
    }
}

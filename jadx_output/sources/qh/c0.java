package qh;

/* loaded from: classes12.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f363327d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qh.f0 f363328e;

    public c0(qh.f0 f0Var, qh.b0 b0Var) {
        this.f363328e = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f363327d++;
        oj.j.c("Matrix.battery.BatteryMonitorCore", "#onBackgroundLoopCheck, round = " + this.f363327d, new java.lang.Object[0]);
        if (!this.f363328e.f363343o) {
            synchronized (qh.f0.class) {
                java.util.Iterator it = ((java.util.ArrayList) this.f363328e.f363335d.f363306y).iterator();
                while (it.hasNext()) {
                    ((rh.e3) it.next()).g(this.f363328e.f363348t * this.f363327d);
                }
            }
        }
        qh.f0 f0Var = this.f363328e;
        if (f0Var.f363343o) {
            return;
        }
        f0Var.f363336e.postDelayed(this, f0Var.f363348t);
    }
}

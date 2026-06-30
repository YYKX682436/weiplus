package ph;

/* loaded from: classes12.dex */
public class u extends qi.b {

    /* renamed from: h, reason: collision with root package name */
    public final qh.f0 f354296h;

    public u(qh.a0 a0Var) {
        this.f354296h = new qh.f0(a0Var);
        oj.j.c("Matrix.battery.BatteryMonitorPlugin", "setUp battery monitor plugin with configs: " + a0Var, new java.lang.Object[0]);
    }

    @Override // qi.b, ei.a
    public void a(boolean z17) {
        qh.d0 d0Var;
        boolean c17 = ih.d.c();
        qh.f0 f0Var = this.f354296h;
        if (!c17) {
            f0Var.getClass();
            oj.j.b("Matrix.battery.BatteryMonitorCore", "Matrix was not installed yet, just ignore the event", new java.lang.Object[0]);
            return;
        }
        f0Var.f363343o = z17;
        if (ph.t.o()) {
            ph.t k17 = ph.t.k();
            k17.f354290e = z17;
            jz5.g gVar = k17.f354289d;
            if (z17) {
                ph.t.f354284l = 0L;
                k17.m().removeCallbacks((ph.b) ((jz5.n) gVar).getValue());
            } else {
                ph.t.f354284l = android.os.SystemClock.uptimeMillis();
                android.os.Handler m17 = k17.m();
                ph.b bVar = (ph.b) ((jz5.n) gVar).getValue();
                long j17 = 0 + 300000;
                ((ph.b) ((jz5.n) gVar).getValue()).f354253d = j17;
                m17.postDelayed(bVar, j17);
            }
        }
        android.os.Handler handler = f0Var.f363336e;
        if (!z17) {
            handler.removeCallbacksAndMessages(null);
            android.os.Message obtain = android.os.Message.obtain(handler);
            obtain.what = 1;
            handler.sendMessageDelayed(obtain, f0Var.f363346r);
            if (f0Var.f363345q) {
                qh.c0 c0Var = f0Var.f363339h;
                if (c0Var != null) {
                    handler.removeCallbacks(c0Var);
                    f0Var.f363339h = null;
                }
                qh.c0 c0Var2 = new qh.c0(f0Var, null);
                f0Var.f363339h = c0Var2;
                handler.postDelayed(c0Var2, f0Var.f363348t);
            }
        } else if (!handler.hasMessages(1)) {
            qh.c0 c0Var3 = f0Var.f363339h;
            if (c0Var3 != null) {
                handler.removeCallbacks(c0Var3);
                f0Var.f363339h = null;
            }
            android.os.Message obtain2 = android.os.Message.obtain(handler);
            obtain2.what = 2;
            handler.sendMessageAtFrontOfQueue(obtain2);
            if (f0Var.f363344p && (d0Var = f0Var.f363338g) != null) {
                handler.removeCallbacks(d0Var);
                qh.d0 d0Var2 = f0Var.f363338g;
                d0Var2.f363331d = 1;
                handler.post(d0Var2);
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) f0Var.f363335d.f363306y).iterator();
        while (it.hasNext()) {
            ((rh.e3) it.next()).a(z17);
        }
    }

    @Override // qi.b
    public java.lang.String b() {
        return "BatteryMonitorPlugin";
    }

    @Override // qi.b
    public void c(android.app.Application application, qi.c cVar) {
        super.c(application, cVar);
        if (this.f354296h.f363335d.f363295n) {
            return;
        }
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        java.util.HashSet hashSet = com.tencent.matrix.lifecycle.owners.f0.f52738t;
        synchronized (hashSet) {
            hashSet.remove(this);
        }
    }

    @Override // qi.b
    public void e() {
        super.e();
        qh.f0 f0Var = this.f354296h;
        f0Var.getClass();
        synchronized (qh.f0.class) {
            if (!f0Var.f363341m) {
                java.util.Iterator it = ((java.util.ArrayList) f0Var.f363335d.f363306y).iterator();
                while (it.hasNext()) {
                    ((rh.e3) it.next()).c();
                }
                f0Var.f363341m = true;
            }
            if (ph.t.o()) {
                ph.t k17 = ph.t.k();
                k17.f354295j = f0Var;
                k17.q();
            }
        }
    }

    public qh.f0 f() {
        return this.f354296h;
    }
}

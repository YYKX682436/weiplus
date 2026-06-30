package rh;

/* loaded from: classes12.dex */
public final class m extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public android.os.Handler f395450b;

    /* renamed from: c, reason: collision with root package name */
    public final rh.l f395451c = new rh.l();

    /* renamed from: d, reason: collision with root package name */
    public wh.c f395452d;

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        if (this.f395294a.f363335d.f363298q) {
            rh.h hVar = new rh.h(this);
            this.f395452d = hVar;
            boolean z17 = wh.e.f445763a;
            synchronized (wh.e.class) {
                java.util.List list = wh.e.f445765c;
                if (((java.util.ArrayList) list).contains(hVar)) {
                    return;
                }
                ((java.util.ArrayList) list).add(hVar);
                if (!wh.e.f445763a && !((java.util.ArrayList) list).isEmpty()) {
                    oj.j.c("Matrix.battery.AlarmHooker", "checkHook hookRet:%b", java.lang.Boolean.valueOf(wh.e.f445764b.a()));
                    wh.e.f445763a = true;
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        wh.c cVar = this.f395452d;
        boolean z17 = wh.e.f445763a;
        synchronized (wh.e.class) {
            if (cVar != null) {
                java.util.List list = wh.e.f445765c;
                ((java.util.ArrayList) list).remove(cVar);
                if (wh.e.f445763a && ((java.util.ArrayList) list).isEmpty()) {
                    oj.j.c("Matrix.battery.AlarmHooker", "checkUnHook unHookRet:%b", java.lang.Boolean.valueOf(wh.e.f445764b.b()));
                    wh.e.f445763a = false;
                }
            }
        }
        this.f395450b.removeCallbacksAndMessages(null);
        rh.l lVar = this.f395451c;
        lVar.f395439b = 0;
        lVar.f395440c = 0;
    }

    @Override // rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        this.f395450b = f0Var.f363337f;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.AlarmMonitorFeature";
    }
}

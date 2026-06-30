package rh;

/* loaded from: classes12.dex */
public final class e4 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public final rh.d4 f395372b = new rh.d4();

    /* renamed from: c, reason: collision with root package name */
    public wh.l2 f395373c;

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        if (this.f395294a.f363335d.f363298q) {
            rh.a4 a4Var = new rh.a4(this);
            this.f395373c = a4Var;
            java.util.List list = wh.m2.f445833a;
            synchronized (wh.m2.class) {
                java.util.List list2 = wh.m2.f445833a;
                if (((java.util.ArrayList) list2).contains(a4Var)) {
                    return;
                }
                ((java.util.ArrayList) list2).add(a4Var);
                if (!wh.m2.f445834b && !((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.WifiHooker", "checkHook hookRet:%b", java.lang.Boolean.valueOf(wh.m2.f445835c.a()));
                    wh.m2.f445834b = true;
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        wh.l2 l2Var = this.f395373c;
        java.util.List list = wh.m2.f445833a;
        synchronized (wh.m2.class) {
            if (l2Var != null) {
                java.util.List list2 = wh.m2.f445833a;
                ((java.util.ArrayList) list2).remove(l2Var);
                if (wh.m2.f445834b && ((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.WifiHooker", "checkUnHook unHookRet:%b", java.lang.Boolean.valueOf(wh.m2.f445835c.b()));
                    wh.m2.f445834b = false;
                }
            }
        }
        rh.d4 d4Var = this.f395372b;
        d4Var.f395366a = 0;
        d4Var.f395367b = 0;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.WifiMonitorFeature";
    }
}

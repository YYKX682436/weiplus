package rh;

/* loaded from: classes12.dex */
public final class m2 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public final rh.l2 f395460b = new rh.l2();

    /* renamed from: c, reason: collision with root package name */
    public wh.y0 f395461c;

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        if (this.f395294a.f363335d.f363298q) {
            rh.i2 i2Var = new rh.i2(this);
            this.f395461c = i2Var;
            java.util.List list = wh.z0.f445906a;
            synchronized (wh.z0.class) {
                java.util.List list2 = wh.z0.f445906a;
                if (((java.util.ArrayList) list2).contains(i2Var)) {
                    return;
                }
                ((java.util.ArrayList) list2).add(i2Var);
                if (!wh.z0.f445907b && !((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.LocationHooker", "checkHook hookRet:%b", java.lang.Boolean.valueOf(wh.z0.f445908c.a()));
                    wh.z0.f445907b = true;
                }
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        wh.y0 y0Var = this.f395461c;
        java.util.List list = wh.z0.f445906a;
        synchronized (wh.z0.class) {
            if (y0Var != null) {
                java.util.List list2 = wh.z0.f445906a;
                ((java.util.ArrayList) list2).remove(y0Var);
                if (wh.z0.f445907b && ((java.util.ArrayList) list2).isEmpty()) {
                    oj.j.c("Matrix.battery.LocationHooker", "checkUnHook unHookRet:%b", java.lang.Boolean.valueOf(wh.z0.f445908c.b()));
                    wh.z0.f445907b = false;
                }
            }
        }
        this.f395460b.f395444a = 0;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.LocationMonitorFeature";
    }
}

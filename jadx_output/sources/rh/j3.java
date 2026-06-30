package rh;

/* loaded from: classes12.dex */
public final class j3 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public wh.b1 f395426b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f395427c;

    /* renamed from: d, reason: collision with root package name */
    public long f395428d = -1;

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
        this.f395428d = z17 ? -1L : android.os.SystemClock.uptimeMillis();
    }

    @Override // rh.e3
    public int b() {
        return Integer.MIN_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        int identifier;
        super.c();
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        java.lang.String string = (system == null || (identifier = system.getIdentifier("app_running_notification_text", "string", com.eclipsesource.mmv8.Platform.ANDROID)) <= 0) ? null : system.getString(identifier);
        this.f395427c = string;
        if (android.text.TextUtils.isEmpty(string)) {
            oj.j.f("Matrix.battery.NotificationMonitorFeature", "can not get app_running_notification_text, abort notification monitor", new java.lang.Object[0]);
            return;
        }
        oj.j.c("Matrix.battery.NotificationMonitorFeature", "get app_running_notification_text: " + this.f395427c, new java.lang.Object[0]);
        rh.f3 f3Var = new rh.f3(this);
        this.f395426b = f3Var;
        java.util.List list = wh.c1.f445749a;
        synchronized (wh.c1.class) {
            java.util.List list2 = wh.c1.f445749a;
            if (((java.util.ArrayList) list2).contains(f3Var)) {
                return;
            }
            ((java.util.ArrayList) list2).add(f3Var);
            if (!wh.c1.f445750b && !((java.util.ArrayList) list2).isEmpty()) {
                oj.j.c("Matrix.battery.NotificationHooker", "checkHook hookRet:%b", java.lang.Boolean.valueOf(wh.c1.f445751c.a()));
                wh.c1.f445750b = true;
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        wh.b1 b1Var = this.f395426b;
        java.util.List list = wh.c1.f445749a;
        synchronized (wh.c1.class) {
            if (b1Var == null) {
                return;
            }
            java.util.List list2 = wh.c1.f445749a;
            ((java.util.ArrayList) list2).remove(b1Var);
            if (wh.c1.f445750b && ((java.util.ArrayList) list2).isEmpty()) {
                oj.j.c("Matrix.battery.NotificationHooker", "checkUnHook unHookRet:%b", java.lang.Boolean.valueOf(wh.c1.f445751c.b()));
                wh.c1.f445750b = false;
            }
        }
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.NotificationMonitorFeature";
    }

    public void k(java.lang.String str, java.lang.String str2) {
        long uptimeMillis = this.f395428d > 0 ? android.os.SystemClock.uptimeMillis() - this.f395428d : 0L;
        qh.a0 a0Var = this.f395294a.f363335d;
        this.f395294a.f363337f.post(new rh.g3(this, str, str2, a0Var.f363300s ? a0Var.A.b() : "", uptimeMillis));
    }
}

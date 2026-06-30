package rh;

/* loaded from: classes12.dex */
public abstract class a implements rh.e3 {

    /* renamed from: a, reason: collision with root package name */
    public qh.f0 f395294a;

    @Override // rh.e3
    public void a(boolean z17) {
        oj.j.c(i(), "#onForeground, foreground = " + z17, new java.lang.Object[0]);
    }

    @Override // rh.e3
    public void c() {
        oj.j.c(i(), "#onTurnOn", new java.lang.Object[0]);
    }

    @Override // rh.e3
    public void e() {
        oj.j.c(i(), "#onTurnOff", new java.lang.Object[0]);
    }

    @Override // rh.e3
    public void g(long j17) {
        oj.j.c(i(), "#onBackgroundCheck, since background started millis = " + j17, new java.lang.Object[0]);
    }

    @Override // rh.e3
    public void h(qh.f0 f0Var) {
        oj.j.c(i(), "#configure", new java.lang.Object[0]);
        this.f395294a = f0Var;
    }

    public java.lang.String i() {
        return "Matrix.battery.MonitorFeature";
    }

    public boolean j() {
        qh.f0 f0Var = this.f395294a;
        return f0Var.f363335d.f363300s || (f0Var.d().getApplicationInfo().flags & 2) != 0;
    }

    public java.lang.String toString() {
        return i();
    }
}

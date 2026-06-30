package ym5;

/* loaded from: classes15.dex */
public final class l0 implements android.util.Printer {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Printer f463423d;

    public l0(android.util.Printer printer) {
        this.f463423d = printer;
    }

    @Override // android.util.Printer
    public void println(java.lang.String x17) {
        kotlin.jvm.internal.o.g(x17, "x");
        ym5.r0.f463491g = true;
        ym5.r0 r0Var = ym5.r0.f463485a;
        if (ym5.r0.f463488d > 0 && java.lang.System.nanoTime() - ym5.r0.f463486b >= 260000000) {
            ((ym5.p0) ym5.r0.f463493i).invoke();
        }
        if (ym5.r0.f463489e > 0 && java.lang.System.nanoTime() - ym5.r0.f463487c >= 50000000) {
            ((ym5.q0) ym5.r0.f463492h).invoke();
        }
        android.util.Printer printer = this.f463423d;
        if (printer != null) {
            printer.println(x17);
        }
    }
}

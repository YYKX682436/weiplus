package cr0;

/* loaded from: classes12.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f221701a;

    /* renamed from: b, reason: collision with root package name */
    public final int f221702b;

    /* renamed from: c, reason: collision with root package name */
    public gi.w0 f221703c;

    public o4(java.lang.String module, int i17) {
        kotlin.jvm.internal.o.g(module, "module");
        this.f221701a = module;
        this.f221702b = i17;
    }

    public final rh.c1 a() {
        gi.w0 w0Var;
        com.tencent.mars.xlog.Log.i("ShellPowerProfiler", "finish: " + this.f221701a);
        if (gi.d.e() == null || (w0Var = this.f221703c) == null) {
            return null;
        }
        w0Var.l();
        return w0Var;
    }

    public final void b() {
        gi.w0 w0Var;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (wh.m.x(context)) {
            com.tencent.mars.xlog.Log.w("ShellPowerProfiler", "Use `adb shell dumpsys battery unplug` cmd to emulate discharging status before starting profiler");
            if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
                throw new java.lang.IllegalStateException("Use `adb shell dumpsys battery unplug` cmd to emulate discharging status before starting profiler".toString());
            }
        }
        com.tencent.mars.xlog.Log.i("ShellPowerProfiler", "start: " + this.f221701a);
        if (gi.d.e() != null) {
            ph.u e17 = gi.d.e();
            if (e17 != null) {
                rh.c1 c1Var = new cr0.l4(this, e17.f354296h).f272021a;
                kotlin.jvm.internal.o.e(c1Var, "null cannot be cast to non-null type com.tencent.matrix.manager.MMCompositeMonitors");
                w0Var = (gi.w0) c1Var;
            } else {
                w0Var = null;
            }
            this.f221703c = w0Var;
            if (w0Var != null) {
                w0Var.I();
            }
        }
    }
}

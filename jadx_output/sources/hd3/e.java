package hd3;

/* loaded from: classes.dex */
public final class e extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "startCpuProfile";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(data, "data");
        boolean a17 = z65.c.a();
        lc3.z zVar = lc3.x.f317936c;
        if (!a17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiStartCpuProfile", "hy: no debug environment! please check");
            s().invoke(i(zVar));
            return;
        }
        lc3.h0 h0Var = (lc3.h0) this.f317890a;
        if (h0Var != null) {
            h0Var.E0(";var __debug_v8_profiler = (function(profiler) {if (typeof profiler === 'undefined') { profiler = NativeGlobal.Profiler;} profiler.token = profiler.startCpuProfiling(); return profiler;})(__debug_v8_profiler);(function(profiler) { return profiler.token;})(__debug_v8_profiler);", new hd3.d(this));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiStartCpuProfile", "hy: context not server type. not valid");
            s().invoke(i(zVar));
        }
    }
}

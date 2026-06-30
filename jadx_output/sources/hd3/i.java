package hd3;

/* loaded from: classes.dex */
public final class i extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "stopCpuProfile";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(data, "data");
        boolean a17 = z65.c.a();
        lc3.z zVar = lc3.x.f317936c;
        if (!a17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStopCpuProfile", "hy: no debug environment! please check");
            s().invoke(i(zVar));
            return;
        }
        java.lang.String optString = data.optString("token");
        lc3.h0 h0Var = (lc3.h0) this.f317890a;
        if (h0Var != null) {
            h0Var.E0(";(function(profiler) {return JSON.stringify(profiler.stopCpuProfiling());})(__debug_v8_profiler);", new hd3.h(this, optString));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStopCpuProfile", "hy: context not server type. not valid");
            s().invoke(i(zVar));
        }
    }
}

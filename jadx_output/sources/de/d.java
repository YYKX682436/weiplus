package de;

/* loaded from: classes7.dex */
public final class d implements de.a {
    @Override // de.a
    public void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, yz5.l callback) {
        jz5.f0 f0Var;
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = runtime.C0().getF147808e();
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var2 = f147808e != null ? (com.tencent.mm.plugin.appbrand.jsruntime.f0) f147808e.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class) : null;
        if (f0Var2 != null) {
            ce.g gVar = (ce.g) runtime.C0().V0().B1(ce.g.class);
            com.tencent.magicbrush.MagicBrush magicBrush = (gVar == null || (magicBrushView = ((ce.o) gVar).f40686g) == null) ? null : magicBrushView.getMagicBrush();
            if (magicBrush == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushCaptureDelegate", "hy: no magicbrush.");
                callback.invoke(null);
            } else {
                if ((magicBrush.f48577a == 0 ? false : magicBrush.nativeGetIsMali(magicBrush.f48577a)) && f0Var2.g()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushCaptureDelegate", "hy: you can not ");
                }
                callback.invoke(yg.b.e(magicBrush.f48591o, null, 1, null));
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MagicBrushCaptureDelegate", "hy: no js thread handler. can not capture magicbrush screenshot");
            callback.invoke(null);
        }
    }
}

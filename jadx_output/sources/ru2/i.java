package ru2;

/* loaded from: classes2.dex */
public final class i implements ru2.a {
    @Override // ru2.a
    public void C1(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLifecycleCallback", "onFinderForeground: ".concat(name));
        if (ru2.j.f399743f != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.trtc.hardwareearmonitor.honor.HonorResultCode.BLUETOOTH_HD_FB_NOT_SUPPORT, 1);
        }
        java.util.concurrent.Future future = ru2.j.f399744g;
        if (future != null) {
            future.cancel(false);
        }
        java.util.concurrent.Future future2 = ru2.j.f399745h;
        if (future2 != null) {
            future2.cancel(false);
        }
    }

    @Override // ru2.a
    public void V4(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLifecycleCallback", "onFinderBackground: ".concat(name));
        i95.m c17 = i95.n0.c(zy2.ob.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (du2.j.f243476d.c()) {
            i95.m c18 = i95.n0.c(eu2.b0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            eu2.b0 b0Var = (eu2.b0) c18;
            if (b0Var.Zi()) {
                pm0.v.X(new eu2.o(b0Var));
            } else {
                com.tencent.mars.xlog.Log.i("FinderVideoSystemPlayerController", "[onFinderBackGround] keyGuard is not locked, return!");
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", "[onFinderBackGround] not hit exp, return!");
        }
        ru2.j jVar = ru2.j.f399741d;
        java.util.concurrent.Future future = ru2.j.f399744g;
        if (future != null) {
            future.cancel(false);
        }
        ru2.j.f399744g = jVar.a(ru2.g.f399739d, ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127638c9).getValue()).r()).intValue(), "releaseUnFocusView");
        java.util.concurrent.Future future2 = ru2.j.f399745h;
        if (future2 != null) {
            future2.cancel(false);
        }
        ru2.j.f399745h = jVar.a(ru2.e.f399737d, ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127657d9).getValue()).r()).intValue(), "releaseAllView");
    }
}

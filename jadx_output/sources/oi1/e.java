package oi1;

/* loaded from: classes7.dex */
public abstract class e implements oi1.j {
    @Override // oi1.j
    public oi1.n a() {
        return oi1.n.f345608e;
    }

    @Override // oi1.j
    public boolean b(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, java.lang.String scene, java.lang.Runnable runnable) {
        boolean z17;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = runtime.x0().getCurrentPage();
        oi1.l w17 = currentPage != null ? currentPage.w(oi1.n.f345608e) : null;
        if (w17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "navigateBackInterceptionInfo is null");
            return false;
        }
        if (!w17.a(scene)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "scene:[" + scene + "] disable");
            return false;
        }
        if (runtime.x0().getPageCount() <= 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "leave current wxa, can't intercept");
            return false;
        }
        ze.n nVar = (ze.n) runtime;
        if (nVar.u0().f47284z == 7) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageNavigateBackInterceptorWC", "fake native wxa, can't intercept");
            z17 = false;
        } else {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "custom intercept return false");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "show navigate back interception dialog");
        fl1.b bVar = new fl1.b(runtime.r0());
        java.lang.String str = w17.f345603a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "";
        }
        bVar.t(str);
        bVar.setCanceledOnTouchOutside(false);
        bVar.setCancelable(false);
        bVar.z(com.tencent.mm.R.string.f490649a32, new oi1.c(this, runnable, runtime, bVar));
        bVar.u(com.tencent.mm.R.string.f490650a33, new oi1.d(this, runtime, bVar));
        fl1.g2 dialogContainer = runtime.getDialogContainer();
        if (dialogContainer != null) {
            ((fl1.c0) dialogContainer).c(bVar);
        }
        ((oi1.a) this).c(nVar, 1);
        return true;
    }

    @Override // oi1.j
    public oi1.i priority() {
        return oi1.h.f345601b;
    }
}

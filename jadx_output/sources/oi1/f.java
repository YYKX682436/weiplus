package oi1;

/* loaded from: classes7.dex */
public abstract class f implements oi1.j {
    @Override // oi1.j
    public oi1.n a() {
        return oi1.n.f345607d;
    }

    @Override // oi1.j
    public boolean b(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, java.lang.String scene, java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = runtime.x0().getCurrentPage();
        oi1.l w17 = currentPage != null ? currentPage.w(oi1.n.f345607d) : null;
        if (w17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageNavigateBackSilentInterceptor", "navigateBackInterceptionInfo is null");
            return false;
        }
        if (!w17.a(scene)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageNavigateBackSilentInterceptor", "scene:[" + scene + "] intercept!!");
        ze.n nVar = (ze.n) runtime;
        int hashCode = scene.hashCode();
        nd1.a aVar = nd1.b.f336260i;
        switch (hashCode) {
            case -1128437284:
                if (scene.equals("scene_actionbar_back")) {
                    aVar.a(nVar, 3);
                    break;
                }
                break;
            case 13653565:
                if (scene.equals("scene_back_key_pressed")) {
                    aVar.a(nVar, 2);
                    break;
                }
                break;
            case 298295391:
                if (scene.equals("scene_swipe_back")) {
                    aVar.a(nVar, 1);
                    break;
                }
                break;
            case 560038708:
                if (scene.equals("scene_jsapi_navigate_back")) {
                    aVar.a(nVar, 4);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // oi1.j
    public oi1.i priority() {
        return oi1.g.f345600b;
    }
}

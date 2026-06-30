package hd1;

/* loaded from: classes7.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final hd1.w a(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        java.util.Map map = hd1.w.f280436d;
        hd1.w wVar = (hd1.w) ((java.util.concurrent.ConcurrentHashMap) map).get(component.getAppId());
        if (wVar != null) {
            return wVar;
        }
        com.tencent.mm.plugin.appbrand.utils.k3 k3Var = new com.tencent.mm.plugin.appbrand.utils.k3(component);
        hd1.l lVar = hd1.w.f280435c;
        hd1.j jVar = hd1.w.f280437e;
        java.lang.String appId = component.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        ((hd1.k) jVar).getClass();
        hd1.w wVar2 = new hd1.w(appId, new hd1.h(appId, k3Var));
        java.lang.String appId2 = component.getAppId();
        kotlin.jvm.internal.o.f(appId2, "getAppId(...)");
        ((java.util.concurrent.ConcurrentHashMap) map).put(appId2, wVar2);
        return wVar2;
    }

    public final boolean b(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        hd1.b bVar = (hd1.b) a(component).f280439b;
        if (bVar.f280388d.get()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AbsNFCDiscoverable", "isNFCUsing, isDiscovering, using");
            return true;
        }
        kotlin.jvm.internal.o.f(bVar.f280387c, "<get-connectedTech>(...)");
        if (!r4.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AbsNFCDiscoverable", "isNFCUsing, connected, using");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AbsNFCDiscoverable", "isNFCUsing, not using");
        return false;
    }
}

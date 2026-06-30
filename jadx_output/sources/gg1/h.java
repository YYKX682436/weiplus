package gg1;

/* loaded from: classes7.dex */
public abstract class h {
    public static final com.tencent.mm.plugin.appbrand.AppBrandRuntime a(sf.f fVar) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        if (!(fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).m();
        if (!(m17 instanceof com.tencent.mm.plugin.appbrand.y)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = ((com.tencent.mm.plugin.appbrand.y) m17).t3();
        kotlin.jvm.internal.o.f(t37, "getRuntime(...)");
        return t37;
    }
}

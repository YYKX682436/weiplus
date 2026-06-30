package tf;

/* loaded from: classes7.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f418832a;

    public static tf1.f a(sf.f fVar) {
        if (!f418832a) {
            com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, not support");
            return null;
        }
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.m();
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = m17 instanceof com.tencent.mm.plugin.appbrand.page.v5 ? ((com.tencent.mm.plugin.appbrand.page.v5) m17).t3() : m17 instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) m17).t3() : null;
        if (t37 == null) {
            com.tencent.mars.xlog.Log.w("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, runtime is null");
            return null;
        }
        if (t37.L0() || t37.S) {
            com.tencent.mars.xlog.Log.w("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, runtime is destroyed or finishing");
            return null;
        }
        tf1.f fVar2 = (tf1.f) t37.k(tf1.f.class);
        if (fVar2 != null) {
            return fVar2;
        }
        com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AudioOfVideoBackgroundPlayManagerProvider", "provide, create");
        tf1.f fVar3 = new tf1.f(t37);
        t37.l(fVar3);
        return fVar3;
    }
}

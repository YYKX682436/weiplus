package xf1;

/* loaded from: classes7.dex */
public class i extends com.tencent.mm.plugin.appbrand.backgroundrunning.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f454237d;

    /* renamed from: f, reason: collision with root package name */
    public volatile tf.w f454239f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f454238e = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f454240g = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    public i(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f454237d = "MicroMsg.AppBrandRuntimeLiveVOIPStateManager";
        this.f454237d = "MicroMsg.AppBrandRuntimeLiveVOIPStateManager#" + hashCode() + "Runtime#" + appBrandRuntime.hashCode();
    }

    @Override // com.tencent.mm.plugin.appbrand.backgroundrunning.h1
    public boolean a() {
        return (this.f454239f == null || this.f454240g.isEmpty()) ? false : true;
    }

    public void b(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, boolean z17) {
        boolean a17 = a();
        com.tencent.mars.xlog.Log.i(this.f454237d, "enableMic, enable:%s, isVOIPing: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a17));
        if (a17) {
            boolean z18 = this.f454238e;
            this.f454238e = z17;
            if (z18 != z17) {
                c(appBrandRuntime, 1);
            }
        }
    }

    public final void c(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = new com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent();
        appBrandBackgroundRunningOperationEvent.f83923g.f454222a = appBrandRuntime.f74803n;
        xf1.a aVar = appBrandBackgroundRunningOperationEvent.f83923g;
        aVar.f454223b = 4;
        aVar.f454224c = i17;
        appBrandBackgroundRunningOperationEvent.e();
    }

    public boolean d(tf.w wVar, int i17) {
        boolean z17 = false;
        if (a() && i17 != 3) {
            if (wVar instanceof yf.i0) {
                if (this.f454239f == wVar) {
                    z17 = true;
                }
            } else if (wVar instanceof wf.b) {
                z17 = this.f454240g.contains(wVar);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f454237d, "shouldInterceptEnterBackground, result:%s, isVOIPing:%s, type:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a()), java.lang.Integer.valueOf(i17));
        return z17;
    }
}

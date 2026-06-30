package p003if;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f291008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f291009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p003if.e f291010f;

    public d(com.tencent.mm.plugin.appbrand.y yVar, int i17, p003if.e eVar) {
        this.f291008d = yVar;
        this.f291009e = i17;
        this.f291010f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.i3 x07;
        com.tencent.mm.plugin.appbrand.y yVar = this.f291008d;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = yVar.t3();
        boolean P = (t37 == null || (x07 = t37.x0()) == null) ? false : x07.P(true);
        com.tencent.mars.xlog.Log.i("JsApiInitPreloadSkylineView", "preloadNextSkylineView isOk:" + P);
        p003if.e eVar = this.f291010f;
        int i17 = this.f291009e;
        if (P) {
            yVar.a(i17, eVar.o("ok"));
        } else {
            yVar.a(i17, eVar.o("fail"));
        }
    }
}

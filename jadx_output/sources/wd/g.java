package wd;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final wd.g f444684a = new wd.g();

    public void a(com.tencent.magicbrush.MBRuntime mBRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBImageHandlerRegistry", "dl: MBImageHandlerRegistry register ");
        new java.lang.ref.WeakReference((z17 && appBrandRuntime != null && (appBrandRuntime.C0() instanceof com.tencent.luggage.sdk.jsapi.component.service.y)) ? (ae.q) ((com.tencent.luggage.sdk.jsapi.component.service.y) appBrandRuntime.C0()).z1(ae.q.class) : null);
        com.github.henryye.nativeiv.BaseImageDecodeService baseImageDecodeService = mBRuntime.f48581e;
        wd.e eVar = new wd.e(appBrandRuntime, null);
        baseImageDecodeService.addImageStreamFetcher(new xd.a(eVar), true);
        baseImageDecodeService.addImageStreamFetcher(new xd.b(eVar), false);
        baseImageDecodeService.addImageStreamFetcher(new xd.c(eVar), false);
        baseImageDecodeService.setKvReportDelegate(new wd.f(14883));
        eh.d dVar = new eh.d();
        dVar.f226897a = 8192;
        dVar.f226898b = 8192;
        baseImageDecodeService.setBitmapDecodeSlave(dVar);
    }
}

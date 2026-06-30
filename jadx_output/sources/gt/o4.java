package gt;

/* loaded from: classes7.dex */
public class o4 extends com.tencent.mm.sdk.event.n {
    public o4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.scanner.EventScanCodeSheetPreloadWxaAttrs event = (com.tencent.mm.plugin.scanner.EventScanCodeSheetPreloadWxaAttrs) iEvent;
        if (!gm0.j1.a()) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.predownload.u0 u0Var = (com.tencent.mm.plugin.appbrand.appcache.predownload.u0) i95.n0.c(com.tencent.mm.plugin.appbrand.appcache.predownload.u0.class);
        u0Var.getClass();
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = event.f158615g;
        if (str != null && u0Var.Ai(str)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1342, 3);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreDownloadServiceExportImpl", "triggerPrefetchWeAppQRCode username:" + str + ", timestamp:" + currentTimeMillis);
            com.tencent.mm.plugin.appbrand.appcache.predownload.k1.f75859a.a(kz5.b0.c(str), k91.h1.QRCODE, new com.tencent.mm.plugin.appbrand.appcache.predownload.t0(str, currentTimeMillis));
        }
        return true;
    }
}

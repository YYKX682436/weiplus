package zx5;

/* loaded from: classes13.dex */
public class h0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        zx5.c cVar = com.tencent.xweb.b3.f220215c;
        if (cVar != null) {
            com.tencent.mm.plugin.appbrand.ui.gc gcVar = (com.tencent.mm.plugin.appbrand.ui.gc) cVar;
            gcVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.AppBrandXWebDownloadProxyUI", "onUpdateCompleted");
            com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI appBrandXWebDownloadProxyUI = gcVar.f89744b;
            appBrandXWebDownloadProxyUI.f89492d = null;
            com.tencent.xweb.b3.f220215c = null;
            appBrandXWebDownloadProxyUI.setResult(-1, new android.content.Intent());
            appBrandXWebDownloadProxyUI.finish();
        }
    }
}
